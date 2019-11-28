package com.inuappcenter.androidstudy.third;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import com.inuappcenter.androidstudy.R;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_sub);

        final EditText editText = findViewById(R.id.edt_sub);
        Intent intent = getIntent();
        editText.setHint(intent.getStringExtra("textIn"));
        Button button = findViewById(R.id.btn_sub);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                String string = editText.getText().toString();
                intent.putExtra("textOut", string);
//                Log.d("test", string);
                setResult(100, intent);
                finish();
            }
        });

        ViewPager viewPager = findViewById(R.id.viewPager);
        FragmentManager fragmentManager = getSupportFragmentManager();
        ViewPagerAdapter pagerAdapter = new ViewPagerAdapter(fragmentManager, 3);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setCurrentItem(0);
    }
}
