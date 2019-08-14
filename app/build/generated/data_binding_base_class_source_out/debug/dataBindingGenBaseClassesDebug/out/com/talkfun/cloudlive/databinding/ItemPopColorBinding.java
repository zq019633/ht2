package com.talkfun.cloudlive.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.talkfun.widget.ColorView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemPopColorBinding extends ViewDataBinding {
  @NonNull
  public final ColorView colorCv;

  protected ItemPopColorBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ColorView colorCv) {
    super(_bindingComponent, _root, _localFieldCount);
    this.colorCv = colorCv;
  }

  @NonNull
  public static ItemPopColorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_pop_color, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemPopColorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemPopColorBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.item_pop_color, root, attachToRoot, component);
  }

  @NonNull
  public static ItemPopColorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_pop_color, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemPopColorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemPopColorBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.item_pop_color, null, false, component);
  }

  public static ItemPopColorBinding bind(@NonNull View view) {
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
  public static ItemPopColorBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemPopColorBinding)bind(component, view, com.talkfun.cloudlive.R.layout.item_pop_color);
  }
}
