// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class NoticeFragment_ViewBinding implements Unbinder {
  private NoticeFragment target;

  @UiThread
  public NoticeFragment_ViewBinding(NoticeFragment target, View source) {
    this.target = target;

    target.noticeTv = Utils.findRequiredViewAsType(source, R.id.notice_tv, "field 'noticeTv'", TextView.class);
    target.timeTv = Utils.findRequiredViewAsType(source, R.id.date, "field 'timeTv'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NoticeFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.noticeTv = null;
    target.timeTv = null;
  }
}
