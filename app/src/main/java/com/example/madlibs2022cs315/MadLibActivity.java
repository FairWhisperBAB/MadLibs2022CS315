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

        String[] messages = intent.getStringArrayExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        textView = findViewById(R.id.name_textbox);
        textView.setText(messages[0]);

        textView2 = findViewById(R.id.adjective_textbox);
        textView2.setText(messages[1]);

        textView3 = findViewById(R.id.Verb_textbox);
        textView3.setText(messages[2]);

        textView4 = findViewById(R.id.sillyWord_textbox);
        textView4.setText(messages[3]);

        textView5 = findViewById(R.id.noun_textbox);
        textView5.setText(messages[4]);

        textView6 = findViewById(R.id.nounPlural_textbox);
        textView6.setText(messages[5]);

        textView7 = findViewById(R.id.verbED_textbox);
        textView7.setText(messages[6]);

        textView8 = findViewById(R.id.noun2_textbox);
        textView8.setText(messages[7]);

        textView9 = findViewById(R.id.noun3_textbox);
        textView9.setText(messages[8]);

        textView10 = findViewById(R.id.verbED2_textbox);
        textView10.setText(messages[9]);

        textView11 = findViewById(R.id.adjective2_textbox);
        textView11.setText(messages[10]);
    }
}