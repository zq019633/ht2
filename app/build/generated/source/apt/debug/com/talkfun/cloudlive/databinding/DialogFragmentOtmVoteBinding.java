package com.talkfun.cloudlive.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class DialogFragmentOtmVoteBinding extends ViewDataBinding {
    @NonNull
    public final android.support.v7.widget.RecyclerView rvVote;
    // variables
    protected DialogFragmentOtmVoteBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , android.support.v7.widget.RecyclerView rvVote1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.rvVote = rvVote1;
    }
    //getters and abstract setters
    @NonNull
    public static DialogFragmentOtmVoteBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static DialogFragmentOtmVoteBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static DialogFragmentOtmVoteBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static DialogFragmentOtmVoteBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<DialogFragmentOtmVoteBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.dialog_fragment_otm_vote, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static DialogFragmentOtmVoteBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<DialogFragmentOtmVoteBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.dialog_fragment_otm_vote, null, false, bindingComponent);
    }
    @NonNull
    public static DialogFragmentOtmVoteBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return (DialogFragmentOtmVoteBinding)bind(bindingComponent, view, com.talkfun.cloudlive.R.layout.dialog_fragment_otm_vote);
    }
}