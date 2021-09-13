package com.example.mileagecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MileageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mileage);

    }
    public void goToHome(View v){
        Intent goToHome = new Intent();
        goToHome.setClass(this,MainActivity.class);
        startActivity(goToHome);
    }
    public void calcMileage(View v){
        EditText beforeOdo = (EditText)findViewById(R.id.editText_beforefill);
        EditText fuelInLitres = (EditText)findViewById(R.id.editText_fuelinlitres);
        EditText finalOdo = (EditText)findViewById(R.id.editText_finalOdo);
        double beforeOdoval = Double.valueOf(beforeOdo.getText().toString());
        double fuel = Double.valueOf(fuelInLitres.getText().toString());
        double afterodo = Double.valueOf(finalOdo.getText().toString());
        double mileage = (afterodo - beforeOdoval)/fuel;
        DecimalFormat formatVal = new DecimalFormat("##.##");
        TextView result = (TextView) findViewById(R.id.result);
        result.setText(formatVal.format(mileage));
        Toast.makeText(getApplicationContext(),"Mileage Calculated Succesfully and displayed",Toast.LENGTH_LONG).show();


    }
}
