package com.talkfun.cloudlive.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.talkfun.cloudlive.view.MultipleStatusLayout2;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityLiveOneToMultiNativeBinding extends ViewDataBinding {
  @Nullable
  public final ActivityLiveOneToMultiBottomBarBinding bottomBar;

  @NonNull
  public final FrameLayout flDesktopLayout;

  @NonNull
  public final FrameLayout flFullScreen;

  @Nullable
  public final ActivityLiveOneToMultiIpadRightOpratorBinding ipadRightOpratorRl;

  @Nullable
  public final ActivityLiveOneToMultiLeftOpratorBinding leftOpratorRl;

  @NonNull
  public final TipNetWorkErrorBinding llBadNetStatus;

  @NonNull
  public final LinearLayout llParent;

  @NonNull
  public final View llWhiteboardParent;

  @NonNull
  public final MultipleStatusLayout2 mlMultiStatus;

  @NonNull
  public final ActivityLiveOneToMultiMediaLayoutBinding multimediaLayout;

  @NonNull
  public final FrameLayout parentViewgroup;

  @Nullable
  public final ActivityLiveOneToMultiRightOpratorBinding rightOpratorRl;

  @NonNull
  public final RecyclerView rvVideo;

  @NonNull
  public final ActivityLiveOneToMultiToolBarBinding toolBar;

  @NonNull
  public final FrameLayout whiteboardFl;

  protected ActivityLiveOneToMultiNativeBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ActivityLiveOneToMultiBottomBarBinding bottomBar,
      FrameLayout flDesktopLayout, FrameLayout flFullScreen,
      ActivityLiveOneToMultiIpadRightOpratorBinding ipadRightOpratorRl,
      ActivityLiveOneToMultiLeftOpratorBinding leftOpratorRl, TipNetWorkErrorBinding llBadNetStatus,
      LinearLayout llParent, View llWhiteboardParent, MultipleStatusLayout2 mlMultiStatus,
      ActivityLiveOneToMultiMediaLayoutBinding multimediaLayout, FrameLayout parentViewgroup,
      ActivityLiveOneToMultiRightOpratorBinding rightOpratorRl, RecyclerView rvVideo,
      ActivityLiveOneToMultiToolBarBinding toolBar, FrameLayout whiteboardFl) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bottomBar = bottomBar;
    setContainedBinding(this.bottomBar);;
    this.flDesktopLayout = flDesktopLayout;
    this.flFullScreen = flFullScreen;
    this.ipadRightOpratorRl = ipadRightOpratorRl;
    setContainedBinding(this.ipadRightOpratorRl);;
    this.leftOpratorRl = leftOpratorRl;
    setContainedBinding(this.leftOpratorRl);;
    this.llBadNetStatus = llBadNetStatus;
    setContainedBinding(this.llBadNetStatus);;
    this.llParent = llParent;
    this.llWhiteboardParent = llWhiteboardParent;
    this.mlMultiStatus = mlMultiStatus;
    this.multimediaLayout = multimediaLayout;
    setContainedBinding(this.multimediaLayout);;
    this.parentViewgroup = parentViewgroup;
    this.rightOpratorRl = rightOpratorRl;
    setContainedBinding(this.rightOpratorRl);;
    this.rvVideo = rvVideo;
    this.toolBar = toolBar;
    setContainedBinding(this.toolBar);;
    this.whiteboardFl = whiteboardFl;
  }

  @NonNull
  public static ActivityLiveOneToMultiNativeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_live_one_to_multi_native, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLiveOneToMultiNativeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityLiveOneToMultiNativeBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_native, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLiveOneToMultiNativeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_live_one_to_multi_native, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLiveOneToMultiNativeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityLiveOneToMultiNativeBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_native, null, false, component);
  }

  public static ActivityLiveOneToMultiNativeBinding bind(@NonNull View view) {
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
  public static ActivityLiveOneToMultiNativeBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityLiveOneToMultiNativeBinding)bind(component, view, com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_native);
  }
}
