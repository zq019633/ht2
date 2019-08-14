package com.talkfun.cloudlive.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;

/**
 * 自动滚动
 * Created by ccy on 2019/1/23/17:05
 */
public class AutoScrollTextView extends androidx.appcompat.widget.AppCompatTextView /*implements View.OnClickListener*/ {
    public final static String TAG = AutoScrollTextView.class.getSimpleName();

    private float textLength = 0f;//文本长度
    private float viewWidth = 0f;
    private float step = 0f;//文字的横坐标
    private float y = 0f;//文字的纵坐标
    private float temp_view_plus_text_length = 0.0f;//用于计算的临时变量
    private float temp_view_plus_two_text_length = 0.0f;//用于计算的临时变量
    public boolean isStarting = false;//是否开始滚动
    private Paint paint = null;//绘图样式
    private String text = "";//文本内容
    private int speed = 2; //滚动的速度


    /**
     * 字幕字体颜色
     */
    private int mTextColor;

    /**
     * 字幕字体大小
     */
    private float mTextSize;

    public AutoScrollTextView(Context context) {
        super(context);
    }

    public AutoScrollTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AutoScrollTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }


    public void init(Context context) {
        paint = getPaint();
        text = getText().toString();
        mTextColor = getCurrentTextColor();
        mTextSize = getTextSize();
        paint.setColor(mTextColor);
        paint.setTextSize(mTextSize);
        textLength = paint.measureText(text);
        viewWidth = getWidth();
        if (viewWidth == 0) {
            viewWidth = getScreenWidth(context);//获取屏幕的宽度
        }
        step = textLength;//文字真实的长度
        temp_view_plus_text_length = viewWidth + textLength;
        temp_view_plus_two_text_length = viewWidth + textLength * 2;//文字移动的距离应该是控件的长度+左边一个文字的长度+右边一个文字的长度
        y = getTextSize() + getPaddingTop();
    }

    @Override
    public Parcelable onSaveInstanceState() {
        Parcelable superState = super.onSaveInstanceState();
        SavedState ss = new SavedState(superState);

        ss.step = step;
        ss.isStarting = isStarting;

        return ss;

    }

    @Override
    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        SavedState ss = (SavedState) state;
        super.onRestoreInstanceState(ss.getSuperState());
        step = ss.step;
        isStarting = ss.isStarting;

    }

    public static class SavedState extends BaseSavedState {
        public boolean isStarting = false;
        public float step = 0.0f;

        SavedState(Parcelable superState) {
            super(superState);
        }

        @Override
        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeBooleanArray(new boolean[]{isStarting});
            out.writeFloat(step);
        }


        public static final Creator<SavedState> CREATOR
                = new Creator<SavedState>() {

            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }

            @Override
            public SavedState createFromParcel(Parcel in) {
                return new SavedState(in);
            }
        };

        private SavedState(Parcel in) {
            super(in);
            boolean[] b = null;
            in.readBooleanArray(b);
            if (b != null && b.length > 0)
                isStarting = b[0];
            step = in.readFloat();
        }
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void startScroll() {
        isStarting = true;
        invalidate();
    }


    public void stopScroll() {
        isStarting = false;
        invalidate();
    }


    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawText(text, temp_view_plus_text_length - step, y, paint);
        if (!isStarting) {
            return;
        }
        step = step + (2 * speed);//0.5为文字滚动速度。
        if (step > temp_view_plus_two_text_length)
            step = textLength;
        invalidate();
    }

/*    @Override
    public void onClick(View v) {
        if (isStarting)
            stopScroll();
        else
            startScroll();

    }*/

    /**
     * 获取屏幕的宽度
     */
    private int getScreenWidth(Context context) {
        if (context instanceof Activity) {
            DisplayMetrics dm = new DisplayMetrics();
            ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(dm);
            return dm.widthPixels;
        }
        return 0;
    }
}
