package com.talkfun.cloudlive.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;

import com.talkfun.cloudlive.R;
import com.talkfun.cloudlive.bean.ScanQRLoginBean;
import com.talkfun.cloudlive.consts.MainConsts;
import com.talkfun.cloudlive.consts.PlayType;
import com.talkfun.cloudlive.net.HttpRequest;
import com.talkfun.sdk.log.TalkFunLogger;
import com.uuzuche.lib_zxing.activity.CaptureFragment;
import com.uuzuche.lib_zxing.activity.CodeUtils;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ScanQRCodeActivity extends BaseActivity {
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    public static String QRBEAN = "qrBean";


    /**
     * 直播登录页
     */
    public static final String LIVE_LOGIN = "liveLogin";
    /**
     * 直播页
     */
    public static final String LIVE = "live";
    /**
     * 临时登录页
     */
    public static final String TEMP_LOGIN = "tempLogin";
    /**
     * 回放登录页
     */
    public static final String PLAYBACK_LOGIN = "playbackLogin";

    /**
     * 回放页
     */
    public static final String PLAYBACK = "playback";

    /**
     * 课程模式
     */
    public static final String COURSE_LOGIN = "courseLogin";

    private ScanQRLoginBean mScanQRLoginBean;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_qrcode);
        ButterKnife.bind(this);
        toolbar.setTitle("扫一扫");
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.mipmap.go_back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        /**
         * 执行扫面Fragment的初始化操作
         */
        CaptureFragment captureFragment = new CaptureFragment();
        // 为二维码扫描界面设置定制化界面
        CodeUtils.setFragmentArgs(captureFragment, R.layout.my_camera);

        captureFragment.setAnalyzeCallback(analyzeCallback);
        /**
         * 替换我们的扫描控件
         */
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_my_container, captureFragment).commit();
    }


    /**
     * 二维码解析回调函数
     */
    CodeUtils.AnalyzeCallback analyzeCallback = new CodeUtils.AnalyzeCallback() {
        @Override
        public void onAnalyzeSuccess(Bitmap mBitmap, String result) {
            requestServer(result);
        }

        @Override
        public void onAnalyzeFailed() {
            ScanQRCodeActivity.this.finish();
        }
    };

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        finish();
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    /***
     * 服务器请求，获取登录指令（）
     * @param qrUrl
     */
    private void requestServer(String qrUrl) {
        try {
            qrUrl = URLEncoder.encode(qrUrl, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String params = String.format(MainConsts.QRCODE_URL_PARAM, qrUrl);
        HttpRequest request = new HttpRequest(this);
        TalkFunLogger.i(MainConsts.SCANQRCODE_URL + "?" + params);
        request.sendRequestWithPost(MainConsts.SCANQRCODE_URL, params, new HttpRequest.IHttpRequestListener() {
            @Override
            public void onRequestCompleted(String responseStr) {
                try {
                    JSONObject jsonObject = new JSONObject(responseStr);
                    int code = jsonObject.optInt("code");
                    if (code == 0) {
                        JSONObject data = jsonObject.optJSONObject("data");
                        if (data != null) {
                            mScanQRLoginBean = ScanQRLoginBean.objectFromData(data.toString());
                            login();
                        }
                    }
                    ScanQRCodeActivity.this.finish();
                } catch (JSONException e) {
                    e.printStackTrace();
                    ScanQRCodeActivity.this.finish();
                }
            }

            @Override
            public void onIOError(String errorStr) {
                ScanQRCodeActivity.this.finish();
            }
        });
    }

    /**
     * 登录页
     */
    private void login() {
        String type = mScanQRLoginBean.getType();
        if (mScanQRLoginBean == null & TextUtils.isEmpty(type)) {
            return;
        }
        switch (type) {
            case LIVE:
                loginJump(PlayType.LIVE);
                break;
            case PLAYBACK:
                loginJump(PlayType.PLAYBACK);
                break;
            case LIVE_LOGIN:
            case TEMP_LOGIN:
            case COURSE_LOGIN:
            case PLAYBACK_LOGIN:
                Intent intent1 = new Intent(ScanQRCodeActivity.this, ScanQRLoginActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable(QRBEAN, mScanQRLoginBean);
                intent1.putExtras(bundle);
                this.startActivity(intent1);
                break;

        }

    }

    /**
     * 直接跳转
     *
     * @param playType
     */
    private void loginJump(int playType) {
        Intent intent = new Intent(ScanQRCodeActivity.this, LoginJumpActivity.class);
        intent.putExtra(LoginJumpActivity.TOKEN_PARAM, mScanQRLoginBean.getAccess_token());
        intent.putExtra(LoginJumpActivity.LOG0_PARAM, mScanQRLoginBean.getLogo());
        intent.putExtra(LoginJumpActivity.TITLE_PARAM, mScanQRLoginBean.getTitle());
        intent.putExtra(LoginJumpActivity.TYPE_PARAM, playType);
        intent.putExtra(LoginJumpActivity.MODE_TYPE, mScanQRLoginBean.getMode());
        intent.putExtra(LoginJumpActivity.ID_PARAM, playType == PlayType.PLAYBACK ? mScanQRLoginBean.getLiveid() : mScanQRLoginBean.getRoomid());
        startActivity(intent);
    }
}
