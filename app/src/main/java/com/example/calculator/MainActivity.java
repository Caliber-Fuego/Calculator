package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    EditText var1txt, var2txt; //declared the edtText boxes
    Button btnAdd, btneql, btnclear, btnSubtract, btnMultiply, btnDivide, btnModulo, digit0, digit1, digit2, digit3, digit4, digit5, digit6, digit7, digit8, digit9; //declared the buttons
    TextView answerTxt, test;
    String operator;
    double variable1, variable2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Buttons
        btnAdd = findViewById(R.id.buttonadd);
        btnSubtract = findViewById(R.id.buttonsubtract);
        btnMultiply = findViewById(R.id.buttonmultiply);
        btnDivide = findViewById(R.id.buttondivide);
        btnModulo = findViewById(R.id.buttondivide2);
        btneql = findViewById(R.id.equbtn);
        btnclear = findViewById(R.id.clearbtn);
        digit0 = findViewById(R.id.digit_0);
        digit1 = findViewById(R.id.digit_1);
        digit2 = findViewById(R.id.digit_2);
        digit3 = findViewById(R.id.digit_3);
        digit4 = findViewById(R.id.digit_4);
        digit5 = findViewById(R.id.digit_5);
        digit6 = findViewById(R.id.digit_6);
        digit7 = findViewById(R.id.digit_7);
        digit8 = findViewById(R.id.digit_8);
        digit9 = findViewById(R.id.digit_9);


        //On Click Listener is responsible for listening to the clicks
        btnAdd.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnModulo.setOnClickListener(this);
        btneql.setOnClickListener(this);
        btnclear.setOnClickListener(this);
        digit0.setOnClickListener(this);
        digit1.setOnClickListener(this);
        digit2.setOnClickListener(this);
        digit3.setOnClickListener(this);
        digit4.setOnClickListener(this);
        digit5.setOnClickListener(this);
        digit6.setOnClickListener(this);
        digit7.setOnClickListener(this);
        digit8.setOnClickListener(this);
        digit9.setOnClickListener(this);
    }


    public void varAdd(){
        variable1 = Double.parseDouble(String.valueOf(var1txt.getText()));
        operator = "+";
        var1txt.setText("0");
    }
    public void varSub(){
        variable1 = Double.parseDouble(String.valueOf(var1txt.getText()));
        operator = "-";
        var1txt.setText("0");
    }
    public void varMult(){
        variable1 = Double.parseDouble(String.valueOf(var1txt.getText()));
        operator = "*";
        var1txt.setText("0");
    }
    public void varDiv(){
        variable1 = Double.parseDouble(String.valueOf(var1txt.getText()));
        operator = "/";
        var1txt.setText("0");
    }
    public void varModulo(){
        variable1 = Double.parseDouble(String.valueOf(var1txt.getText()));
        operator = "%";
        var1txt.setText("0");
    }
    public void varResult(){
        variable2 = Double.parseDouble(String.valueOf(var1txt.getText()));
        switch (operator){
            case"+":
                result = variable1+variable2;
                var1txt.setText("0");
                break;
            case"-":
                result = variable1-variable2;
                var1txt.setText("0");
                break;
            case"*":
                result = variable1*variable2;
                var1txt.setText("0");
                break;
            case"/":
                result = variable1/variable2;
                var1txt.setText("0");
                break;
            case"%":
                result = variable1%variable2;
                var1txt.setText("0");
                break;
        }
        var1txt.setText(String.valueOf(result));
    }
    public void varClear(){
        var1txt.setText("0");
    }

    @Override
    public void onClick(View v){
        //Text Boxes
        var1txt = findViewById(R.id.editTextNumberFirstVar);
        var1txt.setEnabled(false);

        switch (v.getId()) {
            case R.id.buttonadd:
                varAdd();
                break;
            case R.id.buttonsubtract:
                varSub();
                break;
            case R.id.buttonmultiply:
                varMult();
                break;
            case R.id.buttondivide:
                varDiv();
                break;
            case R.id.buttondivide2:
                varModulo();
                break;
            case R.id.equbtn:
                varResult();
                break;
            case R.id.clearbtn:
                varClear();
                break;
            case R.id.digit_0:
                int i = 0;
                var1txt.setText(var1txt.getText()+String.valueOf(i));
                break;
            case R.id.digit_1:
                i = 1;
                var1txt.setText(var1txt.getText()+String.valueOf(i));
                break;
            case R.id.digit_2:
                i = 2;
                var1txt.setText(var1txt.getText()+String.valueOf(i));
                break;
            case R.id.digit_3:
                i = 3;
                var1txt.setText(var1txt.getText()+String.valueOf(i));
                break;
            case R.id.digit_4:
                i = 4;
                var1txt.setText(var1txt.getText()+String.valueOf(i));
                break;
            case R.id.digit_5:
                i = 5;
                var1txt.setText(var1txt.getText()+String.valueOf(i));
                break;
            case R.id.digit_6:
                i = 6;
                var1txt.setText(var1txt.getText()+String.valueOf(i));
                break;
            case R.id.digit_7:
                i = 7;
                var1txt.setText(var1txt.getText()+String.valueOf(i));
                break;
            case R.id.digit_8:
                i = 8;
                var1txt.setText(var1txt.getText()+String.valueOf(i));
                break;
            case R.id.digit_9:
                i = 9;
                var1txt.setText(var1txt.getText()+String.valueOf(i));
                break;
        }
    }



}
