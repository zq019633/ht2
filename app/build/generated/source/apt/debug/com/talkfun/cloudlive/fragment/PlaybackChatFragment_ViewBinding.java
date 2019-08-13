// Generated code from Butter Knife. Do not modify!
package com.talkfun.cloudlive.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.talkfun.cloudlive.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PlaybackChatFragment_ViewBinding implements Unbinder {
  private PlaybackChatFragment target;

  @UiThread
  public PlaybackChatFragment_ViewBinding(PlaybackChatFragment target, View source) {
    this.target = target;

    target.chatLv = Utils.findRequiredViewAsType(source, R.id.chat_lv, "field 'chatLv'", ListView.class);
    target.inputLayout = Utils.findRequiredViewAsType(source, R.id.play_back_input, "field 'inputLayout'", ViewGroup.class);
    target.swipeRefreshLayout = Utils.findRequiredViewAsType(source, R.id.swipe, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PlaybackChatFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.chatLv = null;
    target.inputLayout = null;
    target.swipeRefreshLayout = null;
  }
}
