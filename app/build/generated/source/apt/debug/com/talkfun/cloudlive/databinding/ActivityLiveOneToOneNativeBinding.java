package com.talkfun.cloudlive.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class ActivityLiveOneToOneNativeBinding extends ViewDataBinding {
    @Nullable
    public final com.talkfun.cloudlive.databinding.ActivityLiveOneToOneBottomBarBinding bottomBar;
    @Nullable
    public final com.talkfun.cloudlive.databinding.ActivityLiveOneToOneChatLayoutBinding chatLayout;
    @Nullable
    public final android.widget.LinearLayout chatLl;
    @Nullable
    public final android.support.v7.widget.RecyclerView chatShowLayout;
    @NonNull
    public final android.widget.FrameLayout flDesktopLayout;
    @NonNull
    public final android.widget.FrameLayout flFullScreen;
    @Nullable
    public final com.talkfun.cloudlive.databinding.TipNetWorkErrorBinding llBadNetStatus;
    @Nullable
    public final com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiMediaLayoutBinding multimediaLayout;
    @NonNull
    public final com.talkfun.widget.MultipleStatusLayout multipleStatusLayout;
    @NonNull
    public final android.widget.FrameLayout parentViewgroup;
    @Nullable
    public final android.widget.RelativeLayout rightRl;
    @Nullable
    public final com.talkfun.cloudlive.databinding.ActivityLiveOneToOneToolBarBinding toolBar;
    @NonNull
    public final android.support.v7.widget.RecyclerView videoLayout;
    @Nullable
    public final android.widget.LinearLayout whiteParentLl;
    @NonNull
    public final android.widget.FrameLayout whiteboardFl;
    // variables
    protected ActivityLiveOneToOneNativeBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , com.talkfun.cloudlive.databinding.ActivityLiveOneToOneBottomBarBinding bottomBar1
        , com.talkfun.cloudlive.databinding.ActivityLiveOneToOneChatLayoutBinding chatLayout1
        , android.widget.LinearLayout chatLl1
        , android.support.v7.widget.RecyclerView chatShowLayout1
        , android.widget.FrameLayout flDesktopLayout1
        , android.widget.FrameLayout flFullScreen1
        , com.talkfun.cloudlive.databinding.TipNetWorkErrorBinding llBadNetStatus1
        , com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiMediaLayoutBinding multimediaLayout1
        , com.talkfun.widget.MultipleStatusLayout multipleStatusLayout1
        , android.widget.FrameLayout parentViewgroup1
        , android.widget.RelativeLayout rightRl1
        , com.talkfun.cloudlive.databinding.ActivityLiveOneToOneToolBarBinding toolBar1
        , android.support.v7.widget.RecyclerView videoLayout1
        , android.widget.LinearLayout whiteParentLl1
        , android.widget.FrameLayout whiteboardFl1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.bottomBar = bottomBar1;
        setContainedBinding(this.bottomBar);
        this.chatLayout = chatLayout1;
        setContainedBinding(this.chatLayout);
        this.chatLl = chatLl1;
        this.chatShowLayout = chatShowLayout1;
        this.flDesktopLayout = flDesktopLayout1;
        this.flFullScreen = flFullScreen1;
        this.llBadNetStatus = llBadNetStatus1;
        setContainedBinding(this.llBadNetStatus);
        this.multimediaLayout = multimediaLayout1;
        setContainedBinding(this.multimediaLayout);
        this.multipleStatusLayout = multipleStatusLayout1;
        this.parentViewgroup = parentViewgroup1;
        this.rightRl = rightRl1;
        this.toolBar = toolBar1;
        setContainedBinding(this.toolBar);
        this.videoLayout = videoLayout1;
        this.whiteParentLl = whiteParentLl1;
        this.whiteboardFl = whiteboardFl1;
    }
    //getters and abstract setters
    @NonNull
    public static ActivityLiveOneToOneNativeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLiveOneToOneNativeBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLiveOneToOneNativeBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLiveOneToOneNativeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ActivityLiveOneToOneNativeBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_one_native, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityLiveOneToOneNativeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ActivityLiveOneToOneNativeBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_one_native, null, false, bindingComponent);
    }
    @NonNull
    public static ActivityLiveOneToOneNativeBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return (ActivityLiveOneToOneNativeBinding)bind(bindingComponent, view, com.talkfun.cloudlive.R.layout.activity_live_one_to_one_native);
    }
}