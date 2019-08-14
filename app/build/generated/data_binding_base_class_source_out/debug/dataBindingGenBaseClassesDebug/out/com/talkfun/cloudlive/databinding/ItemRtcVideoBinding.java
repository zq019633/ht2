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
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemRtcVideoBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout allClose;

  @NonNull
  public final CardView cvCardview;

  @NonNull
  public final ImageView ivAllCloseAvatar;

  @NonNull
  public final ImageView ivAudio;

  @NonNull
  public final ImageView ivAvatar;

  @NonNull
  public final ImageView ivCloseVideoCenter;

  @NonNull
  public final ImageView ivVideo;

  @NonNull
  public final ProgressBar progressLoading;

  @NonNull
  public final TextView tvName;

  @NonNull
  public final FrameLayout videoLayout;

  @Bindable
  protected VideoStatusData mVideoData;

  protected ItemRtcVideoBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FrameLayout allClose, CardView cvCardview, ImageView ivAllCloseAvatar, ImageView ivAudio,
      ImageView ivAvatar, ImageView ivCloseVideoCenter, ImageView ivVideo,
      ProgressBar progressLoading, TextView tvName, FrameLayout videoLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.allClose = allClose;
    this.cvCardview = cvCardview;
    this.ivAllCloseAvatar = ivAllCloseAvatar;
    this.ivAudio = ivAudio;
    this.ivAvatar = ivAvatar;
    this.ivCloseVideoCenter = ivCloseVideoCenter;
    this.ivVideo = ivVideo;
    this.progressLoading = progressLoading;
    this.tvName = tvName;
    this.videoLayout = videoLayout;
  }

  public abstract void setVideoData(@Nullable VideoStatusData videoData);

  @Nullable
  public VideoStatusData getVideoData() {
    return mVideoData;
  }

  @NonNull
  public static ItemRtcVideoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_rtc_video, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemRtcVideoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemRtcVideoBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.item_rtc_video, root, attachToRoot, component);
  }

  @NonNull
  public static ItemRtcVideoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_rtc_video, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemRtcVideoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemRtcVideoBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.item_rtc_video, null, false, component);
  }

  public static ItemRtcVideoBinding bind(@NonNull View view) {
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
  public static ItemRtcVideoBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemRtcVideoBinding)bind(component, view, com.talkfun.cloudlive.R.layout.item_rtc_video);
  }
}
