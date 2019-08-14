package com.talkfun.cloudlive.databinding;
import com.talkfun.cloudlive.R;
import com.talkfun.cloudlive.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemLiveRtcChatBindingImpl extends ItemLiveRtcChatBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemLiveRtcChatBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ItemLiveRtcChatBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.TextView) bindings[8]
            );
        this.leftLayout.setTag(null);
        this.leftMsg.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
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
        int chatEntityIsMeViewGONEViewVISIBLE = 0;
        java.lang.String chatEntityTime = null;
        java.lang.Boolean chatEntityIsMe = null;
        int chatEntityIsMeViewVISIBLEViewGONE = 0;
        java.lang.String timeUtilDisplayTimeChatEntityTimeJavaLangObjectNullJavaLangStringChatEntityTime = null;
        android.text.SpannableString expressionUtilGetExpressionStringContextChatEntityMsgJavaLangObjectNullJavaLangStringChatEntityMsgJavaLangStringMipmap = null;
        com.talkfun.sdk.module.ChatEntity chatEntity = mChatEntity;
        boolean androidxDatabindingViewDataBindingSafeUnboxChatEntityIsMe = false;
        java.lang.String chatEntityTimeJavaLangObjectNullJavaLangStringChatEntityTime = null;
        java.lang.String chatEntityMsgJavaLangObjectNullJavaLangStringChatEntityMsg = null;
        java.lang.String chatEntityNickname = null;
        java.lang.String chatEntityMsg = null;
        boolean chatEntityTimeJavaLangObjectNull = false;
        boolean chatEntityMsgJavaLangObjectNull = false;

        if ((dirtyFlags & 0x5L) != 0) {



                if (chatEntity != null) {
                    // read chatEntity.time
                    chatEntityTime = chatEntity.getTime();
                    // read chatEntity.isMe()
                    chatEntityIsMe = chatEntity.isMe();
                    // read chatEntity.nickname
                    chatEntityNickname = chatEntity.getNickname();
                    // read chatEntity.msg
                    chatEntityMsg = chatEntity.getMsg();
                }


                // read chatEntity.time == null
                chatEntityTimeJavaLangObjectNull = (chatEntityTime) == (null);
                // read androidx.databinding.ViewDataBinding.safeUnbox(chatEntity.isMe())
                androidxDatabindingViewDataBindingSafeUnboxChatEntityIsMe = androidx.databinding.ViewDataBinding.safeUnbox(chatEntityIsMe);
                // read chatEntity.msg == null
                chatEntityMsgJavaLangObjectNull = (chatEntityMsg) == (null);
            if((dirtyFlags & 0x5L) != 0) {
                if(chatEntityTimeJavaLangObjectNull) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }
            if((dirtyFlags & 0x5L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxChatEntityIsMe) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
            }
            if((dirtyFlags & 0x5L) != 0) {
                if(chatEntityMsgJavaLangObjectNull) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(chatEntity.isMe()) ? View.GONE : View.VISIBLE
                chatEntityIsMeViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxChatEntityIsMe) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(chatEntity.isMe()) ? View.VISIBLE : View.GONE
                chatEntityIsMeViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxChatEntityIsMe) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x5L) != 0) {

                // read chatEntity.time == null ? "" : chatEntity.time
                chatEntityTimeJavaLangObjectNullJavaLangStringChatEntityTime = ((chatEntityTimeJavaLangObjectNull) ? ("") : (chatEntityTime));
                // read chatEntity.msg == null ? "" : chatEntity.msg
                chatEntityMsgJavaLangObjectNullJavaLangStringChatEntityMsg = ((chatEntityMsgJavaLangObjectNull) ? ("") : (chatEntityMsg));


                // read TimeUtil.displayTime(chatEntity.time == null ? "" : chatEntity.time)
                timeUtilDisplayTimeChatEntityTimeJavaLangObjectNullJavaLangStringChatEntityTime = com.talkfun.cloudlive.util.TimeUtil.displayTime(chatEntityTimeJavaLangObjectNullJavaLangStringChatEntityTime);
                // read ExpressionUtil.getExpressionString(context, chatEntity.msg == null ? "" : chatEntity.msg, "mipmap")
                expressionUtilGetExpressionStringContextChatEntityMsgJavaLangObjectNullJavaLangStringChatEntityMsgJavaLangStringMipmap = com.talkfun.cloudlive.util.ExpressionUtil.getExpressionString(getRoot().getContext(), chatEntityMsgJavaLangObjectNullJavaLangStringChatEntityMsg, "mipmap");
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.leftLayout.setVisibility(chatEntityIsMeViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.leftMsg, expressionUtilGetExpressionStringContextChatEntityMsgJavaLangObjectNullJavaLangStringChatEntityMsgJavaLangStringMipmap);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, chatEntityNickname);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, timeUtilDisplayTimeChatEntityTimeJavaLangObjectNullJavaLangStringChatEntityTime);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, chatEntityNickname);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, timeUtilDisplayTimeChatEntityTimeJavaLangObjectNullJavaLangStringChatEntityTime);
            this.rightLayout.setVisibility(chatEntityIsMeViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.rightMsg, expressionUtilGetExpressionStringContextChatEntityMsgJavaLangObjectNullJavaLangStringChatEntityMsgJavaLangStringMipmap);
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
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(chatEntity.isMe()) ? View.GONE : View.VISIBLE
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(chatEntity.isMe()) ? View.GONE : View.VISIBLE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(chatEntity.isMe()) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(chatEntity.isMe()) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): chatEntity.time == null ? "" : chatEntity.time
        flag 8 (0x9L): chatEntity.time == null ? "" : chatEntity.time
        flag 9 (0xaL): chatEntity.msg == null ? "" : chatEntity.msg
        flag 10 (0xbL): chatEntity.msg == null ? "" : chatEntity.msg
    flag mapping end*/
    //end
}