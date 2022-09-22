package com.example.madlibs2022cs315;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MadLibActivity extends AppCompatActivity {

    TextView textView;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;
    TextView textView8;
    TextView textView9;
    TextView textView10;
    TextView textView11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_lib);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        Intent intent2 = getIntent();
        Intent intent3 = getIntent();
        Intent intent4 = getIntent();
        Intent intent5 = getIntent();
        Intent intent6 = getIntent();
        Intent intent7 = getIntent();
        Intent intent8 = getIntent();
        Intent intent9 = getIntent();
        Intent intent10 = getIntent();
        Intent intent11 = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String message2 = intent2.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String message3 = intent3.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String message4 = intent4.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String message5 = intent5.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String message6 = intent6.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String message7 = intent7.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String message8 = intent8.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String message9 = intent9.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String message10 = intent10.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String message11 = intent11.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        textView = findViewById(R.id.name_textbox);
        textView.setText(message);

        textView2 = findViewById(R.id.adjective_textbox);
        textView2.setText(message2);

        textView3 = findViewById(R.id.Verb_textbox);
        textView3.setText(message3);

        textView4 = findViewById(R.id.sillyWord_textbox);
        textView4.setText(message4);

        textView5 = findViewById(R.id.noun_textbox);
        textView5.setText(message5);

        textView6 = findViewById(R.id.nounPlural_textbox);
        textView6.setText(message6);

        textView7 = findViewById(R.id.verbED_textbox);
        textView7.setText(message7);

        textView8 = findViewById(R.id.noun2_textbox);
        textView8.setText(message8);

        textView9 = findViewById(R.id.noun3_textbox);
        textView9.setText(message9);

        textView10 = findViewById(R.id.verbED2_textbox);
        textView10.setText(message10);

        textView11 = findViewById(R.id.adjective2_textbox);
        textView11.setText(message11);
    }
}