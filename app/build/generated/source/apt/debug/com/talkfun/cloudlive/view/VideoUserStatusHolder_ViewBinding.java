// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class VideoUserStatusHolder_ViewBinding implements Unbinder {
  private VideoUserStatusHolder target;

  @UiThread
  public VideoUserStatusHolder_ViewBinding(VideoUserStatusHolder target, View source) {
    this.target = target;

    target.name = Utils.findRequiredViewAsType(source, R.id.user_name_tv, "field 'name'", TextView.class);
    target.video = Utils.findRequiredViewAsType(source, R.id.video_view_container, "field 'video'", FrameLayout.class);
    target.shadebgIV = Utils.findRequiredView(source, R.id.shade_iv, "field 'shadebgIV'");
    target.shadeRL = Utils.findRequiredView(source, R.id.shade_rl, "field 'shadeRL'");
    target.audioIV = Utils.findRequiredViewAsType(source, R.id.audio_iv, "field 'audioIV'", ImageView.class);
    target.paintIV = Utils.findRequiredViewAsType(source, R.id.paint_iv, "field 'paintIV'", ImageView.class);
    target.videoOffineProgressRL = Utils.findRequiredViewAsType(source, R.id.video_offline_progress_rl, "field 'videoOffineProgressRL'", RelativeLayout.class);
    target.bottom_ll = Utils.findRequiredViewAsType(source, R.id.bottom_ll, "field 'bottom_ll'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    VideoUserStatusHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.name = null;
    target.video = null;
    target.shadebgIV = null;
    target.shadeRL = null;
    target.audioIV = null;
    target.paintIV = null;
    target.videoOffineProgressRL = null;
    target.bottom_ll = null;
  }
}
