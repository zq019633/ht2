//package com.talkfun.cloudlive.adapter;
//
//import android.app.Activity;
//import android.content.Context;
//import android.support.v7.widget.RecyclerView;
//import android.util.Log;
//import android.view.LayoutInflater;
//import android.view.MotionEvent;
//import android.view.SurfaceView;
//import android.view.View;
//import android.view.ViewGroup;
//import android.view.ViewParent;
//import android.widget.FrameLayout;
//
//import com.talkfun.cloudlive.R;
//import com.talkfun.cloudlive.entity.VideoStatusData;
//import com.talkfun.cloudlive.event.OnDoubleTapListener;
//import com.talkfun.cloudlive.event.VideoViewEventListener;
//import com.talkfun.cloudlive.view.VideoUserStatusHolder;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//
//
//public abstract class VideoViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
//
//
//    protected final LayoutInflater mInflater;
//    protected final Context mContext;
//
//    protected final ArrayList<VideoStatusData> mUsers;
//
//    protected final VideoViewEventListener mListener;
//
//    protected int exceptedUid;
//
//    public VideoViewAdapter(Context context, int exceptedUid, HashMap<Integer, SurfaceView> uids, VideoViewEventListener listener) {
//        mContext = context;
//        mInflater = ((Activity) context).getLayoutInflater();
//
//        mListener = listener;
//
//        mUsers = new ArrayList<>();
//
//        this.exceptedUid = exceptedUid;
//
//        initRtc(uids);
//    }
//
//    protected int mItemWidth;
//    protected int mItemHeight;
//
//    private void initRtc(HashMap<Integer, SurfaceView> uids) {
//        mUsers.clear();
//
//        customizedInit(uids, true);
//    }
//
//    protected abstract void customizedInit(HashMap<Integer, SurfaceView> uids, boolean force);
//
//    public abstract void notifyUiChanged(HashMap<Integer, SurfaceView> uids, int uidExcluded, HashMap<Integer, Integer> status, HashMap<Integer, Integer> volume);
//
//    @Override
//    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        Log.d("VideoViewAdapter", "onCreateViewHolder " + viewType);
//
//        View v = mInflater.inflate(R.layout.video_view_container, parent, false);
//        v.getLayoutParams().width = mItemWidth;
//        v.getLayoutParams().height = mItemHeight;
//        return new VideoUserStatusHolder(v);
//    }
//
//    protected final void stripSurfaceView(SurfaceView view) {
//        ViewParent parent = view.getParent();
//        if (parent != null) {
//            ((FrameLayout) parent).removeView(view);
//        }
//    }
//
//    @Override
//    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
//        RecyclerView.ViewHolder myHolder = holder;
//
//        final VideoStatusData user = mUsers.get(position);
//
//        Log.d("VideoViewAdapter", "onBindViewHolder " + position + " " + user + " " + myHolder + " " + myHolder.itemView);
//
//
//        FrameLayout holderView = (FrameLayout) myHolder.itemView;
//
//        if (holderView.getChildCount() == 0) {
//            SurfaceView target = user.mView;
//            stripSurfaceView(target);
//            holderView.addView(target, new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
//        }
//
//        holderView.setOnTouchListener(new OnDoubleTapListener(mContext) {
//            @Override
//            public void onDoubleTap(View view, MotionEvent e) {
//                if (mListener != null) {
//                    mListener.onItemDoubleClick(view, user);
//                }
//            }
//
//            @Override
//            public void onSingleTapUp() {
//            }
//        });
//
//    }
//
//    @Override
//    public int getItemCount() {
//        Log.d("VideoViewAdapter", "getItemCount " + mUsers.size());
//        return mUsers.size();
//    }
//
//    @Override
//    public long getItemId(int position) {
//        VideoStatusData user = mUsers.get(position);
//
//        SurfaceView view = user.mView;
//        if (view == null) {
//            throw new NullPointerException("SurfaceView destroyed for user " );
//        }
//
//        return (String.valueOf(user.mUid) + System.identityHashCode(view)).hashCode();
//    }
//
//}
