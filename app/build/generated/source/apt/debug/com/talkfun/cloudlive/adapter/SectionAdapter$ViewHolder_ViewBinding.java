// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SectionAdapter$ViewHolder_ViewBinding implements Unbinder {
  private SectionAdapter.ViewHolder target;

  @UiThread
  public SectionAdapter$ViewHolder_ViewBinding(SectionAdapter.ViewHolder target, View source) {
    this.target = target;

    target.previewImg = Utils.findRequiredViewAsType(source, R.id.preview, "field 'previewImg'", ImageView.class);
    target.pageTv = Utils.findRequiredViewAsType(source, R.id.page, "field 'pageTv'", TextView.class);
    target.courseTv = Utils.findRequiredViewAsType(source, R.id.course, "field 'courseTv'", TextView.class);
    target.sectionTime = Utils.findRequiredViewAsType(source, R.id.section_time, "field 'sectionTime'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SectionAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.previewImg = null;
    target.pageTv = null;
    target.courseTv = null;
    target.sectionTime = null;
  }
}
