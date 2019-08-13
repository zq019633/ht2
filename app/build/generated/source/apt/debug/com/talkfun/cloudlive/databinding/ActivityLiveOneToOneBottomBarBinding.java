package com.talkfun.cloudlive.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class ActivityLiveOneToOneBottomBarBinding extends ViewDataBinding {
    @Nullable
    public final android.widget.ImageView bottomChatIv;
    @Nullable
    public final android.widget.TextView bottomChatMessageTv;
    @NonNull
    public final android.widget.ImageView drawIv;
    @NonNull
    public final android.widget.ImageView eraserIv;
    @Nullable
    public final android.widget.RelativeLayout rlBottomBar;
    // variables
    protected ActivityLiveOneToOneBottomBarBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , android.widget.ImageView bottomChatIv1
        , android.widget.TextView bottomChatMessageTv1
        , android.widget.ImageView drawIv1
        , android.widget.ImageView eraserIv1
        , android.widget.RelativeLayout rlBottomBar1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.bottomChatIv = bottomChatIv1;
        this.bottomChatMessageTv = bottomChatMessageTv1;
        this.drawIv = drawIv1;
        this.eraserIv = eraserIv1;
        this.rlBottomBar = rlBottomBar1;
    }
    //getters and abstract setters
    @NonNull
    public static ActivityLiveOneToOneBottomBarBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLiveOneToOneBottomBarBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLiveOneToOneBottomBarBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLiveOneToOneBottomBarBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ActivityLiveOneToOneBottomBarBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_one__bottom_bar, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityLiveOneToOneBottomBarBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ActivityLiveOneToOneBottomBarBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_one__bottom_bar, null, false, bindingComponent);
    }
    @NonNull
    public static ActivityLiveOneToOneBottomBarBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return (ActivityLiveOneToOneBottomBarBinding)bind(bindingComponent, view, com.talkfun.cloudlive.R.layout.activity_live_one_to_one__bottom_bar);
    }
}