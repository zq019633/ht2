// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.fragment;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LiveLogInFragment_ViewBinding implements Unbinder {
  private LiveLogInFragment target;

  private View view7f090131;

  @UiThread
  public LiveLogInFragment_ViewBinding(final LiveLogInFragment target, View source) {
    this.target = target;

    View view;
    target.etName = Utils.findRequiredViewAsType(source, R.id.edt_nickname, "field 'etName'", EditText.class);
    target.edt_room_id = Utils.findRequiredViewAsType(source, R.id.edt_room_id, "field 'edt_room_id'", EditText.class);
    target.etKey = Utils.findRequiredViewAsType(source, R.id.edt_psw, "field 'etKey'", EditText.class);
    target.btnLogIn = Utils.findRequiredViewAsType(source, R.id.login, "field 'btnLogIn'", Button.class);
    view = Utils.findRequiredView(source, R.id.live_login_bg, "field 'liveBg' and method 'onClick'");
    target.liveBg = Utils.castView(view, R.id.live_login_bg, "field 'liveBg'", LinearLayout.class);
    view7f090131 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.cb_isSelected = Utils.findRequiredViewAsType(source, R.id.cb_isSelected, "field 'cb_isSelected'", CheckBox.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    LiveLogInFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.etName = null;
    target.edt_room_id = null;
    target.etKey = null;
    target.btnLogIn = null;
    target.liveBg = null;
    target.cb_isSelected = null;

    view7f090131.setOnClickListener(null);
    view7f090131 = null;
  }
}
