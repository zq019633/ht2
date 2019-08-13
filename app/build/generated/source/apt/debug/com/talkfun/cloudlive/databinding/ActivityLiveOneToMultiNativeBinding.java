package com.talkfun.cloudlive.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class ActivityLiveOneToMultiNativeBinding extends ViewDataBinding {
    @Nullable
    public final com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiBottomBarBinding bottomBar;
    @NonNull
    public final android.widget.FrameLayout flDesktopLayout;
    @NonNull
    public final android.widget.FrameLayout flFullScreen;
    @Nullable
    public final com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiIpadRightOpratorBinding ipadRightOpratorRl;
    @Nullable
    public final com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiLeftOpratorBinding leftOpratorRl;
    @Nullable
    public final com.talkfun.cloudlive.databinding.TipNetWorkErrorBinding llBadNetStatus;
    @NonNull
    public final android.widget.LinearLayout llParent;
    @NonNull
    public final android.view.View llWhiteboardParent;
    @NonNull
    public final com.talkfun.cloudlive.view.MultipleStatusLayout2 mlMultiStatus;
    @Nullable
    public final com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiMediaLayoutBinding multimediaLayout;
    @NonNull
    public final android.widget.FrameLayout parentViewgroup;
    @Nullable
    public final com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiRightOpratorBinding rightOpratorRl;
    @NonNull
    public final android.support.v7.widget.RecyclerView rvVideo;
    @Nullable
    public final com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiToolBarBinding toolBar;
    @NonNull
    public final android.widget.FrameLayout whiteboardFl;
    // variables
    protected ActivityLiveOneToMultiNativeBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiBottomBarBinding bottomBar1
        , android.widget.FrameLayout flDesktopLayout1
        , android.widget.FrameLayout flFullScreen1
        , com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiIpadRightOpratorBinding ipadRightOpratorRl1
        , com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiLeftOpratorBinding leftOpratorRl1
        , com.talkfun.cloudlive.databinding.TipNetWorkErrorBinding llBadNetStatus1
        , android.widget.LinearLayout llParent1
        , android.view.View llWhiteboardParent1
        , com.talkfun.cloudlive.view.MultipleStatusLayout2 mlMultiStatus1
        , com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiMediaLayoutBinding multimediaLayout1
        , android.widget.FrameLayout parentViewgroup1
        , com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiRightOpratorBinding rightOpratorRl1
        , android.support.v7.widget.RecyclerView rvVideo1
        , com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiToolBarBinding toolBar1
        , android.widget.FrameLayout whiteboardFl1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.bottomBar = bottomBar1;
        setContainedBinding(this.bottomBar);
        this.flDesktopLayout = flDesktopLayout1;
        this.flFullScreen = flFullScreen1;
        this.ipadRightOpratorRl = ipadRightOpratorRl1;
        setContainedBinding(this.ipadRightOpratorRl);
        this.leftOpratorRl = leftOpratorRl1;
        setContainedBinding(this.leftOpratorRl);
        this.llBadNetStatus = llBadNetStatus1;
        setContainedBinding(this.llBadNetStatus);
        this.llParent = llParent1;
        this.llWhiteboardParent = llWhiteboardParent1;
        this.mlMultiStatus = mlMultiStatus1;
        this.multimediaLayout = multimediaLayout1;
        setContainedBinding(this.multimediaLayout);
        this.parentViewgroup = parentViewgroup1;
        this.rightOpratorRl = rightOpratorRl1;
        setContainedBinding(this.rightOpratorRl);
        this.rvVideo = rvVideo1;
        this.toolBar = toolBar1;
        setContainedBinding(this.toolBar);
        this.whiteboardFl = whiteboardFl1;
    }
    //getters and abstract setters
    @NonNull
    public static ActivityLiveOneToMultiNativeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLiveOneToMultiNativeBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLiveOneToMultiNativeBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLiveOneToMultiNativeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ActivityLiveOneToMultiNativeBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_native, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityLiveOneToMultiNativeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ActivityLiveOneToMultiNativeBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_native, null, false, bindingComponent);
    }
    @NonNull
    public static ActivityLiveOneToMultiNativeBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return (ActivityLiveOneToMultiNativeBinding)bind(bindingComponent, view, com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_native);
    }
}