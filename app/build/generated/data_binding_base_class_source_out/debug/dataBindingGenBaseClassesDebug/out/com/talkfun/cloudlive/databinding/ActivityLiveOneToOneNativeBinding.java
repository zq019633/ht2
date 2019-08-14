package com.talkfun.cloudlive.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.talkfun.widget.MultipleStatusLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityLiveOneToOneNativeBinding extends ViewDataBinding {
  @NonNull
  public final ActivityLiveOneToOneBottomBarBinding bottomBar;

  @Nullable
  public final ActivityLiveOneToOneChatLayoutBinding chatLayout;

  @Nullable
  public final LinearLayout chatLl;

  @Nullable
  public final RecyclerView chatShowLayout;

  @NonNull
  public final FrameLayout flDesktopLayout;

  @NonNull
  public final FrameLayout flFullScreen;

  @NonNull
  public final TipNetWorkErrorBinding llBadNetStatus;

  @NonNull
  public final ActivityLiveOneToMultiMediaLayoutBinding multimediaLayout;

  @NonNull
  public final MultipleStatusLayout multipleStatusLayout;

  @NonNull
  public final FrameLayout parentViewgroup;

  @Nullable
  public final RelativeLayout rightRl;

  @NonNull
  public final ActivityLiveOneToOneToolBarBinding toolBar;

  @NonNull
  public final RecyclerView videoLayout;

  @Nullable
  public final LinearLayout whiteParentLl;

  @NonNull
  public final FrameLayout whiteboardFl;

  protected ActivityLiveOneToOneNativeBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ActivityLiveOneToOneBottomBarBinding bottomBar,
      ActivityLiveOneToOneChatLayoutBinding chatLayout, LinearLayout chatLl,
      RecyclerView chatShowLayout, FrameLayout flDesktopLayout, FrameLayout flFullScreen,
      TipNetWorkErrorBinding llBadNetStatus,
      ActivityLiveOneToMultiMediaLayoutBinding multimediaLayout,
      MultipleStatusLayout multipleStatusLayout, FrameLayout parentViewgroup,
      RelativeLayout rightRl, ActivityLiveOneToOneToolBarBinding toolBar, RecyclerView videoLayout,
      LinearLayout whiteParentLl, FrameLayout whiteboardFl) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bottomBar = bottomBar;
    setContainedBinding(this.bottomBar);;
    this.chatLayout = chatLayout;
    setContainedBinding(this.chatLayout);;
    this.chatLl = chatLl;
    this.chatShowLayout = chatShowLayout;
    this.flDesktopLayout = flDesktopLayout;
    this.flFullScreen = flFullScreen;
    this.llBadNetStatus = llBadNetStatus;
    setContainedBinding(this.llBadNetStatus);;
    this.multimediaLayout = multimediaLayout;
    setContainedBinding(this.multimediaLayout);;
    this.multipleStatusLayout = multipleStatusLayout;
    this.parentViewgroup = parentViewgroup;
    this.rightRl = rightRl;
    this.toolBar = toolBar;
    setContainedBinding(this.toolBar);;
    this.videoLayout = videoLayout;
    this.whiteParentLl = whiteParentLl;
    this.whiteboardFl = whiteboardFl;
  }

  @NonNull
  public static ActivityLiveOneToOneNativeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_live_one_to_one_native, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLiveOneToOneNativeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityLiveOneToOneNativeBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_one_native, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLiveOneToOneNativeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_live_one_to_one_native, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLiveOneToOneNativeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityLiveOneToOneNativeBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_one_native, null, false, component);
  }

  public static ActivityLiveOneToOneNativeBinding bind(@NonNull View view) {
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
  public static ActivityLiveOneToOneNativeBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityLiveOneToOneNativeBinding)bind(component, view, com.talkfun.cloudlive.R.layout.activity_live_one_to_one_native);
  }
}
