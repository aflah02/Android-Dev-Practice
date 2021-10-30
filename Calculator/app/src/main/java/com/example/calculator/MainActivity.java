package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button addButton;
    private Button subtractButton;
    private Button multiplyButton;
    private Button divideButton;
    private EditText firstNum;
    private EditText secondNum;
    private TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addButton = findViewById(R.id.addButton);
        subtractButton = findViewById(R.id.subtractButton);
        divideButton = findViewById(R.id.divideButton);
        multiplyButton = findViewById(R.id.multiplyButton);
        firstNum = findViewById(R.id.firstNum);
        secondNum = findViewById(R.id.secondNum);
        output = findViewById(R.id.output);
    }
    public void add(View view){
        String s1 = firstNum.getText().toString();
        double d1 = Double.parseDouble(s1);
        String s2 = secondNum.getText().toString();
        double d2 = Double.parseDouble(s2);
        double d3 = d1 + d2;
        output.setText("The sum is " + d3);
    }
    public void subtract(View view){
        String s1 = firstNum.getText().toString();
        double d1 = Double.parseDouble(s1);
        String s2 = secondNum.getText().toString();
        double d2 = Double.parseDouble(s2);
        double d3 = d1 - d2;
        output.setText("The Difference is " + d3);
    }
    public void multiply(View view){
        String s1 = firstNum.getText().toString();
        double d1 = Double.parseDouble(s1);
        String s2 = secondNum.getText().toString();
        double d2 = Double.parseDouble(s2);
        double d3 = d1 * d2;
        output.setText("The Product is " + d3);
    }
    public void divide(View view){
        String s1 = firstNum.getText().toString();
        double d1 = Double.parseDouble(s1);
        String s2 = secondNum.getText().toString();
        double d2 = Double.parseDouble(s2);
        double d3 = d1 / d2;
        output.setText("The Result is " + d3);
    }
}