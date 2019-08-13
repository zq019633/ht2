// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import com.talkfun.cloudlive.view.MultipleStatusLayout2;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PlaybackOnlyVideoNativeActivity_ViewBinding implements Unbinder {
  private PlaybackOnlyVideoNativeActivity target;

  private View view2131296529;

  private View view2131296514;

  private View view2131296617;

  private View view2131296531;

  @UiThread
  public PlaybackOnlyVideoNativeActivity_ViewBinding(PlaybackOnlyVideoNativeActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PlaybackOnlyVideoNativeActivity_ViewBinding(final PlaybackOnlyVideoNativeActivity target,
      View source) {
    this.target = target;

    View view;
    target.operationContainer = Utils.findRequiredViewAsType(source, R.id.operation_btn_container, "field 'operationContainer'", LinearLayout.class);
    target.videoVisibleIv = Utils.findRequiredViewAsType(source, R.id.video_visibility_iv, "field 'videoVisibleIv'", ImageView.class);
    target.seekbarLayout = Utils.findRequiredViewAsType(source, R.id.seek_bar_layout, "field 'seekbarLayout'", LinearLayout.class);
    target.seekBar = Utils.findRequiredViewAsType(source, R.id.seek_bar, "field 'seekBar'", SeekBar.class);
    view = Utils.findRequiredView(source, R.id.iv_play, "field 'playBtn' and method 'onClick'");
    target.playBtn = Utils.castView(view, R.id.iv_play, "field 'playBtn'", ImageView.class);
    view2131296529 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.totalDuration = Utils.findRequiredViewAsType(source, R.id.total_duration, "field 'totalDuration'", TextView.class);
    target.currentDuration = Utils.findRequiredViewAsType(source, R.id.current_duration, "field 'currentDuration'", TextView.class);
    view = Utils.findRequiredView(source, R.id.iv_go_back, "field 'goBack' and method 'onClick'");
    target.goBack = Utils.castView(view, R.id.iv_go_back, "field 'goBack'", ImageView.class);
    view2131296514 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.titleBar = Utils.findRequiredViewAsType(source, R.id.title_bar, "field 'titleBar'", RelativeLayout.class);
    target.tvSpeed = Utils.findRequiredViewAsType(source, R.id.tv_speed, "field 'tvSpeed'", TextView.class);
    target.ivDanmuSwitch = Utils.findRequiredViewAsType(source, R.id.iv_danmu_switch, "field 'ivDanmuSwitch'", ImageView.class);
    target.ivExchange = Utils.findRequiredViewAsType(source, R.id.exchange, "field 'ivExchange'", ImageView.class);
    target.ivFullScreen = Utils.findRequiredViewAsType(source, R.id.fullScreen_iv, "field 'ivFullScreen'", ImageView.class);
    target.parentLayout = Utils.findRequiredViewAsType(source, R.id.parent_Layout, "field 'parentLayout'", RelativeLayout.class);
    target.multipleStatusLayout = Utils.findRequiredViewAsType(source, R.id.status_layout, "field 'multipleStatusLayout'", MultipleStatusLayout2.class);
    view = Utils.findRequiredView(source, R.id.network_choice_iv, "method 'onClick'");
    view2131296617 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.iv_refresh, "method 'onClick'");
    view2131296531 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    PlaybackOnlyVideoNativeActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.operationContainer = null;
    target.videoVisibleIv = null;
    target.seekbarLayout = null;
    target.seekBar = null;
    target.playBtn = null;
    target.totalDuration = null;
    target.currentDuration = null;
    target.goBack = null;
    target.titleBar = null;
    target.tvSpeed = null;
    target.ivDanmuSwitch = null;
    target.ivExchange = null;
    target.ivFullScreen = null;
    target.parentLayout = null;
    target.multipleStatusLayout = null;

    view2131296529.setOnClickListener(null);
    view2131296529 = null;
    view2131296514.setOnClickListener(null);
    view2131296514 = null;
    view2131296617.setOnClickListener(null);
    view2131296617 = null;
    view2131296531.setOnClickListener(null);
    view2131296531 = null;
  }
}
