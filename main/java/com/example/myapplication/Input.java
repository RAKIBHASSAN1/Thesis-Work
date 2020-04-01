package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Input extends AppCompatActivity {
EditText Edittext1Id,Edittext2Id;
Button ButtonId1,ButtonId2;
TextView textviewshow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        Edittext1Id=(EditText)findViewById(R.id.Edittext1Id);
        Edittext2Id=(EditText)findViewById(R.id.Edittext2Id);
        ButtonId1=(Button) findViewById(R.id.ButtonId1);
        ButtonId2=(Button)findViewById(R.id.ButtonId2);
        textviewshow=(TextView) findViewById(R.id.textviewshow);
        ButtonId1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    String number1=Edittext1Id.getText().toString();
                    String number2=Edittext2Id.getText().toString();

                    double sum1=Double.parseDouble(number1);
                    double sum2=Double.parseDouble(number2);

                    double sum4=sum1+sum2;
                    textviewshow.setText("Result : "+sum4);
                }catch (Exception e)
                {
                      Toast.makeText(Input.this,"Enter Food and weight",Toast.LENGTH_SHORT).show();
                }


            }
        });
        ButtonId2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1=Edittext1Id.getText().toString();
                String number2=Edittext2Id.getText().toString();
                double sum1=Double.parseDouble(number1);
                double sum2=Double.parseDouble(number2);

                double sum3=sum1-sum2;
                textviewshow.setText("Result : "+sum3);

            }
        });

    }
}
