package com.talkfun.cloudlive.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class ItemPopColorBinding extends ViewDataBinding {
    @NonNull
    public final com.talkfun.widget.ColorView colorCv;
    // variables
    protected ItemPopColorBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , com.talkfun.widget.ColorView colorCv1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.colorCv = colorCv1;
    }
    //getters and abstract setters
    @NonNull
    public static ItemPopColorBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemPopColorBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemPopColorBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemPopColorBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ItemPopColorBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.item_pop_color, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemPopColorBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ItemPopColorBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.item_pop_color, null, false, bindingComponent);
    }
    @NonNull
    public static ItemPopColorBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return (ItemPopColorBinding)bind(bindingComponent, view, com.talkfun.cloudlive.R.layout.item_pop_color);
    }
}