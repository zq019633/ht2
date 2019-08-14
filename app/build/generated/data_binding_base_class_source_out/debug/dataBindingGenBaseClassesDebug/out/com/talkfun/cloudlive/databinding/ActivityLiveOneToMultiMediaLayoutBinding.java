package com.talkfun.cloudlive.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.talkfun.widget.RotateImageView;
import com.talkfun.widget.round.RoundTextView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityLiveOneToMultiMediaLayoutBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout flMultiMedia;

  @NonNull
  public final FrameLayout flMultiMediaParent;

  @NonNull
  public final ImageView ivFullScreen;

  @NonNull
  public final RotateImageView ivMultiMediaDoctype;

  @Nullable
  public final ImageView ivMultiMediaPause;

  @NonNull
  public final ConstraintLayout progressBarParent;

  @NonNull
  public final ProgressBar timeProgress;

  @NonNull
  public final RoundTextView tvPause;

  @NonNull
  public final TextView tvTime;

  @NonNull
  public final View viewShade;

  protected ActivityLiveOneToMultiMediaLayoutBinding(Object _bindingComponent, View _root,
      int _localFieldCount, FrameLayout flMultiMedia, FrameLayout flMultiMediaParent,
      ImageView ivFullScreen, RotateImageView ivMultiMediaDoctype, ImageView ivMultiMediaPause,
      ConstraintLayout progressBarParent, ProgressBar timeProgress, RoundTextView tvPause,
      TextView tvTime, View viewShade) {
    super(_bindingComponent, _root, _localFieldCount);
    this.flMultiMedia = flMultiMedia;
    this.flMultiMediaParent = flMultiMediaParent;
    this.ivFullScreen = ivFullScreen;
    this.ivMultiMediaDoctype = ivMultiMediaDoctype;
    this.ivMultiMediaPause = ivMultiMediaPause;
    this.progressBarParent = progressBarParent;
    this.timeProgress = timeProgress;
    this.tvPause = tvPause;
    this.tvTime = tvTime;
    this.viewShade = viewShade;
  }

  @NonNull
  public static ActivityLiveOneToMultiMediaLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_live_one_to_multi_media_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLiveOneToMultiMediaLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityLiveOneToMultiMediaLayoutBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_media_layout, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLiveOneToMultiMediaLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_live_one_to_multi_media_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLiveOneToMultiMediaLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityLiveOneToMultiMediaLayoutBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_media_layout, null, false, component);
  }

  public static ActivityLiveOneToMultiMediaLayoutBinding bind(@NonNull View view) {
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
  public static ActivityLiveOneToMultiMediaLayoutBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityLiveOneToMultiMediaLayoutBinding)bind(component, view, com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_media_layout);
  }
}
