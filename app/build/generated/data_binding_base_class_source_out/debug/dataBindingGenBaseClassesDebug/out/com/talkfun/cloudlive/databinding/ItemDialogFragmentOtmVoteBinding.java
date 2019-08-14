package com.talkfun.cloudlive.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemDialogFragmentOtmVoteBinding extends ViewDataBinding {
  @NonNull
  public final Button btnCheck;

  @NonNull
  public final TextView nickname;

  @NonNull
  public final TextView tvLabel;

  @NonNull
  public final TextView tvVoteStartTime;

  @NonNull
  public final TextView tvVoteStatus;

  @NonNull
  public final View view;

  protected ItemDialogFragmentOtmVoteBinding(Object _bindingComponent, View _root,
      int _localFieldCount, Button btnCheck, TextView nickname, TextView tvLabel,
      TextView tvVoteStartTime, TextView tvVoteStatus, View view) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnCheck = btnCheck;
    this.nickname = nickname;
    this.tvLabel = tvLabel;
    this.tvVoteStartTime = tvVoteStartTime;
    this.tvVoteStatus = tvVoteStatus;
    this.view = view;
  }

  @NonNull
  public static ItemDialogFragmentOtmVoteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_dialog_fragment_otm_vote, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemDialogFragmentOtmVoteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemDialogFragmentOtmVoteBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.item_dialog_fragment_otm_vote, root, attachToRoot, component);
  }

  @NonNull
  public static ItemDialogFragmentOtmVoteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_dialog_fragment_otm_vote, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemDialogFragmentOtmVoteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemDialogFragmentOtmVoteBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.item_dialog_fragment_otm_vote, null, false, component);
  }

  public static ItemDialogFragmentOtmVoteBinding bind(@NonNull View view) {
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
  public static ItemDialogFragmentOtmVoteBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ItemDialogFragmentOtmVoteBinding)bind(component, view, com.talkfun.cloudlive.R.layout.item_dialog_fragment_otm_vote);
  }
}
