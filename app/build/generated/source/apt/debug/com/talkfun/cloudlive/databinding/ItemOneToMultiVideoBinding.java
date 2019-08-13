package com.talkfun.cloudlive.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class ItemOneToMultiVideoBinding extends ViewDataBinding {
    @NonNull
    public final android.widget.FrameLayout allClose;
    @NonNull
    public final com.talkfun.widget.RoundCornerLinearLayout awardLl;
    @NonNull
    public final android.support.v7.widget.CardView cvCardview;
    @NonNull
    public final android.widget.ImageView ivAllCloseAvatar;
    @NonNull
    public final android.widget.ImageView ivAudio;
    @NonNull
    public final android.widget.ImageView ivAvatar;
    @NonNull
    public final android.widget.ImageView ivAward;
    @NonNull
    public final android.widget.ImageView ivDraw;
    @NonNull
    public final android.widget.ImageView ivVideo;
    @NonNull
    public final android.widget.ProgressBar progressLoading;
    @NonNull
    public final android.widget.TextView tvAwardCount;
    @NonNull
    public final android.widget.TextView tvName;
    @NonNull
    public final android.widget.FrameLayout videoLayout;
    // variables
    protected com.talkfun.cloudlive.entity.VideoStatusData mVideoData;
    protected ItemOneToMultiVideoBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , android.widget.FrameLayout allClose1
        , com.talkfun.widget.RoundCornerLinearLayout awardLl1
        , android.support.v7.widget.CardView cvCardview1
        , android.widget.ImageView ivAllCloseAvatar1
        , android.widget.ImageView ivAudio1
        , android.widget.ImageView ivAvatar1
        , android.widget.ImageView ivAward1
        , android.widget.ImageView ivDraw1
        , android.widget.ImageView ivVideo1
        , android.widget.ProgressBar progressLoading1
        , android.widget.TextView tvAwardCount1
        , android.widget.TextView tvName1
        , android.widget.FrameLayout videoLayout1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.allClose = allClose1;
        this.awardLl = awardLl1;
        this.cvCardview = cvCardview1;
        this.ivAllCloseAvatar = ivAllCloseAvatar1;
        this.ivAudio = ivAudio1;
        this.ivAvatar = ivAvatar1;
        this.ivAward = ivAward1;
        this.ivDraw = ivDraw1;
        this.ivVideo = ivVideo1;
        this.progressLoading = progressLoading1;
        this.tvAwardCount = tvAwardCount1;
        this.tvName = tvName1;
        this.videoLayout = videoLayout1;
    }
    //getters and abstract setters
    public abstract void setVideoData(@Nullable com.talkfun.cloudlive.entity.VideoStatusData VideoData);
    @Nullable
    public com.talkfun.cloudlive.entity.VideoStatusData getVideoData() {
        return mVideoData;
    }
    @NonNull
    public static ItemOneToMultiVideoBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemOneToMultiVideoBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemOneToMultiVideoBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemOneToMultiVideoBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ItemOneToMultiVideoBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.item_one_to_multi_video, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemOneToMultiVideoBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ItemOneToMultiVideoBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.item_one_to_multi_video, null, false, bindingComponent);
    }
    @NonNull
    public static ItemOneToMultiVideoBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return (ItemOneToMultiVideoBinding)bind(bindingComponent, view, com.talkfun.cloudlive.R.layout.item_one_to_multi_video);
    }
}