// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.view;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.flyco.tablayout.CommonTabLayout;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PlaybackMessageView_ViewBinding implements Unbinder {
  private PlaybackMessageView target;

  @UiThread
  public PlaybackMessageView_ViewBinding(PlaybackMessageView target) {
    this(target, target);
  }

  @UiThread
  public PlaybackMessageView_ViewBinding(PlaybackMessageView target, View source) {
    this.target = target;

    target.mCommonTabLayout = Utils.findRequiredViewAsType(source, R.id.common_tablayout, "field 'mCommonTabLayout'", CommonTabLayout.class);
    target.mViewPager = Utils.findRequiredViewAsType(source, R.id.view_pager, "field 'mViewPager'", ViewPager.class);
    target.ivStartDownload = Utils.findRequiredViewAsType(source, R.id.iv_start_download, "field 'ivStartDownload'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PlaybackMessageView target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mCommonTabLayout = null;
    target.mViewPager = null;
    target.ivStartDownload = null;
  }
}
