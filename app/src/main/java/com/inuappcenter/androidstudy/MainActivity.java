package com.inuappcenter.androidstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.inuappcenter.androidstudy.second.SecondActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("test", "ss");

        Button button = findViewById(R.id.btn_second);
        button.setOnClickListener(onClickListener);
    }
    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent;
            switch (view.getId()){
                case R.id.btn_second: {
                    intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                }
            }
        }
    };
}
