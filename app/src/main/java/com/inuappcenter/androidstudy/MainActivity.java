package com.inuappcenter.androidstudy;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText id_edit;
    EditText pw_edit;
    Button login_btn;
    String id, pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id_edit = (EditText)findViewById(R.id.id_edit);
        pw_edit = (EditText)findViewById(R.id.pw_edit);
        login_btn = (Button)findViewById(R.id.login_btn);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = id_edit.getText().toString();
                pw = pw_edit.getText().toString();

                if(id.equals("201801703") && pw.equals("a123456")){
                    Toast.makeText(MainActivity.this,"로그인 성공",Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(MainActivity.this,"로그인 실패",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

