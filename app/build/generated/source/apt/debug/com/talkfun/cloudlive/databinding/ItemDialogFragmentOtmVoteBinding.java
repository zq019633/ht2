package com.talkfun.cloudlive.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class ItemDialogFragmentOtmVoteBinding extends ViewDataBinding {
    @NonNull
    public final android.widget.Button btnCheck;
    @NonNull
    public final android.widget.TextView nickname;
    @NonNull
    public final android.widget.TextView tvLabel;
    @NonNull
    public final android.widget.TextView tvVoteStartTime;
    @NonNull
    public final android.widget.TextView tvVoteStatus;
    @NonNull
    public final android.view.View view;
    // variables
    protected ItemDialogFragmentOtmVoteBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , android.widget.Button btnCheck1
        , android.widget.TextView nickname1
        , android.widget.TextView tvLabel1
        , android.widget.TextView tvVoteStartTime1
        , android.widget.TextView tvVoteStatus1
        , android.view.View view1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.btnCheck = btnCheck1;
        this.nickname = nickname1;
        this.tvLabel = tvLabel1;
        this.tvVoteStartTime = tvVoteStartTime1;
        this.tvVoteStatus = tvVoteStatus1;
        this.view = view1;
    }
    //getters and abstract setters
    @NonNull
    public static ItemDialogFragmentOtmVoteBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemDialogFragmentOtmVoteBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemDialogFragmentOtmVoteBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemDialogFragmentOtmVoteBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ItemDialogFragmentOtmVoteBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.item_dialog_fragment_otm_vote, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemDialogFragmentOtmVoteBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ItemDialogFragmentOtmVoteBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.item_dialog_fragment_otm_vote, null, false, bindingComponent);
    }
    @NonNull
    public static ItemDialogFragmentOtmVoteBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return (ItemDialogFragmentOtmVoteBinding)bind(bindingComponent, view, com.talkfun.cloudlive.R.layout.item_dialog_fragment_otm_vote);
    }
}