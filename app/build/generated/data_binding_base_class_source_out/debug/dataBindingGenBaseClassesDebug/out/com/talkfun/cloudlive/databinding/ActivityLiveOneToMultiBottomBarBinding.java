package com.talkfun.cloudlive.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityLiveOneToMultiBottomBarBinding extends ViewDataBinding {
  @NonNull
  public final TextView bottomChatMessageTv;

  @NonNull
  public final ImageView chatIv;

  @NonNull
  public final ImageView drawIv;

  @NonNull
  public final ImageView eraserIv;

  @NonNull
  public final ImageView ivEmoticon;

  @NonNull
  public final ImageView voteIv;

  protected ActivityLiveOneToMultiBottomBarBinding(Object _bindingComponent, View _root,
      int _localFieldCount, TextView bottomChatMessageTv, ImageView chatIv, ImageView drawIv,
      ImageView eraserIv, ImageView ivEmoticon, ImageView voteIv) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bottomChatMessageTv = bottomChatMessageTv;
    this.chatIv = chatIv;
    this.drawIv = drawIv;
    this.eraserIv = eraserIv;
    this.ivEmoticon = ivEmoticon;
    this.voteIv = voteIv;
  }

  @NonNull
  public static ActivityLiveOneToMultiBottomBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_live_one_to_multi_bottom_bar, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLiveOneToMultiBottomBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityLiveOneToMultiBottomBarBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_bottom_bar, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLiveOneToMultiBottomBarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_live_one_to_multi_bottom_bar, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLiveOneToMultiBottomBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityLiveOneToMultiBottomBarBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_bottom_bar, null, false, component);
  }

  public static ActivityLiveOneToMultiBottomBarBinding bind(@NonNull View view) {
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
  public static ActivityLiveOneToMultiBottomBarBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityLiveOneToMultiBottomBarBinding)bind(component, view, com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_bottom_bar);
  }
}
