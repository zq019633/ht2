// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.adapter;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class VoteResultAdapter$ViewHolder_ViewBinding implements Unbinder {
  private VoteResultAdapter.ViewHolder target;

  @UiThread
  public VoteResultAdapter$ViewHolder_ViewBinding(VoteResultAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.numTv = Utils.findRequiredViewAsType(source, R.id.num, "field 'numTv'", TextView.class);
    target.votePb = Utils.findRequiredViewAsType(source, R.id.progress, "field 'votePb'", ProgressBar.class);
    target.percentTv = Utils.findRequiredViewAsType(source, R.id.percent, "field 'percentTv'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    VoteResultAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.numTv = null;
    target.votePb = null;
    target.percentTv = null;
  }
}
