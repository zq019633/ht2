package com.talkfun.cloudlive.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class ActivityLiveOneToMultiBottomBarBinding extends ViewDataBinding {
    @NonNull
    public final android.widget.TextView bottomChatMessageTv;
    @NonNull
    public final android.widget.ImageView chatIv;
    @NonNull
    public final android.widget.ImageView drawIv;
    @NonNull
    public final android.widget.ImageView eraserIv;
    @NonNull
    public final android.widget.ImageView ivEmoticon;
    @NonNull
    public final android.widget.ImageView voteIv;
    // variables
    protected ActivityLiveOneToMultiBottomBarBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , android.widget.TextView bottomChatMessageTv1
        , android.widget.ImageView chatIv1
        , android.widget.ImageView drawIv1
        , android.widget.ImageView eraserIv1
        , android.widget.ImageView ivEmoticon1
        , android.widget.ImageView voteIv1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.bottomChatMessageTv = bottomChatMessageTv1;
        this.chatIv = chatIv1;
        this.drawIv = drawIv1;
        this.eraserIv = eraserIv1;
        this.ivEmoticon = ivEmoticon1;
        this.voteIv = voteIv1;
    }
    //getters and abstract setters
    @NonNull
    public static ActivityLiveOneToMultiBottomBarBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLiveOneToMultiBottomBarBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLiveOneToMultiBottomBarBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLiveOneToMultiBottomBarBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ActivityLiveOneToMultiBottomBarBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_bottom_bar, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityLiveOneToMultiBottomBarBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ActivityLiveOneToMultiBottomBarBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_bottom_bar, null, false, bindingComponent);
    }
    @NonNull
    public static ActivityLiveOneToMultiBottomBarBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return (ActivityLiveOneToMultiBottomBarBinding)bind(bindingComponent, view, com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_bottom_bar);
    }
}