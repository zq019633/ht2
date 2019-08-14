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
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.talkfun.cloudlive.entity.VideoStatusData;
import com.talkfun.widget.RoundCornerLinearLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemOneToMultiVideoBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout allClose;

  @NonNull
  public final RoundCornerLinearLayout awardLl;

  @NonNull
  public final CardView cvCardview;

  @NonNull
  public final ImageView ivAllCloseAvatar;

  @NonNull
  public final ImageView ivAudio;

  @NonNull
  public final ImageView ivAvatar;

  @NonNull
  public final ImageView ivAward;

  @NonNull
  public final ImageView ivDraw;

  @NonNull
  public final ImageView ivVideo;

  @NonNull
  public final ProgressBar progressLoading;

  @NonNull
  public final TextView tvAwardCount;

  @NonNull
  public final TextView tvName;

  @NonNull
  public final FrameLayout videoLayout;

  @Bindable
  protected VideoStatusData mVideoData;

  protected ItemOneToMultiVideoBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FrameLayout allClose, RoundCornerLinearLayout awardLl, CardView cvCardview,
      ImageView ivAllCloseAvatar, ImageView ivAudio, ImageView ivAvatar, ImageView ivAward,
      ImageView ivDraw, ImageView ivVideo, ProgressBar progressLoading, TextView tvAwardCount,
      TextView tvName, FrameLayout videoLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.allClose = allClose;
    this.awardLl = awardLl;
    this.cvCardview = cvCardview;
    this.ivAllCloseAvatar = ivAllCloseAvatar;
    this.ivAudio = ivAudio;
    this.ivAvatar = ivAvatar;
    this.ivAward = ivAward;
    this.ivDraw = ivDraw;
    this.ivVideo = ivVideo;
    this.progressLoading = progressLoading;
    this.tvAwardCount = tvAwardCount;
    this.tvName = tvName;
    this.videoLayout = videoLayout;
  }

  public abstract void setVideoData(@Nullable VideoStatusData videoData);

  @Nullable
  public VideoStatusData getVideoData() {
    return mVideoData;
  }

  @NonNull
  public static ItemOneToMultiVideoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_one_to_multi_video, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemOneToMultiVideoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemOneToMultiVideoBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.item_one_to_multi_video, root, attachToRoot, component);
  }

  @NonNull
  public static ItemOneToMultiVideoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_one_to_multi_video, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemOneToMultiVideoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemOneToMultiVideoBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.item_one_to_multi_video, null, false, component);
  }

  public static ItemOneToMultiVideoBinding bind(@NonNull View view) {
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
  public static ItemOneToMultiVideoBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemOneToMultiVideoBinding)bind(component, view, com.talkfun.cloudlive.R.layout.item_one_to_multi_video);
  }
}
