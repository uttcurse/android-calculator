package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText first_number, second_number;
    TextView result;
    Button plus, minus, multiply, divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first_number = findViewById(R.id.first_number);
        second_number = findViewById(R.id.second_number);
        result = findViewById(R.id.result);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);

        plus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int first, second, ans;
                first = Integer.parseInt(first_number.getText().toString());
                second = Integer.parseInt(second_number.getText().toString());
                ans=first+second;
                result.setText("Result: "+ans);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int first, second, ans;
                first = Integer.parseInt(first_number.getText().toString());
                second = Integer.parseInt(second_number.getText().toString());
                ans=first-second;
                result.setText("Result: "+ans);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int first, second, ans;
                first = Integer.parseInt(first_number.getText().toString());
                second = Integer.parseInt(second_number.getText().toString());
                ans=first*second;
                result.setText("Result: "+ans);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int first, second, ans;
                first = Integer.parseInt(first_number.getText().toString());
                second = Integer.parseInt(second_number.getText().toString());
                ans=first/second;
                result.setText("Result: "+ans);
            }
        });
    }
}