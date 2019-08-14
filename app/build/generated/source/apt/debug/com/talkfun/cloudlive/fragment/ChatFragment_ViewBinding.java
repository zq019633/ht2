// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.fragment;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChatFragment_ViewBinding implements Unbinder {
  private ChatFragment target;

  private View view7f090141;

  private View view7f090117;

  @UiThread
  public ChatFragment_ViewBinding(final ChatFragment target, View source) {
    this.target = target;

    View view;
    target.chatLv = Utils.findRequiredViewAsType(source, R.id.chat_lv, "field 'chatLv'", ListView.class);
    view = Utils.findRequiredView(source, R.id.ll_tip_layout, "field 'llReplyTip' and method 'onClick'");
    target.llReplyTip = Utils.castView(view, R.id.ll_tip_layout, "field 'llReplyTip'", LinearLayout.class);
    view7f090141 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.iv_remove, "method 'onClick'");
    view7f090117 = view;
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

    view7f090141.setOnClickListener(null);
    view7f090141 = null;
    view7f090117.setOnClickListener(null);
    view7f090117 = null;
  }
}
