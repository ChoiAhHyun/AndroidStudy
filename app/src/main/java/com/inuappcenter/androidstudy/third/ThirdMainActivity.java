package com.inuappcenter.androidstudy.third;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.inuappcenter.androidstudy.R;

public class ThirdMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_main);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL); //  xml 에서도 set 가능



        ViewPager viewPager = (ViewPager) findViewById(R.id.ViewPager);
        FragmentManager fragmentManager = getSupportFragmentManager();
        ThirdViewPagerAdapter adapter = new ThirdViewPagerAdapter(fragmentManager, 3);//뷰페이저가 3개
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);//이걸 추가해야 탭이랑 뷰페이저가 같이 움직인다.

    }
}
