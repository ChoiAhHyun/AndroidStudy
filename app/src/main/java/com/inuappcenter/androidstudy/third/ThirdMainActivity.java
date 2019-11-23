package com.inuappcenter.androidstudy.third;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.inuappcenter.androidstudy.R;

public class ThirdMainActivity extends AppCompatActivity {

    Button btn_main;
    TextView textView;
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

        btn_main =findViewById(R.id.btn_main);
        textView = findViewById(R.id.tv_main);
        btn_main.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThirdMainActivity.this,ThirdSubActivity.class);
                intent.putExtra("textIn", textView.getText().toString());
                startActivityForResult(intent, 100);
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100){
            if (resultCode == 100){
                String string = data.getStringExtra("textOut");
                textView.setText(string);
            }
        }
    }
}
