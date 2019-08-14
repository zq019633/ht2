package com.talkfun.cloudlive.databinding;
import com.talkfun.cloudlive.R;
import com.talkfun.cloudlive.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLiveOneToMultiNativeBindingSw600dpImpl extends ActivityLiveOneToMultiNativeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(16);
        sIncludes.setIncludes(1, 
            new String[] {"activity_live_one_to_multi_tool_bar"},
            new int[] {6},
            new int[] {com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_tool_bar});
        sIncludes.setIncludes(2, 
            new String[] {"tip_net_work_error"},
            new int[] {10},
            new int[] {com.talkfun.cloudlive.R.layout.tip_net_work_error});
        sIncludes.setIncludes(3, 
            new String[] {"activity_live_one_to_multi_bottom_bar"},
            new int[] {9},
            new int[] {com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_bottom_bar});
        sIncludes.setIncludes(4, 
            new String[] {"activity_live_one_to_multi__ipad_right_oprator"},
            new int[] {8},
            new int[] {com.talkfun.cloudlive.R.layout.activity_live_one_to_multi__ipad_right_oprator});
        sIncludes.setIncludes(5, 
            new String[] {"activity_live_one_to_multi_media_layout"},
            new int[] {7},
            new int[] {com.talkfun.cloudlive.R.layout.activity_live_one_to_multi_media_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rv_video, 11);
        sViewsWithIds.put(R.id.ml_multi_status, 12);
        sViewsWithIds.put(R.id.whiteboard_fl, 13);
        sViewsWithIds.put(R.id.fl_desktop_layout, 14);
        sViewsWithIds.put(R.id.fl_full_screen, 15);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    @NonNull
    private final android.widget.FrameLayout mboundView2;
    @NonNull
    private final android.widget.LinearLayout mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityLiveOneToMultiNativeBindingSw600dpImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private ActivityLiveOneToMultiNativeBindingSw600dpImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiBottomBarBinding) bindings[9]
            , (android.widget.FrameLayout) bindings[14]
            , (android.widget.FrameLayout) bindings[15]
            , (com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiIpadRightOpratorBinding) bindings[8]
            , null
            , (com.talkfun.cloudlive.databinding.TipNetWorkErrorBinding) bindings[10]
            , (android.widget.LinearLayout) bindings[1]
            , (android.view.View) bindings[4]
            , (com.talkfun.cloudlive.view.MultipleStatusLayout2) bindings[12]
            , (com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiMediaLayoutBinding) bindings[7]
            , (android.widget.FrameLayout) bindings[5]
            , null
            , (androidx.recyclerview.widget.RecyclerView) bindings[11]
            , (com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiToolBarBinding) bindings[6]
            , (android.widget.FrameLayout) bindings[13]
            );
        this.llParent.setTag(null);
        this.llWhiteboardParent.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.FrameLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.LinearLayout) bindings[3];
        this.mboundView3.setTag(null);
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
        multimediaLayout.invalidateAll();
        ipadRightOpratorRl.invalidateAll();
        bottomBar.invalidateAll();
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
        if (multimediaLayout.hasPendingBindings()) {
            return true;
        }
        if (ipadRightOpratorRl.hasPendingBindings()) {
            return true;
        }
        if (bottomBar.hasPendingBindings()) {
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
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        toolBar.setLifecycleOwner(lifecycleOwner);
        multimediaLayout.setLifecycleOwner(lifecycleOwner);
        ipadRightOpratorRl.setLifecycleOwner(lifecycleOwner);
        bottomBar.setLifecycleOwner(lifecycleOwner);
        llBadNetStatus.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeBottomBar((com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiBottomBarBinding) object, fieldId);
            case 1 :
                return onChangeLlBadNetStatus((com.talkfun.cloudlive.databinding.TipNetWorkErrorBinding) object, fieldId);
            case 2 :
                return onChangeLeftOpratorRl((com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiLeftOpratorBinding) object, fieldId);
            case 3 :
                return onChangeIpadRightOpratorRl((com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiIpadRightOpratorBinding) object, fieldId);
            case 4 :
                return onChangeRightOpratorRl((com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiRightOpratorBinding) object, fieldId);
            case 5 :
                return onChangeToolBar((com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiToolBarBinding) object, fieldId);
            case 6 :
                return onChangeMultimediaLayout((com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiMediaLayoutBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeBottomBar(com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiBottomBarBinding BottomBar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLlBadNetStatus(com.talkfun.cloudlive.databinding.TipNetWorkErrorBinding LlBadNetStatus, int fieldId) {
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
    private boolean onChangeIpadRightOpratorRl(com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiIpadRightOpratorBinding IpadRightOpratorRl, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRightOpratorRl(com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiRightOpratorBinding RightOpratorRl, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeToolBar(com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiToolBarBinding ToolBar, int fieldId) {
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
        executeBindingsOn(multimediaLayout);
        executeBindingsOn(ipadRightOpratorRl);
        executeBindingsOn(bottomBar);
        executeBindingsOn(llBadNetStatus);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): bottomBar
        flag 1 (0x2L): llBadNetStatus
        flag 2 (0x3L): leftOpratorRl
        flag 3 (0x4L): ipadRightOpratorRl
        flag 4 (0x5L): rightOpratorRl
        flag 5 (0x6L): toolBar
        flag 6 (0x7L): multimediaLayout
        flag 7 (0x8L): null
    flag mapping end*/
    //end
}