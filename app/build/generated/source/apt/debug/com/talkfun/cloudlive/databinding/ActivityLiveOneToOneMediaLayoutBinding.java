package com.talkfun.cloudlive.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class ActivityLiveOneToOneMediaLayoutBinding extends ViewDataBinding {
    @NonNull
    public final android.widget.FrameLayout flMultiMediaParent;
    // variables
    protected ActivityLiveOneToOneMediaLayoutBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , android.widget.FrameLayout flMultiMediaParent1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.flMultiMediaParent = flMultiMediaParent1;
    }
    //getters and abstract setters
    @NonNull
    public static ActivityLiveOneToOneMediaLayoutBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLiveOneToOneMediaLayoutBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLiveOneToOneMediaLayoutBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLiveOneToOneMediaLayoutBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ActivityLiveOneToOneMediaLayoutBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_one_media_layout, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityLiveOneToOneMediaLayoutBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ActivityLiveOneToOneMediaLayoutBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_one_media_layout, null, false, bindingComponent);
    }
    @NonNull
    public static ActivityLiveOneToOneMediaLayoutBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return (ActivityLiveOneToOneMediaLayoutBinding)bind(bindingComponent, view, com.talkfun.cloudlive.R.layout.activity_live_one_to_one_media_layout);
    }
}