package com.example.madlibs2022cs315;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MadLibActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_lib);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        textView = findViewById(R.id.name_textbox);
        textView.setText(message);

        textView = findViewById(R.id.adjective_textbox);
        textView.setText(message);

        textView = findViewById(R.id.Verb_textbox);
        textView.setText(message);

        textView = findViewById(R.id.sillyWord_textbox);
        textView.setText(message);

        textView = findViewById(R.id.noun_textbox);
        textView.setText(message);

        textView = findViewById(R.id.nounPlural_textbox);
        textView.setText(message);

        textView = findViewById(R.id.verbED_textbox);
        textView.setText(message);

        textView = findViewById(R.id.noun2_textbox);
        textView.setText(message);

        textView = findViewById(R.id.noun3_textbox);
        textView.setText(message);

        textView = findViewById(R.id.verbED2_textbox);
        textView.setText(message);

        textView = findViewById(R.id.adjective2_textbox);
        textView.setText(message);
    }
}