package com.talkfun.cloudlive.databinding;
import com.talkfun.cloudlive.R;
import com.talkfun.cloudlive.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLiveOneToMultiIpadRightOpratorBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.iv_operator_audio, 1);
        sViewsWithIds.put(R.id.iv_operator_video, 2);
        sViewsWithIds.put(R.id.fl_orperator_rtc_cancel, 3);
        sViewsWithIds.put(R.id.ripple_view_cancle, 4);
        sViewsWithIds.put(R.id.iv_orperator_rtc_apply, 5);
        sViewsWithIds.put(R.id.iv_orperator_rtc_down, 6);
    }
    // views
    @NonNull
    public final android.widget.FrameLayout flOrperatorRtcCancel;
    @NonNull
    public final android.widget.ImageView ivOperatorAudio;
    @NonNull
    public final android.widget.ImageView ivOperatorVideo;
    @NonNull
    public final com.talkfun.widget.HoloView ivOrperatorRtcApply;
    @NonNull
    public final com.talkfun.widget.HoloView ivOrperatorRtcDown;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    public final com.talkfun.widget.RippleView rippleViewCancle;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityLiveOneToMultiIpadRightOpratorBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds);
        this.flOrperatorRtcCancel = (android.widget.FrameLayout) bindings[3];
        this.ivOperatorAudio = (android.widget.ImageView) bindings[1];
        this.ivOperatorVideo = (android.widget.ImageView) bindings[2];
        this.ivOrperatorRtcApply = (com.talkfun.widget.HoloView) bindings[5];
        this.ivOrperatorRtcDown = (com.talkfun.widget.HoloView) bindings[6];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rippleViewCancle = (com.talkfun.widget.RippleView) bindings[4];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityLiveOneToMultiIpadRightOpratorBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLiveOneToMultiIpadRightOpratorBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityLiveOneToMultiIpadRightOpratorBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_multi__ipad_right_oprator, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityLiveOneToMultiIpadRightOpratorBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLiveOneToMultiIpadRightOpratorBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.talkfun.cloudlive.R.layout.activity_live_one_to_multi__ipad_right_oprator, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityLiveOneToMultiIpadRightOpratorBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLiveOneToMultiIpadRightOpratorBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_live_one_to_multi__ipad_right_oprator_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityLiveOneToMultiIpadRightOpratorBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}