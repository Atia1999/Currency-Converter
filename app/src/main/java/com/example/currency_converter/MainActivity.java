package com.example.currency_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    Button btnCalculate,btnClear;
    EditText edtAmount;
    RadioButton rdUSDtoBDT,rdBDTtoUSD,rdINRtoUSD;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCalculate=findViewById(R.id.btnCalculate);
        btnClear=findViewById(R.id.btnClear);
        edtAmount=findViewById(R.id.edTxt);
        rdUSDtoBDT=findViewById(R.id.rdUSDtoBDT);
        rdBDTtoUSD=findViewById(R.id.rdBDTtoUSD);
        rdINRtoUSD=findViewById(R.id.rdINRtoUSD);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double input=new Double(edtAmount.getText().toString());
                if(rdUSDtoBDT.isChecked()){
                    double result=ConvertCurrencyy.usdBDT(input);
                    edtAmount.setText(new Double(result).toString());
                }
                else  if(rdBDTtoUSD.isChecked()){
                    double result=ConvertCurrencyy.bdtUSD(input);
                    edtAmount.setText(new Double(result).toString());
                }
                else  if(rdINRtoUSD.isChecked()){
                    double result=ConvertCurrencyy.inrUSD(input);
                    edtAmount.setText(new Double(result).toString());
                }
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtAmount.setText("");
            }
        });
    }
}