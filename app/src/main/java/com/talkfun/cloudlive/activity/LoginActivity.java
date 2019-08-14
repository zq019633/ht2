//package com.talkfun.cloudlive.activity;
//
//import android.app.Activity;
//import android.os.Bundle;
//import androidx.annotation.Nullable;
//import androidx.appcompat.widget.Toolbar;
//import android.text.Editable;
//import android.text.TextUtils;
//import android.text.TextWatcher;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.view.MotionEvent;
//import android.view.View;
//import android.view.inputmethod.InputMethodManager;
//import android.widget.AdapterView;
//import android.widget.CheckBox;
//import android.widget.EditText;
//import android.widget.ImageView;
//import android.widget.LinearLayout;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import com.bumptech.glide.Glide;
//import com.talkfun.cloudlive.R;
//import com.talkfun.cloudlive.TFApplication;
//import com.talkfun.cloudlive.consts.MainConsts;
//import com.talkfun.cloudlive.consts.PlayType;
//import com.talkfun.cloudlive.entity.PrePlaybackEntity;
//import com.talkfun.cloudlive.entity.PlaybackDataConverter;
//import com.talkfun.cloudlive.manager.PopWindowManager;
//import com.talkfun.cloudlive.net.HttpRequest;
//import com.talkfun.cloudlive.util.ActivityUtil;
//import com.talkfun.cloudlive.util.AppUtil;
//import com.talkfun.cloudlive.util.CacheUtils;
//import com.talkfun.cloudlive.util.DimensionUtils;
//import com.talkfun.cloudlive.util.SharedPreferencesUtil;
//import com.talkfun.cloudlive.view.CustomSpinnerView;
//import com.talkfun.sdk.http.PreDataRequestManager;
//import com.talkfun.sdk.model.PreDataForPlaybackInitModel;
//import com.talkfun.sdk.offline.PlaybackDownloader;
//
//import org.json.JSONException;
//import org.json.JSONObject;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import butterknife.BindView;
//import butterknife.ButterKnife;
//import butterknife.OnClick;
//
///**
// * Created by Administrator on 2017/4/19 0019.
// */
//public class LoginActivity extends BaseActivity {
//    @BindView(R.id.toolbar)
//    Toolbar toolbar;
//    @BindView(R.id.login_userId_layout)
//    LinearLayout llUserIdLayout;
//    @BindView(R.id.ll_login_label)
//    LinearLayout llLoginLabel;
//    @BindView(R.id.login_userId_label)
//    TextView tvUserIdLabel;
//    @BindView(R.id.login_userId_edit)
//    EditText etUserIdEdit;
//    @BindView(R.id.login_password_layout)
//    LinearLayout llPasswordLayout;
//    //    @BindView(R.id.login_password_label)
////    TextView tvPasswordLabel;
//    @BindView(R.id.login_password_edit)
//    EditText etPasswordEdit;
//    //    @BindView(R.id.login_password_hint_tv)
////    TextView tvPasswordHint;
//    @BindView(R.id.iv_arrow)
//    ImageView ivArrow;
//    @BindView(R.id.ll_nickname_layout)
//    LinearLayout llNicknameLayout;
//    @BindView(R.id.ed_nickname_edit)
//    EditText etNicknameEdit;
//    @BindView(R.id.tv_nickname)
//    TextView tvNickname;
//    @BindView(R.id.tv_error_tip)
//    TextView tvErrorTip;
//    @BindView(R.id.iv_logo)
//    ImageView ivLogo;
//    @BindView(R.id.cb_isSelected)
//    CheckBox cbRememberId;
//    @BindView(R.id.version_tv)
//    TextView versionTV;
//    private static final int QR_CODE_CODE = 0;
//    private CustomSpinnerView customSpinnerView;
//    private int type =  PlayType.LIVE; //登录类型，直播/点播
//    private ArrayList<String> idList;
//    private ArrayList<String> checkIdList;
//    private int listMaxSize = 5;
//    private List<String> popupWindowListData;
//    private long preClickTime = 0;
//    HttpRequest httpRequest;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);
//        ButterKnife.bind(this);
//        getCache();
//        initView();
//        initEvent();
//    }
//
//    private void getCache() {
//        idList = (ArrayList<String>) SharedPreferencesUtil.getStringList(this, SharedPreferencesUtil.SP_LOGIN_ID_LIST);
//        checkIdList = (ArrayList<String>) SharedPreferencesUtil.getStringList(this, SharedPreferencesUtil.SP_LOGIN_ID_LIST_CHECK);
//    }
//
//    private void initView() {
//        toolbar.setTitle("");
//        setSupportActionBar(toolbar);
//        customSpinnerView = new CustomSpinnerView(this);
//
//        if (checkIdList.size() > 0) {
//            etUserIdEdit.setText(checkIdList.get(0).trim());
//        }
//        String versionTip = this.getResources().getString(R.string.version_tip);
//        versionTV.setText(versionTip + AppUtil.getVerName(getApplicationContext()));
//    }
//
//    public void initLogo() {
//        String logoUrl = SharedPreferencesUtil.getString(this, SharedPreferencesUtil.SP_LOGIN_LOGO_URL);
//        if (!TextUtils.isEmpty(logoUrl)) {
//            ivLogo.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
//            ivLogo.getLayoutParams().width = LinearLayout.LayoutParams.WRAP_CONTENT;
////            RequestOptions requestOptions = new RequestOptions();
////            requestOptions.placeholder(R.mipmap.huan_tuo_icon);
////            Glide.with(this).load(logoUrl).apply(requestOptions).into(ivLogo);
//           // GlideImageLoader.create(ivLogo).load(logoUrl);
//            Glide.with(this).load(logoUrl).placeholder(R.mipmap.huan_tuo_icon).into(ivLogo);
//        }
//    }
//
//    private void initEvent() {
//        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem item) {
//                switch (item.getItemId()) {
//                    case R.id.video_save_list:
//                        ActivityUtil.jump(LoginActivity.this, PlayDownLoadActivity.class);
//                        break;
//                    case R.id.about_us:
//                        ActivityUtil.jump(LoginActivity.this, AboutUsActivity.class);
//                        break;
//                }
//                return true;
//            }
//        });
//
//        /**监听ID输入--焦点获取*/
//        etUserIdEdit.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View view, boolean b) {
//                llUserIdLayout.setSelected(b);
//                ivArrow.setSelected(false);
//                tvUserIdLabel.setTextColor(b == true ? getResources().getColor(R.color.login_blue) : getResources().getColor(R.color.login_gray));
//            }
//        });
//
//        /**监听密码输入--焦点获取*/
//        etPasswordEdit.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View view, boolean b) {
//                llPasswordLayout.setSelected(b);
//            }
//        });
//
//        /**监听昵称输入--焦点获取*/
//        etNicknameEdit.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View view, boolean b) {
//                llNicknameLayout.setSelected(b);
//                tvNickname.setTextColor(b == true ? getResources().getColor(R.color.login_blue) : getResources().getColor(R.color.login_gray));
//            }
//        });
//
//        /**ID模式选择*/
//        customSpinnerView.setOnSpinnerListener(new CustomSpinnerView.OnSpinnerListener() {
//            @Override
//            public void onItemClick(int position) {
//                setType((position == 0) ? PlayType.LIVE : PlayType.PLAYBACK);
//            }
//
//            @Override
//            public void onDismiss() {
//                ivArrow.setSelected(false);
//            }
//        });
//
//        etUserIdEdit.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                PopWindowManager.getInstance(LoginActivity.this).dismissPop();
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//
//            }
//        });
//
//
//    }
//
//    private void setType(int type) {
//        this.type = type;
//        tvUserIdLabel.setText(getResources().getString(type == PlayType.LIVE ? R.string.live_ID : R.string.playback_ID));
//        llNicknameLayout.setVisibility(type == PlayType.LIVE ? View.VISIBLE : View.GONE);
//        int position = (type == PlayType.LIVE) ? 0 : 1;
//        if (customSpinnerView.getSelectedPosition() != position)
//            customSpinnerView.setSelectedPosition(position);
//    }
//
//    @OnClick({R.id.iv_scan, R.id.ll_login_label, R.id.iv_arrow, R.id.login_btn, R.id.tv_login_old_version,
//            R.id.tv_apply_for_try, R.id.login_userId_edit})
//    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.iv_scan:  //扫码
//                ActivityUtil.jump(this, ScanQRCodeActivity.class);
//                break;
//            case R.id.iv_arrow:
//            case R.id.ll_login_label:
//                ivArrow.setSelected(true);
//                customSpinnerView.showAsDropDown(llLoginLabel, -DimensionUtils.dip2px(this, 10), 0);
//                break;
//            case R.id.login_btn: //登录
//                login();
//                break;
//            case R.id.tv_login_old_version: //旧版本登录
//                ActivityUtil.jump(this, LiveLoginActivity.class);
//                break;
//            case R.id.tv_apply_for_try: //申请试用
//                ActivityUtil.jump(this, ApplyForActivity.class);
//                break;
//            case R.id.login_userId_edit:  //点击ID输入框
//                showListPopWindow(idList);
//                break;
//        }
//    }
//
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    /**
//     * 登录
//     */
//    public void login() {
//        //id
//        final String id = etUserIdEdit.getText().toString().trim();
//        if (TextUtils.isEmpty(id)) {
//            tvErrorTip.setText("ID不能为空");
//            return;
//        }
//        //password
//        String password = etPasswordEdit.getText().toString().trim();
//
//        String nickname = etNicknameEdit.getText().toString().trim();
//        if (type == PlayType.LIVE) {
//            //nickname
//            if (TextUtils.isEmpty(nickname)) {
//                tvErrorTip.setText("昵称不能为空");
//                return;
//            }
//        }
//
//        //服务器请求
//        String params = type == PlayType.LIVE ? String.format(MainConsts.LIVE_LOGIN_PARAM, id, password, nickname, type) : String.format(MainConsts.PLAYBACK_LOGIN_PARAM, id, password, type);
//        if (httpRequest == null)
//            httpRequest = new HttpRequest(this);
//        httpRequest.sendRequestWithPost(MainConsts.LOGIN_URL, params, new HttpRequest.IHttpRequestListener() {
//            @Override
//            public void onRequestCompleted(String responseStr) {
//                try {
//                    JSONObject jsonObject = new JSONObject(responseStr);
//                    int code = jsonObject.optInt("code");
//                    if (code == 0) {
//                        JSONObject data = jsonObject.optJSONObject("data");
//                        if (data != null) {
//                            tvErrorTip.setText("");
////                            String token = "MmMwgzYhFDMjlzY0YmZ1kTM3AjMxMmYiJ2N5MDN5IWY8xHf9BjOiIXZk5WZnJCLiQDNzUTN3IiOiUWbh5mciwCM6ISYiwCM6ICZpdmIs01W6Iic0RXYiwiN2kTN1IzNzUTM6ISZtlGdnVmciwiIxMjMyIzM2QjI6ICZphnIsAjM6ICZpBnIsIiI6IichRXY2FmIsYjNzIDNzczM1EjOiUmcpBHelJCLigTN4gTM5ATOfVnI6ICZpVnIsIiMyMGO1xlMyMGO1xlI6ISZtFmbrNWauJCLwojIkl2XlNnc192YiwCMyojIkl2XyVmb0JXYwJCL0QzM1UzN6ICZp12bvJnIsIiclNXdiojIlx2byJye";
//                            String token = data.optString("access_token");
//                            String logo = data.optString("logo");
//                            String title = data.optString("title");
//                            int modeType = data.optInt("modetype");
//                            int smallType = data.optInt("smallType");
//                            insertListValueUniq(id.trim());
//                            SharedPreferencesUtil.saveString(LoginActivity.this, SharedPreferencesUtil.SP_LOGIN_LOGO_URL, logo);
//                            Bundle bundle = new Bundle();
//                            bundle.putString(LoginJumpActivity.TOKEN_PARAM, token);
//                            bundle.putString(LoginJumpActivity.LOG0_PARAM, logo);
//                            bundle.putString(LoginJumpActivity.TITLE_PARAM, title);
//                            bundle.putInt(LoginJumpActivity.TYPE_PARAM, type);
//                            bundle.putString(LoginJumpActivity.ID_PARAM, id);
//                            bundle.putInt(LoginJumpActivity.MODE_TYPE, modeType);
//                            bundle.putInt(LoginJumpActivity.SMALL_TYPE, smallType);
//                            if (type == PlayType.LIVE) {
//                                ActivityUtil.jump(LoginActivity.this, LoginJumpActivity.class, bundle);
//                            } else {
//                                requestPlaybackType(token, bundle);
//                            }
//                        }
//                    } else {
//                        tvErrorTip.setText(jsonObject.optString("msg"));
//                    }
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            @Override
//            public void onIOError(String errorStr) {
//                tvErrorTip.setText(errorStr);
//            }
//        });
//    }
//
//
//    /**
//     * 插入列表值
//     *
//     * @param value
//     */
//    private void insertListValueUniq(String value) {
//        if (idList.contains(value)) {
//            idList.remove(value);
//        }
//
//        if (checkIdList.contains(value)) {
//            checkIdList.remove(value);
//        }
//
//        if (cbRememberId.isChecked()) {
//            idList.add(0, value);
//            checkIdList.add(0, value);
//        } else {
//            idList.add(value);
//        }
//
//        while (checkIdList.size() > listMaxSize) {
//            checkIdList.remove(checkIdList.size() - 1);
//        }
//        while (idList.size() > listMaxSize) {
//            idList.remove(idList.size() - 1);
//        }
//
//        SharedPreferencesUtil.saveStringList(LoginActivity.this, SharedPreferencesUtil.SP_LOGIN_ID_LIST, idList);
//        SharedPreferencesUtil.saveStringList(LoginActivity.this, SharedPreferencesUtil.SP_LOGIN_ID_LIST_CHECK, checkIdList);
//    }
//
//    private void showListPopWindow(List<String> listDatas) {
//        popupWindowListData = listDatas;
//        if (!listDatas.isEmpty() && listDatas.size() > 0) {
//            if (etUserIdEdit.isFocusable()) {
//                PopWindowManager popWindowManager = PopWindowManager.getInstance(this);
//                if (!popWindowManager.isShowing()) {
//                    popWindowManager.showPopListView(etUserIdEdit, listDatas);
//                    /**监听下拉id列表的点击事件*/
//                    popWindowManager.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//                        @Override
//                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                            String item = popupWindowListData.get(position);
//                            if (position > 0) {
//                                popupWindowListData.remove(position);
//                                popupWindowListData.add(0, item);
//                            }
//                            if (etUserIdEdit.isFocusable()) {
//                                etUserIdEdit.setText(item);
//                                etUserIdEdit.setSelection(etUserIdEdit.getText().toString().length());
//                            }
//                            PopWindowManager.getInstance(LoginActivity.this).dismissPop();
//                        }
//                    });
//                }
//
//            }
//        }
//    }
//
//
//    private void release() {
//        /**退出移除所有的下载任务*/
//        PlaybackDownloader.getInstance().destroy();
//        CacheUtils.deleteCache(this);
//    }
//
//    @Override
//    protected void onResume() {
//        initLogo();
//        super.onResume();
//    }
//
//    @Override
//    public void onBackPressed() {
//        if (System.currentTimeMillis() - preClickTime > 2000) {
//            Toast.makeText(getApplicationContext(), getString(R.string.press_again_exit),
//                    Toast.LENGTH_SHORT).show();
//            preClickTime = System.currentTimeMillis();
//            return;
//        }
//        super.onBackPressed();
//        TFApplication.exit();
//    }
//
//    @Override
//    public boolean dispatchTouchEvent(MotionEvent ev) {
//        if (ev.getAction() == MotionEvent.ACTION_DOWN) {
//            View v = getCurrentFocus();
//            boolean hideInputResult = isShouldHideInput(v, ev);
//            if (hideInputResult) {
//                v.clearFocus();
//                InputMethodManager imm = (InputMethodManager) LoginActivity.this
//                        .getSystemService(Activity.INPUT_METHOD_SERVICE);
//                if (v != null) {
//                    if (imm.isActive()) {
//
//                        imm.hideSoftInputFromWindow(v.getApplicationWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
//                    }
//                }
//            }
//        }
//        return super.dispatchTouchEvent(ev);
//    }
//
//    public boolean isShouldHideInput(View v, MotionEvent event) {
//        if (v != null && (v instanceof EditText)) {
//            int[] leftTop = {0, 0};
//            //获取输入框当前的location位置
//            v.getLocationInWindow(leftTop);
//            int left = leftTop[0];
//            int top = leftTop[1];
//            int bottom = top + v.getHeight();
//            int right = left + v.getWidth();
//            //之前一直不成功的原因是,getX获取的是相对父视图的坐标,getRawX获取的才是相对屏幕原点的坐标！！！
////            Log.v("leftTop[]","zz--left:"+left+"--top:"+top+"--bottom:"+bottom+"--right:"+right);
////            Log.v("event","zz--getX():"+event.getRawX()+"--getY():"+event.getRawY());
//            if (event.getRawX() > left && event.getRawX() < right
//                    && event.getRawY() > top && event.getRawY() < bottom) {
//                // 点击的是输入框区域，保留点击EditText的事件
//                return false;
//            } else {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    private void requestPlaybackType(String token, final Bundle bundle) {
//        PreDataRequestManager preDataRequestManager = new PreDataRequestManager(this);
//        preDataRequestManager.requestPlaybackData(token, new PlaybackDataConverter(), new PreDataForPlaybackInitModel.Callback<PrePlaybackEntity>() {
//            @Override
//            public void success(PrePlaybackEntity result) {
//                bundle.putString(LoginJumpActivity.VIDEO_TYPE, result.getVideoType());
//                ActivityUtil.jump(LoginActivity.this, LoginJumpActivity.class, bundle);
//            }
//
//            @Override
//            public void failed(int code, String msg) {
//                tvErrorTip.setText(msg);
//            }
//        });
//    }
//}
