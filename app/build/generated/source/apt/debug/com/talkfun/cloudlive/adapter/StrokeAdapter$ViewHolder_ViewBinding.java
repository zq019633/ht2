// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.adapter;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import com.talkfun.cloudlive.view.StrokeView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class StrokeAdapter$ViewHolder_ViewBinding implements Unbinder {
  private StrokeAdapter.ViewHolder target;

  @UiThread
  public StrokeAdapter$ViewHolder_ViewBinding(StrokeAdapter.ViewHolder target, View source) {
    this.target = target;

    target.strokeSV = Utils.findRequiredViewAsType(source, R.id.stroke_sv, "field 'strokeSV'", StrokeView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    StrokeAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.strokeSV = null;
  }
}
