// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ListView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PlaybackAlbumFragment_ViewBinding implements Unbinder {
  private PlaybackAlbumFragment target;

  @UiThread
  public PlaybackAlbumFragment_ViewBinding(PlaybackAlbumFragment target, View source) {
    this.target = target;

    target.albumListView = Utils.findRequiredViewAsType(source, R.id.album_list, "field 'albumListView'", ListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PlaybackAlbumFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.albumListView = null;
  }
}
