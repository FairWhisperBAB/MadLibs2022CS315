package com.example.madlibs2022cs315;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static String EXTRA_MESSAGE;
    Intent intent;
    String message;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) 
    {
        
        intent = new Intent(this, MadLibActivity.class);
        EditText name_text = (EditText) findViewById(R.id.editTextTextPersonName);
        message = name_text.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

        intent = new Intent(this, MadLibActivity.class);
        EditText adjective_text = (EditText) findViewById(R.id.editTextTextPersonName2);
        message = adjective_text.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

        intent = new Intent(this, MadLibActivity.class);
        EditText verb_text = (EditText) findViewById(R.id.editTextTextPersonName3);
        message = verb_text.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

        intent = new Intent(this, MadLibActivity.class);
        EditText sillyWord_text = (EditText) findViewById(R.id.editTextTextPersonName4);
        message = sillyWord_text.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

        intent = new Intent(this, MadLibActivity.class);
        EditText noun_text = (EditText) findViewById(R.id.editTextTextPersonName5);
        message = noun_text.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

        intent = new Intent(this, MadLibActivity.class);
        EditText nounPlural_text = (EditText) findViewById(R.id.editTextTextPersonName6);
        message = nounPlural_text.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

        intent = new Intent(this, MadLibActivity.class);
        EditText verbED_text = (EditText) findViewById(R.id.editTextTextPersonName7);
        message = verbED_text.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

        intent = new Intent(this, MadLibActivity.class);
        EditText noun2_text = (EditText) findViewById(R.id.editTextTextPersonName8);
        message = noun2_text.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

        intent = new Intent(this, MadLibActivity.class);
        EditText noun3_text = (EditText) findViewById(R.id.editTextTextPersonName9);
        message = noun3_text.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

        intent = new Intent(this, MadLibActivity.class);
        EditText verbED2_text = (EditText) findViewById(R.id.editTextTextPersonName10);
        message = verbED2_text.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

        intent = new Intent(this, MadLibActivity.class);
        EditText adjective2_text = (EditText) findViewById(R.id.editTextTextPersonName11);
        message = adjective2_text.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

        startActivity(intent);
    }

}