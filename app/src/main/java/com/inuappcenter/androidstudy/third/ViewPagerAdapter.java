package com.inuappcenter.androidstudy.third;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private int tabCount;
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabCount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                FirstFragment fragment1 = new FirstFragment();
                return fragment1;
            case 1:
                SecondFragment fragment2 = new SecondFragment();
                return fragment2;
            case 2:
                ThirdFragment fragment3 = new ThirdFragment();
                return fragment3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
