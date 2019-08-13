package com.talkfun.cloudlive.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.talkfun.cloudlive.R;
import com.talkfun.cloudlive.consts.LiveModeType;
import com.talkfun.cloudlive.consts.PlayType;
import com.talkfun.cloudlive.consts.PlaybackVideoType;
import com.talkfun.cloudlive.consts.SmallClassType;
import com.talkfun.cloudlive.imageload.GlideImageLoader;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class LoginJumpActivity extends BaseActivity {
    @BindView(R.id.iv_logo)
    ImageView ivLogo;
    @BindView(R.id.tv_course_name)
    TextView tvCourseName;
    private String logoUrl;
    private String token;
    private String title;
    private int type;
    private String id;
    private int modeType;
    public static final String TOKEN_PARAM = "token";
    public static final String LOG0_PARAM = "logo";
    public static final String TITLE_PARAM = "title";
    public static final String TYPE_PARAM = "type";
    public static final String ID_PARAM = "id";
    public static final String MODE_TYPE = "modeType";
    public static final String VIDEO_TYPE = "videoType";
    /**
     * 0：非小班，1：双人，2：1V6 模式，3：1V16模式
     */
    public static final String SMALL_TYPE = "smallType";
    private Handler handler = new Handler();
    private Unbinder binder;
    private int videoType;
    private int smallType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_jump);
        binder = ButterKnife.bind(this);
        init();
        initView();
        initEvent();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    private void init() {
        Intent intent = getIntent();
        logoUrl = intent.getStringExtra(LOG0_PARAM);
        token = intent.getStringExtra(TOKEN_PARAM);
        title = intent.getStringExtra(TITLE_PARAM);
        type = intent.getIntExtra(TYPE_PARAM, PlayType.LIVE);
        id = intent.getStringExtra(ID_PARAM);
        modeType = intent.getIntExtra(MODE_TYPE, LiveModeType.LARGE_CLASS_NORMAL);
        videoType = intent.getIntExtra(VIDEO_TYPE, PlaybackVideoType.NORMAL);
        smallType = intent.getIntExtra(SMALL_TYPE, SmallClassType.NON);
    }

    private void initView() {
        if (!TextUtils.isEmpty(logoUrl)) {
//            RequestOptions requestOptions = new RequestOptions();
//            requestOptions.centerCrop();
//            requestOptions.placeholder(R.mipmap.huan_tuo_icon);
            Glide.with(this).load(logoUrl).placeholder(R.mipmap.huan_tuo_icon).into(ivLogo);
            //GlideImageLoader.create(ivLogo).loadImage(logoUrl, R.mipmap.huan_tuo_icon);
        }
        if (!TextUtils.isEmpty(title))
            tvCourseName.setText(title);
    }

    private void initEvent() {
        handler.postDelayed(myRunnale, 2000);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (handler != null && myRunnale != null) {
            handler.removeCallbacks(myRunnale);
        }
    }

    private Runnable myRunnale = new Runnable() {
        @Override
        public void run() {
            Class targetClass = null;
            if (type == PlayType.LIVE) {
                if (modeType == LiveModeType.SMALL_CLASS) {
                    if (smallType == SmallClassType.ONE_V_ONE) {
                        targetClass = LiveOneToOneNativeActivity.class;//1V1 小班
                    } else {
                        targetClass = LiveOneToMultiNativeActivity.class;//1V6 1VN 小班
                    }
                } else if (modeType == LiveModeType.LARGE_CLASS_INTERACTION) {
                    targetClass = LiveMixNativeActivity.class;//大班互动模式
                } else {
                    targetClass = LiveNativeActivity.class;//大班
                }
            } else {
                targetClass = videoType == PlaybackVideoType.RECORD ? PlaybackOnlyVideoNativeActivity.class : PlaybackNativeActivity.class;
            }
            Intent intent = new Intent(LoginJumpActivity.this, targetClass);
            intent.putExtra(TOKEN_PARAM, token);
            intent.putExtra(ID_PARAM, id);
            startActivity(intent);
            finish();
        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        binder.unbind();
        if (handler != null && myRunnale != null) {
            handler.removeCallbacks(myRunnale);
            myRunnale = null;
            handler = null;
        }
    }
}
