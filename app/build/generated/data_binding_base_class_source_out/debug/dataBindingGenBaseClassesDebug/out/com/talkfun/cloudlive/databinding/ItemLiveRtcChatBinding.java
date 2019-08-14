package com.talkfun.cloudlive.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.talkfun.sdk.consts.MemberRole;
import com.talkfun.sdk.module.ChatEntity;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemLiveRtcChatBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout leftLayout;

  @NonNull
  public final TextView leftMsg;

  @NonNull
  public final LinearLayout rightLayout;

  @NonNull
  public final TextView rightMsg;

  @Bindable
  protected MemberRole mMemberRole;

  @Bindable
  protected ChatEntity mChatEntity;

  protected ItemLiveRtcChatBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout leftLayout, TextView leftMsg, LinearLayout rightLayout, TextView rightMsg) {
    super(_bindingComponent, _root, _localFieldCount);
    this.leftLayout = leftLayout;
    this.leftMsg = leftMsg;
    this.rightLayout = rightLayout;
    this.rightMsg = rightMsg;
  }

  public abstract void setMemberRole(@Nullable MemberRole memberRole);

  @Nullable
  public MemberRole getMemberRole() {
    return mMemberRole;
  }

  public abstract void setChatEntity(@Nullable ChatEntity chatEntity);

  @Nullable
  public ChatEntity getChatEntity() {
    return mChatEntity;
  }

  @NonNull
  public static ItemLiveRtcChatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_live_rtc_chat, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemLiveRtcChatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemLiveRtcChatBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.item_live_rtc_chat, root, attachToRoot, component);
  }

  @NonNull
  public static ItemLiveRtcChatBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_live_rtc_chat, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemLiveRtcChatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemLiveRtcChatBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.item_live_rtc_chat, null, false, component);
  }

  public static ItemLiveRtcChatBinding bind(@NonNull View view) {
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
  public static ItemLiveRtcChatBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemLiveRtcChatBinding)bind(component, view, com.talkfun.cloudlive.R.layout.item_live_rtc_chat);
  }
}
