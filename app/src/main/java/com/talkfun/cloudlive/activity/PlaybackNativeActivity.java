package com.talkfun.cloudlive.activity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListPopupWindow;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.talkfun.cloudlive.R;
import com.talkfun.cloudlive.event.SimpleGestureLayoutListener;
import com.talkfun.cloudlive.consts.EventType;
import com.talkfun.cloudlive.consts.MainConsts;
import com.talkfun.cloudlive.dialog.SwitchLineDialogFragment;
import com.talkfun.cloudlive.entity.Event;
import com.talkfun.cloudlive.fragment.PlaybackSectionFragment;
import com.talkfun.cloudlive.helper.NetChoiseDiologHelper;
import com.talkfun.cloudlive.util.ACache;
import com.talkfun.cloudlive.util.DanmakuFlameUtil;
import com.talkfun.cloudlive.util.DimensionUtils;
import com.talkfun.cloudlive.util.LogUtil;
import com.talkfun.cloudlive.util.ScreenSwitchUtils;
import com.talkfun.cloudlive.util.SeekBarHelper;
import com.talkfun.cloudlive.util.StringUtils;
import com.talkfun.cloudlive.util.TimeUtil;
import com.talkfun.cloudlive.view.PlaybackMessageView;
import com.talkfun.sdk.HtSdk;
import com.talkfun.sdk.consts.PlayerLoadState;
import com.talkfun.sdk.consts.TFMode;
import com.talkfun.sdk.data.PlaybackDataManage;
import com.talkfun.sdk.event.ErrorEvent;
import com.talkfun.sdk.event.OnPlayerLoadStateChangeListener;
import com.talkfun.sdk.event.OnVideoChangeListener;
import com.talkfun.sdk.event.OnVideoStatusChangeListener;
import com.talkfun.sdk.event.PlaybackListener;
import com.talkfun.sdk.module.AlbumItemEntity;
import com.talkfun.sdk.module.ModuleConfigHelper;
import com.talkfun.sdk.module.PlaybackInfo;
import com.talkfun.sdk.module.User;

import java.io.File;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
import master.flame.danmaku.ui.widget.DanmakuView;

