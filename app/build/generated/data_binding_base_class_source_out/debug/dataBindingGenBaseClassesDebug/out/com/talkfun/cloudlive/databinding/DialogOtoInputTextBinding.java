package com.talkfun.cloudlive.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.talkfun.cloudlive.view.ClearEditText;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogOtoInputTextBinding extends ViewDataBinding {
  @NonNull
  public final ClearEditText edtInput;

  @NonNull
  public final LinearLayout llButtonEdit;

  @NonNull
  public final RelativeLayout parentRl;

  @NonNull
  public final Button sendMessageBtn;

  @NonNull
  public final ImageView softDownIv;

  protected DialogOtoInputTextBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ClearEditText edtInput, LinearLayout llButtonEdit, RelativeLayout parentRl,
      Button sendMessageBtn, ImageView softDownIv) {
    super(_bindingComponent, _root, _localFieldCount);
    this.edtInput = edtInput;
    this.llButtonEdit = llButtonEdit;
    this.parentRl = parentRl;
    this.sendMessageBtn = sendMessageBtn;
    this.softDownIv = softDownIv;
  }

  @NonNull
  public static DialogOtoInputTextBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_oto_input_text, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogOtoInputTextBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogOtoInputTextBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.dialog_oto_input_text, root, attachToRoot, component);
  }

  @NonNull
  public static DialogOtoInputTextBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_oto_input_text, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogOtoInputTextBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogOtoInputTextBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.dialog_oto_input_text, null, false, component);
  }

  public static DialogOtoInputTextBinding bind(@NonNull View view) {
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
  public static DialogOtoInputTextBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogOtoInputTextBinding)bind(component, view, com.talkfun.cloudlive.R.layout.dialog_oto_input_text);
  }
}
