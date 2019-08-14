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

public abstract class ItemLiveRtcChatLeftBinding extends ViewDataBinding {
  @Nullable
  public final TextView leftMsg;

  @Nullable
  public final LinearLayout rightLayout;

  @Nullable
  public final TextView rightMsg;

  @Bindable
  protected MemberRole mMemberRole;

  @Bindable
  protected ChatEntity mChatEntity;

  protected ItemLiveRtcChatLeftBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView leftMsg, LinearLayout rightLayout, TextView rightMsg) {
    super(_bindingComponent, _root, _localFieldCount);
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
  public static ItemLiveRtcChatLeftBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_live_rtc_chat_left, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemLiveRtcChatLeftBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemLiveRtcChatLeftBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.item_live_rtc_chat_left, root, attachToRoot, component);
  }

  @NonNull
  public static ItemLiveRtcChatLeftBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_live_rtc_chat_left, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemLiveRtcChatLeftBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemLiveRtcChatLeftBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.item_live_rtc_chat_left, null, false, component);
  }

  public static ItemLiveRtcChatLeftBinding bind(@NonNull View view) {
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
  public static ItemLiveRtcChatLeftBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemLiveRtcChatLeftBinding)bind(component, view, com.talkfun.cloudlive.R.layout.item_live_rtc_chat_left);
  }
}
