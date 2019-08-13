package com.talkfun.cloudlive.manager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.talkfun.cloudlive.R;
import com.talkfun.cloudlive.adapter.LogMessageAdapter;
import com.talkfun.cloudlive.bean.LogBean;
import com.talkfun.cloudlive.util.DimensionUtils;
import com.talkfun.widget.PopView;
import com.talkfun.widget.anni.HorizontalGravity;
import com.talkfun.widget.anni.VerticalGravity;

import java.lang.ref.WeakReference;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ccy on 2018/9/8/11:52
 */
public class LogPopManager {
    private Context mContext;
    private PopView mChatPopView;
    @BindView(R.id.log_lv)
    ListView mChatLV;
    private LogMessageAdapter chatAdapter;
    private int popWidth;
    private int popHeight;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            if (chatAdapter != null) {
                chatAdapter.appendList((LogBean) msg.obj);
            }
            if (mChatLV != null)
                mChatLV.setSelection(chatAdapter.getCount() - 1);
        }
    };

    public LogPopManager(Context context) {
        if (context == null) {
            return;
        }
        WeakReference<Context> contextWeakReference = new WeakReference<>(context);
        mContext = contextWeakReference.get();
//        popWidth = (int) (DimensionUtils.getScreenWidth(mContext) * 0.34);
        popHeight = (int) (DimensionUtils.getScreenHeight(mContext) * 0.75);
        initView();
    }

    public void initView() {
        View rootView = View.inflate(mContext, R.layout.log_pop, null);
        mChatPopView = new PopView(mContext).setContentView(rootView, LinearLayout.LayoutParams.MATCH_PARENT, popHeight).setFocusable(true).setFocusAndOutsideEnable(true)
                .createPopup();
        ButterKnife.bind(this, rootView);
        setAdapter();
    }


    private void setAdapter() {
        chatAdapter = new LogMessageAdapter(mContext);
        mChatLV.setAdapter(chatAdapter);
    }

    public void receiveMessage(final LogBean logBean) {
        Message message = new Message();
        message.obj = logBean;
        if (handler == null) {
            return;
        }
        handler.sendMessage(message);

    }


    /**
     * 面板开关
     */
    @SuppressLint("WrongConstant")
    public void show(View view) {
        if (mChatPopView == null) {
            return;
        }
        if (mChatPopView.isShowing()) {
            mChatPopView.dismiss();
        } else {
            mChatPopView.showAtAnchorView(view, VerticalGravity.CENTER, HorizontalGravity.ALIGN_RIGHT, -170, 2);
        }
    }

    public boolean isShow() {
        return mChatPopView != null && mChatPopView.isShowing();
    }

    public void dismiss() {
        if (mChatPopView == null) {
            return;
        }
        if (!mChatPopView.isShowing())
            return;
        mChatPopView.dismiss();
    }
}
