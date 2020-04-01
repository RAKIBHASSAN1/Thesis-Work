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

public class Home2Activity extends AppCompatActivity {
    private RecyclerView recyclerView;
    MyAdapter2 myAdapter2;
    private String[] title,desc,desc1;
    private int[] images ={R.drawable.salmon,R.drawable.tuna,R.drawable.whitefish

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
        recyclerView=findViewById(R.id.recyclerViewId);
        title=getResources().getStringArray(R.array.fish_name);
        desc=getResources().getStringArray(R.array.fish_details);
        desc1=getResources().getStringArray(R.array.fish_details1);

        myAdapter2= new MyAdapter2(getApplicationContext(), images, title, desc,desc1) ;
        recyclerView.setAdapter(myAdapter2);

        recyclerView.setLayoutManager(new LinearLayoutManager( this));



    }
}
