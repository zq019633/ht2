package com.talkfun.cloudlive.adapter;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;


public class FragmentListAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> fragments;
    public FragmentListAdapter(Context context, List<Fragment> fragmentList) {
        super(((FragmentActivity)context).getSupportFragmentManager());
        this.fragments = fragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    private int mChildCount = Integer.MIN_VALUE;
    private int lashChildCount = Integer.MIN_VALUE;

    @Override
    public void notifyDataSetChanged() {
        lashChildCount = mChildCount;
        mChildCount = getCount();
        super.notifyDataSetChanged();
    }

    @Override
    public int getItemPosition(Object object) {
        if(lashChildCount > 0 ){
            lashChildCount--;
            return POSITION_NONE;
        }else if(lashChildCount == Integer.MIN_VALUE){
            return POSITION_NONE;
        }
        return super.getItemPosition(object);
    }


}
