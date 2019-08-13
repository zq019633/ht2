// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.manager;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ListView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LogPopManager_ViewBinding implements Unbinder {
  private LogPopManager target;

  @UiThread
  public LogPopManager_ViewBinding(LogPopManager target, View source) {
    this.target = target;

    target.mChatLV = Utils.findRequiredViewAsType(source, R.id.log_lv, "field 'mChatLV'", ListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    LogPopManager target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mChatLV = null;
  }
}
