package com.talkfun.cloudlive.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemPopDrawBindingImpl extends ViewDataBinding {
  @NonNull
  public final FrameLayout drawParentFl;

  @NonNull
  public final ImageView drawTypeIv;

  protected ItemPopDrawBindingImpl(Object _bindingComponent, View _root, int _localFieldCount,
      FrameLayout drawParentFl, ImageView drawTypeIv) {
    super(_bindingComponent, _root, _localFieldCount);
    this.drawParentFl = drawParentFl;
    this.drawTypeIv = drawTypeIv;
  }

  @NonNull
  public static ItemPopDrawBindingImpl inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_pop_draw, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemPopDrawBindingImpl inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemPopDrawBindingImpl>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.item_pop_draw, root, attachToRoot, component);
  }

  @NonNull
  public static ItemPopDrawBindingImpl inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_pop_draw, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemPopDrawBindingImpl inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemPopDrawBindingImpl>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.item_pop_draw, null, false, component);
  }

  public static ItemPopDrawBindingImpl bind(@NonNull View view) {
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
  public static ItemPopDrawBindingImpl bind(@NonNull View view, @Nullable Object component) {
    return (ItemPopDrawBindingImpl)bind(component, view, com.talkfun.cloudlive.R.layout.item_pop_draw);
  }
}
