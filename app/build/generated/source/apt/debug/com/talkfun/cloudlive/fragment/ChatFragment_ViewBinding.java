// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChatFragment_ViewBinding implements Unbinder {
  private ChatFragment target;

  private View view2131296573;

  private View view2131296532;

  @UiThread
  public ChatFragment_ViewBinding(final ChatFragment target, View source) {
    this.target = target;

    View view;
    target.chatLv = Utils.findRequiredViewAsType(source, R.id.chat_lv, "field 'chatLv'", ListView.class);
    view = Utils.findRequiredView(source, R.id.ll_tip_layout, "field 'llReplyTip' and method 'onClick'");
    target.llReplyTip = Utils.castView(view, R.id.ll_tip_layout, "field 'llReplyTip'", LinearLayout.class);
    view2131296573 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.iv_remove, "method 'onClick'");
    view2131296532 = view;
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
    ChatFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.chatLv = null;
    target.llReplyTip = null;

    view2131296573.setOnClickListener(null);
    view2131296573 = null;
    view2131296532.setOnClickListener(null);
    view2131296532 = null;
  }
}
