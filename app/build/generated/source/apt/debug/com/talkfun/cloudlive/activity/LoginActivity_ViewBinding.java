// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoginActivity_ViewBinding implements Unbinder {
  private LoginActivity target;

  private View view2131296567;

  private View view2131296588;

  private View view2131296496;

  private View view2131296533;

  private View view2131296582;

  private View view2131296832;

  private View view2131296809;

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginActivity_ViewBinding(final LoginActivity target, View source) {
    this.target = target;

    View view;
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.llUserIdLayout = Utils.findRequiredViewAsType(source, R.id.login_userId_layout, "field 'llUserIdLayout'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.ll_login_label, "field 'llLoginLabel' and method 'onClick'");
    target.llLoginLabel = Utils.castView(view, R.id.ll_login_label, "field 'llLoginLabel'", LinearLayout.class);
    view2131296567 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.tvUserIdLabel = Utils.findRequiredViewAsType(source, R.id.login_userId_label, "field 'tvUserIdLabel'", TextView.class);
    view = Utils.findRequiredView(source, R.id.login_userId_edit, "field 'etUserIdEdit' and method 'onClick'");
    target.etUserIdEdit = Utils.castView(view, R.id.login_userId_edit, "field 'etUserIdEdit'", EditText.class);
    view2131296588 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.llPasswordLayout = Utils.findRequiredViewAsType(source, R.id.login_password_layout, "field 'llPasswordLayout'", LinearLayout.class);
    target.etPasswordEdit = Utils.findRequiredViewAsType(source, R.id.login_password_edit, "field 'etPasswordEdit'", EditText.class);
    view = Utils.findRequiredView(source, R.id.iv_arrow, "field 'ivArrow' and method 'onClick'");
    target.ivArrow = Utils.castView(view, R.id.iv_arrow, "field 'ivArrow'", ImageView.class);
    view2131296496 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.llNicknameLayout = Utils.findRequiredViewAsType(source, R.id.ll_nickname_layout, "field 'llNicknameLayout'", LinearLayout.class);
    target.etNicknameEdit = Utils.findRequiredViewAsType(source, R.id.ed_nickname_edit, "field 'etNicknameEdit'", EditText.class);
    target.tvNickname = Utils.findRequiredViewAsType(source, R.id.tv_nickname, "field 'tvNickname'", TextView.class);
    target.tvErrorTip = Utils.findRequiredViewAsType(source, R.id.tv_error_tip, "field 'tvErrorTip'", TextView.class);
    target.ivLogo = Utils.findRequiredViewAsType(source, R.id.iv_logo, "field 'ivLogo'", ImageView.class);
    target.cbRememberId = Utils.findRequiredViewAsType(source, R.id.cb_isSelected, "field 'cbRememberId'", CheckBox.class);
    target.versionTV = Utils.findRequiredViewAsType(source, R.id.version_tv, "field 'versionTV'", TextView.class);
    view = Utils.findRequiredView(source, R.id.iv_scan, "method 'onClick'");
    view2131296533 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.login_btn, "method 'onClick'");
    view2131296582 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_login_old_version, "method 'onClick'");
    view2131296832 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_apply_for_try, "method 'onClick'");
    view2131296809 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    LoginActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.llUserIdLayout = null;
    target.llLoginLabel = null;
    target.tvUserIdLabel = null;
    target.etUserIdEdit = null;
    target.llPasswordLayout = null;
    target.etPasswordEdit = null;
    target.ivArrow = null;
    target.llNicknameLayout = null;
    target.etNicknameEdit = null;
    target.tvNickname = null;
    target.tvErrorTip = null;
    target.ivLogo = null;
    target.cbRememberId = null;
    target.versionTV = null;

    view2131296567.setOnClickListener(null);
    view2131296567 = null;
    view2131296588.setOnClickListener(null);
    view2131296588 = null;
    view2131296496.setOnClickListener(null);
    view2131296496 = null;
    view2131296533.setOnClickListener(null);
    view2131296533 = null;
    view2131296582.setOnClickListener(null);
    view2131296582 = null;
    view2131296832.setOnClickListener(null);
    view2131296832 = null;
    view2131296809.setOnClickListener(null);
    view2131296809 = null;
  }
}
