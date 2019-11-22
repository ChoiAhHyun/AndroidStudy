package com.inuappcenter.androidstudy.third;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ThirdViewPagerAdapter extends FragmentPagerAdapter {
    private int tabCount;
    public ThirdViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabCount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                third_first fragment1 = new third_first();
                return fragment1;
            case 1:
                third_second fragment2 = new third_second();
                return fragment2;
            case 2:
                third_third fragment3 = new third_third();
                return fragment3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return "탭 " + (position+1); // 페이지(position)에 따른 tab 의 타이틀 지정
    }
}
