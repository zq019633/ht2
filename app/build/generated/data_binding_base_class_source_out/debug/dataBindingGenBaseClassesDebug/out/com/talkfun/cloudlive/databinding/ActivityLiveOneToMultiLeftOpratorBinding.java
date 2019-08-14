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
import com.talkfun.widget.HoloView;
import com.talkfun.widget.RippleView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityLiveOneToMultiLeftOpratorBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout flOrperatorRtcCancel;

  @NonNull
  public final ImageView ivOperatorAudio;

  @NonNull
  public final ImageView ivOperatorVideo;

  @NonNull
  public final HoloView ivOrperatorRtcApply;

  @NonNull
  public final HoloView ivOrperatorRtcDown;

  @NonNull
  public final RippleView rippleViewCancle;

  protected ActivityLiveOneToMultiLeftOpratorBinding(Object _bindingComponent, View _root,
      int _localFieldCount, FrameLayout flOrperatorRtcCancel, ImageView ivOperatorAudio,
      ImageView ivOperatorVideo, HoloView ivOrperatorRtcApply, HoloView ivOrperatorRtcDown,
      RippleView rippleViewCancle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.flOrperatorRtcCancel = flOrperatorRtcCancel;
    this.ivOperatorAudio = ivOperatorAudio;
    this.ivOperatorVideo = ivOperatorVideo;
    this.ivOrperatorRtcApply = ivOrperatorRtcApply;
    this.ivOrperatorRtcDown = ivOrperatorRtcDown;
    this.rippleViewCancle = rippleViewCancle;
  }

  @NonNull
  public static ActivityLiveOneToMultiLeftOpratorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_live_one_to_multi__left_oprator, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLiveOneToMultiLeftOpratorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityLiveOneToMultiLeftOpratorBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_multi__left_oprator, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLiveOneToMultiLeftOpratorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_live_one_to_multi__left_oprator, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLiveOneToMultiLeftOpratorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityLiveOneToMultiLeftOpratorBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_multi__left_oprator, null, false, component);
  }

  public static ActivityLiveOneToMultiLeftOpratorBinding bind(@NonNull View view) {
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
  public static ActivityLiveOneToMultiLeftOpratorBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityLiveOneToMultiLeftOpratorBinding)bind(component, view, com.talkfun.cloudlive.R.layout.activity_live_one_to_multi__left_oprator);
  }
}
