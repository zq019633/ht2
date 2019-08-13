package com.talkfun.cloudlive.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class ActivityLiveOneToMultiMediaLayoutBinding extends ViewDataBinding {
    @NonNull
    public final android.widget.FrameLayout flMultiMedia;
    @NonNull
    public final android.widget.FrameLayout flMultiMediaParent;
    @NonNull
    public final android.widget.ImageView ivFullScreen;
    @NonNull
    public final com.talkfun.widget.RotateImageView ivMultiMediaDoctype;
    @Nullable
    public final android.widget.ImageView ivMultiMediaPause;
    @NonNull
    public final android.support.constraint.ConstraintLayout progressBarParent;
    @NonNull
    public final android.widget.ProgressBar timeProgress;
    @NonNull
    public final com.talkfun.widget.round.RoundTextView tvPause;
    @NonNull
    public final android.widget.TextView tvTime;
    @NonNull
    public final android.view.View viewShade;
    // variables
    protected ActivityLiveOneToMultiMediaLayoutBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , android.widget.FrameLayout flMultiMedia1
        , android.widget.FrameLayout flMultiMediaParent1
        , android.widget.ImageView ivFullScreen1
        , com.talkfun.widget.RotateImageView ivMultiMediaDoctype1
        , android.widget.ImageView ivMultiMediaPause1
        , android.support.constraint.ConstraintLayout progressBarParent1
        , android.widget.ProgressBar timeProgress1
        , com.talkfun.widget.round.RoundTextView tvPause1
        , android.widget.TextView tvTime1
        , android.view.View viewShade1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.flMultiMedia = flMultiMedia1;
        this.flMultiMediaParent = flMultiMediaParent1;
        this.ivFullScreen = ivFullScreen1;
        this.ivMultiMediaDoctype = ivMultiMediaDoctype1;
        this.ivMultiMediaPause = ivMultiMediaPause1;
        this.progressBarParent = progressBarParent1;
        this.timeProgress = timeProgress1;
        this.tvPause = tvPause1;
        this.tvTime = tvTime1;
        this.viewShade = viewShade1;
    }
    //getters and abstract setters
    @NonNull
    public static ActivityLiveOneToMultiMediaLayoutBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLiveOneToMultiMediaLayoutBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLiveOneToMultiMediaLayoutBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLiveOneToMultiMediaLayoutBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ActivityLiveOneToMultiMediaLayoutBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_media_layout, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityLiveOneToMultiMediaLayoutBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ActivityLiveOneToMultiMediaLayoutBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_media_layout, null, false, bindingComponent);
    }
    @NonNull
    public static ActivityLiveOneToMultiMediaLayoutBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return (ActivityLiveOneToMultiMediaLayoutBinding)bind(bindingComponent, view, com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_media_layout);
    }
}