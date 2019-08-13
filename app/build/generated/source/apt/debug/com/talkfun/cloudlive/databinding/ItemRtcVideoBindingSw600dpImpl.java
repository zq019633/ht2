package com.talkfun.cloudlive.databinding;
import com.talkfun.cloudlive.R;
import com.talkfun.cloudlive.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemRtcVideoBindingSw600dpImpl extends ItemRtcVideoBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cv_cardview, 6);
        sViewsWithIds.put(R.id.all_close, 7);
        sViewsWithIds.put(R.id.iv_all_close_avatar, 8);
        sViewsWithIds.put(R.id.iv_close_video_center, 9);
        sViewsWithIds.put(R.id.progress_loading, 10);
        sViewsWithIds.put(R.id.iv_video, 11);
        sViewsWithIds.put(R.id.iv_audio, 12);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    @NonNull
    private final com.talkfun.widget.RoundCornerLayout mboundView2;
    @NonNull
    private final com.talkfun.widget.RoundCornerLayout mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemRtcVideoBindingSw600dpImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ItemRtcVideoBindingSw600dpImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.FrameLayout) bindings[7]
            , (android.support.v7.widget.CardView) bindings[6]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ProgressBar) bindings[10]
            , (android.widget.TextView) bindings[3]
            , (android.widget.FrameLayout) bindings[1]
            );
        this.ivAvatar.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (com.talkfun.widget.RoundCornerLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (com.talkfun.widget.RoundCornerLayout) bindings[4];
        this.mboundView4.setTag(null);
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
        android.view.View videoDataGetVideoView = null;
        boolean videoDataGetRtcUserEntityJavaLangObjectNullBooleanTrueTextUtilsIsEmptyVideoDataGetRtcUserEntityGetNickname = false;
        boolean videoDataGetRtcUserEntityJavaLangObjectNullBooleanTrueVideoDataGetVideoViewJavaLangObjectNull = false;
        com.talkfun.sdk.rtc.entity.RtcUserEntity videoDataGetRtcUserEntity = null;
        int videoDataGetVideoViewJavaLangObjectNullViewVISIBLEViewGONE = 0;
        int videoDataGetVideoViewJavaLangObjectNullViewGONEViewVISIBLE = 0;
        int videoDataGetRtcUserEntityJavaLangObjectNullBooleanTrueVideoDataGetVideoViewJavaLangObjectNullViewGONEVideoDataGetRtcUserEntityVideoOpenViewVISIBLEViewGONE = 0;
        java.lang.String videoDataGetRtcUserEntityGetNickname = null;
        int videoDataGetRtcUserEntityJavaLangObjectNullBooleanTrueTextUtilsIsEmptyVideoDataGetRtcUserEntityGetNicknameViewGONEViewVISIBLE = 0;
        boolean videoDataGetRtcUserEntityVideoOpen = false;
        boolean videoDataGetRtcUserEntityJavaLangObjectNull = false;
        boolean textUtilsIsEmptyVideoDataGetRtcUserEntityGetNickname = false;
        boolean VideoDataGetRtcUserEntityJavaLangObjectNull1 = false;
        int videoDataGetRtcUserEntityVideoOpenViewVISIBLEViewGONE = 0;
        boolean videoDataGetVideoViewJavaLangObjectNull = false;
        int videoDataGetRtcUserEntityJavaLangObjectNullViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (videoData != null) {
                    // read videoData.getVideoView()
                    videoDataGetVideoView = videoData.getVideoView();
                    // read videoData.getRtcUserEntity()
                    videoDataGetRtcUserEntity = videoData.getRtcUserEntity();
                }


                // read videoData.getVideoView() == null
                videoDataGetVideoViewJavaLangObjectNull = (videoDataGetVideoView) == (null);
                // read videoData.getRtcUserEntity() == null
                videoDataGetRtcUserEntityJavaLangObjectNull = (videoDataGetRtcUserEntity) == (null);
                // read videoData.getRtcUserEntity() != null
                VideoDataGetRtcUserEntityJavaLangObjectNull1 = (videoDataGetRtcUserEntity) != (null);
            if((dirtyFlags & 0x3L) != 0) {
                if(videoDataGetVideoViewJavaLangObjectNull) {
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x40L;
                        dirtyFlags |= 0x100L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(videoDataGetRtcUserEntityJavaLangObjectNull) {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x4L;
                        dirtyFlags |= 0x10L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(VideoDataGetRtcUserEntityJavaLangObjectNull1) {
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                }
            }
                if (videoDataGetRtcUserEntity != null) {
                    // read videoData.getRtcUserEntity().getNickname()
                    videoDataGetRtcUserEntityGetNickname = videoDataGetRtcUserEntity.getNickname();
                }


                // read videoData.getVideoView() == null ? View.VISIBLE : View.GONE
                videoDataGetVideoViewJavaLangObjectNullViewVISIBLEViewGONE = ((videoDataGetVideoViewJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read videoData.getVideoView() == null ? View.GONE : View.VISIBLE
                videoDataGetVideoViewJavaLangObjectNullViewGONEViewVISIBLE = ((videoDataGetVideoViewJavaLangObjectNull) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read videoData.getRtcUserEntity() != null ? View.VISIBLE : View.GONE
                videoDataGetRtcUserEntityJavaLangObjectNullViewVISIBLEViewGONE = ((VideoDataGetRtcUserEntityJavaLangObjectNull1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x3L) != 0) {

                // read videoData.getRtcUserEntity() == null ? true : videoData.getVideoView() == null
                videoDataGetRtcUserEntityJavaLangObjectNullBooleanTrueVideoDataGetVideoViewJavaLangObjectNull = ((videoDataGetRtcUserEntityJavaLangObjectNull) ? (true) : (videoDataGetVideoViewJavaLangObjectNull));
            if((dirtyFlags & 0x3L) != 0) {
                if(videoDataGetRtcUserEntityJavaLangObjectNullBooleanTrueVideoDataGetVideoViewJavaLangObjectNull) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }
        }
        if ((dirtyFlags & 0x4L) != 0) {

                // read TextUtils.isEmpty(videoData.getRtcUserEntity().getNickname())
                textUtilsIsEmptyVideoDataGetRtcUserEntityGetNickname = android.text.TextUtils.isEmpty(videoDataGetRtcUserEntityGetNickname);
        }

        if ((dirtyFlags & 0x3L) != 0) {

                // read videoData.getRtcUserEntity() == null ? true : TextUtils.isEmpty(videoData.getRtcUserEntity().getNickname())
                videoDataGetRtcUserEntityJavaLangObjectNullBooleanTrueTextUtilsIsEmptyVideoDataGetRtcUserEntityGetNickname = ((videoDataGetRtcUserEntityJavaLangObjectNull) ? (true) : (textUtilsIsEmptyVideoDataGetRtcUserEntityGetNickname));
            if((dirtyFlags & 0x3L) != 0) {
                if(videoDataGetRtcUserEntityJavaLangObjectNullBooleanTrueTextUtilsIsEmptyVideoDataGetRtcUserEntityGetNickname) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }


                // read videoData.getRtcUserEntity() == null ? true : TextUtils.isEmpty(videoData.getRtcUserEntity().getNickname()) ? View.GONE : View.VISIBLE
                videoDataGetRtcUserEntityJavaLangObjectNullBooleanTrueTextUtilsIsEmptyVideoDataGetRtcUserEntityGetNicknameViewGONEViewVISIBLE = ((videoDataGetRtcUserEntityJavaLangObjectNullBooleanTrueTextUtilsIsEmptyVideoDataGetRtcUserEntityGetNickname) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished

        if ((dirtyFlags & 0x400L) != 0) {

                if (videoDataGetRtcUserEntity != null) {
                    // read videoData.getRtcUserEntity().videoOpen
                    videoDataGetRtcUserEntityVideoOpen = videoDataGetRtcUserEntity.isVideoOpen();
                }
            if((dirtyFlags & 0x400L) != 0) {
                if(videoDataGetRtcUserEntityVideoOpen) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
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

            this.ivAvatar.setVisibility(videoDataGetVideoViewJavaLangObjectNullViewVISIBLEViewGONE);
            this.mboundView2.setVisibility(videoDataGetRtcUserEntityJavaLangObjectNullViewVISIBLEViewGONE);
            this.mboundView4.setVisibility(videoDataGetVideoViewJavaLangObjectNullViewGONEViewVISIBLE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, videoDataGetRtcUserEntityGetNickname);
            this.tvName.setVisibility(videoDataGetRtcUserEntityJavaLangObjectNullBooleanTrueTextUtilsIsEmptyVideoDataGetRtcUserEntityGetNicknameViewGONEViewVISIBLE);
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
        flag 2 (0x3L): videoData.getRtcUserEntity() == null ? true : TextUtils.isEmpty(videoData.getRtcUserEntity().getNickname())
        flag 3 (0x4L): videoData.getRtcUserEntity() == null ? true : TextUtils.isEmpty(videoData.getRtcUserEntity().getNickname())
        flag 4 (0x5L): videoData.getRtcUserEntity() == null ? true : videoData.getVideoView() == null
        flag 5 (0x6L): videoData.getRtcUserEntity() == null ? true : videoData.getVideoView() == null
        flag 6 (0x7L): videoData.getVideoView() == null ? View.VISIBLE : View.GONE
        flag 7 (0x8L): videoData.getVideoView() == null ? View.VISIBLE : View.GONE
        flag 8 (0x9L): videoData.getVideoView() == null ? View.GONE : View.VISIBLE
        flag 9 (0xaL): videoData.getVideoView() == null ? View.GONE : View.VISIBLE
        flag 10 (0xbL): videoData.getRtcUserEntity() == null ? true : videoData.getVideoView() == null ? View.GONE : videoData.getRtcUserEntity().videoOpen ? View.VISIBLE : View.GONE
        flag 11 (0xcL): videoData.getRtcUserEntity() == null ? true : videoData.getVideoView() == null ? View.GONE : videoData.getRtcUserEntity().videoOpen ? View.VISIBLE : View.GONE
        flag 12 (0xdL): videoData.getRtcUserEntity() == null ? true : TextUtils.isEmpty(videoData.getRtcUserEntity().getNickname()) ? View.GONE : View.VISIBLE
        flag 13 (0xeL): videoData.getRtcUserEntity() == null ? true : TextUtils.isEmpty(videoData.getRtcUserEntity().getNickname()) ? View.GONE : View.VISIBLE
        flag 14 (0xfL): videoData.getRtcUserEntity().videoOpen ? View.VISIBLE : View.GONE
        flag 15 (0x10L): videoData.getRtcUserEntity().videoOpen ? View.VISIBLE : View.GONE
        flag 16 (0x11L): videoData.getRtcUserEntity() != null ? View.VISIBLE : View.GONE
        flag 17 (0x12L): videoData.getRtcUserEntity() != null ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}