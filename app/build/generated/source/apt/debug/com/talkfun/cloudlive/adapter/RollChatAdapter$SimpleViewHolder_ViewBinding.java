// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RollChatAdapter$SimpleViewHolder_ViewBinding implements Unbinder {
  private RollChatAdapter.SimpleViewHolder target;

  @UiThread
  public RollChatAdapter$SimpleViewHolder_ViewBinding(RollChatAdapter.SimpleViewHolder target,
      View source) {
    this.target = target;

    target.nameTv = Utils.findRequiredViewAsType(source, R.id.name, "field 'nameTv'", TextView.class);
    target.contentTv = Utils.findRequiredViewAsType(source, R.id.content, "field 'contentTv'", TextView.class);
    target.itemLayout = Utils.findRequiredViewAsType(source, R.id.item_layout, "field 'itemLayout'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RollChatAdapter.SimpleViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nameTv = null;
    target.contentTv = null;
    target.itemLayout = null;
  }
}
