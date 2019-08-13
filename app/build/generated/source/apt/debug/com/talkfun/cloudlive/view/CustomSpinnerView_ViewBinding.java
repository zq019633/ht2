// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ListView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CustomSpinnerView_ViewBinding implements Unbinder {
  private CustomSpinnerView target;

  @UiThread
  public CustomSpinnerView_ViewBinding(CustomSpinnerView target, View source) {
    this.target = target;

    target.lvSpinnerList = Utils.findRequiredViewAsType(source, R.id.lv_spinner_list, "field 'lvSpinnerList'", ListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CustomSpinnerView target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.lvSpinnerList = null;
  }
}
