package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText1, editText2;
    TextView resultview;
    Double num1,num2,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=findViewById(R.id.num1EditTextid);
        editText2=findViewById(R.id.num2EditTextid);
        resultview=findViewById(R.id.resultTextviewID);
    }

    public void addFunction(View view) {
        num1=Double.parseDouble(editText1.getText().toString());
        num2=Double.parseDouble(editText2.getText().toString());
        result=num1+num2;
        resultview.setText(""+result);
    }

    public void subFunction(View view) {
        num1=Double.parseDouble(editText1.getText().toString());
        num2=Double.parseDouble(editText2.getText().toString());
        result=num1-num2;
        resultview.setText(""+result);
    }

    public void mulFunction(View view) {
        num1=Double.parseDouble(editText1.getText().toString());
        num2=Double.parseDouble(editText2.getText().toString());
        result=num1*num2;
        resultview.setText(""+result);
    }

    public void divFunction(View view) {
        num1=Double.parseDouble(editText1.getText().toString());
        num2=Double.parseDouble(editText2.getText().toString());
        result=num1/num2;
        resultview.setText(""+result);
    }
}