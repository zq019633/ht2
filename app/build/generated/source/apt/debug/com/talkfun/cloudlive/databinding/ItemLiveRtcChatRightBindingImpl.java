package com.talkfun.cloudlive.databinding;
import com.talkfun.cloudlive.R;
import com.talkfun.cloudlive.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemLiveRtcChatRightBindingImpl extends ItemLiveRtcChatRightBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemLiveRtcChatRightBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemLiveRtcChatRightBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , null
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.TextView) bindings[3]
            );
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.rightLayout.setTag(null);
        this.rightMsg.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.chatEntity == variableId) {
            setChatEntity((com.talkfun.sdk.module.ChatEntity) variable);
        }
        else if (BR.memberRole == variableId) {
            setMemberRole((com.talkfun.sdk.consts.MemberRole) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setChatEntity(@Nullable com.talkfun.sdk.module.ChatEntity ChatEntity) {
        this.mChatEntity = ChatEntity;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.chatEntity);
        super.requestRebind();
    }
    public void setMemberRole(@Nullable com.talkfun.sdk.consts.MemberRole MemberRole) {
        this.mMemberRole = MemberRole;
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
        java.lang.String chatEntityTime = null;
        com.talkfun.sdk.module.ChatEntity chatEntity = mChatEntity;
        java.lang.String chatEntityNickname = null;
        boolean chatEntityMsgJavaLangObjectNull = false;
        java.lang.String chatEntityMsgJavaLangObjectNullJavaLangStringChatEntityMsg = null;
        boolean chatEntityTimeJavaLangObjectNull = false;
        java.lang.String timeUtilDisplayTimeChatEntityTimeJavaLangObjectNullJavaLangStringChatEntityTime = null;
        android.text.SpannableString expressionUtilGetExpressionStringContextChatEntityMsgJavaLangObjectNullJavaLangStringChatEntityMsgJavaLangStringMipmap = null;
        java.lang.String chatEntityTimeJavaLangObjectNullJavaLangStringChatEntityTime = null;
        java.lang.String chatEntityMsg = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (chatEntity != null) {
                    // read chatEntity.time
                    chatEntityTime = chatEntity.getTime();
                    // read chatEntity.nickname
                    chatEntityNickname = chatEntity.getNickname();
                    // read chatEntity.msg
                    chatEntityMsg = chatEntity.getMsg();
                }


                // read chatEntity.time == null
                chatEntityTimeJavaLangObjectNull = (chatEntityTime) == (null);
                // read chatEntity.msg == null
                chatEntityMsgJavaLangObjectNull = (chatEntityMsg) == (null);
            if((dirtyFlags & 0x5L) != 0) {
                if(chatEntityTimeJavaLangObjectNull) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
            if((dirtyFlags & 0x5L) != 0) {
                if(chatEntityMsgJavaLangObjectNull) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x5L) != 0) {

                // read chatEntity.msg == null ? "" : chatEntity.msg
                chatEntityMsgJavaLangObjectNullJavaLangStringChatEntityMsg = ((chatEntityMsgJavaLangObjectNull) ? ("") : (chatEntityMsg));
                // read chatEntity.time == null ? "" : chatEntity.time
                chatEntityTimeJavaLangObjectNullJavaLangStringChatEntityTime = ((chatEntityTimeJavaLangObjectNull) ? ("") : (chatEntityTime));


                // read ExpressionUtil.getExpressionString(context, chatEntity.msg == null ? "" : chatEntity.msg, "mipmap")
                expressionUtilGetExpressionStringContextChatEntityMsgJavaLangObjectNullJavaLangStringChatEntityMsgJavaLangStringMipmap = com.talkfun.cloudlive.util.ExpressionUtil.getExpressionString(getRoot().getContext(), chatEntityMsgJavaLangObjectNullJavaLangStringChatEntityMsg, "mipmap");
                // read TimeUtil.displayTime(chatEntity.time == null ? "" : chatEntity.time)
                timeUtilDisplayTimeChatEntityTimeJavaLangObjectNullJavaLangStringChatEntityTime = com.talkfun.cloudlive.util.TimeUtil.displayTime(chatEntityTimeJavaLangObjectNullJavaLangStringChatEntityTime);
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, chatEntityNickname);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, timeUtilDisplayTimeChatEntityTimeJavaLangObjectNullJavaLangStringChatEntityTime);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.rightMsg, expressionUtilGetExpressionStringContextChatEntityMsgJavaLangObjectNullJavaLangStringChatEntityMsgJavaLangStringMipmap);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): chatEntity
        flag 1 (0x2L): memberRole
        flag 2 (0x3L): null
        flag 3 (0x4L): chatEntity.msg == null ? "" : chatEntity.msg
        flag 4 (0x5L): chatEntity.msg == null ? "" : chatEntity.msg
        flag 5 (0x6L): chatEntity.time == null ? "" : chatEntity.time
        flag 6 (0x7L): chatEntity.time == null ? "" : chatEntity.time
    flag mapping end*/
    //end
}