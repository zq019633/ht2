package com.talkfun.cloudlive.databinding;
import com.talkfun.cloudlive.R;
import com.talkfun.cloudlive.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLiveOneToMultiMediaLayoutBindingSw600dpImpl extends ActivityLiveOneToMultiMediaLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.fl_multi_media, 1);
        sViewsWithIds.put(R.id.view_shade, 2);
        sViewsWithIds.put(R.id.iv_multi_media_doctype, 3);
        sViewsWithIds.put(R.id.tv_pause, 4);
        sViewsWithIds.put(R.id.progress_bar_parent, 5);
        sViewsWithIds.put(R.id.time_progress, 6);
        sViewsWithIds.put(R.id.tv_time, 7);
        sViewsWithIds.put(R.id.iv_full_screen, 8);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityLiveOneToMultiMediaLayoutBindingSw600dpImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ActivityLiveOneToMultiMediaLayoutBindingSw600dpImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.FrameLayout) bindings[1]
            , (android.widget.FrameLayout) bindings[0]
            , (android.widget.ImageView) bindings[8]
            , (com.talkfun.widget.RotateImageView) bindings[3]
            , null
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (android.widget.ProgressBar) bindings[6]
            , (com.talkfun.widget.round.RoundTextView) bindings[4]
            , (android.widget.TextView) bindings[7]
            , (android.view.View) bindings[2]
            );
        this.flMultiMediaParent.setTag(null);
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
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}