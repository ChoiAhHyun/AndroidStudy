package com.inuappcenter.androidstudy.fourth;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.inuappcenter.androidstudy.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    DrawerLayout drawerLayout;
    Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_main);

        drawerLayout = findViewById(R.id.drawer_layout);
        button = findViewById(R.id.btn_drawer);

        //1번
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                drawerLayout.openDrawer(GravityCompat.START);
//            }
//        });

//        button.setOnClickListener(onClickListener);
    }

    //2번
//    View.OnClickListener onClickListener = new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            switch (view.getId()) {
//                case R.id.btn_drawer : {
//                drawerLayout.openDrawer(GravityCompat.START);
//                break;
//            }
//            }
//        }
//    };

    //3번
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_drawer : {
                drawerLayout.openDrawer(GravityCompat.START);
                break;
            }
        }
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
