package com.example.eli.practiceapp;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


public class PracticeMain extends ActionBarActivity {

    LinearLayout background;
    Button btnGreen, btnBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_main);

        background = (LinearLayout) findViewById(R.id.background);

        btnGreen = (Button) findViewById(R.id.btnGreen);
        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Click button code here
                background.setBackgroundColor(Color.parseColor("#00ff00"));
            }
        });

        btnBlue = (Button) findViewById(R.id.btnBlue);
        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Click button code here
                background.setBackgroundColor(Color.parseColor("#006699"));
            }
        });
    }
}
