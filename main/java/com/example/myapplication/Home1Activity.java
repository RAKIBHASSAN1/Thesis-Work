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

public class Home1Activity extends AppCompatActivity {
    private RecyclerView recyclerView;
    MyAdapter1 myAdapter1;
    private String[] title,desc,desc1;
    private int[] images ={R.drawable.aubergine,R.drawable.carrots,R.drawable.cabbage,R.drawable.cauliflower,
                           R.drawable.cucumber,R.drawable.olives,R.drawable.mushrooms,R.drawable.onions,
                           R.drawable.potatoes,R.drawable.pumpkin,R.drawable.radish,R.drawable.tomato,
                           R.drawable.turnip
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home1);
        recyclerView=findViewById(R.id.recyclerViewId);
        title=getResources().getStringArray(R.array.vegetable_name);
        desc=getResources().getStringArray(R.array.vegetable_details);
        desc1=getResources().getStringArray(R.array.vegetable_details1);

        myAdapter1= new MyAdapter1(getApplicationContext(), images, title, desc,desc1) ;
        recyclerView.setAdapter(myAdapter1);

        recyclerView.setLayoutManager(new LinearLayoutManager( this));



    }
}