public class PlaybackNativeActivity extends BasePlayActivity implements
        PlaybackListener, PlaybackSectionFragment.PlaybackSectionInterface, View.OnTouchListener
        , OnVideoStatusChangeListener, ErrorEvent.OnErrorListener {

    //-------------------------------ui---------------------------------
    @BindView(R.id.operation_btn_container)
    LinearLayout operationContainer;
    @BindView(R.id.video_visibility_iv)
    ImageView videoVisibleIv;
    @BindView(R.id.seek_bar_layout)
    LinearLayout seekbarLayout;
    @BindView(R.id.seek_bar)
    SeekBar seekBar;
    @BindView(R.id.iv_play)
    ImageView playBtn;
    @BindView(R.id.total_duration)
    TextView totalDuration;
    @BindView(R.id.current_duration)
    TextView currentDuration;
    @BindView(R.id.iv_go_back)
    ImageView goBack;
    @BindView(R.id.title_bar)
    RelativeLayout titleBar;
    @BindView(R.id.tab_container)
    PlaybackMessageView mPlaybackMessageView;
    //    @BindView(R.id.iv_start_download)
//    ImageView ivStartDownload;
    @BindView(R.id.tv_speed)
    TextView tvSpeed;

//    @BindView(R.id.danmaku_view)
//    DanmakuView danmakuView;
//    @BindView(R.id.iv_danmu_switch)
//    ImageView ivDanmuSwitch;

    //--------------------------------------------------------------------------------

    private SwitchLineDialogFragment switchLineDialogFragment;
    private boolean mIsPlaying = true;
    private String mId;
    private SeekBarHelper seekBarHelper;
    private ListPopupWindow playSpeedlpw;


    private static final String TAG = PlaybackNativeActivity.class.getName();
    private static final String[] playSpeedStrs = {"0.75X", "1.0X", "1.2X", "1.5X"};
    private static final float[] playSpeeds = {0.75f, 1.0f, 1.2f, 1.5f};
    private HtSdk mHtSdk;

    private NetChoiseDiologHelper mNetChoiseDiologHelper; //网络选择弹框

    DanmakuFlameUtil danmakuFlameUtil; //弹幕帮助类



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initEvent();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.playback_layout;
    }

    @Override
    protected void init() {
        super.init();
        mId = getIntent().getStringExtra("id");
        MainConsts.PlayBackID = mId;

    }


    /**
     * 初始化布局
     */
    protected void initView() {
        super.initView();
//        ivStartDownload.setVisibility(View.VISIBLE);
        showVideoContainer(videoVisibleIv, false);
        operationContainer.bringToFront();  //将控件移动到前面
        seekbarLayout.bringToFront();
        goBack.bringToFront();

        hideTitleBar();  // 隐藏标题栏和操作按钮
//        initDanmaku();
        updateLayout();
        seekBarHelper = new SeekBarHelper(this, seekBar);
        mHtSdk = HtSdk.getInstance();
       // mHtSdk.init(pptContainer, videoViewContainer, mToken, true);
        mHtSdk.init(this,pptContainer,videoViewContainer,mToken, TFMode.PLAYBACK_NORMAL);
        /**设置桌面分享/插播视频容器
         * 如果没调用该方法设置容器，默认使用PPT白板容器，桌面分享的视频会添加到白板的上一层
         * */
        mHtSdk.setDesktopVideoContainer(desktopVideoContainer);
        mHtSdk.setFilterQuestionFlag(false);
        LayoutInflater layoutInflater = LayoutInflater.from(this);
        View loadingView = layoutInflater.inflate(R.layout.loading_layout, null);
        View loadFailView = layoutInflater.inflate(R.layout.load_fail_layout, null);
        mHtSdk.setLoadingView(loadingView); //设置正在加载数据显示view
        mHtSdk.setLoadFailView(loadFailView);//设置加载数据失败显示view
        mHtSdk.setWhiteboardLoadFailDrawable(getResources().getDrawable(R.mipmap.image_broken));
        //启动本地服务器和播放设置
        //如果为true,在连网情况下，如果点播下载完成播放本地点播，未下载或下载未完成则播放网络点播，如果本地下载完成断网播放本地点播
        //如果为false,在连网情况下播放网络点播，如果本地下载完成断网播放本地点播
        //默认为true
        mHtSdk.setIsPlayOffline(mId, true);
        initHelper();
    }

    private void initHelper() {
        mPlaybackMessageView.addTokenAndId(mToken, mId);
        mPlaybackMessageView.addSeekBarUtil(seekBarHelper);
    }

    /**
     * 初始化弹幕库
     */

    private void initDanmaku() {
//        ivDanmuSwitch.setSelected(false);
//        danmakuFlameUtil = new DanmakuFlameUtil(danmakuView);
//        danmakuFlameUtil.hide();
    }



    /**
     * 监听初始化
     */
    private void initEvent() {
        videoViewContainer.setOnTouchListener(this);

        //点播必须初始化的接口
        mHtSdk.setPlaybackListener(this);


        //视频播放状态改变的监听回调
        mHtSdk.setOnVideoStatusChangeListener(this);
        /**设置视频切换事件监听*/
        mHtSdk.setOnVideoChangeListener(new OnPlayVideoChangeLister());
        //错误监听
        mHtSdk.setOnErrorListener(this);
        //添加快进快退的滑动监听事件
        //seekBarHelper.addTouchSlidSeekEvent(pptLayout);

        /***
         * 获取缓冲状态
         */
        mHtSdk.setOnPlayerLoadStateChangeListener(new OnPlayerLoadStateChangeListener() {
            @Override
            public void onPlayerLoadStateChange(int loadState) {
                if (loadState == PlayerLoadState.MEDIA_INFO_BUFFERING_START) {
                    Log.d(TAG, "缓冲开始");
                } else if (loadState == PlayerLoadState.MEDIA_INFO_BUFFERING_END) {
                    Log.d(TAG, "缓冲结束");
                }
            }
        });

        gestureLayoutWrapper.setGestureLayoutListener(new SimpleGestureLayoutListener() {
            @Override
            public void onStartVolumeOffset() {
                audioManagerHelper.startVolumeOffset();
            }

            @Override
            public void onVolumeOffset(float offsetPercentage) {
                audioManagerHelper.volumeOffset(offsetPercentage);
            }

            @Override
            public void onStopVolumeOffset() {
                audioManagerHelper.stopVolumeOffset();
            }

            @Override
            public void onStartFastSeekOffset() {
                seekBarHelper.startFastSeek(pptLayout);
            }

            @Override
            public void onFastSeekOffset(float offsetPercentage) {
                seekBarHelper.fastSeekOffset(offsetPercentage);
            }

            @Override
            public void onStopFastSeekOffset() {
                seekBarHelper.stopFastSeek();
            }

            @Override
            public boolean onDown() {
                return true;
            }

            @Override
            public boolean onClick() {
                if (seekBarHelper.isShowPoped) {
                    seekBarHelper.isShowPoped = false;
                    return true;
                }
                if (isTitleBarShow) {
                    hideTitleBar();
                } else {
                    showTitleBar();
                }
                return true;
            }

            @Override
            public boolean onDoubleClick() {
                onFullScreenChange();
                return true;
            }
        });
    }

    @OnClick({R.id.fullScreen_iv, R.id.video_visibility_iv, R.id.iv_play, R.id.iv_go_back,
             R.id.exchange, R.id.network_choice_iv, R.id.iv_refresh, R.id.tv_speed,R.id.iv_danmu_switch})
    void onClick(View v) {
        Log.d(getClass().getName(), v.getClass().getName());
        switch (v.getId()) {
            case R.id.fullScreen_iv:  //全屏
                onFullScreenChange();
                break;
            case R.id.video_visibility_iv:  //开关摄像头
                onVideoVisible(videoVisibleIv);
                break;
            case R.id.iv_play:  //开始或暂停
                if (mIsPlaying) {
                    pause();
                    mIsPlaying = false;
                } else {
                    play();
                    mIsPlaying = true;
                }
                break;
            case R.id.iv_go_back:  //返回
                gobackAction();
                break;
            case R.id.exchange:
                /**切换ppt容器与摄像头视频容器*/
                if (!isVideoViewContainerVisiable()) {
                    return;
                }

                isExchangeViewContainer = !isExchangeViewContainer;
                mHtSdk.exchangeVideoAndWhiteboard();
                break;
            case R.id.network_choice_iv: //切换视频路线
//                showSwitchLineDialog();
                if (mNetChoiseDiologHelper == null) {
                    mNetChoiseDiologHelper = new NetChoiseDiologHelper(PlaybackNativeActivity.this);
                }
                mNetChoiseDiologHelper.showNetworkChoiceDialog();
                break;
            case R.id.iv_refresh: //刷新
                //seekBarHelper.resetSeekBarProgress();
                exchangeViewContainer();
                videoViewContainer.setVisibility(View.INVISIBLE);
                cachePlayTime();
                mHtSdk.reload();
                break;
            case R.id.tv_speed:
                showOrHideSpeedList(v);
                break;
//            case R.id.iv_danmu_switch:  //弹幕开关
//                boolean selected = ivDanmuSwitch.isSelected();
//                ivDanmuSwitch.setSelected(!selected);
//                if (!selected) {
//                    danmakuFlameUtil.show();
//                } else {
//                    danmakuFlameUtil.hide();
//                }
//                break;
            default:
                break;
        }
    }

    /**
     * 显示或隐藏播放倍速列表
     *
     * @param anchor
     */
    private void showOrHideSpeedList(View anchor) {
        stopDismissTitleBar();
        if (playSpeedlpw != null && playSpeedlpw.isShowing()) {
            playSpeedlpw.dismiss();
            playSpeedlpw = null;
            autoDismissTitleBar();
            return;
        }
        if (playSpeedlpw == null) {
            playSpeedlpw = new ListPopupWindow(this);
            playSpeedlpw.setAdapter(new ArrayAdapter<String>(this, R.layout.speed_popup_window_item, R.id.list_pop_item, playSpeedStrs));
            playSpeedlpw.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    tvSpeed.setText(playSpeedStrs[position]);
                    mHtSdk.setPlaybackPlaySpeed(playSpeeds[position]);
                    playSpeedlpw.dismiss();
                    playSpeedlpw = null;
                    autoDismissTitleBar();
                }
            });
            playSpeedlpw.setOnDismissListener(new PopupWindow.OnDismissListener() {
                @Override
                public void onDismiss() {
                    autoDismissTitleBar();
                }
            });
            playSpeedlpw.setBackgroundDrawable(null);
        }

        int lpwWidth = DimensionUtils.dip2px(this, 100);
        int lpwHeight = DimensionUtils.dip2px(this, 150);
        if (anchor != null) {
            playSpeedlpw.setAnchorView(anchor);
            playSpeedlpw.setVerticalOffset(-lpwHeight);
            playSpeedlpw.setHorizontalOffset(-(lpwWidth - anchor.getWidth()) / 2);
        }

        playSpeedlpw.setModal(true);
        playSpeedlpw.setWidth(lpwWidth);
        playSpeedlpw.setHeight(lpwHeight);
        playSpeedlpw.show();
    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        if (playSpeedlpw != null && playSpeedlpw.isShowing()) {
            playSpeedlpw.dismiss();
            // playSpeedlpw.setAnchorView(null);
            playSpeedlpw = null;
            autoDismissTitleBar();
            return;
        }
        super.onConfigurationChanged(newConfig);
    }

    //TODO-------------------------------------------view changed------------------------------------

    /**
     * 显示控制按钮和进度条
     */
    @Override
    void showController() {
        seekbarLayout.setVisibility(View.VISIBLE);
        operationContainer.setVisibility(View.VISIBLE);
        titleBar.setVisibility(View.VISIBLE);
        playBtn.setVisibility(View.VISIBLE);
    }

    /**
     * 隐藏控制按钮和进度条
     */
    @Override
    void hideController() {
        if (seekbarLayout == null)
            return;
        seekbarLayout.setVisibility(View.INVISIBLE);
        operationContainer.setVisibility(View.GONE);
        titleBar.setVisibility(View.GONE);
        playBtn.setVisibility(View.GONE);
    }


    /**
     * 切换到全屏
     */
    @Override
    public void layoutChanged() {
        super.layoutChanged();
        //竖屏不显示时长
        boolean isPortrait = ScreenSwitchUtils.getInstance(this).isPortrait();
        boolean isSensorNotFullLandScreen = ScreenSwitchUtils.getInstance(this).isSensorNotFullLandScreen();
        totalDuration.setVisibility(isPortrait == false ? View.VISIBLE : View.GONE);
        if((mHtSdk != null && mHtSdk.isPlayLocal()) || isSensorNotFullLandScreen){
            mPlaybackMessageView.hideDownloadButton();
        }else{
            mPlaybackMessageView.showDownloadButton();
        }
        // currentDuration.setVisibility(isPortrait == false ? View.VISIBLE : View.GONE);

    }

    //TODO-------------------------------------------点播初始化以及状态提示------------------------------
