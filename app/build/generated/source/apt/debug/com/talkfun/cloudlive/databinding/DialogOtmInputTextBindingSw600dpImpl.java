package com.talkfun.cloudlive.databinding;
import com.talkfun.cloudlive.R;
import com.talkfun.cloudlive.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogOtmInputTextBindingSw600dpImpl extends DialogOtmInputTextBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ll_button_edit, 1);
        sViewsWithIds.put(R.id.tv_useful_expression, 2);
        sViewsWithIds.put(R.id.iv_pop_input, 3);
        sViewsWithIds.put(R.id.edtInput, 4);
        sViewsWithIds.put(R.id.iv_emoticons, 5);
        sViewsWithIds.put(R.id.send_message_btn, 6);
        sViewsWithIds.put(R.id.layout_expression, 7);
        sViewsWithIds.put(R.id.rv_useful_expression, 8);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogOtmInputTextBindingSw600dpImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private DialogOtmInputTextBindingSw600dpImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.talkfun.cloudlive.view.ClearEditText) bindings[4]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[3]
            , (com.talkfun.cloudlive.view.ExpressionLayout) bindings[7]
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.RelativeLayout) bindings[0]
            , (android.support.v7.widget.RecyclerView) bindings[8]
            , (android.widget.Button) bindings[6]
            , (android.widget.TextView) bindings[2]
            );
        this.parentRl.setTag(null);
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