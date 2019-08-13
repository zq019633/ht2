// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BaseLoginActivity_ViewBinding implements Unbinder {
  private BaseLoginActivity target;

  private View view2131296502;

  @UiThread
  public BaseLoginActivity_ViewBinding(BaseLoginActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public BaseLoginActivity_ViewBinding(final BaseLoginActivity target, View source) {
    this.target = target;

    View view;
    target.tvTabDefault = Utils.findRequiredViewAsType(source, R.id.tv_room, "field 'tvTabDefault'", TextView.class);
    target.tvTabCustom = Utils.findRequiredViewAsType(source, R.id.tv_course, "field 'tvTabCustom'", TextView.class);
    target.viewPager = Utils.findRequiredViewAsType(source, R.id.viewpager, "field 'viewPager'", ViewPager.class);
    target.packageTv = Utils.findRequiredViewAsType(source, R.id.package_tv, "field 'packageTv'", TextView.class);
    target.applyForTv = Utils.findRequiredViewAsType(source, R.id.apply_for, "field 'applyForTv'", TextView.class);
    target.tvChangeMode = Utils.findRequiredViewAsType(source, R.id.tv_change_mode, "field 'tvChangeMode'", TextView.class);
    view = Utils.findRequiredView(source, R.id.iv_chose_back, "method 'back'");
    view2131296502 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.back();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    BaseLoginActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvTabDefault = null;
    target.tvTabCustom = null;
    target.viewPager = null;
    target.packageTv = null;
    target.applyForTv = null;
    target.tvChangeMode = null;

    view2131296502.setOnClickListener(null);
    view2131296502 = null;
  }
}
