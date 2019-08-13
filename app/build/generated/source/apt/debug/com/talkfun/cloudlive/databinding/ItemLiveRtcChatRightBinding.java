package com.talkfun.cloudlive.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class ItemLiveRtcChatRightBinding extends ViewDataBinding {
    @Nullable
    public final android.widget.TextView leftMsg;
    @Nullable
    public final android.widget.LinearLayout rightLayout;
    @Nullable
    public final android.widget.TextView rightMsg;
    // variables
    protected com.talkfun.sdk.module.ChatEntity mChatEntity;
    protected com.talkfun.sdk.consts.MemberRole mMemberRole;
    protected ItemLiveRtcChatRightBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , android.widget.TextView leftMsg1
        , android.widget.LinearLayout rightLayout1
        , android.widget.TextView rightMsg1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.leftMsg = leftMsg1;
        this.rightLayout = rightLayout1;
        this.rightMsg = rightMsg1;
    }
    //getters and abstract setters
    public abstract void setChatEntity(@Nullable com.talkfun.sdk.module.ChatEntity ChatEntity);
    @Nullable
    public com.talkfun.sdk.module.ChatEntity getChatEntity() {
        return mChatEntity;
    }
    public abstract void setMemberRole(@Nullable com.talkfun.sdk.consts.MemberRole MemberRole);
    @Nullable
    public com.talkfun.sdk.consts.MemberRole getMemberRole() {
        return mMemberRole;
    }
    @NonNull
    public static ItemLiveRtcChatRightBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemLiveRtcChatRightBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemLiveRtcChatRightBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemLiveRtcChatRightBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ItemLiveRtcChatRightBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.item_live_rtc_chat_right, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemLiveRtcChatRightBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ItemLiveRtcChatRightBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.item_live_rtc_chat_right, null, false, bindingComponent);
    }
    @NonNull
    public static ItemLiveRtcChatRightBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return (ItemLiveRtcChatRightBinding)bind(bindingComponent, view, com.talkfun.cloudlive.R.layout.item_live_rtc_chat_right);
    }
}