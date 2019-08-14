package com.talkfun.cloudlive.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogFragmentOtmVoteBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView rvVote;

  protected DialogFragmentOtmVoteBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView rvVote) {
    super(_bindingComponent, _root, _localFieldCount);
    this.rvVote = rvVote;
  }

  @NonNull
  public static DialogFragmentOtmVoteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_fragment_otm_vote, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogFragmentOtmVoteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogFragmentOtmVoteBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.dialog_fragment_otm_vote, root, attachToRoot, component);
  }

  @NonNull
  public static DialogFragmentOtmVoteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_fragment_otm_vote, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogFragmentOtmVoteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogFragmentOtmVoteBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.dialog_fragment_otm_vote, null, false, component);
  }

  public static DialogFragmentOtmVoteBinding bind(@NonNull View view) {
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
  public static DialogFragmentOtmVoteBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogFragmentOtmVoteBinding)bind(component, view, com.talkfun.cloudlive.R.layout.dialog_fragment_otm_vote);
  }
}
