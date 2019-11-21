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
                ThirdFirstFragment fragment1 = new ThirdFirstFragment();
                return fragment1;
            case 1:
                ThirdSecondFragment fragment2 = new ThirdSecondFragment();
                return fragment2;
            case 2:
                ThirdThirdFragment fragment3 = new ThirdThirdFragment();
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
