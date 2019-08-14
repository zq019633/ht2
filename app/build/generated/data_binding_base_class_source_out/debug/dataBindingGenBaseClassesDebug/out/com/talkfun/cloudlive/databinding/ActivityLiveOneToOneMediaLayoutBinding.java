package com.talkfun.cloudlive.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityLiveOneToOneMediaLayoutBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout flMultiMediaParent;

  protected ActivityLiveOneToOneMediaLayoutBinding(Object _bindingComponent, View _root,
      int _localFieldCount, FrameLayout flMultiMediaParent) {
    super(_bindingComponent, _root, _localFieldCount);
    this.flMultiMediaParent = flMultiMediaParent;
  }

  @NonNull
  public static ActivityLiveOneToOneMediaLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_live_one_to_one_media_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLiveOneToOneMediaLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityLiveOneToOneMediaLayoutBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_one_media_layout, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLiveOneToOneMediaLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_live_one_to_one_media_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLiveOneToOneMediaLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityLiveOneToOneMediaLayoutBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_one_media_layout, null, false, component);
  }

  public static ActivityLiveOneToOneMediaLayoutBinding bind(@NonNull View view) {
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
  public static ActivityLiveOneToOneMediaLayoutBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityLiveOneToOneMediaLayoutBinding)bind(component, view, com.talkfun.cloudlive.R.layout.activity_live_one_to_one_media_layout);
  }
}
