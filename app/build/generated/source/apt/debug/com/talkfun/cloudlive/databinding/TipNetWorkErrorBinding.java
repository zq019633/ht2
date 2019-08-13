package com.talkfun.cloudlive.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class TipNetWorkErrorBinding extends ViewDataBinding {
    @NonNull
    public final android.widget.LinearLayout badNetStatusLl;
    // variables
    protected TipNetWorkErrorBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , android.widget.LinearLayout badNetStatusLl1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.badNetStatusLl = badNetStatusLl1;
    }
    //getters and abstract setters
    @NonNull
    public static TipNetWorkErrorBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static TipNetWorkErrorBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static TipNetWorkErrorBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static TipNetWorkErrorBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<TipNetWorkErrorBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.tip_net_work_error, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static TipNetWorkErrorBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<TipNetWorkErrorBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.tip_net_work_error, null, false, bindingComponent);
    }
    @NonNull
    public static TipNetWorkErrorBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return (TipNetWorkErrorBinding)bind(bindingComponent, view, com.talkfun.cloudlive.R.layout.tip_net_work_error);
    }
}