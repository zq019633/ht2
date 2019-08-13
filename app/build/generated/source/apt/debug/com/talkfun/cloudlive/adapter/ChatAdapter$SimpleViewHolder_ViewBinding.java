// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChatAdapter$SimpleViewHolder_ViewBinding implements Unbinder {
  private ChatAdapter.SimpleViewHolder target;

  @UiThread
  public ChatAdapter$SimpleViewHolder_ViewBinding(ChatAdapter.SimpleViewHolder target,
      View source) {
    this.target = target;

    target.identityTv = Utils.findRequiredViewAsType(source, R.id.identity, "field 'identityTv'", TextView.class);
    target.nameTv = Utils.findRequiredViewAsType(source, R.id.name, "field 'nameTv'", TextView.class);
    target.contentTv = Utils.findRequiredViewAsType(source, R.id.content, "field 'contentTv'", TextView.class);
    target.timeTv = Utils.findRequiredViewAsType(source, R.id.time, "field 'timeTv'", TextView.class);
    target.ivAvatar = Utils.findRequiredViewAsType(source, R.id.iv_avatar, "field 'ivAvatar'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ChatAdapter.SimpleViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.identityTv = null;
    target.nameTv = null;
    target.contentTv = null;
    target.timeTv = null;
    target.ivAvatar = null;
  }
}
