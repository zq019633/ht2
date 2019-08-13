package com.talkfun.cloudlive.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class ItemVoteListEmptyViewBinding extends ViewDataBinding {
    // variables
    protected ItemVoteListEmptyViewBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
    ) {
        super(bindingComponent, root_, localFieldCount);
    }
    //getters and abstract setters
    @NonNull
    public static ItemVoteListEmptyViewBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemVoteListEmptyViewBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemVoteListEmptyViewBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemVoteListEmptyViewBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ItemVoteListEmptyViewBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.item_vote_list_empty_view, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemVoteListEmptyViewBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ItemVoteListEmptyViewBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.item_vote_list_empty_view, null, false, bindingComponent);
    }
    @NonNull
    public static ItemVoteListEmptyViewBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return (ItemVoteListEmptyViewBinding)bind(bindingComponent, view, com.talkfun.cloudlive.R.layout.item_vote_list_empty_view);
    }
}