package com.talkfun.cloudlive.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.talkfun.cloudlive.view.ClearEditText;
import com.talkfun.cloudlive.view.ExpressionLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogOtmInputTextBinding extends ViewDataBinding {
  @NonNull
  public final ClearEditText edtInput;

  @NonNull
  public final ImageView ivEmoticons;

  @NonNull
  public final ImageView ivPopInput;

  @NonNull
  public final ExpressionLayout layoutExpression;

  @NonNull
  public final LinearLayout llButtonEdit;

  @NonNull
  public final RelativeLayout parentRl;

  @NonNull
  public final RecyclerView rvUsefulExpression;

  @NonNull
  public final Button sendMessageBtn;

  @NonNull
  public final TextView tvUsefulExpression;

  protected DialogOtmInputTextBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ClearEditText edtInput, ImageView ivEmoticons, ImageView ivPopInput,
      ExpressionLayout layoutExpression, LinearLayout llButtonEdit, RelativeLayout parentRl,
      RecyclerView rvUsefulExpression, Button sendMessageBtn, TextView tvUsefulExpression) {
    super(_bindingComponent, _root, _localFieldCount);
    this.edtInput = edtInput;
    this.ivEmoticons = ivEmoticons;
    this.ivPopInput = ivPopInput;
    this.layoutExpression = layoutExpression;
    this.llButtonEdit = llButtonEdit;
    this.parentRl = parentRl;
    this.rvUsefulExpression = rvUsefulExpression;
    this.sendMessageBtn = sendMessageBtn;
    this.tvUsefulExpression = tvUsefulExpression;
  }

  @NonNull
  public static DialogOtmInputTextBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_otm_input_text, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogOtmInputTextBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogOtmInputTextBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.dialog_otm_input_text, root, attachToRoot, component);
  }

  @NonNull
  public static DialogOtmInputTextBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_otm_input_text, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogOtmInputTextBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogOtmInputTextBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.dialog_otm_input_text, null, false, component);
  }

  public static DialogOtmInputTextBinding bind(@NonNull View view) {
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
  public static DialogOtmInputTextBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogOtmInputTextBinding)bind(component, view, com.talkfun.cloudlive.R.layout.dialog_otm_input_text);
  }
}
