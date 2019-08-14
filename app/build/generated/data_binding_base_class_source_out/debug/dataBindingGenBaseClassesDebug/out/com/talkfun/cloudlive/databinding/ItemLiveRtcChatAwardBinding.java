package com.talkfun.cloudlive.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.talkfun.sdk.rtc.entity.AwardEntity;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemLiveRtcChatAwardBinding extends ViewDataBinding {
  @Bindable
  protected AwardEntity mAwardEntity;

  protected ItemLiveRtcChatAwardBinding(Object _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setAwardEntity(@Nullable AwardEntity awardEntity);

  @Nullable
  public AwardEntity getAwardEntity() {
    return mAwardEntity;
  }

  @NonNull
  public static ItemLiveRtcChatAwardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_live_rtc_chat_award, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemLiveRtcChatAwardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemLiveRtcChatAwardBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.item_live_rtc_chat_award, root, attachToRoot, component);
  }

  @NonNull
  public static ItemLiveRtcChatAwardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_live_rtc_chat_award, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemLiveRtcChatAwardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemLiveRtcChatAwardBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.item_live_rtc_chat_award, null, false, component);
  }

  public static ItemLiveRtcChatAwardBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemLiveRtcChatAwardBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemLiveRtcChatAwardBinding)bind(component, view, com.talkfun.cloudlive.R.layout.item_live_rtc_chat_award);
  }
}
