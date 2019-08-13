package com.talkfun.cloudlive.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class ItemPopStokeBinding extends ViewDataBinding {
    @NonNull
    public final com.talkfun.widget.DotView stokeDv;
    // variables
    protected ItemPopStokeBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , com.talkfun.widget.DotView stokeDv1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.stokeDv = stokeDv1;
    }
    //getters and abstract setters
    @NonNull
    public static ItemPopStokeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemPopStokeBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemPopStokeBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemPopStokeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ItemPopStokeBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.item_pop_stoke, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemPopStokeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ItemPopStokeBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.item_pop_stoke, null, false, bindingComponent);
    }
    @NonNull
    public static ItemPopStokeBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return (ItemPopStokeBinding)bind(bindingComponent, view, com.talkfun.cloudlive.R.layout.item_pop_stoke);
    }
}