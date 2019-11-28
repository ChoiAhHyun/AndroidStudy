package com.inuappcenter.androidstudy.third;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

//어뎁터란 하나의 객체로써 보여지는 뷰와 그 뷰에 올릴 데이터를 연결하는 일종의 다리 역할.
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
