package com.talkfun.cloudlive.adapter;

import android.graphics.Color;
import android.support.annotation.NonNull;

import com.talkfun.cloudlive.R;
import com.talkfun.cloudlive.base.BaseDatabindingAdapter;
import com.talkfun.cloudlive.databinding.ItemPopColorBinding;

import java.util.List;

/**
 * Created by ccy on 2019/5/8/20:24
 */
public class OTOColorAdapter extends BaseDatabindingAdapter<String> {
    @Override
    protected int getLayoutId() {
        return R.layout.item_pop_color;
    }

    @Override
    public boolean isOpenSelectFunction() {
        return true;
    }

    @Override
    protected int getVariableId() {
        return 0;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder<String> holder, int position, @NonNull List<Object> payloads) {
        super.onBindViewHolder(holder, position, payloads);
        ItemPopColorBinding binding = (ItemPopColorBinding) holder.getBinding();
        binding.colorCv.setColor(Color.parseColor(getItem(position)));
        binding.colorCv.setChecked(selectPosition == position);

    }

}