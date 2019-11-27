package com.inuappcenter.androidstudy.week3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.inuappcenter.androidstudy.R;

public class SecondActivity extends AppCompatActivity {
    EditText data_edit2;
    Button act_btn2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        data_edit2 = findViewById(R.id.data_edit2);
        act_btn2 = findViewById(R.id.act_btn2);

        Intent intent = getIntent();
        data_edit2.setHint(intent.getStringExtra("data1"));
        act_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                String data2 = data_edit2.getText().toString();
                intent.putExtra("data2",data2);
                setResult(1,intent);
                finish();
            }
        });
    }
}
