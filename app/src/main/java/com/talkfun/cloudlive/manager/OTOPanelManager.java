package com.talkfun.cloudlive.manager;

import androidx.lifecycle.MutableLiveData;
import android.content.Context;
import android.graphics.Color;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;

import com.talkfun.cloudlive.R;
import com.talkfun.cloudlive.adapter.OTOColorAdapter;
import com.talkfun.cloudlive.adapter.OTODrawAdapter;
import com.talkfun.cloudlive.adapter.OTOStokeAdapter;
import com.talkfun.cloudlive.base.BaseDatabindingAdapter;
import com.talkfun.cloudlive.util.DimensionUtils;
import com.talkfun.cloudlive.view.GridSpacingItemDecoration;
import com.talkfun.cloudlive.viewmodel.LiveOneToOneViewModel;
import com.talkfun.widget.PopView;
import com.talkfun.widget.anni.HorizontalGravity;
import com.talkfun.widget.anni.VerticalGravity;
import com.talkfun.whiteboard.config.DrawType;

import java.lang.ref.WeakReference;
import java.util.Arrays;

/**
 * 弹框面板管理
 * Created by ccy on 2019/5/8/18:11
 */
public class OTOPanelManager {
    private WeakReference<Context> contextWeakReference;
    private LiveOneToOneViewModel liveOneToOneViewModel;
    private PopView mPopView;
    private RecyclerView colorRV;
    private RecyclerView stokeRV;
    private RecyclerView drawRV;
    private MutableLiveData drawLiveData = new MutableLiveData<Integer>();
    /**
     * 颜色值
     */
    private String[] mColorValueArr = {
            "#FC2F04", "#FF6F00", "#FBD504", "#94CE44", "#01D7CF", "#0096F9",
            "#8D6CC5", "#FC9D9B", "#FFFFFF", "#9B9B9B", "#4C5464", "#000000"
    };
    private Integer[] mDrawValue = {
            DrawType.DRAW_PATH_MODE,
            DrawType.DRAW_LINE_MODE,
            DrawType.DRAW_DOTTED_LINE_MODE,
            DrawType.DRAW_RECTANGLE_MODE,
            DrawType.DRAW_OVAL_MODE
    };
    private Integer[] mDrawValueArr = {
            R.mipmap.pop_panel_draw,
            R.mipmap.pop_panel_line,
            R.mipmap.pop_panel_dottedline,
            R.mipmap.pop_panel_square,
            R.mipmap.pop_panel_circle
    };
    private Integer[] mDrawValueArrSelect = {
            R.mipmap.pop_panel_draw_select,
            R.mipmap.pop_panel_line_select,
            R.mipmap.pop_panel_dottedline_select,
            R.mipmap.pop_panel_square_select,
            R.mipmap.pop_panel_circle_select};
    private Float[] mStokeValueArr = {
            0.5f, 0.6f, 0.8f, 0.9f, 1f
    };
    private Integer[] mStokeValueForSDK = {5, 7, 9, 11, 13};
    private int lastSelectDrawType = DrawType.DRAW_PATH_MODE;

    public OTOPanelManager(Context context, LiveOneToOneViewModel liveOneToOneViewModel) {
        contextWeakReference = new WeakReference<>(context);
        if (getContext() == null) {
            return;
        }
        this.liveOneToOneViewModel = liveOneToOneViewModel;
        View rootView = View.inflate(getContext(), R.layout.pop_draw_panel, null);
        int width = (DimensionUtils.isPad(getContext()) ? getDimension(R.dimen.dp_150) : getDimension(
                R.dimen.dp_240));
        mPopView = new PopView(getContext()).setContentView(rootView).setWidth(width).setFocusable(true).setFocusAndOutsideEnable(true).createPopup();
        colorRV = rootView.findViewById(R.id.color_rv);
        stokeRV = rootView.findViewById(R.id.stoke_rv);
        drawRV = rootView.findViewById(R.id.draw_rv);
        setAdapter();
        initDefault();
    }

    private Context getContext() {
        return contextWeakReference.get();
    }

    public int getLastSelectDrawType() {
        return lastSelectDrawType;
    }

    private void setAdapter() {
        drawAdapter();
        colorAdapter();
        stokeAdapter();


    }

    private void stokeAdapter() {
        stokeRV.setLayoutManager(new GridLayoutManager(getContext(), 5));
        OTOStokeAdapter adapter = new OTOStokeAdapter();
        adapter.setDataList(Arrays.asList(mStokeValueArr));
        adapter.setOnItemClickListener(new BaseDatabindingAdapter.OnItemClickListener<Float>() {
            @Override
            public void onItemClick(Float data, int position) {
                liveOneToOneViewModel.setStokeWidth(mStokeValueForSDK[position]);
            }
        });
        stokeRV.setAdapter(adapter);
    }

    private void colorAdapter() {
        colorRV.setLayoutManager(new GridLayoutManager(getContext(), 6));
        colorRV.addItemDecoration(new GridSpacingItemDecoration(6, (int) getDimension(R.dimen.dp_6), false));
        final OTOColorAdapter OTOColorAdapter = new OTOColorAdapter();
        OTOColorAdapter.setDataList(Arrays.asList(mColorValueArr));
        OTOColorAdapter.setOnItemClickListener(new BaseDatabindingAdapter.OnItemClickListener<String>() {
            @Override
            public void onItemClick(String data, int position) {
                liveOneToOneViewModel.setPaintColor(Color.parseColor(data));
            }
        });
        colorRV.setAdapter(OTOColorAdapter);
    }

    private void drawAdapter() {
        drawRV.setLayoutManager(new GridLayoutManager(getContext(), 5));
        final OTODrawAdapter drawAdapter = new OTODrawAdapter();
        drawAdapter.setDataList(Arrays.asList(mDrawValueArr));
        drawAdapter.setOnItemClickListener(new BaseDatabindingAdapter.OnItemClickListener<Integer>() {
            @Override
            public void onItemClick(Integer data, int position) {
                lastSelectDrawType = mDrawValue[position];
                liveOneToOneViewModel.setDrawType(lastSelectDrawType);
                drawLiveData.setValue(mDrawValueArrSelect[position]);
            }
        });
        drawRV.setAdapter(drawAdapter);
    }

    private void initDefault() {
        liveOneToOneViewModel.setDrawType(DrawType.DRAW_PATH_MODE);
        liveOneToOneViewModel.setStokeWidth(5);
        liveOneToOneViewModel.setPaintColor(Color.parseColor("#FC2F04"));
        drawLiveData.setValue(R.mipmap.live_one_to_one_panel_draw_select);
    }

    public MutableLiveData<Integer> getDrawLiveData() {
        return drawLiveData;
    }

    public void show(View view) {
        if (mPopView == null) {
            return;
        }
        if (mPopView.isShowing()) {
            mPopView.dismiss();
            return;
        }
        int offy = -getDimension(R.dimen.dp_2);
        mPopView.showAtAnchorView(view, VerticalGravity.ABOVE, HorizontalGravity.ALIGN_LEFT, 0, offy);
    }

    public boolean isShowing() {
        return mPopView == null ? false : mPopView.isShowing();
    }

    public void dismiss() {
        if (mPopView != null) {
            mPopView.dismiss();
        }
    }

    private int getDimension(int id) {
        return (int) getContext().getResources().getDimension(id);
    }

    public void release() {
        liveOneToOneViewModel = null;
        drawLiveData = null;
    }
}
