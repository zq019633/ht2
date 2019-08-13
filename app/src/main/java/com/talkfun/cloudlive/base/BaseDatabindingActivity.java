package com.talkfun.cloudlive.base;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.talkfun.cloudlive.entity.Event;
import com.talkfun.cloudlive.helper.NetWorkHelper;
import com.talkfun.cloudlive.util.ActivityStacks;
import com.talkfun.cloudlive.util.EventBusUtil;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/**
 * Created by ccy on 2019/5/8/16:32
 */
public abstract class BaseDatabindingActivity<B extends ViewDataBinding, VM extends BaseViewModel> extends AppCompatActivity {
    protected B mDatabinding;
    protected VM baseViewModel;
    private int viewModelId;
    private NetWorkHelper mNetworkHelper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initParam();
        //私有的初始化Databinding和ViewModel方法
        initViewDataBinding(savedInstanceState);
        initView();
        initData();
        mNetworkHelper = new NetWorkHelper(this);
        EventBusUtil.register(this);
        ActivityStacks.getInstance().addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBusUtil.unregister(this);
        ActivityStacks.getInstance().removeActivity(this);
    }

    private void initViewDataBinding(Bundle savedInstanceState) {
        mDatabinding = DataBindingUtil.setContentView(this, initContentView(savedInstanceState));
        viewModelId = initVariableId();
        baseViewModel = initViewModel();
        //关联ViewModel
        mDatabinding.setVariable(viewModelId, baseViewModel);
    }


    @Override
    protected void onResume() {
        super.onResume();
        mNetworkHelper.registerNetWorkStateReceiver();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mNetworkHelper.unRegisterNetWorkStateReceiver();
    }



    @Subscribe(threadMode = ThreadMode.MAIN)
    public void eventCallback(Event message) {
    }

    protected abstract int initContentView(Bundle savedInstanceState);

    /**
     * 初始化ViewModel的id
     *
     * @return BR的id
     */
    public abstract int initVariableId();

    protected abstract VM initViewModel();

    //页面接受的参数方法
    public void initParam() {

    }
    protected abstract void initView();
    protected abstract void initData();

}
