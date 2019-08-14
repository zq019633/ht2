package com.talkfun.cloudlive.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class TipNetWorkErrorBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout badNetStatusLl;

  protected TipNetWorkErrorBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout badNetStatusLl) {
    super(_bindingComponent, _root, _localFieldCount);
    this.badNetStatusLl = badNetStatusLl;
  }

  @NonNull
  public static TipNetWorkErrorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.tip_net_work_error, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static TipNetWorkErrorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<TipNetWorkErrorBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.tip_net_work_error, root, attachToRoot, component);
  }

  @NonNull
  public static TipNetWorkErrorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.tip_net_work_error, null, false, component)
   */
  @NonNull
  @Deprecated
  public static TipNetWorkErrorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<TipNetWorkErrorBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.tip_net_work_error, null, false, component);
  }

  public static TipNetWorkErrorBinding bind(@NonNull View view) {
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
  public static TipNetWorkErrorBinding bind(@NonNull View view, @Nullable Object component) {
    return (TipNetWorkErrorBinding)bind(component, view, com.talkfun.cloudlive.R.layout.tip_net_work_error);
  }
}
