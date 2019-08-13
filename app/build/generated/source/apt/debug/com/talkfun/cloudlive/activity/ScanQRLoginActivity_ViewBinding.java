// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.Toolbar;
import android.view.View;
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

public class ScanQRLoginActivity_ViewBinding implements Unbinder {
  private ScanQRLoginActivity target;

  private View view2131296582;

  @UiThread
  public ScanQRLoginActivity_ViewBinding(ScanQRLoginActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ScanQRLoginActivity_ViewBinding(final ScanQRLoginActivity target, View source) {
    this.target = target;

    View view;
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.llPasswordLayout = Utils.findRequiredViewAsType(source, R.id.login_password_layout, "field 'llPasswordLayout'", LinearLayout.class);
    target.tvPasswordLabel = Utils.findRequiredViewAsType(source, R.id.login_password_label, "field 'tvPasswordLabel'", TextView.class);
    target.etPasswordEdit = Utils.findRequiredViewAsType(source, R.id.login_password_edit, "field 'etPasswordEdit'", EditText.class);
    target.tvPasswordHint = Utils.findRequiredViewAsType(source, R.id.login_password_hint_tv, "field 'tvPasswordHint'", TextView.class);
    target.tvErrorTip = Utils.findRequiredViewAsType(source, R.id.tv_error_tip, "field 'tvErrorTip'", TextView.class);
    target.tvCourseName = Utils.findRequiredViewAsType(source, R.id.tv_course_name, "field 'tvCourseName'", TextView.class);
    target.llNicknameLayout = Utils.findRequiredViewAsType(source, R.id.ll_nickname_layout, "field 'llNicknameLayout'", LinearLayout.class);
    target.edNicknameEdit = Utils.findRequiredViewAsType(source, R.id.ed_nickname_edit, "field 'edNicknameEdit'", EditText.class);
    target.tvNickname = Utils.findRequiredViewAsType(source, R.id.tv_nickname, "field 'tvNickname'", TextView.class);
    target.ivLogo = Utils.findRequiredViewAsType(source, R.id.iv_logo, "field 'ivLogo'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.login_btn, "method 'onClick'");
    view2131296582 = view;
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
    ScanQRLoginActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.llPasswordLayout = null;
    target.tvPasswordLabel = null;
    target.etPasswordEdit = null;
    target.tvPasswordHint = null;
    target.tvErrorTip = null;
    target.tvCourseName = null;
    target.llNicknameLayout = null;
    target.edNicknameEdit = null;
    target.tvNickname = null;
    target.ivLogo = null;

    view2131296582.setOnClickListener(null);
    view2131296582 = null;
  }
}
