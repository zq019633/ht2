// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.dialog;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class GroupChatDialogFragment_ViewBinding implements Unbinder {
  private GroupChatDialogFragment target;

  private View view7f0901e5;

  @UiThread
  public GroupChatDialogFragment_ViewBinding(final GroupChatDialogFragment target, View source) {
    this.target = target;

    View view;
    target.questionLv = Utils.findRequiredViewAsType(source, R.id.chat_lv, "field 'questionLv'", ListView.class);
    target.inputEdt = Utils.findRequiredViewAsType(source, R.id.edt_input, "field 'inputEdt'", EditText.class);
    target.sendFlower = Utils.findRequiredViewAsType(source, R.id.input, "field 'sendFlower'", RelativeLayout.class);
    view = Utils.findRequiredView(source, R.id.send_btn, "field 'sendBtn' and method 'onClcik'");
    target.sendBtn = Utils.castView(view, R.id.send_btn, "field 'sendBtn'", TextView.class);
    view7f0901e5 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClcik();
      }
    });
    target.flower = Utils.findRequiredViewAsType(source, R.id.flower_btn, "field 'flower'", ImageView.class);
    target.redDot = Utils.findRequiredViewAsType(source, R.id.flower_num, "field 'redDot'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    GroupChatDialogFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.questionLv = null;
    target.inputEdt = null;
    target.sendFlower = null;
    target.sendBtn = null;
    target.flower = null;
    target.redDot = null;

    view7f0901e5.setOnClickListener(null);
    view7f0901e5 = null;
  }
}
