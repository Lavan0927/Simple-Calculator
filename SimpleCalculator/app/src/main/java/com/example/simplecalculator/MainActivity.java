package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText fnum;
    private EditText snum;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fnum=findViewById(R.id.txtNum1);
        snum=findViewById(R.id.txtNum2);
        add=findViewById(R.id.addButton);
        sub=findViewById(R.id.subButton);
        mul=findViewById(R.id.mulButton);
        div=findViewById(R.id.divButton);
        ans=findViewById(R.id.txtResult);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1=Integer.parseInt(fnum.getText().toString());
                float num2=Integer.parseInt(snum.getText().toString());
                float result=num1+num2;
                ans.setText("Result: " +result);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1=Integer.parseInt(fnum.getText().toString());
                float num2=Integer.parseInt(snum.getText().toString());
                float result=num1-num2;
                ans.setText("Result: " +result);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1=Integer.parseInt(fnum.getText().toString());
                float num2=Integer.parseInt(snum.getText().toString());
                float result=num1*num2;
                ans.setText("Result: " +result);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1=Integer.parseInt(fnum.getText().toString());
                float num2=Integer.parseInt(snum.getText().toString());
                float result=num1/num2;
                ans.setText("Result: " +result);
            }
        });


    }
}