package com.example.a12f4567_labexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText n1,n2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get the ids of all the views
        n1=(EditText) findViewById(R.id.ed1);
        n2=(EditText) findViewById(R.id.ed2);
        b1=(Button) findViewById(R.id.btn);

        //trigering action
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1=n1.getText().toString();
                String num2=n2.getText().toString();
                int a=Integer.parseInt(num1);
                int b=Integer.parseInt(num2);
                int sum=a+b;

                Toast.makeText(getApplicationContext(),"Sum=" +(a+b),Toast.LENGTH_LONG).show();
            }
        });


    }
}