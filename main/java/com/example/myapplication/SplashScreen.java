package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {
    private ProgressBar progressBar;
    private int progress;
    private ImageView simpleImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);
        progressBar =(ProgressBar) findViewById(R.id.progressBarId);
        ImageView simpleImageView=(ImageView) findViewById(R.id.simpleImageView);
        simpleImageView.setImageResource(R.drawable.imagecal);//set the source in java class
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                dowork();
                stratApp();
            }
        });
        thread.start();

    }
    public void dowork()
    {
        for(progress=20;progress<=100;progress=progress+6)
        {
            try{
                Thread.sleep(1000);
                progressBar.setProgress(progress);
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
    public void stratApp()
    {
        Intent intent=new Intent(SplashScreen.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
    public void onBackPressed(){
        super.onBackPressed();
        Toast.makeText(this,"back key is pressed", Toast.LENGTH_SHORT).show();
    }
}
