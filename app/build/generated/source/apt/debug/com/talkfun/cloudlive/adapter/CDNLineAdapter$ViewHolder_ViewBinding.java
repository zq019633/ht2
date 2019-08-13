// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CDNLineAdapter$ViewHolder_ViewBinding implements Unbinder {
  private CDNLineAdapter.ViewHolder target;

  @UiThread
  public CDNLineAdapter$ViewHolder_ViewBinding(CDNLineAdapter.ViewHolder target, View source) {
    this.target = target;

    target.tvLine = Utils.findRequiredViewAsType(source, R.id.tv_line, "field 'tvLine'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CDNLineAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvLine = null;
  }
}
