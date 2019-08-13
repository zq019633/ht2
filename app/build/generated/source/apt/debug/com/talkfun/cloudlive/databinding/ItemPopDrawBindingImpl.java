package com.talkfun.cloudlive.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class ItemPopDrawBindingImpl extends ViewDataBinding {
    @NonNull
    public final android.widget.FrameLayout drawParentFl;
    @NonNull
    public final android.widget.ImageView drawTypeIv;
    // variables
    protected ItemPopDrawBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , android.widget.FrameLayout drawParentFl1
        , android.widget.ImageView drawTypeIv1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.drawParentFl = drawParentFl1;
        this.drawTypeIv = drawTypeIv1;
    }
    //getters and abstract setters
    @NonNull
    public static ItemPopDrawBindingImpl inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemPopDrawBindingImpl inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemPopDrawBindingImpl bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemPopDrawBindingImpl inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ItemPopDrawBindingImpl>inflate(inflater, com.talkfun.cloudlive.R.layout.item_pop_draw, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemPopDrawBindingImpl inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ItemPopDrawBindingImpl>inflate(inflater, com.talkfun.cloudlive.R.layout.item_pop_draw, null, false, bindingComponent);
    }
    @NonNull
    public static ItemPopDrawBindingImpl bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return (ItemPopDrawBindingImpl)bind(bindingComponent, view, com.talkfun.cloudlive.R.layout.item_pop_draw);
    }
}