// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.dialog;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ScoreDialogFragment_ViewBinding extends BaseDialog_ViewBinding {
  private ScoreDialogFragment target;

  private View view2131296353;

  @UiThread
  public ScoreDialogFragment_ViewBinding(final ScoreDialogFragment target, View source) {
    super(target, source);

    this.target = target;

    View view;
    target.etMsg = Utils.findRequiredViewAsType(source, R.id.et_msg, "field 'etMsg'", EditText.class);
    target.llScore = Utils.findRequiredViewAsType(source, R.id.ll_score, "field 'llScore'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.btn_submit, "method 'onClickHandle'");
    view2131296353 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickHandle(p0);
      }
    });
  }

  @Override
  public void unbind() {
    ScoreDialogFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.etMsg = null;
    target.llScore = null;

    view2131296353.setOnClickListener(null);
    view2131296353 = null;

    super.unbind();
  }
}
