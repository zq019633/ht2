// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import com.talkfun.cloudlive.view.LoadingImageView;
import com.talkfun.cloudlive.view.SectorLayout;
import com.talkfun.widget.ColorView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LiveMixNativeActivity_ViewBinding implements Unbinder {
  private LiveMixNativeActivity target;

  private View view2131296656;

  private View view2131296649;

  private View view2131296419;

  private View view2131296366;

  private View view2131296866;

  private View view2131296322;

  private View view2131296636;

  private View view2131296725;

  private View view2131296729;

  private View view2131296726;

  private View view2131296727;

  private View view2131296305;

  private View view2131296302;

  @UiThread
  public LiveMixNativeActivity_ViewBinding(LiveMixNativeActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LiveMixNativeActivity_ViewBinding(final LiveMixNativeActivity target, View source) {
    this.target = target;

    View view;
    target.base_container = Utils.findRequiredViewAsType(source, R.id.base_container, "field 'base_container'", LinearLayout.class);
    target.pptLayout = Utils.findRequiredViewAsType(source, R.id.ppt_fl_layout, "field 'pptLayout'", FrameLayout.class);
    target.videoLayout = Utils.findRequiredViewAsType(source, R.id.video_container, "field 'videoLayout'", FrameLayout.class);
    view = Utils.findRequiredView(source, R.id.ppt_container, "field 'pptContainer' and method 'onClick'");
    target.pptContainer = Utils.castView(view, R.id.ppt_container, "field 'pptContainer'", FrameLayout.class);
    view2131296656 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.videoContainerRV = Utils.findRequiredViewAsType(source, R.id.video_view_container_rv, "field 'videoContainerRV'", RecyclerView.class);
    target.controllContainer = Utils.findRequiredViewAsType(source, R.id.activity_small_container, "field 'controllContainer'", LinearLayout.class);
    target.titlebarContainer = Utils.findRequiredViewAsType(source, R.id.activity_small_titlebar, "field 'titlebarContainer'", RelativeLayout.class);
    target.badNetStatusLL = Utils.findRequiredViewAsType(source, R.id.bad_netStatus_ll, "field 'badNetStatusLL'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.platform_iv, "field 'platformIV' and method 'onClick'");
    target.platformIV = Utils.castView(view, R.id.platform_iv, "field 'platformIV'", LoadingImageView.class);
    view2131296649 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.down_platform_iv, "field 'downPlatformIV' and method 'onClick'");
    target.downPlatformIV = view;
    view2131296419 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.chat_iv, "field 'chatFab' and method 'onClick'");
    target.chatFab = view;
    view2131296366 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.video_switch_iv, "field 'videoSwitchIV' and method 'onClick'");
    target.videoSwitchIV = Utils.castView(view, R.id.video_switch_iv, "field 'videoSwitchIV'", ImageView.class);
    view2131296866 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.audio_switch_iv, "field 'audioSwitchIV' and method 'onClick'");
    target.audioSwitchIV = Utils.castView(view, R.id.audio_switch_iv, "field 'audioSwitchIV'", ImageView.class);
    view2131296322 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.titleTV = Utils.findRequiredViewAsType(source, R.id.activity_small_title_tv, "field 'titleTV'", TextView.class);
    target.cuurentPlayTotalTimeTV = Utils.findRequiredViewAsType(source, R.id.activity_small_play_total_time_tv, "field 'cuurentPlayTotalTimeTV'", TextView.class);
    target.networkStateTV = Utils.findRequiredViewAsType(source, R.id.network_state_tv, "field 'networkStateTV'", TextView.class);
    view = Utils.findRequiredView(source, R.id.paint_sl, "field 'paintSL' and method 'onClick'");
    target.paintSL = Utils.castView(view, R.id.paint_sl, "field 'paintSL'", SectorLayout.class);
    view2131296636 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.paintIV = Utils.findRequiredViewAsType(source, R.id.sector_layout_paint_iv, "field 'paintIV'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.sector_layout_cmd_iv, "field 'cmdIV' and method 'onClick'");
    target.cmdIV = Utils.castView(view, R.id.sector_layout_cmd_iv, "field 'cmdIV'", ImageView.class);
    view2131296725 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.sector_layout_stroke_cv, "field 'strokeCV' and method 'onClick'");
    target.strokeCV = Utils.castView(view, R.id.sector_layout_stroke_cv, "field 'strokeCV'", ColorView.class);
    view2131296729 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.sector_layout_color_cv, "field 'colorCV' and method 'onClick'");
    target.colorCV = Utils.castView(view, R.id.sector_layout_color_cv, "field 'colorCV'", ColorView.class);
    view2131296726 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.sector_layout_eraser_iv, "field 'eraserIV' and method 'onClick'");
    target.eraserIV = Utils.castView(view, R.id.sector_layout_eraser_iv, "field 'eraserIV'", ImageView.class);
    view2131296727 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.activity_small_refresh_iv, "method 'onClick'");
    view2131296305 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.activity_small_back_rl, "method 'onClick'");
    view2131296302 = view;
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
    LiveMixNativeActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.base_container = null;
    target.pptLayout = null;
    target.videoLayout = null;
    target.pptContainer = null;
    target.videoContainerRV = null;
    target.controllContainer = null;
    target.titlebarContainer = null;
    target.badNetStatusLL = null;
    target.platformIV = null;
    target.downPlatformIV = null;
    target.chatFab = null;
    target.videoSwitchIV = null;
    target.audioSwitchIV = null;
    target.titleTV = null;
    target.cuurentPlayTotalTimeTV = null;
    target.networkStateTV = null;
    target.paintSL = null;
    target.paintIV = null;
    target.cmdIV = null;
    target.strokeCV = null;
    target.colorCV = null;
    target.eraserIV = null;

    view2131296656.setOnClickListener(null);
    view2131296656 = null;
    view2131296649.setOnClickListener(null);
    view2131296649 = null;
    view2131296419.setOnClickListener(null);
    view2131296419 = null;
    view2131296366.setOnClickListener(null);
    view2131296366 = null;
    view2131296866.setOnClickListener(null);
    view2131296866 = null;
    view2131296322.setOnClickListener(null);
    view2131296322 = null;
    view2131296636.setOnClickListener(null);
    view2131296636 = null;
    view2131296725.setOnClickListener(null);
    view2131296725 = null;
    view2131296729.setOnClickListener(null);
    view2131296729 = null;
    view2131296726.setOnClickListener(null);
    view2131296726 = null;
    view2131296727.setOnClickListener(null);
    view2131296727 = null;
    view2131296305.setOnClickListener(null);
    view2131296305 = null;
    view2131296302.setOnClickListener(null);
    view2131296302 = null;
  }
}
