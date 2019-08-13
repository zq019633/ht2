// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ApplyForActivity_ViewBinding implements Unbinder {
  private ApplyForActivity target;

  @UiThread
  public ApplyForActivity_ViewBinding(ApplyForActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ApplyForActivity_ViewBinding(ApplyForActivity target, View source) {
    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.rootLayout = Utils.findRequiredViewAsType(source, R.id.ll_webView_rootLayout, "field 'rootLayout'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ApplyForActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.rootLayout = null;
  }
}
