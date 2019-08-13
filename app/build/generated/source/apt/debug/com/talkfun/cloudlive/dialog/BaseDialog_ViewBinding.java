// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.dialog;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BaseDialog_ViewBinding implements Unbinder {
  private BaseDialog target;

  @UiThread
  public BaseDialog_ViewBinding(BaseDialog target, View source) {
    this.target = target;

    target.icon = Utils.findRequiredViewAsType(source, R.id.iv_icon, "field 'icon'", ImageView.class);
    target.title = Utils.findRequiredViewAsType(source, R.id.tv_title, "field 'title'", TextView.class);
    target.cancal = Utils.findRequiredViewAsType(source, R.id.cancel, "field 'cancal'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BaseDialog target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.icon = null;
    target.title = null;
    target.cancal = null;
  }
}
