package com.talkfun.cloudlive.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.talkfun.cloudlive.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ccy on 2018/9/6/17:23
 */
public class PaintAdapter extends BAdapter<Integer> {
    public PaintAdapter(Context context) {
        super(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            View view = loadView(R.layout.sl_paint_item, null, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
            convertView = view;
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        if (position == itemList.size() - 1) {
            holder.mImage.setLayoutParams(new FrameLayout.LayoutParams(30, 30));
        } else {
            holder.mImage.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        }
        holder.mImage.setBackgroundResource(itemList.get(position));
        return convertView;
    }

    class ViewHolder {
        @BindView(R.id.type_iv)
        ImageView mImage;

        ViewHolder(View v) {
            ButterKnife.bind(this, v);
        }
    }
}
