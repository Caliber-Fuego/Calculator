package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    EditText var1txt, var2txt; //declared the edtText boxes
    Button btnAdd, btnSubtract, btnMultiply, btnDivide, btnModulo; //declared the buttons
    TextView answerTxt;
    double variable1, variable2;

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

        //On Click Listener is responsible for listening to the clicks
        btnAdd.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnModulo.setOnClickListener(this);

        //Answer Display
        answerTxt = findViewById(R.id.textAnswer);





    }
    @Override
    public void onClick(View v){

        //Text Boxes
        var1txt = findViewById(R.id.editTextNumberFirstVar);
        var2txt = findViewById(R.id.editTextNumberSecondVar);

        variable1 = Double.parseDouble(String.valueOf(var1txt.getText()));
        variable2 = Double.parseDouble(String.valueOf(var2txt.getText()));


        switch (v.getId()) {
            case R.id.buttonadd:
                answerTxt.setText(Double.toString(variable1 + variable2));
                break;
            case R.id.buttonsubtract:
                answerTxt.setText(Double.toString(variable1 - variable2));
                break;
            case R.id.buttonmultiply:
                answerTxt.setText(Double.toString(variable1 * variable2));
                break;
            case R.id.buttondivide:
                answerTxt.setText(Double.toString(variable1 / variable2));
                break;
            case R.id.buttondivide2:
                answerTxt.setText(Double.toString(variable1 % variable2));
                break;

        }
    }
}