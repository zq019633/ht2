// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.dialog;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class VoteBaseDialogFragment_ViewBinding implements Unbinder {
  private VoteBaseDialogFragment target;

  private View view2131296540;

  @UiThread
  public VoteBaseDialogFragment_ViewBinding(final VoteBaseDialogFragment target, View source) {
    this.target = target;

    View view;
    target.cancelImg = Utils.findRequiredViewAsType(source, R.id.cancel, "field 'cancelImg'", ImageView.class);
    target.tvPublishTime = Utils.findRequiredViewAsType(source, R.id.tv_sub_title, "field 'tvPublishTime'", TextView.class);
    target.titleTv = Utils.findRequiredViewAsType(source, R.id.tv_content_title, "field 'titleTv'", TextView.class);
    target.voteBtn = Utils.findRequiredViewAsType(source, R.id.vote, "field 'voteBtn'", Button.class);
    target.chooseLv = Utils.findRequiredViewAsType(source, R.id.lv_option, "field 'chooseLv'", ListView.class);
    view = Utils.findRequiredView(source, R.id.iv_vote_image, "field 'ivVoteImage' and method 'onClick'");
    target.ivVoteImage = Utils.castView(view, R.id.iv_vote_image, "field 'ivVoteImage'", ImageView.class);
    view2131296540 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.llVoteBody = Utils.findRequiredViewAsType(source, R.id.ll_vote_body, "field 'llVoteBody'", LinearLayout.class);
    target.answerSelf = Utils.findRequiredViewAsType(source, R.id.answer_yourself, "field 'answerSelf'", TextView.class);
    target.answerCorrect = Utils.findRequiredViewAsType(source, R.id.answer_correct, "field 'answerCorrect'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    VoteBaseDialogFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.cancelImg = null;
    target.tvPublishTime = null;
    target.titleTv = null;
    target.voteBtn = null;
    target.chooseLv = null;
    target.ivVoteImage = null;
    target.llVoteBody = null;
    target.answerSelf = null;
    target.answerCorrect = null;

    view2131296540.setOnClickListener(null);
    view2131296540 = null;
  }
}
