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

public abstract class ActivityLiveOneToOneToolBarBinding extends ViewDataBinding {
  @NonNull
  public final ImageView backIv;

  @NonNull
  public final ImageView timeIv;

  @NonNull
  public final TextView timeTv;

  @NonNull
  public final TextView titleTv;

  protected ActivityLiveOneToOneToolBarBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ImageView backIv, ImageView timeIv, TextView timeTv, TextView titleTv) {
    super(_bindingComponent, _root, _localFieldCount);
    this.backIv = backIv;
    this.timeIv = timeIv;
    this.timeTv = timeTv;
    this.titleTv = titleTv;
  }

  @NonNull
  public static ActivityLiveOneToOneToolBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_live_one_to_one__tool_bar, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLiveOneToOneToolBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityLiveOneToOneToolBarBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_one__tool_bar, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLiveOneToOneToolBarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_live_one_to_one__tool_bar, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLiveOneToOneToolBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityLiveOneToOneToolBarBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_one__tool_bar, null, false, component);
  }

  public static ActivityLiveOneToOneToolBarBinding bind(@NonNull View view) {
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
  public static ActivityLiveOneToOneToolBarBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityLiveOneToOneToolBarBinding)bind(component, view, com.talkfun.cloudlive.R.layout.activity_live_one_to_one__tool_bar);
  }
}
