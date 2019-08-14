// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.dialog;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LotteryDialogFragment_ViewBinding implements Unbinder {
  private LotteryDialogFragment target;

  @UiThread
  public LotteryDialogFragment_ViewBinding(LotteryDialogFragment target, View source) {
    this.target = target;

    target.recyclerLeft = Utils.findRequiredViewAsType(source, R.id.rv_scroll_left, "field 'recyclerLeft'", RecyclerView.class);
    target.recyclerCenter = Utils.findRequiredViewAsType(source, R.id.rv_scroll_center, "field 'recyclerCenter'", RecyclerView.class);
    target.recyclerRight = Utils.findRequiredViewAsType(source, R.id.rv_scroll_right, "field 'recyclerRight'", RecyclerView.class);
    target.lotteryLinearLayout = Utils.findRequiredViewAsType(source, R.id.lottery_area, "field 'lotteryLinearLayout'", LinearLayout.class);
    target.cancelImg = Utils.findRequiredViewAsType(source, R.id.cancel, "field 'cancelImg'", ImageView.class);
    target.textView = Utils.findRequiredViewAsType(source, R.id.winner, "field 'textView'", TextView.class);
    target.lotteryBg = Utils.findRequiredViewAsType(source, R.id.lottery_bg, "field 'lotteryBg'", RelativeLayout.class);
    target.centerCancel = Utils.findRequiredViewAsType(source, R.id.my_cancel, "field 'centerCancel'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    LotteryDialogFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.recyclerLeft = null;
    target.recyclerCenter = null;
    target.recyclerRight = null;
    target.lotteryLinearLayout = null;
    target.cancelImg = null;
    target.textView = null;
    target.lotteryBg = null;
    target.centerCancel = null;
  }
}
