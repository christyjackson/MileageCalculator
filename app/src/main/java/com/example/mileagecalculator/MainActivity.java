package com.example.mileagecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void gotoMileagecalculator(View v){
        Intent goToMileageCalc = new Intent();
        goToMileageCalc.setClass(this, MileageActivity.class);
        startActivity(goToMileageCalc);
    }

    public void gotoTips(View v){
        Intent goToTips = new Intent();
        goToTips.setClass(this,Tips_Activity.class);
        startActivity(goToTips);
    }
}
