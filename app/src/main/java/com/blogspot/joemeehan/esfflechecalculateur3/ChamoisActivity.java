package com.blogspot.joemeehan.esfflechecalculateur3;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.view.View.OnClickListener;

public class ChamoisActivity extends AppCompatActivity {

    EditText tempsbase;
    EditText handicap;
    EditText temps;
    TextView tempsref;
    TextView or, vermeil, argent, bronze, cabri, skiopen;
    Button CalcChamois;

    Double num1,num2,num3,sum, sum1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chamois);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Chamois Calculator

        tempsbase = (EditText)findViewById(R.id.editText);
        handicap = (EditText)findViewById(R.id.editText2);
        tempsref = (TextView)findViewById(R.id.editText3);
        or = (TextView)findViewById(R.id.editText4);
        vermeil = (TextView)findViewById(R.id.editText5);
        argent = (TextView)findViewById(R.id.editText6);
        bronze = (TextView)findViewById(R.id.editText7);
        cabri = (TextView)findViewById(R.id.editText8);
        temps = (EditText)findViewById(R.id.editText9);
        skiopen = (TextView)findViewById(R.id.editText11);
        CalcChamois = (Button)findViewById(R.id.button);

        CalcChamois.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {

                num1 = Double.parseDouble(tempsbase.getText().toString());
                num2 = Double.parseDouble(handicap.getText().toString());
                sum = num1 / (1+num2/100);
                tempsref.setText(String.format("%.2f",sum));
                sum1 = sum*(1.17);
                or.setText(String.format("%.2f",sum1));
                sum1 = sum*(1.35);
                vermeil.setText(String.format("%.2f",sum1));
                sum1 = sum*(1.55);
                argent.setText(String.format("%.2f",sum1));
                sum1 = sum*(1.75);
                bronze.setText(String.format("%.2f",sum1));
                sum1 = sum*(1.80);
                cabri.setText(String.format("%.2f",sum1));
                if(!temps.getText().toString().equals("")){
                    num3 = Double.parseDouble(temps.getText().toString());
                    sum1 = (num3/sum-1)*100;
                    skiopen.setText(String.format("%.2f",sum1));
                }




            }
        });

    }

}
