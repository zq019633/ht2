// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChatAdapter$SystemVoteViewHolder_ViewBinding implements Unbinder {
  private ChatAdapter.SystemVoteViewHolder target;

  @UiThread
  public ChatAdapter$SystemVoteViewHolder_ViewBinding(ChatAdapter.SystemVoteViewHolder target,
      View source) {
    this.target = target;

    target.checkVote = Utils.findRequiredViewAsType(source, R.id.check_vote, "field 'checkVote'", TextView.class);
    target.systemMsg = Utils.findRequiredViewAsType(source, R.id.system_msg, "field 'systemMsg'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ChatAdapter.SystemVoteViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.checkVote = null;
    target.systemMsg = null;
  }
}
