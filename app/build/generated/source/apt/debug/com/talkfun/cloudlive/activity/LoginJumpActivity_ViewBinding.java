// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoginJumpActivity_ViewBinding implements Unbinder {
  private LoginJumpActivity target;

  @UiThread
  public LoginJumpActivity_ViewBinding(LoginJumpActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginJumpActivity_ViewBinding(LoginJumpActivity target, View source) {
    this.target = target;

    target.ivLogo = Utils.findRequiredViewAsType(source, R.id.iv_logo, "field 'ivLogo'", ImageView.class);
    target.tvCourseName = Utils.findRequiredViewAsType(source, R.id.tv_course_name, "field 'tvCourseName'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    LoginJumpActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivLogo = null;
    target.tvCourseName = null;
  }
}
