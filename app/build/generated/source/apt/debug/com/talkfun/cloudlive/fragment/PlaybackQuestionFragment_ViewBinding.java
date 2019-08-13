// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PlaybackQuestionFragment_ViewBinding implements Unbinder {
  private PlaybackQuestionFragment target;

  @UiThread
  public PlaybackQuestionFragment_ViewBinding(PlaybackQuestionFragment target, View source) {
    this.target = target;

    target.questionLv = Utils.findRequiredViewAsType(source, R.id.question_lv, "field 'questionLv'", ListView.class);
    target.inputLayout = Utils.findRequiredViewAsType(source, R.id.question_input_layout, "field 'inputLayout'", ViewGroup.class);
    target.swipeRefreshLayout = Utils.findRequiredViewAsType(source, R.id.swipe, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PlaybackQuestionFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.questionLv = null;
    target.inputLayout = null;
    target.swipeRefreshLayout = null;
  }
}
