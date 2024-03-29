// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.fragment;

import android.view.View;
import android.widget.ListView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class QuestionFragment_ViewBinding implements Unbinder {
  private QuestionFragment target;

  @UiThread
  public QuestionFragment_ViewBinding(QuestionFragment target, View source) {
    this.target = target;

    target.questionLv = Utils.findRequiredViewAsType(source, R.id.chat_lv, "field 'questionLv'", ListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    QuestionFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.questionLv = null;
  }
}
