package com.example.madlibs2022cs315;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static String EXTRA_MESSAGE = "1";
//    public static String EXTRA_MESSAGE2 = "2";
//    public static String EXTRA_MESSAGE3 = "3";
//    public static String EXTRA_MESSAGE4 = "4";
//    public static String EXTRA_MESSAGE5 = "5";
//    public static String EXTRA_MESSAGE6 = "6";
//    public static String EXTRA_MESSAGE7 = "7";
//    public static String EXTRA_MESSAGE8 = "8";
//    public static String EXTRA_MESSAGE9 = "9";
//    public static String EXTRA_MESSAGE10 = "10";
//    public static String EXTRA_MESSAGE11 = "11";

    Intent intent;
    Intent intent2;
    Intent intent3;
    Intent intent4;
    Intent intent5;
    Intent intent6;
    Intent intent7;
    Intent intent8;
    Intent intent9;
    Intent intent10;
    Intent intent11;

    String[] messages = new String[11];
    
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
        messages[0] = name_text.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, messages);

//        intent2 = new Intent(this, MadLibActivity.class);
        EditText adjective_text = (EditText) findViewById(R.id.editTextTextPersonName2);
        messages[1] = adjective_text.getText().toString();
//        intent2.putExtra(EXTRA_MESSAGE, message2);
//
//        intent3 = new Intent(this, MadLibActivity.class);
        EditText verb_text = (EditText) findViewById(R.id.editTextTextPersonName3);
        messages[2] = verb_text.getText().toString();
//        intent3.putExtra(EXTRA_MESSAGE, message3);
//
//        intent4 = new Intent(this, MadLibActivity.class);
        EditText sillyWord_text = (EditText) findViewById(R.id.editTextTextPersonName4);
        messages[3] = sillyWord_text.getText().toString();
//        intent4.putExtra(EXTRA_MESSAGE, message4);
//
//        intent5 = new Intent(this, MadLibActivity.class);
        EditText noun_text = (EditText) findViewById(R.id.editTextTextPersonName5);
        messages[4] = noun_text.getText().toString();
//        intent5.putExtra(EXTRA_MESSAGE, message5);
//
//        intent6 = new Intent(this, MadLibActivity.class);
        EditText nounPlural_text = (EditText) findViewById(R.id.editTextTextPersonName6);
        messages[5] = nounPlural_text.getText().toString();
//        intent6.putExtra(EXTRA_MESSAGE, message6);
//
//        intent7 = new Intent(this, MadLibActivity.class);
        EditText verbED_text = (EditText) findViewById(R.id.editTextTextPersonName7);
        messages[6] = verbED_text.getText().toString();
//        intent7.putExtra(EXTRA_MESSAGE, message7);
//
//        intent8 = new Intent(this, MadLibActivity.class);
        EditText noun2_text = (EditText) findViewById(R.id.editTextTextPersonName8);
        messages[7] = noun2_text.getText().toString();
//        intent8.putExtra(EXTRA_MESSAGE, message8);
//
//        intent9 = new Intent(this, MadLibActivity.class);
        EditText noun3_text = (EditText) findViewById(R.id.editTextTextPersonName9);
        messages[8] = noun3_text.getText().toString();
//        intent9.putExtra(EXTRA_MESSAGE, message9);
//
//        intent10 = new Intent(this, MadLibActivity.class);
        EditText verbED2_text = (EditText) findViewById(R.id.editTextTextPersonName10);
        messages[9] = verbED2_text.getText().toString();
//        intent10.putExtra(EXTRA_MESSAGE, message10);
//
//        intent11 = new Intent(this, MadLibActivity.class);
        EditText adjective2_text = (EditText) findViewById(R.id.editTextTextPersonName11);
        messages[10] = adjective2_text.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, messages);

        startActivity(intent);
//        startActivity(intent2);
//        startActivity(intent3);
//        startActivity(intent4);
//        startActivity(intent5);
//        startActivity(intent6);
//        startActivity(intent7);
//        startActivity(intent8);
//        startActivity(intent9);
//        startActivity(intent10);
//        startActivity(intent11);
    }

}