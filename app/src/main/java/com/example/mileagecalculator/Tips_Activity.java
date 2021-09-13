package com.example.mileagecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class Tips_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips_);
    }
    public void goToHome(View v){
        Intent goToHome = new Intent();
        goToHome.setClass(this,MainActivity.class);
        startActivity(goToHome);
    }
    public void searchURL(View v){
        WebView webView = (WebView)findViewById(R.id.webView);
        EditText editText_search = (EditText)findViewById(R.id.editText_search);
        Button btn = (Button)findViewById(R.id.button_search);
        String query = editText_search.getText().toString();
        String URL = "https://www.google.com/search?q="+query;
        webView.loadUrl(URL);


    }
}
