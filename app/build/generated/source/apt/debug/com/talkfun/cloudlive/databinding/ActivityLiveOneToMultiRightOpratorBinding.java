package com.talkfun.cloudlive.databinding;
import com.talkfun.cloudlive.R;
import com.talkfun.cloudlive.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLiveOneToMultiRightOpratorBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.draw_iv, 1);
        sViewsWithIds.put(R.id.eraser_iv, 2);
        sViewsWithIds.put(R.id.vote_iv, 3);
        sViewsWithIds.put(R.id.view_red_point, 4);
        sViewsWithIds.put(R.id.chat_iv, 5);
    }
    // views
    @NonNull
    public final android.widget.ImageView chatIv;
    @NonNull
    public final android.widget.ImageView drawIv;
    @NonNull
    public final android.widget.ImageView eraserIv;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    public final android.view.View viewRedPoint;
    @NonNull
    public final android.widget.ImageView voteIv;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityLiveOneToMultiRightOpratorBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds);
        this.chatIv = (android.widget.ImageView) bindings[5];
        this.drawIv = (android.widget.ImageView) bindings[1];
        this.eraserIv = (android.widget.ImageView) bindings[2];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.viewRedPoint = (android.view.View) bindings[4];
        this.voteIv = (android.widget.ImageView) bindings[3];
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
    public static ActivityLiveOneToMultiRightOpratorBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLiveOneToMultiRightOpratorBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityLiveOneToMultiRightOpratorBinding>inflate(inflater, com.talkfun.cloudlive.R.layout.activity_live_one_to_multi__right_oprator, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityLiveOneToMultiRightOpratorBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLiveOneToMultiRightOpratorBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.talkfun.cloudlive.R.layout.activity_live_one_to_multi__right_oprator, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityLiveOneToMultiRightOpratorBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLiveOneToMultiRightOpratorBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_live_one_to_multi__right_oprator_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityLiveOneToMultiRightOpratorBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}