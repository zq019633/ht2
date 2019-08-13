// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.manager;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SwitchModePopManager_ViewBinding implements Unbinder {
  private SwitchModePopManager target;

  @UiThread
  public SwitchModePopManager_ViewBinding(SwitchModePopManager target, View source) {
    this.target = target;

    target.modeTV = Utils.findRequiredViewAsType(source, R.id.mode_text_tv, "field 'modeTV'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SwitchModePopManager target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.modeTV = null;
  }
}
