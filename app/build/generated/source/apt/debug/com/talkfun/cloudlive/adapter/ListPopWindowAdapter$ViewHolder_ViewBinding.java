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

public class ListPopWindowAdapter$ViewHolder_ViewBinding implements Unbinder {
  private ListPopWindowAdapter.ViewHolder target;

  @UiThread
  public ListPopWindowAdapter$ViewHolder_ViewBinding(ListPopWindowAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.textView = Utils.findRequiredViewAsType(source, R.id.list_pop_item, "field 'textView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ListPopWindowAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.textView = null;
  }
}
