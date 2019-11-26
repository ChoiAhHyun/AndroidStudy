package com.inuappcenter.androidstudy.week3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.inuappcenter.androidstudy.R;

public class FirstActivity extends AppCompatActivity {
    EditText data_edit1;
    Button act_btn1;
    TabLayout tab;
    ViewPager viewPager;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        data_edit1 = findViewById(R.id.data_edit1);
        act_btn1 = findViewById(R.id.act_btn1);
        act_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("data1", data_edit1.getText().toString());
                startActivityForResult(intent,1);
            }
        });

        viewPager = findViewById(R.id.viewPager);

        final FragmentManager fm = getSupportFragmentManager();
        MyFragmentPagerAdapter myFragmentPagerAdapter = new MyFragmentPagerAdapter(fm,3);
        viewPager.setAdapter(myFragmentPagerAdapter);
        viewPager.setCurrentItem(0);

        tab = findViewById(R.id.tab);
        tab.addTab(tab.newTab().setText("FIRST"));
        tab.addTab(tab.newTab().setText("SECOND"));
        tab.addTab(tab.newTab().setText("THIRD"));
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tab));
        tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
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
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1){
            if(resultCode==1){
                String data2 = data.getStringExtra("data2");
                data_edit1.setHint(data2);
            }
        }
    }
}

