package com.inuappcenter.androidstudy.fifth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.inuappcenter.androidstudy.R;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    Button btn_drawer, btn_click, btn_next;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_main);

        drawerLayout = findViewById(R.id.drawer_layout);
        btn_drawer = findViewById(R.id.btn_drawer);
        btn_next = findViewById(R.id.btn_next);
        btn_drawer.setOnClickListener(onClickListener);
        btn_next.setOnClickListener(onClickListener);

        setDrawer();
    }

    private void setDrawer() {
        btn_click = findViewById(R.id.btn_click);
        btn_click.setOnClickListener(onClickListener);
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn_drawer : {
                    drawerLayout.openDrawer(GravityCompat.START);
                    break;
                }
                case R.id.btn_next : {
                    Intent intent = new Intent(MainActivity.this, com.inuappcenter.androidstudy.fifth.SubActivity.class);
                    startActivity(intent);
                    break;
                }
                case R.id.btn_click : {
                    Toast.makeText(MainActivity.this, "클릭", Toast.LENGTH_SHORT).show();
                    break;
                }
            }
        }
    };

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
