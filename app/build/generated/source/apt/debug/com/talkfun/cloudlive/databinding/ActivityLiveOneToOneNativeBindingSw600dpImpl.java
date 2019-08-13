package com.talkfun.cloudlive.databinding;
import com.talkfun.cloudlive.R;
import com.talkfun.cloudlive.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLiveOneToOneNativeBindingSw600dpImpl extends ActivityLiveOneToOneNativeBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(18);
        sIncludes.setIncludes(2, 
            new String[] {"tip_net_work_error"},
            new int[] {10},
            new int[] {R.layout.tip_net_work_error});
        sIncludes.setIncludes(4, 
            new String[] {"activity_live_one_to_multi_media_layout"},
            new int[] {7},
            new int[] {R.layout.activity_live_one_to_multi_media_layout});
        sIncludes.setIncludes(1, 
            new String[] {"activity_live_one_to_one__tool_bar"},
            new int[] {6},
            new int[] {R.layout.activity_live_one_to_one__tool_bar});
        sIncludes.setIncludes(5, 
            new String[] {"activity_live_one_to_one__chat_layout"},
            new int[] {9},
            new int[] {R.layout.activity_live_one_to_one__chat_layout});
        sIncludes.setIncludes(3, 
            new String[] {"activity_live_one_to_one__bottom_bar"},
            new int[] {8},
            new int[] {R.layout.activity_live_one_to_one__bottom_bar});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.multiple_status_layout, 11);
        sViewsWithIds.put(R.id.whiteboard_fl, 12);
        sViewsWithIds.put(R.id.fl_desktop_layout, 13);
        sViewsWithIds.put(R.id.right_rl, 14);
        sViewsWithIds.put(R.id.video_layout, 15);
        sViewsWithIds.put(R.id.chat_show_layout, 16);
        sViewsWithIds.put(R.id.fl_full_screen, 17);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final android.widget.FrameLayout mboundView2;
    @NonNull
    private final android.widget.LinearLayout mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityLiveOneToOneNativeBindingSw600dpImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private ActivityLiveOneToOneNativeBindingSw600dpImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (com.talkfun.cloudlive.databinding.ActivityLiveOneToOneBottomBarBinding) bindings[8]
            , (com.talkfun.cloudlive.databinding.ActivityLiveOneToOneChatLayoutBinding) bindings[9]
            , (android.widget.LinearLayout) bindings[5]
            , (android.support.v7.widget.RecyclerView) bindings[16]
            , (android.widget.FrameLayout) bindings[13]
            , (android.widget.FrameLayout) bindings[17]
            , (com.talkfun.cloudlive.databinding.TipNetWorkErrorBinding) bindings[10]
            , (com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiMediaLayoutBinding) bindings[7]
            , (com.talkfun.widget.MultipleStatusLayout) bindings[11]
            , (android.widget.FrameLayout) bindings[4]
            , (android.widget.RelativeLayout) bindings[14]
            , (com.talkfun.cloudlive.databinding.ActivityLiveOneToOneToolBarBinding) bindings[6]
            , (android.support.v7.widget.RecyclerView) bindings[15]
            , null
            , (android.widget.FrameLayout) bindings[12]
            );
        this.chatLl.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
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
                mDirtyFlags = 0x20L;
        }
        toolBar.invalidateAll();
        multimediaLayout.invalidateAll();
        bottomBar.invalidateAll();
        chatLayout.invalidateAll();
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
        if (bottomBar.hasPendingBindings()) {
            return true;
        }
        if (chatLayout.hasPendingBindings()) {
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
        multimediaLayout.setLifecycleOwner(lifecycleOwner);
        bottomBar.setLifecycleOwner(lifecycleOwner);
        chatLayout.setLifecycleOwner(lifecycleOwner);
        llBadNetStatus.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeToolBar((com.talkfun.cloudlive.databinding.ActivityLiveOneToOneToolBarBinding) object, fieldId);
            case 1 :
                return onChangeLlBadNetStatus((com.talkfun.cloudlive.databinding.TipNetWorkErrorBinding) object, fieldId);
            case 2 :
                return onChangeBottomBar((com.talkfun.cloudlive.databinding.ActivityLiveOneToOneBottomBarBinding) object, fieldId);
            case 3 :
                return onChangeMultimediaLayout((com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiMediaLayoutBinding) object, fieldId);
            case 4 :
                return onChangeChatLayout((com.talkfun.cloudlive.databinding.ActivityLiveOneToOneChatLayoutBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeToolBar(com.talkfun.cloudlive.databinding.ActivityLiveOneToOneToolBarBinding ToolBar, int fieldId) {
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
    private boolean onChangeBottomBar(com.talkfun.cloudlive.databinding.ActivityLiveOneToOneBottomBarBinding BottomBar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMultimediaLayout(com.talkfun.cloudlive.databinding.ActivityLiveOneToMultiMediaLayoutBinding MultimediaLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeChatLayout(com.talkfun.cloudlive.databinding.ActivityLiveOneToOneChatLayoutBinding ChatLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        executeBindingsOn(bottomBar);
        executeBindingsOn(chatLayout);
        executeBindingsOn(llBadNetStatus);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): toolBar
        flag 1 (0x2L): llBadNetStatus
        flag 2 (0x3L): bottomBar
        flag 3 (0x4L): multimediaLayout
        flag 4 (0x5L): chatLayout
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}