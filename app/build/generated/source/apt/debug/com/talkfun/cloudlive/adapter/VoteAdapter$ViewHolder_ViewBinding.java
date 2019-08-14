// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.adapter;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class VoteAdapter$ViewHolder_ViewBinding implements Unbinder {
  private VoteAdapter.ViewHolder target;

  @UiThread
  public VoteAdapter$ViewHolder_ViewBinding(VoteAdapter.ViewHolder target, View source) {
    this.target = target;

    target.itemCb = Utils.findRequiredViewAsType(source, R.id.choice_item, "field 'itemCb'", CheckBox.class);
    target.singleItemCb = Utils.findRequiredViewAsType(source, R.id.single_choice_item, "field 'singleItemCb'", CheckBox.class);
    target.choice = Utils.findRequiredViewAsType(source, R.id.choiceTv, "field 'choice'", TextView.class);
    target.itemContent = Utils.findRequiredViewAsType(source, R.id.choice_content, "field 'itemContent'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    VoteAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.itemCb = null;
    target.singleItemCb = null;
    target.choice = null;
    target.itemContent = null;
  }
}