//    /**
//     * 专辑Fragment
//     */
//    private PlaybackAlbumFragment albumFragment;

    /**
     * 点播初始化完成回调
     */

    @Override
    public void initSuccess() {
        showTitleBar();
//        showVideoContainer();
        userVideoShow = true;
//        showVideoContainer(videoVisibleIv, true);
        videoVisibleIv.setSelected(mHtSdk.isVideoShow());
        setSeekBar();
        if (mPlaybackMessageView != null) {
            /**
             * 如是有专辑，则在viewpaper添加PlaybackAlbumFragment,在Tab层添加专辑Tab
             */
            mPlaybackMessageView.addAlbumFragment();
        }
        if(mHtSdk.isPlayLocal()){
            mPlaybackMessageView.hideDownloadButton();
        }else{
            mPlaybackMessageView.showDownloadButton();
        }

        ModuleConfigHelper moduleConfigHelper = mHtSdk.getModuleConfigHelper();
        if(moduleConfigHelper != null && moduleConfigHelper.getModuleEnable(ModuleConfigHelper.KEY_MOD_THEFTPROOF_PLAYBACK)){
            User user = PlaybackInfo.getInstance().getUser();
            startShowWatermark(user != null ? user.getUid() : PlaybackInfo.getInstance().getLiveId());
        }

        //根据后台文字互动模块聊天区设置是否显示
        if (!moduleConfigHelper.getModuleEnable(ModuleConfigHelper.KEY_MOD_TEXT_PLAYBACK) || !moduleConfigHelper.getModuleEnable(ModuleConfigHelper.KEY_MOD_TEXT_PLAYBACK_CHAT)){
            mPlaybackMessageView.hideChatFragment();
            showFullScreenInput(false);
        }else {
            mPlaybackMessageView.showChatFragment();
            updateLayout();
        }

        //根据后台文字互动模块问答区设置是否显示
        if (!moduleConfigHelper.getModuleEnable(ModuleConfigHelper.KEY_MOD_TEXT_PLAYBACK) || !moduleConfigHelper.getModuleEnable(ModuleConfigHelper.KEY_MOD_TEXT_PLAYBACK_QA)){
           // mLiveMessageView.hideQuestionFragment();
            mPlaybackMessageView.hideQuestionFragment();
        }else{
           // mLiveMessageView.showQuestionFragment();
            mPlaybackMessageView.showQuestionFragment();
        }

        Long playTime = getCachePlayTime();
        if(playTime > 0){
            mHtSdk.playbackSeekTo(playTime);
        }

    }

    private void setSeekBar() {
        seekBar.setClickable(true);
        seekBar.setOnSeekBarChangeListener(onSeekBarChangeListener);
        long duration = PlaybackInfo.getInstance().getDurationLong();

        seekBar.setMax((int) duration);
        totalDuration.setText(TimeUtil.displayHHMMSS((int) duration));
    }

    /**
     * 初始化失败
     *
     * @param msg
     */
    @Override
    public void onInitFail(String msg) {
        Log.d(TAG, "onInitFail:" + msg);
    }

    protected void registerNetWorkStateReceiver(){
        //如果是离线播放本地回放，不需要网络状态监测
       if(mHtSdk != null && mHtSdk.isPlayLocal()){
           return;
       }
       super.registerNetWorkStateReceiver();
    }
    //TODO-----------------------------------------activity life------------------------------------------------
    @Override
    public void onBackPressed() {
        gobackAction();
    }

    @Override
    protected void onResume() {
        super.onResume();
        seekBarHelper.updateSeekBar();
    }


    @Override
    protected void onPause() {
        super.onPause();
        mHtSdk.onPause();
        seekBarHelper.stopUpdateSeekBar();
    }

    @Override
    protected void onDestroy() {
        cachePlayTime();
        super.onDestroy();
        onSeekBarChangeListener = null;
        if (mPlaybackMessageView != null) {
            mPlaybackMessageView.clear();
        }
    }

    @Override
    public void onStart() {
        super.onStart();

    }

    @Override
    public void onStop() {
        super.onStop();
    }



    //TODO--------------------------------------------视频播放状态-----------------------------------------

    private SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            currentDuration.setText(TimeUtil.displayHHMMSS(progress));
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            int progress = seekBar.getProgress();
            seekTo(progress);
        }
    };


    private void play() {
        setPlayingStatus();
        mHtSdk.playbackResume();

        seekBarHelper.updateSeekBar();
    }

    private void pause() {
        setPauseStatus();
        mHtSdk.playbackPause();
        seekBarHelper.stopUpdateSeekBar();
    }

    private void setPlayingStatus() {
        playBtn.setImageResource(R.mipmap.pause);
        mIsPlaying = true;
    }

    private void setPauseStatus() {
        playBtn.setImageResource(R.mipmap.play);
        mIsPlaying = false;
    }

    private void setStopStatus() {
        setPauseStatus();
        seekBarHelper.stopUpdateSeekBar();
        seekBarHelper.resetSeekBarProgress();
    }

    /**
     * 跳转到指定时间点
     */
    @Override
    public void seekTo(long progress) {
        seekBarHelper.seekTo(progress);
    }

    /**
     * 视频播放状态
     *
     * @param status 当前状态
     * @param msg    信息
     */
    @Override
    public void onVideoStatusChange(int status, String msg) {
        switch (status) {
            case OnVideoStatusChangeListener.STATUS_PAUSE:
                setPauseStatus();
                break;
            case OnVideoStatusChangeListener.STATUS_PLAYING:
                setPlayingStatus();
                break;
            case OnVideoStatusChangeListener.STATUS_ERROR:
                StringUtils.tip(getApplicationContext(), msg);
                break;
            case OnVideoStatusChangeListener.STATUS_IDLE:
                setStopStatus();
                break;
            case OnVideoStatusChangeListener.STATUS_COMPLETED:
                Log.d(TAG, "completed");
                // 播放完毕后重新播放
               if (PlaybackInfo.getInstance().isAlbum()) {
                    int currentIndex = PlaybackInfo.getInstance().getCurrentAlbumIndex();
                    List<AlbumItemEntity> albumItemEntities = PlaybackDataManage.getInstance().getAlbumList();
                    if ((albumItemEntities.size() <= 1) || (currentIndex >= albumItemEntities.size() - 1)) {
                        currentIndex = 0;
                    } else {
                        currentIndex++;
                    }
                    seekBarHelper.resetSeekBarProgress();
                    mHtSdk.playAlbum(albumItemEntities.get(currentIndex));
                    return;
                }
                mHtSdk.replayVideo();
                seekBarHelper.resetSeekBarProgress();
                seekBarHelper.updateSeekBar();
                break;
        }
    }

    @Override
    public void error(int code, String msg) {
        Toast.makeText(this, code + "------>>" + msg, Toast.LENGTH_SHORT).show();
        LogUtil.e("error:", code + "------>>" + msg);
    }

    @Override
    public void eventCallback(Event message) {
        if (message != null) {
            int type = message.getType();
            switch (type) {
                case EventType.ADDDANMAKU:
                    if (danmakuFlameUtil == null) return;
                    if (danmakuFlameUtil.isShown()) {   //如果弹幕 view 显示才添加弹幕信息
                        danmakuFlameUtil.addDanmaku((SpannableString) message.getData(), false);
                    }
                    break;
            }
        }
    }


  /*  private static final int MAX_SIZE = 1000 * 1000 * 50; // 50 mb
    private static final int MAX_COUNT = Integer.MAX_VALUE; // 不限制存放数据的数量*/

    static final int CACHE_VOD_PLAY_TIME_MAX_COUNT = 100;
    static final int CACHE_VOD_PLAY_TIME_MAX_SIZE = 1000 * 1000 * 50; //50mb
    static final String CACHE_VOD_PLAY_TIME_FILE_NAME = "vod_cache_play_time";
    ACache aCache;

    /**
     * 获取缓存播放时间
     * @return
     */
    public long getCachePlayTime(){
        String id = mHtSdk.getPlaybackInfo().getLiveId();
        ensureACache();
        return StringUtils.getLong(aCache.getAsString(id),0);
    }

    /**
     * 缓存播放时间
     */
    public void cachePlayTime(){
        ensureACache();
        String id = mHtSdk.getPlaybackInfo().getLiveId();
        long time = mHtSdk.getVideoCurrentTime();
        if(TextUtils.isEmpty(id))
            return;
        aCache.put(id,String.valueOf(time));
    }


    private void ensureACache(){
        if(aCache == null){
            File f = new File(getCacheDir(),CACHE_VOD_PLAY_TIME_FILE_NAME);
            aCache = ACache.get(f,CACHE_VOD_PLAY_TIME_MAX_SIZE,CACHE_VOD_PLAY_TIME_MAX_COUNT);
        }
    }




    /**
     * 视频播放切换事件监听
     */
    //TODO--------------------------------------------视频播放切换事件监听-------------------------------
    class OnPlayVideoChangeLister implements OnVideoChangeListener {
        /**
         * 视频开始播放
         *
         * @param mode 视频类型
         */
        @Override
        public void onVideoStart(int mode) {
        }

        /**
         * 视频停止播放
         *
         * @param mode 视频类型
         */
        @Override
        public void onVideoStop(int mode) {

        }

        /**
         * 视频播放模式类型切换
         *
         * @param beforeMode  切换前类型
         * @param currentMode 切换后类型
         */
        @Override
        public void onVideoModeChanging(int beforeMode, int currentMode) {

        }

        /**
         * 视频切换完成
         */
        @Override
        public void onVideoModeChanged() {

        }

        /**
         * 摄像头视频显示
         */
        @Override
        public void onCameraShow() {
            if (!userVideoShow) return;
            showVideoContainer(videoVisibleIv, true);
        }

        /**
         * 摄像头视隐藏
         */
        @Override
        public void onCameraHide() {
            exchangeViewContainer();
            showVideoContainer(videoVisibleIv, false);
        }
    }

}
