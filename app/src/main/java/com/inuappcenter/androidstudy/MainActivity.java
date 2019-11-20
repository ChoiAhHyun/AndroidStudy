package com.inuappcenter.androidstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String id = "apple";
    String pw = "lemon";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.kbn);
        final EditText edit = findViewById(R.id.kid);
        final EditText edit1 = findViewById(R.id.kpw);
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = edit.getText().toString();
                Log.d("test", str);
                String str1 = edit1.getText().toString();
                Log.d("test", str1);

                if (str.equals(id)  && str1.equals(pw) ) {
                    Toast.makeText(MainActivity.this, "성공", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "실패", Toast.LENGTH_SHORT).show();


                }
                Log.d("test", "id: " + id + " pw: " + pw);
                Log.d("test", "str: " + str + " str1: " + str1);

            }


        });

    }


}
