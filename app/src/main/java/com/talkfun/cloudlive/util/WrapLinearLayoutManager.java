package com.talkfun.cloudlive.util;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by ccy on 2018/9/4/18:45
 */
public class WrapLinearLayoutManager extends LinearLayoutManager {

    public WrapLinearLayoutManager(Context context) {
        super(context);
    }

    public WrapLinearLayoutManager(Context context, int orientation, boolean reverseLayout) {
        super(context, orientation, reverseLayout);
    }

    @Override
    public void onMeasure(RecyclerView.Recycler recycler, RecyclerView.State state, int widthSpec, int heightSpec) {
        int itemCount = state.getItemCount();
        if (itemCount == 0) {
            super.onMeasure(recycler, state, widthSpec, heightSpec);
            return;
        }
        int holdMeasuredHeight = 0;
        int holdMeasuredWidth = 0;
        if (VERTICAL == getOrientation()) {
            for (int i = itemCount - 1; i >= 0; i--) {
                View view = recycler.getViewForPosition(i);
                if (view != null) {
                    measureChild(view, widthSpec, heightSpec);
                    holdMeasuredHeight += view.getMeasuredHeight();

                }
            }
            holdMeasuredWidth = View.MeasureSpec.getSize(widthSpec);
        } else {
            int maxHeight = 0;
            for (int i = itemCount - 1; i >= 0; i--) {
                View view = recycler.getViewForPosition(i);
                if (view != null) {
                    measureChild(view, widthSpec, heightSpec);
                    holdMeasuredWidth += view.getMeasuredWidth();
                    if (maxHeight < view.getMeasuredHeight()) maxHeight = view.getMeasuredHeight();
                }
            }
            if (holdMeasuredWidth > View.MeasureSpec.getSize(widthSpec)) {
                holdMeasuredWidth = View.MeasureSpec.getSize(widthSpec);
            }
            holdMeasuredHeight = View.MeasureSpec.getSize(heightSpec);
            if (maxHeight != 0 && maxHeight < holdMeasuredHeight) {
                holdMeasuredHeight = maxHeight;
            }
        }
        setMeasuredDimension(holdMeasuredWidth, holdMeasuredHeight);
    }
}
