package com.talkfun.cloudlive.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class DialogOtoInputTextBinding extends ViewDataBinding {
    @NonNull
    public final com.talkfun.cloudlive.view.ClearEditText edtInput;
    @NonNull
    public final android.widget.LinearLayout llButtonEdit;
    @NonNull
    public final android.widget.RelativeLayout parentRl;
    @NonNull
    public final android.widget.Button sendMessageBtn;
    @NonNull
    public final android.widget.ImageView softDownIv;
    // variables
    protected DialogOtoInputTextBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , com.talkfun.cloudlive.view.ClearEditText edtInput1
        , android.widget.LinearLayout llButtonEdit1
        , android.widget.RelativeLayout parentRl1
        , android.widget.Button sendMessageBtn1
        , android.widget.ImageView softDownIv1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.edtInput = edtInput1;
        this.llButtonEdit = llButtonEdit1;
        this.parentRl = parentRl1;
        this.sendMessageBtn = sendMessageBtn1;
        this.softDownIv = softDownIv1;
    }
    //getters and abstract setters
    @NonNull
    public static DialogOtoInputTextBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static DialogOtoInputTextBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static DialogOtoInputTextBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static DialogOtoInputTextBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<DialogOtoInputTextBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.dialog_oto_input_text, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static DialogOtoInputTextBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<DialogOtoInputTextBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.dialog_oto_input_text, null, false, bindingComponent);
    }
    @NonNull
    public static DialogOtoInputTextBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return (DialogOtoInputTextBinding)bind(bindingComponent, view, com.talkfun.cloudlive.R.layout.dialog_oto_input_text);
    }
}