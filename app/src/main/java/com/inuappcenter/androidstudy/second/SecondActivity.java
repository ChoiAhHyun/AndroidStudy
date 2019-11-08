package com.inuappcenter.androidstudy.second;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.inuappcenter.androidstudy.R;

public class SecondActivity extends AppCompatActivity {
    String id = "dd", pass = "sss";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_linear);

        final TextView textView = findViewById(R.id.tv);
//        textView.setPadding(20, 10, 20, 40);

        final EditText editText = findViewById(R.id.edt);

        final Button button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                textView.setText(str);

                Toast.makeText(SecondActivity.this, "메시지", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
