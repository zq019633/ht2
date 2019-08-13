
package android.databinding;
import com.talkfun.cloudlive.BR;
class DataBinderMapperImpl extends android.databinding.DataBinderMapper {
    public DataBinderMapperImpl() {
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_tool_bar:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_live_one_to_multi_tool_bar_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiToolBarBindingImpl(bindingComponent, view);
                    }
                    if ("layout-sw600dp/activity_live_one_to_multi_tool_bar_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiToolBarBindingSw600dpImpl(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_live_one_to_multi_tool_bar is invalid. Received: " + tag);
                }
                case com.talkfun.cloudlive.R.layout.activity_live_one_to_one__tool_bar:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_live_one_to_one__tool_bar_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ActivityLiveOneToOneToolBarBindingImpl(bindingComponent, view);
                    }
                    if ("layout-sw600dp/activity_live_one_to_one__tool_bar_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ActivityLiveOneToOneToolBarBindingSw600dpImpl(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_live_one_to_one__tool_bar is invalid. Received: " + tag);
                }
                case com.talkfun.cloudlive.R.layout.activity_live_one_to_multi__right_oprator:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_live_one_to_multi__right_oprator_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiRightOpratorBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_live_one_to_multi__right_oprator is invalid. Received: " + tag);
                }
                case com.talkfun.cloudlive.R.layout.activity_live_one_to_one__chat_layout:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_live_one_to_one__chat_layout_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ActivityLiveOneToOneChatLayoutBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_live_one_to_one__chat_layout is invalid. Received: " + tag);
                }
                case com.talkfun.cloudlive.R.layout.dialog_fragment_otm_vote:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout-sw600dp/dialog_fragment_otm_vote_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.DialogFragmentOtmVoteBindingSw600dpImpl(bindingComponent, view);
                    }
                    if ("layout/dialog_fragment_otm_vote_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.DialogFragmentOtmVoteBindingImpl(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for dialog_fragment_otm_vote is invalid. Received: " + tag);
                }
                case com.talkfun.cloudlive.R.layout.item_vote_list_empty_view:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/item_vote_list_empty_view_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ItemVoteListEmptyViewBindingImpl(bindingComponent, view);
                    }
                    if ("layout-sw600dp/item_vote_list_empty_view_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ItemVoteListEmptyViewBindingSw600dpImpl(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for item_vote_list_empty_view is invalid. Received: " + tag);
                }
                case com.talkfun.cloudlive.R.layout.item_dialog_fragment_otm_vote:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/item_dialog_fragment_otm_vote_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ItemDialogFragmentOtmVoteBindingImpl(bindingComponent, view);
                    }
                    if ("layout-sw600dp/item_dialog_fragment_otm_vote_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ItemDialogFragmentOtmVoteBindingSw600dpImpl(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for item_dialog_fragment_otm_vote is invalid. Received: " + tag);
                }
                case com.talkfun.cloudlive.R.layout.item_live_rtc_chat:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/item_live_rtc_chat_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ItemLiveRtcChatBindingImpl(bindingComponent, view);
                    }
                    if ("layout-sw600dp/item_live_rtc_chat_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ItemLiveRtcChatBindingSw600dpImpl(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for item_live_rtc_chat is invalid. Received: " + tag);
                }
                case com.talkfun.cloudlive.R.layout.item_empty_view:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/item_empty_view_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ItemEmptyViewBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for item_empty_view is invalid. Received: " + tag);
                }
                case com.talkfun.cloudlive.R.layout.item_rtc_video:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout-sw600dp/item_rtc_video_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ItemRtcVideoBindingSw600dpImpl(bindingComponent, view);
                    }
                    if ("layout/item_rtc_video_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ItemRtcVideoBindingImpl(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for item_rtc_video is invalid. Received: " + tag);
                }
                case com.talkfun.cloudlive.R.layout.activity_live_one_to_one_native:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout-sw600dp/activity_live_one_to_one_native_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ActivityLiveOneToOneNativeBindingSw600dpImpl(bindingComponent, view);
                    }
                    if ("layout/activity_live_one_to_one_native_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ActivityLiveOneToOneNativeBindingImpl(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_live_one_to_one_native is invalid. Received: " + tag);
                }
                case com.talkfun.cloudlive.R.layout.item_pop_color:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/item_pop_color_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ItemPopColorBindingImpl(bindingComponent, view);
                    }
                    if ("layout-sw600dp/item_pop_color_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ItemPopColorBindingSw600dpImpl(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for item_pop_color is invalid. Received: " + tag);
                }
                case com.talkfun.cloudlive.R.layout.item_live_rtc_chat_award:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/item_live_rtc_chat_award_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ItemLiveRtcChatAwardBindingImpl(bindingComponent, view);
                    }
                    if ("layout-sw600dp/item_live_rtc_chat_award_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ItemLiveRtcChatAwardBindingSw600dpImpl(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for item_live_rtc_chat_award is invalid. Received: " + tag);
                }
                case com.talkfun.cloudlive.R.layout.activity_live_one_to_one_media_layout:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_live_one_to_one_media_layout_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ActivityLiveOneToOneMediaLayoutBindingImpl(bindingComponent, view);
                    }
                    if ("layout-sw600dp/activity_live_one_to_one_media_layout_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ActivityLiveOneToOneMediaLayoutBindingSw600dpImpl(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_live_one_to_one_media_layout is invalid. Received: " + tag);
                }
                case com.talkfun.cloudlive.R.layout.dialog_oto_input_text:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout-sw600dp/dialog_oto_input_text_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.DialogOtoInputTextBindingSw600dpImpl(bindingComponent, view);
                    }
                    if ("layout/dialog_oto_input_text_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.DialogOtoInputTextBindingImpl(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for dialog_oto_input_text is invalid. Received: " + tag);
                }
                case com.talkfun.cloudlive.R.layout.activity_live_one_to_multi__left_oprator:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_live_one_to_multi__left_oprator_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiLeftOpratorBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_live_one_to_multi__left_oprator is invalid. Received: " + tag);
                }
                case com.talkfun.cloudlive.R.layout.item_live_rtc_chat_left:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/item_live_rtc_chat_left_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ItemLiveRtcChatLeftBindingImpl(bindingComponent, view);
                    }
                    if ("layout-sw600dp/item_live_rtc_chat_left_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ItemLiveRtcChatLeftBindingSw600dpImpl(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for item_live_rtc_chat_left is invalid. Received: " + tag);
                }
                case com.talkfun.cloudlive.R.layout.activity_live_one_to_one__bottom_bar:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout-sw600dp/activity_live_one_to_one__bottom_bar_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ActivityLiveOneToOneBottomBarBindingSw600dpImpl(bindingComponent, view);
                    }
                    if ("layout/activity_live_one_to_one__bottom_bar_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ActivityLiveOneToOneBottomBarBindingImpl(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_live_one_to_one__bottom_bar is invalid. Received: " + tag);
                }
                case com.talkfun.cloudlive.R.layout.item_pop_draw:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout-sw600dp/item_pop_draw_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ItemPopDrawBindingImplSw600dpImpl(bindingComponent, view);
                    }
                    if ("layout/item_pop_draw_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ItemPopDrawBindingImplImpl(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for item_pop_draw is invalid. Received: " + tag);
                }
                case com.talkfun.cloudlive.R.layout.dialog_otm_input_text:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout-sw600dp/dialog_otm_input_text_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.DialogOtmInputTextBindingSw600dpImpl(bindingComponent, view);
                    }
                    if ("layout/dialog_otm_input_text_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.DialogOtmInputTextBindingImpl(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for dialog_otm_input_text is invalid. Received: " + tag);
                }
                case com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_media_layout:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_live_one_to_multi_media_layout_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiMediaLayoutBindingImpl(bindingComponent, view);
                    }
                    if ("layout-sw600dp/activity_live_one_to_multi_media_layout_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiMediaLayoutBindingSw600dpImpl(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_live_one_to_multi_media_layout is invalid. Received: " + tag);
                }
                case com.talkfun.cloudlive.R.layout.item_one_to_multi_video:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout-sw600dp/item_one_to_multi_video_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ItemOneToMultiVideoBindingSw600dpImpl(bindingComponent, view);
                    }
                    if ("layout/item_one_to_multi_video_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ItemOneToMultiVideoBindingImpl(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for item_one_to_multi_video is invalid. Received: " + tag);
                }
                case com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_bottom_bar:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_live_one_to_multi_bottom_bar_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiBottomBarBindingImpl(bindingComponent, view);
                    }
                    if ("layout-sw600dp/activity_live_one_to_multi_bottom_bar_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiBottomBarBindingSw600dpImpl(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_live_one_to_multi_bottom_bar is invalid. Received: " + tag);
                }
                case com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_native:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout-sw600dp/activity_live_one_to_multi_native_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiNativeBindingSw600dpImpl(bindingComponent, view);
                    }
                    if ("layout/activity_live_one_to_multi_native_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiNativeBindingImpl(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_live_one_to_multi_native is invalid. Received: " + tag);
                }
                case com.talkfun.cloudlive.R.layout.item_pop_stoke:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout-sw600dp/item_pop_stoke_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ItemPopStokeBindingSw600dpImpl(bindingComponent, view);
                    }
                    if ("layout/item_pop_stoke_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ItemPopStokeBindingImpl(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for item_pop_stoke is invalid. Received: " + tag);
                }
                case com.talkfun.cloudlive.R.layout.item_live_rtc_chat_right:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout-sw600dp/item_live_rtc_chat_right_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ItemLiveRtcChatRightBindingSw600dpImpl(bindingComponent, view);
                    }
                    if ("layout/item_live_rtc_chat_right_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ItemLiveRtcChatRightBindingImpl(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for item_live_rtc_chat_right is invalid. Received: " + tag);
                }
                case com.talkfun.cloudlive.R.layout.tip_net_work_error:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout-sw600dp/tip_net_work_error_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.TipNetWorkErrorBindingSw600dpImpl(bindingComponent, view);
                    }
                    if ("layout/tip_net_work_error_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.TipNetWorkErrorBindingImpl(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for tip_net_work_error is invalid. Received: " + tag);
                }
                case com.talkfun.cloudlive.R.layout.activity_live_one_to_multi__ipad_right_oprator:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_live_one_to_multi__ipad_right_oprator_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiIpadRightOpratorBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_live_one_to_multi__ipad_right_oprator is invalid. Received: " + tag);
                }
                case com.talkfun.cloudlive.R.layout.item_pop_useful_expressions:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/item_pop_useful_expressions_0".equals(tag)) {
                            return new com.talkfun.cloudlive.databinding.ItemPopUsefulExpressionsBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for item_pop_useful_expressions is invalid. Received: " + tag);
                }
        }
        return null;
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    @Override
    public int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case 669681670: {
                if(tag.equals("layout/activity_live_one_to_multi_tool_bar_0")) {
                    return com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_tool_bar;
                }
                break;
            }
            case 200221783: {
                if(tag.equals("layout-sw600dp/activity_live_one_to_multi_tool_bar_0")) {
                    return com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_tool_bar;
                }
                break;
            }
            case 1105344224: {
                if(tag.equals("layout/activity_live_one_to_one__tool_bar_0")) {
                    return com.talkfun.cloudlive.R.layout.activity_live_one_to_one__tool_bar;
                }
                break;
            }
            case -710914961: {
                if(tag.equals("layout-sw600dp/activity_live_one_to_one__tool_bar_0")) {
                    return com.talkfun.cloudlive.R.layout.activity_live_one_to_one__tool_bar;
                }
                break;
            }
            case -2088601473: {
                if(tag.equals("layout/activity_live_one_to_multi__right_oprator_0")) {
                    return com.talkfun.cloudlive.R.layout.activity_live_one_to_multi__right_oprator;
                }
                break;
            }
            case -2134184641: {
                if(tag.equals("layout/activity_live_one_to_one__chat_layout_0")) {
                    return com.talkfun.cloudlive.R.layout.activity_live_one_to_one__chat_layout;
                }
                break;
            }
            case 1192431422: {
                if(tag.equals("layout-sw600dp/dialog_fragment_otm_vote_0")) {
                    return com.talkfun.cloudlive.R.layout.dialog_fragment_otm_vote;
                }
                break;
            }
            case -1519312145: {
                if(tag.equals("layout/dialog_fragment_otm_vote_0")) {
                    return com.talkfun.cloudlive.R.layout.dialog_fragment_otm_vote;
                }
                break;
            }
            case -891700869: {
                if(tag.equals("layout/item_vote_list_empty_view_0")) {
                    return com.talkfun.cloudlive.R.layout.item_vote_list_empty_view;
                }
                break;
            }
            case 1567971084: {
                if(tag.equals("layout-sw600dp/item_vote_list_empty_view_0")) {
                    return com.talkfun.cloudlive.R.layout.item_vote_list_empty_view;
                }
                break;
            }
            case 1055238833: {
                if(tag.equals("layout/item_dialog_fragment_otm_vote_0")) {
                    return com.talkfun.cloudlive.R.layout.item_dialog_fragment_otm_vote;
                }
                break;
            }
            case -1201268798: {
                if(tag.equals("layout-sw600dp/item_dialog_fragment_otm_vote_0")) {
                    return com.talkfun.cloudlive.R.layout.item_dialog_fragment_otm_vote;
                }
                break;
            }
            case -688773517: {
                if(tag.equals("layout/item_live_rtc_chat_0")) {
                    return com.talkfun.cloudlive.R.layout.item_live_rtc_chat;
                }
                break;
            }
            case -1571603966: {
                if(tag.equals("layout-sw600dp/item_live_rtc_chat_0")) {
                    return com.talkfun.cloudlive.R.layout.item_live_rtc_chat;
                }
                break;
            }
            case 320738895: {
                if(tag.equals("layout/item_empty_view_0")) {
                    return com.talkfun.cloudlive.R.layout.item_empty_view;
                }
                break;
            }
            case 187803062: {
                if(tag.equals("layout-sw600dp/item_rtc_video_0")) {
                    return com.talkfun.cloudlive.R.layout.item_rtc_video;
                }
                break;
            }
            case 1204974247: {
                if(tag.equals("layout/item_rtc_video_0")) {
                    return com.talkfun.cloudlive.R.layout.item_rtc_video;
                }
                break;
            }
            case -2096232011: {
                if(tag.equals("layout-sw600dp/activity_live_one_to_one_native_0")) {
                    return com.talkfun.cloudlive.R.layout.activity_live_one_to_one_native;
                }
                break;
            }
            case 1744084196: {
                if(tag.equals("layout/activity_live_one_to_one_native_0")) {
                    return com.talkfun.cloudlive.R.layout.activity_live_one_to_one_native;
                }
                break;
            }
            case -38831233: {
                if(tag.equals("layout/item_pop_color_0")) {
                    return com.talkfun.cloudlive.R.layout.item_pop_color;
                }
                break;
            }
            case -1056002418: {
                if(tag.equals("layout-sw600dp/item_pop_color_0")) {
                    return com.talkfun.cloudlive.R.layout.item_pop_color;
                }
                break;
            }
            case 978881233: {
                if(tag.equals("layout/item_live_rtc_chat_award_0")) {
                    return com.talkfun.cloudlive.R.layout.item_live_rtc_chat_award;
                }
                break;
            }
            case -604342496: {
                if(tag.equals("layout-sw600dp/item_live_rtc_chat_award_0")) {
                    return com.talkfun.cloudlive.R.layout.item_live_rtc_chat_award;
                }
                break;
            }
            case 517839922: {
                if(tag.equals("layout/activity_live_one_to_one_media_layout_0")) {
                    return com.talkfun.cloudlive.R.layout.activity_live_one_to_one_media_layout;
                }
                break;
            }
            case 338454595: {
                if(tag.equals("layout-sw600dp/activity_live_one_to_one_media_layout_0")) {
                    return com.talkfun.cloudlive.R.layout.activity_live_one_to_one_media_layout;
                }
                break;
            }
            case 716479211: {
                if(tag.equals("layout-sw600dp/dialog_oto_input_text_0")) {
                    return com.talkfun.cloudlive.R.layout.dialog_oto_input_text;
                }
                break;
            }
            case -1261335334: {
                if(tag.equals("layout/dialog_oto_input_text_0")) {
                    return com.talkfun.cloudlive.R.layout.dialog_oto_input_text;
                }
                break;
            }
            case -1057811306: {
                if(tag.equals("layout/activity_live_one_to_multi__left_oprator_0")) {
                    return com.talkfun.cloudlive.R.layout.activity_live_one_to_multi__left_oprator;
                }
                break;
            }
            case -1193995883: {
                if(tag.equals("layout/item_live_rtc_chat_left_0")) {
                    return com.talkfun.cloudlive.R.layout.item_live_rtc_chat_left;
                }
                break;
            }
            case 1110237030: {
                if(tag.equals("layout-sw600dp/item_live_rtc_chat_left_0")) {
                    return com.talkfun.cloudlive.R.layout.item_live_rtc_chat_left;
                }
                break;
            }
            case -1954408894: {
                if(tag.equals("layout-sw600dp/activity_live_one_to_one__bottom_bar_0")) {
                    return com.talkfun.cloudlive.R.layout.activity_live_one_to_one__bottom_bar;
                }
                break;
            }
            case -286054285: {
                if(tag.equals("layout/activity_live_one_to_one__bottom_bar_0")) {
                    return com.talkfun.cloudlive.R.layout.activity_live_one_to_one__bottom_bar;
                }
                break;
            }
            case 1798129787: {
                if(tag.equals("layout-sw600dp/item_pop_draw_0")) {
                    return com.talkfun.cloudlive.R.layout.item_pop_draw;
                }
                break;
            }
            case -1078552214: {
                if(tag.equals("layout/item_pop_draw_0")) {
                    return com.talkfun.cloudlive.R.layout.item_pop_draw;
                }
                break;
            }
            case 1727596461: {
                if(tag.equals("layout-sw600dp/dialog_otm_input_text_0")) {
                    return com.talkfun.cloudlive.R.layout.dialog_otm_input_text;
                }
                break;
            }
            case -250218084: {
                if(tag.equals("layout/dialog_otm_input_text_0")) {
                    return com.talkfun.cloudlive.R.layout.dialog_otm_input_text;
                }
                break;
            }
            case 1567713343: {
                if(tag.equals("layout/activity_live_one_to_multi_media_layout_0")) {
                    return com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_media_layout;
                }
                break;
            }
            case 977105936: {
                if(tag.equals("layout-sw600dp/activity_live_one_to_multi_media_layout_0")) {
                    return com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_media_layout;
                }
                break;
            }
            case 2046394163: {
                if(tag.equals("layout-sw600dp/item_one_to_multi_video_0")) {
                    return com.talkfun.cloudlive.R.layout.item_one_to_multi_video;
                }
                break;
            }
            case -257838750: {
                if(tag.equals("layout/item_one_to_multi_video_0")) {
                    return com.talkfun.cloudlive.R.layout.item_one_to_multi_video;
                }
                break;
            }
            case 1949026329: {
                if(tag.equals("layout/activity_live_one_to_multi_bottom_bar_0")) {
                    return com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_bottom_bar;
                }
                break;
            }
            case 1769641002: {
                if(tag.equals("layout-sw600dp/activity_live_one_to_multi_bottom_bar_0")) {
                    return com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_bottom_bar;
                }
                break;
            }
            case 512963394: {
                if(tag.equals("layout-sw600dp/activity_live_one_to_multi_native_0")) {
                    return com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_native;
                }
                break;
            }
            case 1679931057: {
                if(tag.equals("layout/activity_live_one_to_multi_native_0")) {
                    return com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_native;
                }
                break;
            }
            case 404939251: {
                if(tag.equals("layout-sw600dp/item_pop_stoke_0")) {
                    return com.talkfun.cloudlive.R.layout.item_pop_stoke;
                }
                break;
            }
            case 1422110436: {
                if(tag.equals("layout/item_pop_stoke_0")) {
                    return com.talkfun.cloudlive.R.layout.item_pop_stoke;
                }
                break;
            }
            case 1202768671: {
                if(tag.equals("layout-sw600dp/item_live_rtc_chat_right_0")) {
                    return com.talkfun.cloudlive.R.layout.item_live_rtc_chat_right;
                }
                break;
            }
            case -1508974896: {
                if(tag.equals("layout/item_live_rtc_chat_right_0")) {
                    return com.talkfun.cloudlive.R.layout.item_live_rtc_chat_right;
                }
                break;
            }
            case 749438053: {
                if(tag.equals("layout-sw600dp/tip_net_work_error_0")) {
                    return com.talkfun.cloudlive.R.layout.tip_net_work_error;
                }
                break;
            }
            case 1632268502: {
                if(tag.equals("layout/tip_net_work_error_0")) {
                    return com.talkfun.cloudlive.R.layout.tip_net_work_error;
                }
                break;
            }
            case 1123284278: {
                if(tag.equals("layout/activity_live_one_to_multi__ipad_right_oprator_0")) {
                    return com.talkfun.cloudlive.R.layout.activity_live_one_to_multi__ipad_right_oprator;
                }
                break;
            }
            case -771224424: {
                if(tag.equals("layout/item_pop_useful_expressions_0")) {
                    return com.talkfun.cloudlive.R.layout.item_pop_useful_expressions;
                }
                break;
            }
        }
        return 0;
    }
    @Override
    public String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"awardEntity"
            ,"chatEntity"
            ,"memberRole"
            ,"tips"
            ,"videoData"};
    }
}