package com.inuappcenter.androidstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class InitialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial);
        Log.d("test", "ss");

        Button buttonSecond = findViewById(R.id.btn_second);
        Button buttonThird = findViewById(R.id.btn_third);
        Button buttonFifth = findViewById(R.id.btn_fifth);
        buttonSecond.setOnClickListener(onClickListener);
        buttonThird.setOnClickListener(onClickListener);
        buttonFifth.setOnClickListener(onClickListener);
    }
    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent;
            switch (view.getId()){
                case R.id.btn_second: {
                    intent = new Intent(InitialActivity.this, com.inuappcenter.androidstudy.second.MainActivity.class);
                    startActivity(intent);
                    break;
                }
                case R.id.btn_third: {
                    intent = new Intent(InitialActivity.this, com.inuappcenter.androidstudy.third.MainActivity.class);
                    startActivity(intent);
                    break;
                }
                case R.id.btn_fifth: {
                    intent = new Intent(InitialActivity.this, com.inuappcenter.androidstudy.fifth.MainActivity.class);
                    startActivity(intent);
                    break;
                }
            }
        }
    };
}
