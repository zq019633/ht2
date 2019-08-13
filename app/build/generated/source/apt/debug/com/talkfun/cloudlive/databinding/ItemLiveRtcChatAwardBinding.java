package com.talkfun.cloudlive.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class ItemLiveRtcChatAwardBinding extends ViewDataBinding {
    // variables
    protected com.talkfun.sdk.rtc.entity.AwardEntity mAwardEntity;
    protected ItemLiveRtcChatAwardBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
    ) {
        super(bindingComponent, root_, localFieldCount);
    }
    //getters and abstract setters
    public abstract void setAwardEntity(@Nullable com.talkfun.sdk.rtc.entity.AwardEntity AwardEntity);
    @Nullable
    public com.talkfun.sdk.rtc.entity.AwardEntity getAwardEntity() {
        return mAwardEntity;
    }
    @NonNull
    public static ItemLiveRtcChatAwardBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemLiveRtcChatAwardBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemLiveRtcChatAwardBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemLiveRtcChatAwardBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ItemLiveRtcChatAwardBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.item_live_rtc_chat_award, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemLiveRtcChatAwardBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ItemLiveRtcChatAwardBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.item_live_rtc_chat_award, null, false, bindingComponent);
    }
    @NonNull
    public static ItemLiveRtcChatAwardBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return (ItemLiveRtcChatAwardBinding)bind(bindingComponent, view, com.talkfun.cloudlive.R.layout.item_live_rtc_chat_award);
    }
}