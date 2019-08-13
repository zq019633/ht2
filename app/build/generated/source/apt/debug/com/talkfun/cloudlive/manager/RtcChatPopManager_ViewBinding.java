// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.manager;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RtcChatPopManager_ViewBinding implements Unbinder {
  private RtcChatPopManager target;

  private View view2131296370;

  private View view2131296734;

  @UiThread
  public RtcChatPopManager_ViewBinding(final RtcChatPopManager target, View source) {
    this.target = target;

    View view;
    target.mChatLV = Utils.findRequiredViewAsType(source, R.id.small_room_chat_lv, "field 'mChatLV'", ListView.class);
    view = Utils.findRequiredView(source, R.id.chat_message_edit, "field 'mChatMessageTV' and method 'onClick'");
    target.mChatMessageTV = Utils.castView(view, R.id.chat_message_edit, "field 'mChatMessageTV'", TextView.class);
    view2131296370 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.send_message_btn, "field 'sendMessageBtn' and method 'onClick'");
    target.sendMessageBtn = Utils.castView(view, R.id.send_message_btn, "field 'sendMessageBtn'", Button.class);
    view2131296734 = view;
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
    RtcChatPopManager target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mChatLV = null;
    target.mChatMessageTV = null;
    target.sendMessageBtn = null;

    view2131296370.setOnClickListener(null);
    view2131296370 = null;
    view2131296734.setOnClickListener(null);
    view2131296734 = null;
  }
}
