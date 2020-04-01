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

public class Home3Activity extends AppCompatActivity {
    private RecyclerView recyclerView;
    MyAdapter3 myAdapter3;
    private String[] title,desc,desc1;
    private int[] images ={R.drawable.chickenbreast,R.drawable.roastbeef,R.drawable.roastlamb

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home3);
        recyclerView=findViewById(R.id.recyclerViewId);
        title=getResources().getStringArray(R.array.meat_name);
        desc=getResources().getStringArray(R.array.meat_details);
        desc1=getResources().getStringArray(R.array.meat_details1);

        myAdapter3= new MyAdapter3(getApplicationContext(), images, title, desc,desc1) ;
        recyclerView.setAdapter(myAdapter3);

        recyclerView.setLayoutManager(new LinearLayoutManager( this));



    }
}
