package com.example.tute02;
//IntentsProj

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_Number1 = "com.example.tute02.Numbe1 ";
    public static final String EXTRA_Number2 = "com.example.tute02.Numbe2 ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendNumbers(View view){
        Intent intent = new Intent(this,Activity2.class);
        EditText numberOne =(EditText) findViewById(R.id.etxtN1);
        EditText numberTwo =(EditText) findViewById(R.id.etxtN2);
        String n1 =numberOne.getText().toString();
        String n2 = numberTwo.getText().toString();
        intent.putExtra(EXTRA_Number1,n1);
        intent.putExtra(EXTRA_Number2,n2);
        startActivity(intent);

    }
}
