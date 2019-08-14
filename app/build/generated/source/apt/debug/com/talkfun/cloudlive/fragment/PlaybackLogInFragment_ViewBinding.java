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

public class PlaybackLogInFragment_ViewBinding implements Unbinder {
  private PlaybackLogInFragment target;

  private View view7f090194;

  @UiThread
  public PlaybackLogInFragment_ViewBinding(final PlaybackLogInFragment target, View source) {
    this.target = target;

    View view;
    target.editText = Utils.findRequiredViewAsType(source, R.id.etID, "field 'editText'", EditText.class);
    target.edt_playback_psw = Utils.findRequiredViewAsType(source, R.id.edt_playback_psw, "field 'edt_playback_psw'", EditText.class);
    target.btnLogin = Utils.findRequiredViewAsType(source, R.id.btnLogin, "field 'btnLogin'", Button.class);
    target.btn_downloadLogin = Utils.findRequiredViewAsType(source, R.id.btn_downloadLogin, "field 'btn_downloadLogin'", Button.class);
    view = Utils.findRequiredView(source, R.id.play_login_bg, "field 'playBg' and method 'onClick'");
    target.playBg = Utils.castView(view, R.id.play_login_bg, "field 'playBg'", LinearLayout.class);
    view7f090194 = view;
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
    PlaybackLogInFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.editText = null;
    target.edt_playback_psw = null;
    target.btnLogin = null;
    target.btn_downloadLogin = null;
    target.playBg = null;
    target.cb_isSelected = null;

    view7f090194.setOnClickListener(null);
    view7f090194 = null;
  }
}
