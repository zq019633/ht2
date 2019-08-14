// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.manager;

import android.view.View;
import android.widget.GridView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ColorViewPopManager_ViewBinding implements Unbinder {
  private ColorViewPopManager target;

  @UiThread
  public ColorViewPopManager_ViewBinding(ColorViewPopManager target, View source) {
    this.target = target;

    target.colorGV = Utils.findRequiredViewAsType(source, R.id.color_gv, "field 'colorGV'", GridView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ColorViewPopManager target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.colorGV = null;
  }
}
