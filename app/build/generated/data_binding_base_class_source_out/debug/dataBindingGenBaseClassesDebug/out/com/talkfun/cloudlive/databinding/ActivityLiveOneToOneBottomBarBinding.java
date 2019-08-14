package com.talkfun.cloudlive.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityLiveOneToOneBottomBarBinding extends ViewDataBinding {
  @Nullable
  public final ImageView bottomChatIv;

  @Nullable
  public final TextView bottomChatMessageTv;

  @NonNull
  public final ImageView drawIv;

  @NonNull
  public final ImageView eraserIv;

  @Nullable
  public final RelativeLayout rlBottomBar;

  protected ActivityLiveOneToOneBottomBarBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ImageView bottomChatIv, TextView bottomChatMessageTv, ImageView drawIv,
      ImageView eraserIv, RelativeLayout rlBottomBar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bottomChatIv = bottomChatIv;
    this.bottomChatMessageTv = bottomChatMessageTv;
    this.drawIv = drawIv;
    this.eraserIv = eraserIv;
    this.rlBottomBar = rlBottomBar;
  }

  @NonNull
  public static ActivityLiveOneToOneBottomBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_live_one_to_one__bottom_bar, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLiveOneToOneBottomBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityLiveOneToOneBottomBarBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_one__bottom_bar, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLiveOneToOneBottomBarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_live_one_to_one__bottom_bar, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLiveOneToOneBottomBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityLiveOneToOneBottomBarBinding>inflateInternal(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_one__bottom_bar, null, false, component);
  }

  public static ActivityLiveOneToOneBottomBarBinding bind(@NonNull View view) {
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
  public static ActivityLiveOneToOneBottomBarBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityLiveOneToOneBottomBarBinding)bind(component, view, com.talkfun.cloudlive.R.layout.activity_live_one_to_one__bottom_bar);
  }
}
