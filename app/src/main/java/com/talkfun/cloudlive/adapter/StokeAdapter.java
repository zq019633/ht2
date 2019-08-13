package com.talkfun.cloudlive.adapter;//package com.talkfun.cloud.adapter;
//
//import android.support.annotation.NonNull;
//import com.talkfun.cloud.R;
//import com.talkfun.cloud.base.BaseDatabindingAdapter;
//import com.talkfun.cloud.databinding.ItemPopStokeBinding;
//
//import java.util.List;
//
///**
// * Created by ccy on 2019/4/11/11:41
// */
//public class StokeAdapter extends BaseDatabindingAdapter<Float> {
//    @Override
//    protected int getLayoutId() {
//        return R.layout.item_pop_stoke;
//    }
//
//    @Override
//    protected int getVariableId() {
//        return 0;
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder<Float> holder, int position, @NonNull List<Object> payloads) {
//        super.onBindViewHolder(holder, position, payloads);
//        ItemPopStokeBinding itemPopStokeBinding = (ItemPopStokeBinding) holder.getBinding();
//        itemPopStokeBinding.stokeDv.setDotPerent(getItem(position));
//        itemPopStokeBinding.stokeDv.setSelected(position==selectPosition);
//    }
//}
