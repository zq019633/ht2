// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.activity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PlayDownLoadActivity_ViewBinding implements Unbinder {
  private PlayDownLoadActivity target;

  private View view7f090246;

  private View view7f0900fc;

  private View view7f090059;

  private View view7f0900f8;

  @UiThread
  public PlayDownLoadActivity_ViewBinding(PlayDownLoadActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PlayDownLoadActivity_ViewBinding(final PlayDownLoadActivity target, View source) {
    this.target = target;

    View view;
    target.lv_playList = Utils.findRequiredViewAsType(source, R.id.lv_playList, "field 'lv_playList'", ListView.class);
    target.rl_editor = Utils.findRequiredViewAsType(source, R.id.rl_editor, "field 'rl_editor'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.tv_editor, "field 'tv_editor' and method 'cancel'");
    target.tv_editor = Utils.castView(view, R.id.tv_editor, "field 'tv_editor'", TextView.class);
    view7f090246 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.cancel();
      }
    });
    target.btn_all_select = Utils.findRequiredViewAsType(source, R.id.btn_all_select, "field 'btn_all_select'", Button.class);
    target.rlDelete = Utils.findRequiredViewAsType(source, R.id.rl_editor_s, "field 'rlDelete'", RelativeLayout.class);
    view = Utils.findRequiredView(source, R.id.iv_delete, "field 'iv_delete' and method 'editor'");
    target.iv_delete = Utils.castView(view, R.id.iv_delete, "field 'iv_delete'", ImageView.class);
    view7f0900fc = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.editor();
      }
    });
    target.pb_delete = Utils.findRequiredViewAsType(source, R.id.pb_delete, "field 'pb_delete'", ProgressBar.class);
    view = Utils.findRequiredView(source, R.id.btn_delete, "method 'tv_delete'");
    view7f090059 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.tv_delete();
      }
    });
    view = Utils.findRequiredView(source, R.id.iv_back, "method 'back'");
    view7f0900f8 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.back();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    PlayDownLoadActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.lv_playList = null;
    target.rl_editor = null;
    target.tv_editor = null;
    target.btn_all_select = null;
    target.rlDelete = null;
    target.iv_delete = null;
    target.pb_delete = null;

    view7f090246.setOnClickListener(null);
    view7f090246 = null;
    view7f0900fc.setOnClickListener(null);
    view7f0900fc = null;
    view7f090059.setOnClickListener(null);
    view7f090059 = null;
    view7f0900f8.setOnClickListener(null);
    view7f0900f8 = null;
  }
}
