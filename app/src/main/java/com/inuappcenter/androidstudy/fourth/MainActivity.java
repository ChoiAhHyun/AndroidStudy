package com.inuappcenter.androidstudy.fourth;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.inuappcenter.androidstudy.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_main);

        button = findViewById(R.id.btn_main);

        Example example = new Example();
        example.a = 1;

        Example.d = 2;

        example2.make();

        //1번
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        button.setOnClickListener(onClickListener);
    }

    //2번
    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn_drawer : {

                break;
            }
            }
        }
    };

    //3번
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_drawer : {

                break;
            }
        }
    }

    Example2 example2 = new Example2() {
        @Override
        public void make() {

        }
    };
}
