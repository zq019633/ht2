// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChatAdapter$SystemViewHolder_ViewBinding implements Unbinder {
  private ChatAdapter.SystemViewHolder target;

  @UiThread
  public ChatAdapter$SystemViewHolder_ViewBinding(ChatAdapter.SystemViewHolder target,
      View source) {
    this.target = target;

    target.systemMsg = Utils.findRequiredViewAsType(source, R.id.system_msg, "field 'systemMsg'", TextView.class);
    target.systemImg = Utils.findRequiredViewAsType(source, R.id.icon, "field 'systemImg'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ChatAdapter.SystemViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.systemMsg = null;
    target.systemImg = null;
  }
}
