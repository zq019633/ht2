// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.adapter;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class OTMVoteOptionAdapter$ViewHolder_ViewBinding implements Unbinder {
  private OTMVoteOptionAdapter.ViewHolder target;

  @UiThread
  public OTMVoteOptionAdapter$ViewHolder_ViewBinding(OTMVoteOptionAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.itemCb = Utils.findRequiredViewAsType(source, R.id.cb_check, "field 'itemCb'", CheckBox.class);
    target.choiceTV = Utils.findRequiredViewAsType(source, R.id.tv_choice, "field 'choiceTV'", TextView.class);
    target.itemContentTV = Utils.findRequiredViewAsType(source, R.id.tv_choice_content, "field 'itemContentTV'", TextView.class);
    target.itemProgressPB = Utils.findRequiredViewAsType(source, R.id.pb_progress, "field 'itemProgressPB'", ProgressBar.class);
    target.percentTV = Utils.findRequiredViewAsType(source, R.id.tv_percent, "field 'percentTV'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    OTMVoteOptionAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.itemCb = null;
    target.choiceTV = null;
    target.itemContentTV = null;
    target.itemProgressPB = null;
    target.percentTV = null;
  }
}
