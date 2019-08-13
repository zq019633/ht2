package com.talkfun.cloudlive.adapter;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.talkfun.cloudlive.R;
import com.talkfun.cloudlive.util.DimensionUtils;
import com.talkfun.cloudlive.util.ExpressionUtil;
import com.talkfun.sdk.module.ChatEntity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 小班聊天适配器
 */
public class RollChatAdapter extends BAdapter<ChatEntity> {
    private String message;
    private int icon;
    private final static int index = 3;

    public RollChatAdapter(Context context) {
        super(context);
        ExpressionUtil.tvImgWidth = DimensionUtils.dip2px(context, 55);
        ExpressionUtil.tvImgHeight = DimensionUtils.dip2px(context, 45);
    }

    public void appendList(ChatEntity chatMessageEntity) {
        itemList.add(chatMessageEntity);
        if (itemList.size() >= MXA_LENGTH) {
            itemList.remove(0);
        }
        notifyDataSetChanged();
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        SimpleViewHolder simpleViewHolder = null;
        if (convertView == null) {
            convertView = loadView(R.layout.roll_chat_item_layout, null);
            simpleViewHolder = new SimpleViewHolder(convertView);
            convertView.setTag(simpleViewHolder);
        } else {
            simpleViewHolder = (SimpleViewHolder) convertView.getTag();
        }
        setBackground(simpleViewHolder.itemLayout, position);
        setChatMessage(simpleViewHolder, itemList.get(position));
        return convertView;
    }

    private void setBackground(View convertView, int position) {
        GradientDrawable mm = (GradientDrawable) convertView.getBackground();
        if (position == getCount() - 1) {
            mm.setColor(context.getResources().getColor(R.color.adapter_roll_chat_item_bg_1));
        } else if (position == getCount() - 2) {
            mm.setColor(context.getResources().getColor(R.color.adapter_roll_chat_item_bg_2));
        } else {
            mm.setColor(context.getResources().getColor(R.color.adapter_roll_chat_item_bg_3));
        }
    }

    /**
     * 设置聊天信息
     *
     * @param simpleViewHolder
     * @param chatEntity
     */
    private void setChatMessage(SimpleViewHolder simpleViewHolder, ChatEntity chatEntity) {
        ChatEntity chatMessageEntity = chatEntity;
        if (simpleViewHolder != null) {
            simpleViewHolder.nameTv.setText("");
            String name = chatMessageEntity.getNickname();
            if (name != null & !TextUtils.isEmpty(name)) {
                simpleViewHolder.nameTv.setText(name + ":");
            }
            String content = chatMessageEntity.getMsg();
            if (content != null & !TextUtils.isEmpty(content)) {
                SpannableString spannableString = ExpressionUtil.getExpressionString(context, content, "mipmap");
                simpleViewHolder.contentTv.setText(spannableString);
            }
        }

    }

    class SimpleViewHolder {
        @BindView(R.id.name)
        TextView nameTv;
        @BindView(R.id.content)
        TextView contentTv;
        @BindView(R.id.item_layout)
        LinearLayout itemLayout;

        SimpleViewHolder(View v) {
            ButterKnife.bind(this, v);
        }
    }


}
