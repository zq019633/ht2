package com.talkfun.cloudlive.databinding;
import com.talkfun.cloudlive.R;
import com.talkfun.cloudlive.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemOneToMultiVideoBindingSw600dpImpl extends ItemOneToMultiVideoBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cv_cardview, 7);
        sViewsWithIds.put(R.id.all_close, 8);
        sViewsWithIds.put(R.id.iv_all_close_avatar, 9);
        sViewsWithIds.put(R.id.progress_loading, 10);
        sViewsWithIds.put(R.id.iv_award, 11);
        sViewsWithIds.put(R.id.iv_draw, 12);
        sViewsWithIds.put(R.id.iv_video, 13);
        sViewsWithIds.put(R.id.iv_audio, 14);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemOneToMultiVideoBindingSw600dpImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private ItemOneToMultiVideoBindingSw600dpImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.FrameLayout) bindings[8]
            , (com.talkfun.widget.RoundCornerLinearLayout) bindings[2]
            , (android.support.v7.widget.CardView) bindings[7]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ProgressBar) bindings[10]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.FrameLayout) bindings[1]
            );
        this.awardLl.setTag(null);
        this.ivAvatar.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView4 = (android.widget.LinearLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.tvAwardCount.setTag(null);
        this.tvName.setTag(null);
        this.videoLayout.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.videoData == variableId) {
            setVideoData((com.talkfun.cloudlive.entity.VideoStatusData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVideoData(@Nullable com.talkfun.cloudlive.entity.VideoStatusData VideoData) {
        this.mVideoData = VideoData;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.videoData);
        super.requestRebind();
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
        com.talkfun.cloudlive.entity.VideoStatusData videoData = mVideoData;
        boolean videoDataJavaLangObjectNull = false;
        boolean textUtilsIsEmptyVideoDataRtcUserEntityNickname = false;
        boolean videoDataJavaLangObjectNullBooleanTrueVideoDataRtcUserEntityJavaLangObjectNull = false;
        boolean videoDataRtcUserEntityJavaLangObjectNullBooleanTrueTextUtilsIsEmptyVideoDataRtcUserEntityNickname = false;
        boolean videoDataJavaLangObjectNullBooleanTrueVideoDataRtcUserEntityJavaLangObjectNullBooleanTrueTextUtilsEqualsVideoDataRtcUserEntityRoleMemberRoleMEMBERROLESUPERADMIN = false;
        java.lang.String videoDataRtcUserEntityRole = null;
        android.view.View videoDataGetVideoView = null;
        boolean videoDataGetRtcUserEntityJavaLangObjectNullBooleanTrueVideoDataGetVideoViewJavaLangObjectNull = false;
        int textUtilsEqualsVideoDataRtcUserEntityRoleMemberRoleMEMBERROLESUPERADMINMboundView4AndroidColorOtmBottomSpdinBgMboundView4AndroidColorOtmBottomUserBg = 0;
        com.talkfun.sdk.rtc.entity.RtcUserEntity videoDataGetRtcUserEntity = null;
        boolean textUtilsEqualsVideoDataRtcUserEntityRoleMemberRoleMEMBERROLESUPERADMIN = false;
        int videoDataGetVideoViewJavaLangObjectNullViewVISIBLEViewGONE = 0;
        int videoDataGetRtcUserEntityJavaLangObjectNullBooleanTrueVideoDataGetVideoViewJavaLangObjectNullViewGONEVideoDataGetRtcUserEntityVideoOpenViewVISIBLEViewGONE = 0;
        java.lang.String videoDataGetRtcUserEntityGetNickname = null;
        int videoDataRtcUserEntityScoreInt2 = 0;
        boolean videoDataGetRtcUserEntityVideoOpen = false;
        boolean videoDataGetRtcUserEntityJavaLangObjectNull = false;
        boolean videoDataRtcUserEntityJavaLangObjectNull = false;
        java.lang.String tvAwardCountAndroidStringXPrefixVideoDataRtcUserEntityScoreInt2 = null;
        int videoDataGetRtcUserEntityVideoOpenViewVISIBLEViewGONE = 0;
        com.talkfun.sdk.rtc.entity.RtcUserEntity videoDataRtcUserEntity = null;
        int videoDataRtcUserEntityScore = 0;
        java.lang.String videoDataRtcUserEntityNickname = null;
        int videoDataRtcUserEntityJavaLangObjectNullBooleanTrueTextUtilsIsEmptyVideoDataRtcUserEntityNicknameViewGONEViewVISIBLE = 0;
        boolean videoDataGetVideoViewJavaLangObjectNull = false;
        int videoDataJavaLangObjectNullBooleanTrueVideoDataRtcUserEntityJavaLangObjectNullBooleanTrueTextUtilsEqualsVideoDataRtcUserEntityRoleMemberRoleMEMBERROLESUPERADMINViewGONEViewVISIBLE = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                // read videoData == null
                videoDataJavaLangObjectNull = (videoData) == (null);
            if((dirtyFlags & 0x3L) != 0) {
                if(videoDataJavaLangObjectNull) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }
                if (videoData != null) {
                    // read videoData.getVideoView()
                    videoDataGetVideoView = videoData.getVideoView();
                    // read videoData.getRtcUserEntity()
                    videoDataGetRtcUserEntity = videoData.getRtcUserEntity();
                    // read videoData.rtcUserEntity
                    videoDataRtcUserEntity = videoData.getRtcUserEntity();
                }


                // read videoData.getVideoView() == null
                videoDataGetVideoViewJavaLangObjectNull = (videoDataGetVideoView) == (null);
                // read videoData.getRtcUserEntity() == null
                videoDataGetRtcUserEntityJavaLangObjectNull = (videoDataGetRtcUserEntity) == (null);
                // read videoData.rtcUserEntity == null
                videoDataRtcUserEntityJavaLangObjectNull = (videoDataRtcUserEntity) == (null);
            if((dirtyFlags & 0x3L) != 0) {
                if(videoDataGetVideoViewJavaLangObjectNull) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(videoDataGetRtcUserEntityJavaLangObjectNull) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(videoDataRtcUserEntityJavaLangObjectNull) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
                if (videoDataGetRtcUserEntity != null) {
                    // read videoData.getRtcUserEntity().getNickname()
                    videoDataGetRtcUserEntityGetNickname = videoDataGetRtcUserEntity.getNickname();
                }
                if (videoDataRtcUserEntity != null) {
                    // read videoData.rtcUserEntity.role
                    videoDataRtcUserEntityRole = videoDataRtcUserEntity.getRole();
                    // read videoData.rtcUserEntity.score
                    videoDataRtcUserEntityScore = videoDataRtcUserEntity.getScore();
                }


                // read videoData.getVideoView() == null ? View.VISIBLE : View.GONE
                videoDataGetVideoViewJavaLangObjectNullViewVISIBLEViewGONE = ((videoDataGetVideoViewJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read TextUtils.equals(videoData.rtcUserEntity.role, MemberRole.MEMBER_ROLE_SUPER_ADMIN)
                textUtilsEqualsVideoDataRtcUserEntityRoleMemberRoleMEMBERROLESUPERADMIN = android.text.TextUtils.equals(videoDataRtcUserEntityRole, com.talkfun.sdk.consts.MemberRole.MEMBER_ROLE_SUPER_ADMIN);
                // read (videoData.rtcUserEntity.score) / (2)
                videoDataRtcUserEntityScoreInt2 = (videoDataRtcUserEntityScore) / (2);
            if((dirtyFlags & 0x3L) != 0) {
                if(textUtilsEqualsVideoDataRtcUserEntityRoleMemberRoleMEMBERROLESUPERADMIN) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }


                // read TextUtils.equals(videoData.rtcUserEntity.role, MemberRole.MEMBER_ROLE_SUPER_ADMIN) ? @android:color/otm_bottom_spdin_bg : @android:color/otm_bottom_user_bg
                textUtilsEqualsVideoDataRtcUserEntityRoleMemberRoleMEMBERROLESUPERADMINMboundView4AndroidColorOtmBottomSpdinBgMboundView4AndroidColorOtmBottomUserBg = ((textUtilsEqualsVideoDataRtcUserEntityRoleMemberRoleMEMBERROLESUPERADMIN) ? (getColorFromResource(mboundView4, R.color.otm_bottom_spdin_bg)) : (getColorFromResource(mboundView4, R.color.otm_bottom_user_bg)));
                // read (@android:string/x_prefix) + ((videoData.rtcUserEntity.score) / (2))
                tvAwardCountAndroidStringXPrefixVideoDataRtcUserEntityScoreInt2 = (tvAwardCount.getResources().getString(R.string.x_prefix)) + (videoDataRtcUserEntityScoreInt2);
        }
        // batch finished

        if ((dirtyFlags & 0x3L) != 0) {

                // read videoData == null ? true : videoData.rtcUserEntity == null
                videoDataJavaLangObjectNullBooleanTrueVideoDataRtcUserEntityJavaLangObjectNull = ((videoDataJavaLangObjectNull) ? (true) : (videoDataRtcUserEntityJavaLangObjectNull));
                // read videoData.getRtcUserEntity() == null ? true : videoData.getVideoView() == null
                videoDataGetRtcUserEntityJavaLangObjectNullBooleanTrueVideoDataGetVideoViewJavaLangObjectNull = ((videoDataGetRtcUserEntityJavaLangObjectNull) ? (true) : (videoDataGetVideoViewJavaLangObjectNull));
            if((dirtyFlags & 0x3L) != 0) {
                if(videoDataJavaLangObjectNullBooleanTrueVideoDataRtcUserEntityJavaLangObjectNull) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(videoDataGetRtcUserEntityJavaLangObjectNullBooleanTrueVideoDataGetVideoViewJavaLangObjectNull) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }
        }
        if ((dirtyFlags & 0x10L) != 0) {

                if (videoDataRtcUserEntity != null) {
                    // read videoData.rtcUserEntity.nickname
                    videoDataRtcUserEntityNickname = videoDataRtcUserEntity.getNickname();
                }


                // read TextUtils.isEmpty(videoData.rtcUserEntity.nickname)
                textUtilsIsEmptyVideoDataRtcUserEntityNickname = android.text.TextUtils.isEmpty(videoDataRtcUserEntityNickname);
        }

        if ((dirtyFlags & 0x3L) != 0) {

                // read videoData.rtcUserEntity == null ? true : TextUtils.isEmpty(videoData.rtcUserEntity.nickname)
                videoDataRtcUserEntityJavaLangObjectNullBooleanTrueTextUtilsIsEmptyVideoDataRtcUserEntityNickname = ((videoDataRtcUserEntityJavaLangObjectNull) ? (true) : (textUtilsIsEmptyVideoDataRtcUserEntityNickname));
            if((dirtyFlags & 0x3L) != 0) {
                if(videoDataRtcUserEntityJavaLangObjectNullBooleanTrueTextUtilsIsEmptyVideoDataRtcUserEntityNickname) {
                        dirtyFlags |= 0x80000L;
                }
                else {
                        dirtyFlags |= 0x40000L;
                }
            }


                // read videoData.rtcUserEntity == null ? true : TextUtils.isEmpty(videoData.rtcUserEntity.nickname) ? View.GONE : View.VISIBLE
                videoDataRtcUserEntityJavaLangObjectNullBooleanTrueTextUtilsIsEmptyVideoDataRtcUserEntityNicknameViewGONEViewVISIBLE = ((videoDataRtcUserEntityJavaLangObjectNullBooleanTrueTextUtilsIsEmptyVideoDataRtcUserEntityNickname) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished

        if ((dirtyFlags & 0x3L) != 0) {

                // read videoData == null ? true : videoData.rtcUserEntity == null ? true : TextUtils.equals(videoData.rtcUserEntity.role, MemberRole.MEMBER_ROLE_SUPER_ADMIN)
                videoDataJavaLangObjectNullBooleanTrueVideoDataRtcUserEntityJavaLangObjectNullBooleanTrueTextUtilsEqualsVideoDataRtcUserEntityRoleMemberRoleMEMBERROLESUPERADMIN = ((videoDataJavaLangObjectNullBooleanTrueVideoDataRtcUserEntityJavaLangObjectNull) ? (true) : (textUtilsEqualsVideoDataRtcUserEntityRoleMemberRoleMEMBERROLESUPERADMIN));
            if((dirtyFlags & 0x3L) != 0) {
                if(videoDataJavaLangObjectNullBooleanTrueVideoDataRtcUserEntityJavaLangObjectNullBooleanTrueTextUtilsEqualsVideoDataRtcUserEntityRoleMemberRoleMEMBERROLESUPERADMIN) {
                        dirtyFlags |= 0x200000L;
                }
                else {
                        dirtyFlags |= 0x100000L;
                }
            }


                // read videoData == null ? true : videoData.rtcUserEntity == null ? true : TextUtils.equals(videoData.rtcUserEntity.role, MemberRole.MEMBER_ROLE_SUPER_ADMIN) ? View.GONE : View.VISIBLE
                videoDataJavaLangObjectNullBooleanTrueVideoDataRtcUserEntityJavaLangObjectNullBooleanTrueTextUtilsEqualsVideoDataRtcUserEntityRoleMemberRoleMEMBERROLESUPERADMINViewGONEViewVISIBLE = ((videoDataJavaLangObjectNullBooleanTrueVideoDataRtcUserEntityJavaLangObjectNullBooleanTrueTextUtilsEqualsVideoDataRtcUserEntityRoleMemberRoleMEMBERROLESUPERADMIN) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x4000L) != 0) {

                if (videoDataGetRtcUserEntity != null) {
                    // read videoData.getRtcUserEntity().videoOpen
                    videoDataGetRtcUserEntityVideoOpen = videoDataGetRtcUserEntity.isVideoOpen();
                }
            if((dirtyFlags & 0x4000L) != 0) {
                if(videoDataGetRtcUserEntityVideoOpen) {
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                }
            }


                // read videoData.getRtcUserEntity().videoOpen ? View.VISIBLE : View.GONE
                videoDataGetRtcUserEntityVideoOpenViewVISIBLEViewGONE = ((videoDataGetRtcUserEntityVideoOpen) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }

        if ((dirtyFlags & 0x3L) != 0) {

                // read videoData.getRtcUserEntity() == null ? true : videoData.getVideoView() == null ? View.GONE : videoData.getRtcUserEntity().videoOpen ? View.VISIBLE : View.GONE
                videoDataGetRtcUserEntityJavaLangObjectNullBooleanTrueVideoDataGetVideoViewJavaLangObjectNullViewGONEVideoDataGetRtcUserEntityVideoOpenViewVISIBLEViewGONE = ((videoDataGetRtcUserEntityJavaLangObjectNullBooleanTrueVideoDataGetVideoViewJavaLangObjectNull) ? (android.view.View.GONE) : (videoDataGetRtcUserEntityVideoOpenViewVISIBLEViewGONE));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.awardLl.setVisibility(videoDataJavaLangObjectNullBooleanTrueVideoDataRtcUserEntityJavaLangObjectNullBooleanTrueTextUtilsEqualsVideoDataRtcUserEntityRoleMemberRoleMEMBERROLESUPERADMINViewGONEViewVISIBLE);
            this.ivAvatar.setVisibility(videoDataGetVideoViewJavaLangObjectNullViewVISIBLEViewGONE);
            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView4, android.databinding.adapters.Converters.convertColorToDrawable(textUtilsEqualsVideoDataRtcUserEntityRoleMemberRoleMEMBERROLESUPERADMINMboundView4AndroidColorOtmBottomSpdinBgMboundView4AndroidColorOtmBottomUserBg));
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvAwardCount, tvAwardCountAndroidStringXPrefixVideoDataRtcUserEntityScoreInt2);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, videoDataGetRtcUserEntityGetNickname);
            this.tvName.setVisibility(videoDataRtcUserEntityJavaLangObjectNullBooleanTrueTextUtilsIsEmptyVideoDataRtcUserEntityNicknameViewGONEViewVISIBLE);
            this.videoLayout.setVisibility(videoDataGetRtcUserEntityJavaLangObjectNullBooleanTrueVideoDataGetVideoViewJavaLangObjectNullViewGONEVideoDataGetRtcUserEntityVideoOpenViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): videoData
        flag 1 (0x2L): null
        flag 2 (0x3L): videoData == null ? true : videoData.rtcUserEntity == null
        flag 3 (0x4L): videoData == null ? true : videoData.rtcUserEntity == null
        flag 4 (0x5L): videoData.rtcUserEntity == null ? true : TextUtils.isEmpty(videoData.rtcUserEntity.nickname)
        flag 5 (0x6L): videoData.rtcUserEntity == null ? true : TextUtils.isEmpty(videoData.rtcUserEntity.nickname)
        flag 6 (0x7L): videoData == null ? true : videoData.rtcUserEntity == null ? true : TextUtils.equals(videoData.rtcUserEntity.role, MemberRole.MEMBER_ROLE_SUPER_ADMIN)
        flag 7 (0x8L): videoData == null ? true : videoData.rtcUserEntity == null ? true : TextUtils.equals(videoData.rtcUserEntity.role, MemberRole.MEMBER_ROLE_SUPER_ADMIN)
        flag 8 (0x9L): videoData.getRtcUserEntity() == null ? true : videoData.getVideoView() == null
        flag 9 (0xaL): videoData.getRtcUserEntity() == null ? true : videoData.getVideoView() == null
        flag 10 (0xbL): TextUtils.equals(videoData.rtcUserEntity.role, MemberRole.MEMBER_ROLE_SUPER_ADMIN) ? @android:color/otm_bottom_spdin_bg : @android:color/otm_bottom_user_bg
        flag 11 (0xcL): TextUtils.equals(videoData.rtcUserEntity.role, MemberRole.MEMBER_ROLE_SUPER_ADMIN) ? @android:color/otm_bottom_spdin_bg : @android:color/otm_bottom_user_bg
        flag 12 (0xdL): videoData.getVideoView() == null ? View.VISIBLE : View.GONE
        flag 13 (0xeL): videoData.getVideoView() == null ? View.VISIBLE : View.GONE
        flag 14 (0xfL): videoData.getRtcUserEntity() == null ? true : videoData.getVideoView() == null ? View.GONE : videoData.getRtcUserEntity().videoOpen ? View.VISIBLE : View.GONE
        flag 15 (0x10L): videoData.getRtcUserEntity() == null ? true : videoData.getVideoView() == null ? View.GONE : videoData.getRtcUserEntity().videoOpen ? View.VISIBLE : View.GONE
        flag 16 (0x11L): videoData.getRtcUserEntity().videoOpen ? View.VISIBLE : View.GONE
        flag 17 (0x12L): videoData.getRtcUserEntity().videoOpen ? View.VISIBLE : View.GONE
        flag 18 (0x13L): videoData.rtcUserEntity == null ? true : TextUtils.isEmpty(videoData.rtcUserEntity.nickname) ? View.GONE : View.VISIBLE
        flag 19 (0x14L): videoData.rtcUserEntity == null ? true : TextUtils.isEmpty(videoData.rtcUserEntity.nickname) ? View.GONE : View.VISIBLE
        flag 20 (0x15L): videoData == null ? true : videoData.rtcUserEntity == null ? true : TextUtils.equals(videoData.rtcUserEntity.role, MemberRole.MEMBER_ROLE_SUPER_ADMIN) ? View.GONE : View.VISIBLE
        flag 21 (0x16L): videoData == null ? true : videoData.rtcUserEntity == null ? true : TextUtils.equals(videoData.rtcUserEntity.role, MemberRole.MEMBER_ROLE_SUPER_ADMIN) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}