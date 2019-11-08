package com.inuappcenter.androidstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String ji ="akai";
    String su = "1234";
    public Button login;
    public EditText id;
    public EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login =findViewById(R.id.login);
        id = findViewById(R.id.id);
        pass = findViewById(R.id.pass);
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(ji.equals(id.getText().toString()) &&
                        su.equals(pass.getText().toString()))
                {
                    Toast.makeText(MainActivity.this,"성공",Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(MainActivity.this,"실패",Toast.LENGTH_SHORT).show();
            }
        });
    }
}