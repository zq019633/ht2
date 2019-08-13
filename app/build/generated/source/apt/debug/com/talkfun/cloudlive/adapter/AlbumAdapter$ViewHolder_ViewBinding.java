// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AlbumAdapter$ViewHolder_ViewBinding implements Unbinder {
  private AlbumAdapter.ViewHolder target;

  @UiThread
  public AlbumAdapter$ViewHolder_ViewBinding(AlbumAdapter.ViewHolder target, View source) {
    this.target = target;

    target.thumbIv = Utils.findRequiredViewAsType(source, R.id.thumbnail, "field 'thumbIv'", ImageView.class);
    target.titleTv = Utils.findRequiredViewAsType(source, R.id.tv_title, "field 'titleTv'", TextView.class);
    target.nameTv = Utils.findRequiredViewAsType(source, R.id.live_name, "field 'nameTv'", TextView.class);
    target.durationTv = Utils.findRequiredViewAsType(source, R.id.duration, "field 'durationTv'", TextView.class);
    target.labelTv = Utils.findRequiredViewAsType(source, R.id.playing_label, "field 'labelTv'", TextView.class);
    target.itemLayout = Utils.findRequiredViewAsType(source, R.id.item_layout, "field 'itemLayout'", RelativeLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AlbumAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.thumbIv = null;
    target.titleTv = null;
    target.nameTv = null;
    target.durationTv = null;
    target.labelTv = null;
    target.itemLayout = null;
  }
}
