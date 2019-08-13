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

public class GroupChatListAdapter$ViewHolder_ViewBinding implements Unbinder {
  private GroupChatListAdapter.ViewHolder target;

  @UiThread
  public GroupChatListAdapter$ViewHolder_ViewBinding(GroupChatListAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.img = Utils.findRequiredViewAsType(source, R.id.img, "field 'img'", ImageView.class);
    target.groupName = Utils.findRequiredViewAsType(source, R.id.group_name, "field 'groupName'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    GroupChatListAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.img = null;
    target.groupName = null;
  }
}
