package com.talkfun.cloudlive.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class ActivityLiveOneToOneToolBarBinding extends ViewDataBinding {
    @NonNull
    public final android.widget.ImageView backIv;
    @NonNull
    public final android.widget.ImageView timeIv;
    @NonNull
    public final android.widget.TextView timeTv;
    @NonNull
    public final android.widget.TextView titleTv;
    // variables
    protected ActivityLiveOneToOneToolBarBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , android.widget.ImageView backIv1
        , android.widget.ImageView timeIv1
        , android.widget.TextView timeTv1
        , android.widget.TextView titleTv1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.backIv = backIv1;
        this.timeIv = timeIv1;
        this.timeTv = timeTv1;
        this.titleTv = titleTv1;
    }
    //getters and abstract setters
    @NonNull
    public static ActivityLiveOneToOneToolBarBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLiveOneToOneToolBarBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLiveOneToOneToolBarBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLiveOneToOneToolBarBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ActivityLiveOneToOneToolBarBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_one__tool_bar, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityLiveOneToOneToolBarBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ActivityLiveOneToOneToolBarBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_one__tool_bar, null, false, bindingComponent);
    }
    @NonNull
    public static ActivityLiveOneToOneToolBarBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return (ActivityLiveOneToOneToolBarBinding)bind(bindingComponent, view, com.talkfun.cloudlive.R.layout.activity_live_one_to_one__tool_bar);
    }
}