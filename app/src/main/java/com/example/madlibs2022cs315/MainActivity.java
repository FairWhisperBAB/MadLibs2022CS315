package com.example.madlibs2022cs315;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static String EXTRA_MESSAGE = "1";

    Intent intent;

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


        EditText adjective_text = (EditText) findViewById(R.id.editTextTextPersonName2);
        messages[1] = adjective_text.getText().toString();

//

        EditText verb_text = (EditText) findViewById(R.id.editTextTextPersonName3);
        messages[2] = verb_text.getText().toString();

//

        EditText sillyWord_text = (EditText) findViewById(R.id.editTextTextPersonName4);
        messages[3] = sillyWord_text.getText().toString();

//

        EditText noun_text = (EditText) findViewById(R.id.editTextTextPersonName5);
        messages[4] = noun_text.getText().toString();

//

        EditText nounPlural_text = (EditText) findViewById(R.id.editTextTextPersonName6);
        messages[5] = nounPlural_text.getText().toString();

//

        EditText verbED_text = (EditText) findViewById(R.id.editTextTextPersonName7);
        messages[6] = verbED_text.getText().toString();

//

        EditText noun2_text = (EditText) findViewById(R.id.editTextTextPersonName8);
        messages[7] = noun2_text.getText().toString();

//

        EditText noun3_text = (EditText) findViewById(R.id.editTextTextPersonName9);
        messages[8] = noun3_text.getText().toString();

//

        EditText verbED2_text = (EditText) findViewById(R.id.editTextTextPersonName10);
        messages[9] = verbED2_text.getText().toString();

//

        EditText adjective2_text = (EditText) findViewById(R.id.editTextTextPersonName11);
        messages[10] = adjective2_text.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, messages);

        startActivity(intent);

    }

}