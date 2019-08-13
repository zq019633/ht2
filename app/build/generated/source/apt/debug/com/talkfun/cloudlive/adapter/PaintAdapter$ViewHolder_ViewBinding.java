// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PaintAdapter$ViewHolder_ViewBinding implements Unbinder {
  private PaintAdapter.ViewHolder target;

  @UiThread
  public PaintAdapter$ViewHolder_ViewBinding(PaintAdapter.ViewHolder target, View source) {
    this.target = target;

    target.mImage = Utils.findRequiredViewAsType(source, R.id.type_iv, "field 'mImage'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PaintAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mImage = null;
  }
}
