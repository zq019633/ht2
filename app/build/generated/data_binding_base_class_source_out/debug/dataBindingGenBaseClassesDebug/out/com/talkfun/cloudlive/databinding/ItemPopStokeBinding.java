package com.talkfun.cloudlive.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.talkfun.widget.DotView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemPopStokeBinding extends ViewDataBinding {
  @NonNull
  public final DotView stokeDv;

  protected ItemPopStokeBinding(Object _bindingComponent, View _root, int _localFieldCount,
      DotView stokeDv) {
    super(_bindingComponent, _root, _localFieldCount);
    this.stokeDv = stokeDv;
  }

  @NonNull
  public static ItemPopStokeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_pop_stoke, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemPopStokeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemPopStokeBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.item_pop_stoke, root, attachToRoot, component);
  }

  @NonNull
  public static ItemPopStokeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_pop_stoke, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemPopStokeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemPopStokeBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.item_pop_stoke, null, false, component);
  }

  public static ItemPopStokeBinding bind(@NonNull View view) {
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
  public static ItemPopStokeBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemPopStokeBinding)bind(component, view, com.talkfun.cloudlive.R.layout.item_pop_stoke);
  }
}
