package com.talkfun.cloudlive.databinding;
import com.talkfun.cloudlive.R;
import com.talkfun.cloudlive.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLiveOneToMultiNativeBindingImpl extends ActivityLiveOneToMultiNativeBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(15);
        sIncludes.setIncludes(2, 
            new String[] {"tip_net_work_error"},
            new int[] {9},
            new int[] {R.layout.tip_net_work_error});
        sIncludes.setIncludes(4, 
            new String[] {"activity_live_one_to_multi_media_layout"},
            new int[] {7},
            new int[] {R.layout.activity_live_one_to_multi_media_layout});
        sIncludes.setIncludes(3, 
            new String[] {"activity_live_one_to_multi__left_oprator", "activity_live_one_to_multi__right_oprator"},
            new int[] {6, 8},
            new int[] {R.layout.activity_live_one_to_multi__left_oprator, R.layout.activity_live_one_to_multi__right_oprator});
        sIncludes.setIncludes(1, 
            new String[] {"activity_live_one_to_multi_tool_bar"},
            new int[] {5},
            new int[] {R.layout.activity_live_one_to_multi_tool_bar});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rv_video, 10);
        sViewsWithIds.put(R.id.ml_multi_status, 11);
        sViewsWithIds.put(R.id.whiteboard_fl, 12);
        sViewsWithIds.put(R.id.fl_desktop_layout, 13);
        sViewsWithIds.put(R.id.fl_full_screen, 14);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    @NonNull
    private final android.widget.FrameLayout mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityLiveOneToMultiNativeBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private ActivityLiveOneToMultiNativeBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , null
            , (android.widget.FrameLayout) bindings[13]
            , (android.widget.FrameLayout) bindings[14]
            , null
            , (com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiLeftOpratorBinding) bindings[6]
            , (com.talkfun.cloudlive.databinding.TipNetWorkErrorBinding) bindings[9]
            , (android.widget.LinearLayout) bindings[1]
            , (android.view.View) bindings[3]
            , (com.talkfun.cloudlive.view.MultipleStatusLayout2) bindings[11]
            , (com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiMediaLayoutBinding) bindings[7]
            , (android.widget.FrameLayout) bindings[4]
            , (com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiRightOpratorBinding) bindings[8]
            , (android.support.v7.widget.RecyclerView) bindings[10]
            , (com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiToolBarBinding) bindings[5]
            , (android.widget.FrameLayout) bindings[12]
            );
        this.llParent.setTag(null);
        this.llWhiteboardParent.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.FrameLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.parentViewgroup.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
        }
        toolBar.invalidateAll();
        leftOpratorRl.invalidateAll();
        multimediaLayout.invalidateAll();
        rightOpratorRl.invalidateAll();
        llBadNetStatus.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (toolBar.hasPendingBindings()) {
            return true;
        }
        if (leftOpratorRl.hasPendingBindings()) {
            return true;
        }
        if (multimediaLayout.hasPendingBindings()) {
            return true;
        }
        if (rightOpratorRl.hasPendingBindings()) {
            return true;
        }
        if (llBadNetStatus.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    public void setLifecycleOwner(@Nullable android.arch.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        toolBar.setLifecycleOwner(lifecycleOwner);
        leftOpratorRl.setLifecycleOwner(lifecycleOwner);
        multimediaLayout.setLifecycleOwner(lifecycleOwner);
        rightOpratorRl.setLifecycleOwner(lifecycleOwner);
        llBadNetStatus.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeRightOpratorRl((com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiRightOpratorBinding) object, fieldId);
            case 1 :
                return onChangeToolBar((com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiToolBarBinding) object, fieldId);
            case 2 :
                return onChangeLeftOpratorRl((com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiLeftOpratorBinding) object, fieldId);
            case 3 :
                return onChangeLlBadNetStatus((com.talkfun.cloudlive.databinding.TipNetWorkErrorBinding) object, fieldId);
            case 4 :
                return onChangeIpadRightOpratorRl((com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiIpadRightOpratorBinding) object, fieldId);
            case 5 :
                return onChangeBottomBar((com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiBottomBarBinding) object, fieldId);
            case 6 :
                return onChangeMultimediaLayout((com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiMediaLayoutBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeRightOpratorRl(com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiRightOpratorBinding RightOpratorRl, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeToolBar(com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiToolBarBinding ToolBar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLeftOpratorRl(com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiLeftOpratorBinding LeftOpratorRl, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLlBadNetStatus(com.talkfun.cloudlive.databinding.TipNetWorkErrorBinding LlBadNetStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIpadRightOpratorRl(com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiIpadRightOpratorBinding IpadRightOpratorRl, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeBottomBar(com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiBottomBarBinding BottomBar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMultimediaLayout(com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiMediaLayoutBinding MultimediaLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
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
        executeBindingsOn(toolBar);
        executeBindingsOn(leftOpratorRl);
        executeBindingsOn(multimediaLayout);
        executeBindingsOn(rightOpratorRl);
        executeBindingsOn(llBadNetStatus);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): rightOpratorRl
        flag 1 (0x2L): toolBar
        flag 2 (0x3L): leftOpratorRl
        flag 3 (0x4L): llBadNetStatus
        flag 4 (0x5L): ipadRightOpratorRl
        flag 5 (0x6L): bottomBar
        flag 6 (0x7L): multimediaLayout
        flag 7 (0x8L): null
    flag mapping end*/
    //end
}