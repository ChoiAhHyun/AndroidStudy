package com.inuappcenter.androidstudy.fifth;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.inuappcenter.androidstudy.R;

import java.util.ArrayList;

public class SubActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_sub);

        ArrayList<RecyclerItem> list = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            list.add(new RecyclerItem(i + "번째 아이템", i));
        }

        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        RecyclerAdapter adapter = new RecyclerAdapter(this, list);
        recyclerView.setAdapter(adapter);///

        list.add(new RecyclerItem(22 + "번째 아이템", 22));
        list.add(new RecyclerItem(24 + "번째 아이템", 24));

        adapter.notifyDataSetChanged();
    }
}
