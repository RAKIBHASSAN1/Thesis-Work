package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    MyAdapter myAdapter;
    private String[] title,desc,desc1;
    private int[] images ={R.drawable.apple,R.drawable.banana,R.drawable.blackberries,
            R.drawable.blueberries,R.drawable.cherries,R.drawable.grapes,
            R.drawable.guava,R.drawable.lemon,R.drawable.mango,R.drawable.melon,
            R.drawable.oranges,R.drawable.watermelon

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        recyclerView=findViewById(R.id.recyclerViewId);
        title=getResources().getStringArray(R.array.fruit_name);
        desc=getResources().getStringArray(R.array.fruit_details);
        desc1=getResources().getStringArray(R.array.fruit_details1);

        myAdapter= new MyAdapter(getApplicationContext(), images, title, desc,desc1) ;
        recyclerView.setAdapter(myAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager( this));



    }
}
