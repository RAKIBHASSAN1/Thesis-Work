package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;
import static com.example.myapplication.R.id.button;


public class MainActivity extends AppCompatActivity{
   private Button button;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
   private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button=findViewById(R.id.button);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.button)
                {
                    Intent intent=new Intent(MainActivity.this,HomeActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.button1)
                {
                    Intent intent=new Intent(MainActivity.this,Home1Activity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.button2)
                {
                    Intent intent=new Intent(MainActivity.this,Home2Activity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.button3)
                {
                    Intent intent=new Intent(MainActivity.this,Home3Activity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.button4)
                {
                    Intent intent=new Intent(MainActivity.this,Home4Activity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

    }
}
