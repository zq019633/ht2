// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.adapter;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DrawAdapter$ViewHolder_ViewBinding implements Unbinder {
  private DrawAdapter.ViewHolder target;

  @UiThread
  public DrawAdapter$ViewHolder_ViewBinding(DrawAdapter.ViewHolder target, View source) {
    this.target = target;

    target.cmdBtn = Utils.findRequiredViewAsType(source, R.id.cmd_btn, "field 'cmdBtn'", ImageView.class);
    target.bg_fl = Utils.findRequiredView(source, R.id.bg_fl, "field 'bg_fl'");
  }

  @Override
  @CallSuper
  public void unbind() {
    DrawAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.cmdBtn = null;
    target.bg_fl = null;
  }
}
