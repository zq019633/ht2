package com.talkfun.cloudlive;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiBottomBarBindingImpl;
import com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiBottomBarBindingSw600dpImpl;
import com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiIpadRightOpratorBindingImpl;
import com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiLeftOpratorBindingImpl;
import com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiMediaLayoutBindingImpl;
import com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiMediaLayoutBindingSw600dpImpl;
import com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiNativeBindingImpl;
import com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiNativeBindingSw600dpImpl;
import com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiRightOpratorBindingImpl;
import com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiToolBarBindingImpl;
import com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiToolBarBindingSw600dpImpl;
import com.talkfun.cloudlive.databinding.ActivityLiveOneToOneBottomBarBindingImpl;
import com.talkfun.cloudlive.databinding.ActivityLiveOneToOneBottomBarBindingSw600dpImpl;
import com.talkfun.cloudlive.databinding.ActivityLiveOneToOneChatLayoutBindingImpl;
import com.talkfun.cloudlive.databinding.ActivityLiveOneToOneMediaLayoutBindingImpl;
import com.talkfun.cloudlive.databinding.ActivityLiveOneToOneMediaLayoutBindingSw600dpImpl;
import com.talkfun.cloudlive.databinding.ActivityLiveOneToOneNativeBindingImpl;
import com.talkfun.cloudlive.databinding.ActivityLiveOneToOneNativeBindingSw600dpImpl;
import com.talkfun.cloudlive.databinding.ActivityLiveOneToOneToolBarBindingImpl;
import com.talkfun.cloudlive.databinding.ActivityLiveOneToOneToolBarBindingSw600dpImpl;
import com.talkfun.cloudlive.databinding.DialogFragmentOtmVoteBindingImpl;
import com.talkfun.cloudlive.databinding.DialogFragmentOtmVoteBindingSw600dpImpl;
import com.talkfun.cloudlive.databinding.DialogOtmInputTextBindingImpl;
import com.talkfun.cloudlive.databinding.DialogOtmInputTextBindingSw600dpImpl;
import com.talkfun.cloudlive.databinding.DialogOtoInputTextBindingImpl;
import com.talkfun.cloudlive.databinding.DialogOtoInputTextBindingSw600dpImpl;
import com.talkfun.cloudlive.databinding.ItemDialogFragmentOtmVoteBindingImpl;
import com.talkfun.cloudlive.databinding.ItemDialogFragmentOtmVoteBindingSw600dpImpl;
import com.talkfun.cloudlive.databinding.ItemEmptyViewBindingImpl;
import com.talkfun.cloudlive.databinding.ItemLiveRtcChatAwardBindingImpl;
import com.talkfun.cloudlive.databinding.ItemLiveRtcChatAwardBindingSw600dpImpl;
import com.talkfun.cloudlive.databinding.ItemLiveRtcChatBindingImpl;
import com.talkfun.cloudlive.databinding.ItemLiveRtcChatBindingSw600dpImpl;
import com.talkfun.cloudlive.databinding.ItemLiveRtcChatLeftBindingImpl;
import com.talkfun.cloudlive.databinding.ItemLiveRtcChatLeftBindingSw600dpImpl;
import com.talkfun.cloudlive.databinding.ItemLiveRtcChatRightBindingImpl;
import com.talkfun.cloudlive.databinding.ItemLiveRtcChatRightBindingSw600dpImpl;
import com.talkfun.cloudlive.databinding.ItemOneToMultiVideoBindingImpl;
import com.talkfun.cloudlive.databinding.ItemOneToMultiVideoBindingSw600dpImpl;
import com.talkfun.cloudlive.databinding.ItemPopColorBindingImpl;
import com.talkfun.cloudlive.databinding.ItemPopColorBindingSw600dpImpl;
import com.talkfun.cloudlive.databinding.ItemPopDrawBindingImplImpl;
import com.talkfun.cloudlive.databinding.ItemPopDrawBindingImplSw600dpImpl;
import com.talkfun.cloudlive.databinding.ItemPopStokeBindingImpl;
import com.talkfun.cloudlive.databinding.ItemPopStokeBindingSw600dpImpl;
import com.talkfun.cloudlive.databinding.ItemPopUsefulExpressionsBindingImpl;
import com.talkfun.cloudlive.databinding.ItemRtcVideoBindingImpl;
import com.talkfun.cloudlive.databinding.ItemRtcVideoBindingSw600dpImpl;
import com.talkfun.cloudlive.databinding.ItemVoteListEmptyViewBindingImpl;
import com.talkfun.cloudlive.databinding.ItemVoteListEmptyViewBindingSw600dpImpl;
import com.talkfun.cloudlive.databinding.TipNetWorkErrorBindingImpl;
import com.talkfun.cloudlive.databinding.TipNetWorkErrorBindingSw600dpImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYLIVEONETOMULTIIPADRIGHTOPRATOR = 1;

  private static final int LAYOUT_ACTIVITYLIVEONETOMULTILEFTOPRATOR = 2;

  private static final int LAYOUT_ACTIVITYLIVEONETOMULTIRIGHTOPRATOR = 3;

  private static final int LAYOUT_ACTIVITYLIVEONETOMULTIBOTTOMBAR = 4;

  private static final int LAYOUT_ACTIVITYLIVEONETOMULTIMEDIALAYOUT = 5;

  private static final int LAYOUT_ACTIVITYLIVEONETOMULTINATIVE = 6;

  private static final int LAYOUT_ACTIVITYLIVEONETOMULTITOOLBAR = 7;

  private static final int LAYOUT_ACTIVITYLIVEONETOONEBOTTOMBAR = 8;

  private static final int LAYOUT_ACTIVITYLIVEONETOONECHATLAYOUT = 9;

  private static final int LAYOUT_ACTIVITYLIVEONETOONETOOLBAR = 10;

  private static final int LAYOUT_ACTIVITYLIVEONETOONEMEDIALAYOUT = 11;

  private static final int LAYOUT_ACTIVITYLIVEONETOONENATIVE = 12;

  private static final int LAYOUT_DIALOGFRAGMENTOTMVOTE = 13;

  private static final int LAYOUT_DIALOGOTMINPUTTEXT = 14;

  private static final int LAYOUT_DIALOGOTOINPUTTEXT = 15;

  private static final int LAYOUT_ITEMDIALOGFRAGMENTOTMVOTE = 16;

  private static final int LAYOUT_ITEMEMPTYVIEW = 17;

  private static final int LAYOUT_ITEMLIVERTCCHAT = 18;

  private static final int LAYOUT_ITEMLIVERTCCHATAWARD = 19;

  private static final int LAYOUT_ITEMLIVERTCCHATLEFT = 20;

  private static final int LAYOUT_ITEMLIVERTCCHATRIGHT = 21;

  private static final int LAYOUT_ITEMONETOMULTIVIDEO = 22;

  private static final int LAYOUT_ITEMPOPCOLOR = 23;

  private static final int LAYOUT_ITEMPOPDRAW = 24;

  private static final int LAYOUT_ITEMPOPSTOKE = 25;

  private static final int LAYOUT_ITEMPOPUSEFULEXPRESSIONS = 26;

  private static final int LAYOUT_ITEMRTCVIDEO = 27;

  private static final int LAYOUT_ITEMVOTELISTEMPTYVIEW = 28;

  private static final int LAYOUT_TIPNETWORKERROR = 29;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(29);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.talkfun.cloudlive.R.layout.activity_live_one_to_multi__ipad_right_oprator, LAYOUT_ACTIVITYLIVEONETOMULTIIPADRIGHTOPRATOR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.talkfun.cloudlive.R.layout.activity_live_one_to_multi__left_oprator, LAYOUT_ACTIVITYLIVEONETOMULTILEFTOPRATOR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.talkfun.cloudlive.R.layout.activity_live_one_to_multi__right_oprator, LAYOUT_ACTIVITYLIVEONETOMULTIRIGHTOPRATOR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_bottom_bar, LAYOUT_ACTIVITYLIVEONETOMULTIBOTTOMBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_media_layout, LAYOUT_ACTIVITYLIVEONETOMULTIMEDIALAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_native, LAYOUT_ACTIVITYLIVEONETOMULTINATIVE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_tool_bar, LAYOUT_ACTIVITYLIVEONETOMULTITOOLBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.talkfun.cloudlive.R.layout.activity_live_one_to_one__bottom_bar, LAYOUT_ACTIVITYLIVEONETOONEBOTTOMBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.talkfun.cloudlive.R.layout.activity_live_one_to_one__chat_layout, LAYOUT_ACTIVITYLIVEONETOONECHATLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.talkfun.cloudlive.R.layout.activity_live_one_to_one__tool_bar, LAYOUT_ACTIVITYLIVEONETOONETOOLBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.talkfun.cloudlive.R.layout.activity_live_one_to_one_media_layout, LAYOUT_ACTIVITYLIVEONETOONEMEDIALAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.talkfun.cloudlive.R.layout.activity_live_one_to_one_native, LAYOUT_ACTIVITYLIVEONETOONENATIVE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.talkfun.cloudlive.R.layout.dialog_fragment_otm_vote, LAYOUT_DIALOGFRAGMENTOTMVOTE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.talkfun.cloudlive.R.layout.dialog_otm_input_text, LAYOUT_DIALOGOTMINPUTTEXT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.talkfun.cloudlive.R.layout.dialog_oto_input_text, LAYOUT_DIALOGOTOINPUTTEXT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.talkfun.cloudlive.R.layout.item_dialog_fragment_otm_vote, LAYOUT_ITEMDIALOGFRAGMENTOTMVOTE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.talkfun.cloudlive.R.layout.item_empty_view, LAYOUT_ITEMEMPTYVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.talkfun.cloudlive.R.layout.item_live_rtc_chat, LAYOUT_ITEMLIVERTCCHAT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.talkfun.cloudlive.R.layout.item_live_rtc_chat_award, LAYOUT_ITEMLIVERTCCHATAWARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.talkfun.cloudlive.R.layout.item_live_rtc_chat_left, LAYOUT_ITEMLIVERTCCHATLEFT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.talkfun.cloudlive.R.layout.item_live_rtc_chat_right, LAYOUT_ITEMLIVERTCCHATRIGHT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.talkfun.cloudlive.R.layout.item_one_to_multi_video, LAYOUT_ITEMONETOMULTIVIDEO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.talkfun.cloudlive.R.layout.item_pop_color, LAYOUT_ITEMPOPCOLOR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.talkfun.cloudlive.R.layout.item_pop_draw, LAYOUT_ITEMPOPDRAW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.talkfun.cloudlive.R.layout.item_pop_stoke, LAYOUT_ITEMPOPSTOKE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.talkfun.cloudlive.R.layout.item_pop_useful_expressions, LAYOUT_ITEMPOPUSEFULEXPRESSIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.talkfun.cloudlive.R.layout.item_rtc_video, LAYOUT_ITEMRTCVIDEO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.talkfun.cloudlive.R.layout.item_vote_list_empty_view, LAYOUT_ITEMVOTELISTEMPTYVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.talkfun.cloudlive.R.layout.tip_net_work_error, LAYOUT_TIPNETWORKERROR);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYLIVEONETOMULTIIPADRIGHTOPRATOR: {
          if ("layout/activity_live_one_to_multi__ipad_right_oprator_0".equals(tag)) {
            return new ActivityLiveOneToMultiIpadRightOpratorBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_live_one_to_multi__ipad_right_oprator is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLIVEONETOMULTILEFTOPRATOR: {
          if ("layout/activity_live_one_to_multi__left_oprator_0".equals(tag)) {
            return new ActivityLiveOneToMultiLeftOpratorBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_live_one_to_multi__left_oprator is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLIVEONETOMULTIRIGHTOPRATOR: {
          if ("layout/activity_live_one_to_multi__right_oprator_0".equals(tag)) {
            return new ActivityLiveOneToMultiRightOpratorBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_live_one_to_multi__right_oprator is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLIVEONETOMULTIBOTTOMBAR: {
          if ("layout/activity_live_one_to_multi_bottom_bar_0".equals(tag)) {
            return new ActivityLiveOneToMultiBottomBarBindingImpl(component, view);
          }
          if ("layout-sw600dp/activity_live_one_to_multi_bottom_bar_0".equals(tag)) {
            return new ActivityLiveOneToMultiBottomBarBindingSw600dpImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_live_one_to_multi_bottom_bar is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLIVEONETOMULTIMEDIALAYOUT: {
          if ("layout-sw600dp/activity_live_one_to_multi_media_layout_0".equals(tag)) {
            return new ActivityLiveOneToMultiMediaLayoutBindingSw600dpImpl(component, view);
          }
          if ("layout/activity_live_one_to_multi_media_layout_0".equals(tag)) {
            return new ActivityLiveOneToMultiMediaLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_live_one_to_multi_media_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLIVEONETOMULTINATIVE: {
          if ("layout/activity_live_one_to_multi_native_0".equals(tag)) {
            return new ActivityLiveOneToMultiNativeBindingImpl(component, view);
          }
          if ("layout-sw600dp/activity_live_one_to_multi_native_0".equals(tag)) {
            return new ActivityLiveOneToMultiNativeBindingSw600dpImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_live_one_to_multi_native is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLIVEONETOMULTITOOLBAR: {
          if ("layout/activity_live_one_to_multi_tool_bar_0".equals(tag)) {
            return new ActivityLiveOneToMultiToolBarBindingImpl(component, view);
          }
          if ("layout-sw600dp/activity_live_one_to_multi_tool_bar_0".equals(tag)) {
            return new ActivityLiveOneToMultiToolBarBindingSw600dpImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_live_one_to_multi_tool_bar is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLIVEONETOONEBOTTOMBAR: {
          if ("layout-sw600dp/activity_live_one_to_one__bottom_bar_0".equals(tag)) {
            return new ActivityLiveOneToOneBottomBarBindingSw600dpImpl(component, view);
          }
          if ("layout/activity_live_one_to_one__bottom_bar_0".equals(tag)) {
            return new ActivityLiveOneToOneBottomBarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_live_one_to_one__bottom_bar is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLIVEONETOONECHATLAYOUT: {
          if ("layout/activity_live_one_to_one__chat_layout_0".equals(tag)) {
            return new ActivityLiveOneToOneChatLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_live_one_to_one__chat_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLIVEONETOONETOOLBAR: {
          if ("layout-sw600dp/activity_live_one_to_one__tool_bar_0".equals(tag)) {
            return new ActivityLiveOneToOneToolBarBindingSw600dpImpl(component, view);
          }
          if ("layout/activity_live_one_to_one__tool_bar_0".equals(tag)) {
            return new ActivityLiveOneToOneToolBarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_live_one_to_one__tool_bar is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLIVEONETOONEMEDIALAYOUT: {
          if ("layout-sw600dp/activity_live_one_to_one_media_layout_0".equals(tag)) {
            return new ActivityLiveOneToOneMediaLayoutBindingSw600dpImpl(component, view);
          }
          if ("layout/activity_live_one_to_one_media_layout_0".equals(tag)) {
            return new ActivityLiveOneToOneMediaLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_live_one_to_one_media_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLIVEONETOONENATIVE: {
          if ("layout/activity_live_one_to_one_native_0".equals(tag)) {
            return new ActivityLiveOneToOneNativeBindingImpl(component, view);
          }
          if ("layout-sw600dp/activity_live_one_to_one_native_0".equals(tag)) {
            return new ActivityLiveOneToOneNativeBindingSw600dpImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_live_one_to_one_native is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGFRAGMENTOTMVOTE: {
          if ("layout/dialog_fragment_otm_vote_0".equals(tag)) {
            return new DialogFragmentOtmVoteBindingImpl(component, view);
          }
          if ("layout-sw600dp/dialog_fragment_otm_vote_0".equals(tag)) {
            return new DialogFragmentOtmVoteBindingSw600dpImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_fragment_otm_vote is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGOTMINPUTTEXT: {
          if ("layout-sw600dp/dialog_otm_input_text_0".equals(tag)) {
            return new DialogOtmInputTextBindingSw600dpImpl(component, view);
          }
          if ("layout/dialog_otm_input_text_0".equals(tag)) {
            return new DialogOtmInputTextBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_otm_input_text is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGOTOINPUTTEXT: {
          if ("layout-sw600dp/dialog_oto_input_text_0".equals(tag)) {
            return new DialogOtoInputTextBindingSw600dpImpl(component, view);
          }
          if ("layout/dialog_oto_input_text_0".equals(tag)) {
            return new DialogOtoInputTextBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_oto_input_text is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMDIALOGFRAGMENTOTMVOTE: {
          if ("layout-sw600dp/item_dialog_fragment_otm_vote_0".equals(tag)) {
            return new ItemDialogFragmentOtmVoteBindingSw600dpImpl(component, view);
          }
          if ("layout/item_dialog_fragment_otm_vote_0".equals(tag)) {
            return new ItemDialogFragmentOtmVoteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_dialog_fragment_otm_vote is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMEMPTYVIEW: {
          if ("layout/item_empty_view_0".equals(tag)) {
            return new ItemEmptyViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_empty_view is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMLIVERTCCHAT: {
          if ("layout-sw600dp/item_live_rtc_chat_0".equals(tag)) {
            return new ItemLiveRtcChatBindingSw600dpImpl(component, view);
          }
          if ("layout/item_live_rtc_chat_0".equals(tag)) {
            return new ItemLiveRtcChatBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_live_rtc_chat is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMLIVERTCCHATAWARD: {
          if ("layout/item_live_rtc_chat_award_0".equals(tag)) {
            return new ItemLiveRtcChatAwardBindingImpl(component, view);
          }
          if ("layout-sw600dp/item_live_rtc_chat_award_0".equals(tag)) {
            return new ItemLiveRtcChatAwardBindingSw600dpImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_live_rtc_chat_award is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMLIVERTCCHATLEFT: {
          if ("layout/item_live_rtc_chat_left_0".equals(tag)) {
            return new ItemLiveRtcChatLeftBindingImpl(component, view);
          }
          if ("layout-sw600dp/item_live_rtc_chat_left_0".equals(tag)) {
            return new ItemLiveRtcChatLeftBindingSw600dpImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_live_rtc_chat_left is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMLIVERTCCHATRIGHT: {
          if ("layout-sw600dp/item_live_rtc_chat_right_0".equals(tag)) {
            return new ItemLiveRtcChatRightBindingSw600dpImpl(component, view);
          }
          if ("layout/item_live_rtc_chat_right_0".equals(tag)) {
            return new ItemLiveRtcChatRightBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_live_rtc_chat_right is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMONETOMULTIVIDEO: {
          if ("layout/item_one_to_multi_video_0".equals(tag)) {
            return new ItemOneToMultiVideoBindingImpl(component, view);
          }
          if ("layout-sw600dp/item_one_to_multi_video_0".equals(tag)) {
            return new ItemOneToMultiVideoBindingSw600dpImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_one_to_multi_video is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPOPCOLOR: {
          if ("layout-sw600dp/item_pop_color_0".equals(tag)) {
            return new ItemPopColorBindingSw600dpImpl(component, view);
          }
          if ("layout/item_pop_color_0".equals(tag)) {
            return new ItemPopColorBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_pop_color is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPOPDRAW: {
          if ("layout/item_pop_draw_0".equals(tag)) {
            return new ItemPopDrawBindingImplImpl(component, view);
          }
          if ("layout-sw600dp/item_pop_draw_0".equals(tag)) {
            return new ItemPopDrawBindingImplSw600dpImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_pop_draw is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPOPSTOKE: {
          if ("layout-sw600dp/item_pop_stoke_0".equals(tag)) {
            return new ItemPopStokeBindingSw600dpImpl(component, view);
          }
          if ("layout/item_pop_stoke_0".equals(tag)) {
            return new ItemPopStokeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_pop_stoke is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPOPUSEFULEXPRESSIONS: {
          if ("layout/item_pop_useful_expressions_0".equals(tag)) {
            return new ItemPopUsefulExpressionsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_pop_useful_expressions is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMRTCVIDEO: {
          if ("layout/item_rtc_video_0".equals(tag)) {
            return new ItemRtcVideoBindingImpl(component, view);
          }
          if ("layout-sw600dp/item_rtc_video_0".equals(tag)) {
            return new ItemRtcVideoBindingSw600dpImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_rtc_video is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMVOTELISTEMPTYVIEW: {
          if ("layout/item_vote_list_empty_view_0".equals(tag)) {
            return new ItemVoteListEmptyViewBindingImpl(component, view);
          }
          if ("layout-sw600dp/item_vote_list_empty_view_0".equals(tag)) {
            return new ItemVoteListEmptyViewBindingSw600dpImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_vote_list_empty_view is invalid. Received: " + tag);
        }
        case  LAYOUT_TIPNETWORKERROR: {
          if ("layout/tip_net_work_error_0".equals(tag)) {
            return new TipNetWorkErrorBindingImpl(component, view);
          }
          if ("layout-sw600dp/tip_net_work_error_0".equals(tag)) {
            return new TipNetWorkErrorBindingSw600dpImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for tip_net_work_error is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(7);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "chatEntity");
      sKeys.put(2, "awardEntity");
      sKeys.put(3, "memberRole");
      sKeys.put(4, "videoData");
      sKeys.put(5, "tips");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(52);

    static {
      sKeys.put("layout/activity_live_one_to_multi__ipad_right_oprator_0", com.talkfun.cloudlive.R.layout.activity_live_one_to_multi__ipad_right_oprator);
      sKeys.put("layout/activity_live_one_to_multi__left_oprator_0", com.talkfun.cloudlive.R.layout.activity_live_one_to_multi__left_oprator);
      sKeys.put("layout/activity_live_one_to_multi__right_oprator_0", com.talkfun.cloudlive.R.layout.activity_live_one_to_multi__right_oprator);
      sKeys.put("layout/activity_live_one_to_multi_bottom_bar_0", com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_bottom_bar);
      sKeys.put("layout-sw600dp/activity_live_one_to_multi_bottom_bar_0", com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_bottom_bar);
      sKeys.put("layout-sw600dp/activity_live_one_to_multi_media_layout_0", com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_media_layout);
      sKeys.put("layout/activity_live_one_to_multi_media_layout_0", com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_media_layout);
      sKeys.put("layout/activity_live_one_to_multi_native_0", com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_native);
      sKeys.put("layout-sw600dp/activity_live_one_to_multi_native_0", com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_native);
      sKeys.put("layout/activity_live_one_to_multi_tool_bar_0", com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_tool_bar);
      sKeys.put("layout-sw600dp/activity_live_one_to_multi_tool_bar_0", com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_tool_bar);
      sKeys.put("layout-sw600dp/activity_live_one_to_one__bottom_bar_0", com.talkfun.cloudlive.R.layout.activity_live_one_to_one__bottom_bar);
      sKeys.put("layout/activity_live_one_to_one__bottom_bar_0", com.talkfun.cloudlive.R.layout.activity_live_one_to_one__bottom_bar);
      sKeys.put("layout/activity_live_one_to_one__chat_layout_0", com.talkfun.cloudlive.R.layout.activity_live_one_to_one__chat_layout);
      sKeys.put("layout-sw600dp/activity_live_one_to_one__tool_bar_0", com.talkfun.cloudlive.R.layout.activity_live_one_to_one__tool_bar);
      sKeys.put("layout/activity_live_one_to_one__tool_bar_0", com.talkfun.cloudlive.R.layout.activity_live_one_to_one__tool_bar);
      sKeys.put("layout-sw600dp/activity_live_one_to_one_media_layout_0", com.talkfun.cloudlive.R.layout.activity_live_one_to_one_media_layout);
      sKeys.put("layout/activity_live_one_to_one_media_layout_0", com.talkfun.cloudlive.R.layout.activity_live_one_to_one_media_layout);
      sKeys.put("layout/activity_live_one_to_one_native_0", com.talkfun.cloudlive.R.layout.activity_live_one_to_one_native);
      sKeys.put("layout-sw600dp/activity_live_one_to_one_native_0", com.talkfun.cloudlive.R.layout.activity_live_one_to_one_native);
      sKeys.put("layout/dialog_fragment_otm_vote_0", com.talkfun.cloudlive.R.layout.dialog_fragment_otm_vote);
      sKeys.put("layout-sw600dp/dialog_fragment_otm_vote_0", com.talkfun.cloudlive.R.layout.dialog_fragment_otm_vote);
      sKeys.put("layout-sw600dp/dialog_otm_input_text_0", com.talkfun.cloudlive.R.layout.dialog_otm_input_text);
      sKeys.put("layout/dialog_otm_input_text_0", com.talkfun.cloudlive.R.layout.dialog_otm_input_text);
      sKeys.put("layout-sw600dp/dialog_oto_input_text_0", com.talkfun.cloudlive.R.layout.dialog_oto_input_text);
      sKeys.put("layout/dialog_oto_input_text_0", com.talkfun.cloudlive.R.layout.dialog_oto_input_text);
      sKeys.put("layout-sw600dp/item_dialog_fragment_otm_vote_0", com.talkfun.cloudlive.R.layout.item_dialog_fragment_otm_vote);
      sKeys.put("layout/item_dialog_fragment_otm_vote_0", com.talkfun.cloudlive.R.layout.item_dialog_fragment_otm_vote);
      sKeys.put("layout/item_empty_view_0", com.talkfun.cloudlive.R.layout.item_empty_view);
      sKeys.put("layout-sw600dp/item_live_rtc_chat_0", com.talkfun.cloudlive.R.layout.item_live_rtc_chat);
      sKeys.put("layout/item_live_rtc_chat_0", com.talkfun.cloudlive.R.layout.item_live_rtc_chat);
      sKeys.put("layout/item_live_rtc_chat_award_0", com.talkfun.cloudlive.R.layout.item_live_rtc_chat_award);
      sKeys.put("layout-sw600dp/item_live_rtc_chat_award_0", com.talkfun.cloudlive.R.layout.item_live_rtc_chat_award);
      sKeys.put("layout/item_live_rtc_chat_left_0", com.talkfun.cloudlive.R.layout.item_live_rtc_chat_left);
      sKeys.put("layout-sw600dp/item_live_rtc_chat_left_0", com.talkfun.cloudlive.R.layout.item_live_rtc_chat_left);
      sKeys.put("layout-sw600dp/item_live_rtc_chat_right_0", com.talkfun.cloudlive.R.layout.item_live_rtc_chat_right);
      sKeys.put("layout/item_live_rtc_chat_right_0", com.talkfun.cloudlive.R.layout.item_live_rtc_chat_right);
      sKeys.put("layout/item_one_to_multi_video_0", com.talkfun.cloudlive.R.layout.item_one_to_multi_video);
      sKeys.put("layout-sw600dp/item_one_to_multi_video_0", com.talkfun.cloudlive.R.layout.item_one_to_multi_video);
      sKeys.put("layout-sw600dp/item_pop_color_0", com.talkfun.cloudlive.R.layout.item_pop_color);
      sKeys.put("layout/item_pop_color_0", com.talkfun.cloudlive.R.layout.item_pop_color);
      sKeys.put("layout/item_pop_draw_0", com.talkfun.cloudlive.R.layout.item_pop_draw);
      sKeys.put("layout-sw600dp/item_pop_draw_0", com.talkfun.cloudlive.R.layout.item_pop_draw);
      sKeys.put("layout-sw600dp/item_pop_stoke_0", com.talkfun.cloudlive.R.layout.item_pop_stoke);
      sKeys.put("layout/item_pop_stoke_0", com.talkfun.cloudlive.R.layout.item_pop_stoke);
      sKeys.put("layout/item_pop_useful_expressions_0", com.talkfun.cloudlive.R.layout.item_pop_useful_expressions);
      sKeys.put("layout/item_rtc_video_0", com.talkfun.cloudlive.R.layout.item_rtc_video);
      sKeys.put("layout-sw600dp/item_rtc_video_0", com.talkfun.cloudlive.R.layout.item_rtc_video);
      sKeys.put("layout/item_vote_list_empty_view_0", com.talkfun.cloudlive.R.layout.item_vote_list_empty_view);
      sKeys.put("layout-sw600dp/item_vote_list_empty_view_0", com.talkfun.cloudlive.R.layout.item_vote_list_empty_view);
      sKeys.put("layout/tip_net_work_error_0", com.talkfun.cloudlive.R.layout.tip_net_work_error);
      sKeys.put("layout-sw600dp/tip_net_work_error_0", com.talkfun.cloudlive.R.layout.tip_net_work_error);
    }
  }
}
