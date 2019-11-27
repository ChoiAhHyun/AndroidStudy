package com.inuappcenter.androidstudy.quest2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.inuappcenter.androidstudy.R;

public class ThirdMainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_main);

        textView = findViewById(R.id.ma_main);
        Button button = findViewById(R.id.bt_main);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThirdMainActivity.this, ThirdSubActivity.class);
                intent.putExtra("textIn", textView.getText().toString());
                startActivityForResult(intent, 905);
            }
        });

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("one"));
        tabLayout.addTab(tabLayout.newTab().setText("two"));
        tabLayout.addTab(tabLayout.newTab().setText("three"));

        final ViewPager viewPager = findViewById(R.id.viewPager);
        FragmentManager fm = getSupportFragmentManager();
        ThirdViewPagerAdapter pagerAdapter = new ThirdViewPagerAdapter(fm, 3);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setCurrentItem(0);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 905){
            if (resultCode == 905){
                String string = data.getStringExtra("textOut");
                textView.setText(string);
            }
        }
    }
}