// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.manager;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.GridView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DrawAndStrokePopManager_ViewBinding implements Unbinder {
  private DrawAndStrokePopManager target;

  @UiThread
  public DrawAndStrokePopManager_ViewBinding(DrawAndStrokePopManager target, View source) {
    this.target = target;

    target.drawGV = Utils.findRequiredViewAsType(source, R.id.draw_gv, "field 'drawGV'", GridView.class);
    target.strokeGV = Utils.findRequiredViewAsType(source, R.id.stroke_gv, "field 'strokeGV'", GridView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DrawAndStrokePopManager target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.drawGV = null;
    target.strokeGV = null;
  }
}
