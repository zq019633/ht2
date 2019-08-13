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
import com.talkfun.cloudlive.view.PlaybackMessageView;
import java.lang.IllegalStateException;
import java.lang.Override;
import master.flame.danmaku.ui.widget.DanmakuView;

public class PlaybackNativeActivity_ViewBinding implements Unbinder {
  private PlaybackNativeActivity target;

  private View view2131296869;

  private View view2131296529;

  private View view2131296514;

  private View view2131296843;

  private View view2131296504;

  private View view2131296466;

  private View view2131296446;

  private View view2131296617;

  private View view2131296531;

  @UiThread
  public PlaybackNativeActivity_ViewBinding(PlaybackNativeActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PlaybackNativeActivity_ViewBinding(final PlaybackNativeActivity target, View source) {
    this.target = target;

    View view;
    target.operationContainer = Utils.findRequiredViewAsType(source, R.id.operation_btn_container, "field 'operationContainer'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.video_visibility_iv, "field 'videoVisibleIv' and method 'onClick'");
    target.videoVisibleIv = Utils.castView(view, R.id.video_visibility_iv, "field 'videoVisibleIv'", ImageView.class);
    view2131296869 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
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
    target.mPlaybackMessageView = Utils.findRequiredViewAsType(source, R.id.tab_container, "field 'mPlaybackMessageView'", PlaybackMessageView.class);
    view = Utils.findRequiredView(source, R.id.tv_speed, "field 'tvSpeed' and method 'onClick'");
    target.tvSpeed = Utils.castView(view, R.id.tv_speed, "field 'tvSpeed'", TextView.class);
    view2131296843 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.danmakuView = Utils.findRequiredViewAsType(source, R.id.danmaku_view, "field 'danmakuView'", DanmakuView.class);
    view = Utils.findRequiredView(source, R.id.iv_danmu_switch, "field 'ivDanmuSwitch' and method 'onClick'");
    target.ivDanmuSwitch = Utils.castView(view, R.id.iv_danmu_switch, "field 'ivDanmuSwitch'", ImageView.class);
    view2131296504 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.fullScreen_iv, "method 'onClick'");
    view2131296466 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.exchange, "method 'onClick'");
    view2131296446 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
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
    PlaybackNativeActivity target = this.target;
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
    target.mPlaybackMessageView = null;
    target.tvSpeed = null;
    target.danmakuView = null;
    target.ivDanmuSwitch = null;

    view2131296869.setOnClickListener(null);
    view2131296869 = null;
    view2131296529.setOnClickListener(null);
    view2131296529 = null;
    view2131296514.setOnClickListener(null);
    view2131296514 = null;
    view2131296843.setOnClickListener(null);
    view2131296843 = null;
    view2131296504.setOnClickListener(null);
    view2131296504 = null;
    view2131296466.setOnClickListener(null);
    view2131296466 = null;
    view2131296446.setOnClickListener(null);
    view2131296446 = null;
    view2131296617.setOnClickListener(null);
    view2131296617 = null;
    view2131296531.setOnClickListener(null);
    view2131296531 = null;
  }
}
