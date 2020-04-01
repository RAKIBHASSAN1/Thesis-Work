package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public   class MyAdapter extends RecyclerView.Adapter <MyAdapter.MyViewHolder> {

 Context context;
 private int[] images;
 private String[] title,desc,desc1;

    public MyAdapter(Context context,int[] images,String[] title,String[] desc,String[] desc1) {
        this.context=context;
        this.images=images;
        this.title=title;
        this.desc=desc;
        this.desc1=desc1;

    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.sample_layout,viewGroup,false);
        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.imageView.setImageResource(images[i]);
        myViewHolder.t1.setText(title[i]);
        myViewHolder.t2.setText(desc[i]);
        myViewHolder.t3.setText(desc1[i]);

    }
    @Override
    public int getItemCount() {
        return title.length;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView t1,t2,t3;
        public MyViewHolder(@NonNull View itemView)
        {
            super(itemView);
            imageView=itemView.findViewById(R.id.ImageViewId);
            t1=itemView.findViewById(R.id.titleTextViewId);
            t2=itemView.findViewById(R.id.descTextViewId);
            t3=itemView.findViewById(R.id.desc1TextViewId);

        }
    }

}