// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import com.talkfun.widget.ColorView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ColorAdapter$ViewHolder_ViewBinding implements Unbinder {
  private ColorAdapter.ViewHolder target;

  @UiThread
  public ColorAdapter$ViewHolder_ViewBinding(ColorAdapter.ViewHolder target, View source) {
    this.target = target;

    target.cmdCV = Utils.findRequiredViewAsType(source, R.id.color_cv, "field 'cmdCV'", ColorView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ColorAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.cmdCV = null;
  }
}
