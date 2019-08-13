//package com.talkfun.cloudlive.base;
//
//
//import androidx.lifecycle.Lifecycle;
//import androidx.lifecycle.LifecycleObserver;
//import androidx.lifecycle.LifecycleOwner;
//import androidx.lifecycle.OnLifecycleEvent;
//
///**
// * 生命周期
// * Created by ccy on 2019/5/10/13:44
// */
//public interface IBaseViewModel extends LifecycleObserver {
//    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
//    void onAny(LifecycleOwner owner, Lifecycle.Event event);
//
//    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
//    void onCreate();
//
//    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
//    void onDestroy();
//
//    @OnLifecycleEvent(Lifecycle.Event.ON_START)
//    void onStart();
//
//    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
//    void onStop();
//
//    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
//    void onResume();
//
//    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
//    void onPause();
//}
