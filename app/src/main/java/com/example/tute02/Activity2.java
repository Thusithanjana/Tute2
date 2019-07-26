package com.example.tute02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    int num1;
    int num2;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Intent intent = getIntent();
        String n1 = intent.getStringExtra(MainActivity.EXTRA_Number1);
        String n2 = intent.getStringExtra(MainActivity.EXTRA_Number2);
        tv = findViewById(R.id.txtAns);
        TextView nm1 = findViewById(R.id.etxtN1);
        TextView nm2 = findViewById(R.id.etxtN2);

        nm1.setText(n1);
        nm2.setText(n2);
        num1 = Integer.parseInt(n1);
        num2 = Integer.parseInt(n2);

    }

    public void addition(View view){
        int x = num1+num2;
        tv.setText(String.valueOf(x));
    }

    public void substraction(View view){
        int x = num1-num2;
        tv.setText(String.valueOf(x));

    }

    public void multiplication(View view){
        int x = num1*num2;
        tv.setText(String.valueOf(x));

    }

    public void divition(View view){
        int x = num1/num2;
        tv.setText(String.valueOf(x));
    }
}
