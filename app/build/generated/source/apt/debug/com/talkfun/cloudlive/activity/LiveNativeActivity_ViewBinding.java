// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import com.talkfun.cloudlive.view.FullScreenInputBarView;
import com.talkfun.cloudlive.view.LiveMessageView;
import java.lang.IllegalStateException;
import java.lang.Override;
import master.flame.danmaku.ui.widget.DanmakuView;

public class LiveNativeActivity_ViewBinding implements Unbinder {
  private LiveNativeActivity target;

  private View view2131296869;

  private View view2131296504;

  private View view2131296617;

  private View view2131296446;

  private View view2131296466;

  private View view2131296514;

  private View view2131296531;

  @UiThread
  public LiveNativeActivity_ViewBinding(LiveNativeActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LiveNativeActivity_ViewBinding(final LiveNativeActivity target, View source) {
    this.target = target;

    View view;
    target.mLiveMessageView = Utils.findRequiredViewAsType(source, R.id.tab_container, "field 'mLiveMessageView'", LiveMessageView.class);
    target.changeTip = Utils.findRequiredViewAsType(source, R.id.change_tip, "field 'changeTip'", TextView.class);
    view = Utils.findRequiredView(source, R.id.video_visibility_iv, "field 'videoVisibleIv' and method 'onClick'");
    target.videoVisibleIv = Utils.castView(view, R.id.video_visibility_iv, "field 'videoVisibleIv'", ImageView.class);
    view2131296869 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.iv_danmu_switch, "field 'ivDanmuSwitch' and method 'onClick'");
    target.ivDanmuSwitch = Utils.castView(view, R.id.iv_danmu_switch, "field 'ivDanmuSwitch'", ImageView.class);
    view2131296504 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.titlebarContainer = Utils.findRequiredViewAsType(source, R.id.title_bar, "field 'titlebarContainer'", RelativeLayout.class);
    target.danmakuView = Utils.findRequiredViewAsType(source, R.id.danmaku_view, "field 'danmakuView'", DanmakuView.class);
    view = Utils.findRequiredView(source, R.id.network_choice_iv, "field 'ivNetWorkChoice' and method 'onClick'");
    target.ivNetWorkChoice = Utils.castView(view, R.id.network_choice_iv, "field 'ivNetWorkChoice'", ImageView.class);
    view2131296617 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.operationContainer = Utils.findRequiredViewAsType(source, R.id.operation_btn_container, "field 'operationContainer'", RelativeLayout.class);
    target.fullScreenInputBarView = Utils.findRequiredViewAsType(source, R.id.ll_input_fullScreen, "field 'fullScreenInputBarView'", FullScreenInputBarView.class);
    target.memberFloatTV = Utils.findRequiredViewAsType(source, R.id.fab_float_window, "field 'memberFloatTV'", TextView.class);
    target.llBottomMenu = Utils.findRequiredViewAsType(source, R.id.ll_bottom_menu, "field 'llBottomMenu'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.exchange, "field 'ivExchange' and method 'onClick'");
    target.ivExchange = Utils.castView(view, R.id.exchange, "field 'ivExchange'", ImageView.class);
    view2131296446 = view;
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
    view = Utils.findRequiredView(source, R.id.iv_go_back, "method 'onClick'");
    view2131296514 = view;
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
    LiveNativeActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mLiveMessageView = null;
    target.changeTip = null;
    target.videoVisibleIv = null;
    target.ivDanmuSwitch = null;
    target.titlebarContainer = null;
    target.danmakuView = null;
    target.ivNetWorkChoice = null;
    target.operationContainer = null;
    target.fullScreenInputBarView = null;
    target.memberFloatTV = null;
    target.llBottomMenu = null;
    target.ivExchange = null;

    view2131296869.setOnClickListener(null);
    view2131296869 = null;
    view2131296504.setOnClickListener(null);
    view2131296504 = null;
    view2131296617.setOnClickListener(null);
    view2131296617 = null;
    view2131296446.setOnClickListener(null);
    view2131296446 = null;
    view2131296466.setOnClickListener(null);
    view2131296466 = null;
    view2131296514.setOnClickListener(null);
    view2131296514 = null;
    view2131296531.setOnClickListener(null);
    view2131296531 = null;
  }
}
