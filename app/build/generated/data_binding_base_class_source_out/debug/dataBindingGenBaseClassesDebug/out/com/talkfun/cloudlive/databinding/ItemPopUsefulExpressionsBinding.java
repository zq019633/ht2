package com.talkfun.cloudlive.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemPopUsefulExpressionsBinding extends ViewDataBinding {
  @Bindable
  protected String mTips;

  protected ItemPopUsefulExpressionsBinding(Object _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setTips(@Nullable String tips);

  @Nullable
  public String getTips() {
    return mTips;
  }

  @NonNull
  public static ItemPopUsefulExpressionsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_pop_useful_expressions, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemPopUsefulExpressionsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemPopUsefulExpressionsBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.item_pop_useful_expressions, root, attachToRoot, component);
  }

  @NonNull
  public static ItemPopUsefulExpressionsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_pop_useful_expressions, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemPopUsefulExpressionsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemPopUsefulExpressionsBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.item_pop_useful_expressions, null, false, component);
  }

  public static ItemPopUsefulExpressionsBinding bind(@NonNull View view) {
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
  public static ItemPopUsefulExpressionsBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ItemPopUsefulExpressionsBinding)bind(component, view, com.talkfun.cloudlive.R.layout.item_pop_useful_expressions);
  }
}
