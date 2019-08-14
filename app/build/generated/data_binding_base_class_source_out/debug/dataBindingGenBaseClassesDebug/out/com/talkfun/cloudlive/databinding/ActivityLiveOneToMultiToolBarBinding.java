package com.talkfun.cloudlive.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityLiveOneToMultiToolBarBinding extends ViewDataBinding {
  @NonNull
  public final ImageView backIv;

  @NonNull
  public final ImageView refreshIv;

  @NonNull
  public final RelativeLayout rlToolbar;

  @NonNull
  public final ImageView timeIv;

  @NonNull
  public final TextView timeTv;

  @NonNull
  public final TextView titleTv;

  protected ActivityLiveOneToMultiToolBarBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ImageView backIv, ImageView refreshIv, RelativeLayout rlToolbar,
      ImageView timeIv, TextView timeTv, TextView titleTv) {
    super(_bindingComponent, _root, _localFieldCount);
    this.backIv = backIv;
    this.refreshIv = refreshIv;
    this.rlToolbar = rlToolbar;
    this.timeIv = timeIv;
    this.timeTv = timeTv;
    this.titleTv = titleTv;
  }

  @NonNull
  public static ActivityLiveOneToMultiToolBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_live_one_to_multi_tool_bar, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLiveOneToMultiToolBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityLiveOneToMultiToolBarBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_tool_bar, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLiveOneToMultiToolBarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_live_one_to_multi_tool_bar, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLiveOneToMultiToolBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityLiveOneToMultiToolBarBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_tool_bar, null, false, component);
  }

  public static ActivityLiveOneToMultiToolBarBinding bind(@NonNull View view) {
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
  public static ActivityLiveOneToMultiToolBarBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityLiveOneToMultiToolBarBinding)bind(component, view, com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_tool_bar);
  }
}
