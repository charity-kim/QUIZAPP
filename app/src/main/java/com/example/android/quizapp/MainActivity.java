package com.example.android.quizapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   int score;
    RadioGroup radioGroup,radioGroup1,radioGroup2,radioGroup3,radioGroup4;
    private RadioButton radioButton,radioButton1,radioButton2,radioButton3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        selectedRadio();

    }

    public void selectedRadio()
    {
        radioGroup1 = findViewById(R.id.radioGroup1);
        radioGroup2= findViewById(R.id.radioGroup2);
        radioGroup3 = findViewById(R.id.radioGroup3);
        radioGroup4 = findViewById(R.id.radioGroup4);



    }

    
    public void submitScore (View view)
    {
        // get selected radio button from radioGroup
        int selectedId = radioGroup.getCheckedRadioButtonId();

        // find the radiobutton by returned id
        radioButton = (RadioButton) findViewById(selectedId);

        switch (radioButton.getText().toString()) {
            case "Mercury":
                    score += 2;
                break;
            case "jupiter":
                    score += 0;
                break;
            case "mars":
                    score += 0;
                break;
            case "earth":
                    score += 0;
                break;

        }
        radioButton1 = findViewById(selectedId);
        switch (radioButton1.getText().toString()) {
            case "SouthAfrica":
                score += 2;
                break;
            case "Denmark":
                score += 0;
                break;
            case "Europe":
                score += 0;
                break;
            case "Kenya":
                score += 0;
                break;
        }
        radioButton2 = findViewById(selectedId);
        switch (radioButton2.getText().toString()) {
            case "Everest":
                score += 2;
                break;
            case "Mc kinley":
                score += 0;
                break;
            case "Nanga parbat":
                score += 0;
                break;
            case "Kilimanjaro":
                score += 0;
                break;
        }
        radioButton3 = findViewById(selectedId);
        switch (radioButton3.getText().toString()) {
            case "Nile":
                score += 2;
                break;
            case "Amazon":
                score += 0;
                break;
            case "Niger":
                score += 0;
                break;
            case "Amur":
                score += 0;
                break;
        }


        Toast.makeText(this,String.valueOf(score) , Toast.LENGTH_SHORT).show();
        score = 0;
    }

}