package com.talkfun.cloudlive.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityLiveOneToMultiRightOpratorBinding extends ViewDataBinding {
  @NonNull
  public final ImageView chatIv;

  @NonNull
  public final ImageView drawIv;

  @NonNull
  public final ImageView eraserIv;

  @NonNull
  public final View viewRedPoint;

  @NonNull
  public final ImageView voteIv;

  protected ActivityLiveOneToMultiRightOpratorBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ImageView chatIv, ImageView drawIv, ImageView eraserIv,
      View viewRedPoint, ImageView voteIv) {
    super(_bindingComponent, _root, _localFieldCount);
    this.chatIv = chatIv;
    this.drawIv = drawIv;
    this.eraserIv = eraserIv;
    this.viewRedPoint = viewRedPoint;
    this.voteIv = voteIv;
  }

  @NonNull
  public static ActivityLiveOneToMultiRightOpratorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_live_one_to_multi__right_oprator, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLiveOneToMultiRightOpratorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityLiveOneToMultiRightOpratorBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_multi__right_oprator, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLiveOneToMultiRightOpratorBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_live_one_to_multi__right_oprator, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLiveOneToMultiRightOpratorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityLiveOneToMultiRightOpratorBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_multi__right_oprator, null, false, component);
  }

  public static ActivityLiveOneToMultiRightOpratorBinding bind(@NonNull View view) {
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
  public static ActivityLiveOneToMultiRightOpratorBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityLiveOneToMultiRightOpratorBinding)bind(component, view, com.talkfun.cloudlive.R.layout.activity_live_one_to_multi__right_oprator);
  }
}
