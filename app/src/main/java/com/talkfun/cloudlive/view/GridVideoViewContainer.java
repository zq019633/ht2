//package com.talkfun.cloudlive.view;
//
//import android.content.Context;
//import android.support.annotation.Nullable;
//import android.support.v7.widget.GridLayoutManager;
//import android.support.v7.widget.RecyclerView;
//import android.util.AttributeSet;
//import android.view.SurfaceView;
//
//import com.talkfun.cloudlive.adapter.VideoAdapter;
//import com.talkfun.cloudlive.entity.VideoStatusData;
//import com.talkfun.cloudlive.event.VideoViewEventListener;
//
//import java.util.HashMap;
//
//
//public class GridVideoViewContainer extends RecyclerView {
//    public GridVideoViewContainer(Context context) {
//        super(context);
//    }
//
//    public GridVideoViewContainer(Context context, @Nullable AttributeSet attrs) {
//        super(context, attrs);
//    }
//
//    public GridVideoViewContainer(Context context, @Nullable AttributeSet attrs, int defStyle) {
//        super(context, attrs, defStyle);
//    }
//
//    private VideoAdapter mGridVideoViewContainerAdapter;
//
//    private VideoViewEventListener mEventListener;
//
//    public void setItemEventHandler(VideoViewEventListener listener) {
//        this.mEventListener = listener;
//    }
//
//    private boolean initAdapter(HashMap<Integer, VideoStatusData> map) {
//        if (mGridVideoViewContainerAdapter == null) {
//            mGridVideoViewContainerAdapter = new VideoAdapter(getContext(), map, mEventListener);
//            mGridVideoViewContainerAdapter.setHasStableIds(true);
//            GridLayoutManager mGridLayoutManager = new GridLayoutManager(getContext(), 4, RecyclerView.VERTICAL, false);
//            this.setLayoutManager(mGridLayoutManager);
//            this.addItemDecoration(new SpaceItemDecoration(5));
//            return true;
//        }
//        return false;
//    }
//    private void addItem
//
//
//    public SurfaceView getSurfaceView(int index) {
//        return mGridVideoViewContainerAdapter.getItem(index).mView;
//    }
//
//    public VideoStatusData getItem(int position) {
//        return mGridVideoViewContainerAdapter.getItem(position);
//    }
//
//    public void remove(int id) {
//    }
//}
