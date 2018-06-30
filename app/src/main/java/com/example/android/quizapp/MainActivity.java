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
    RadioGroup radioGroup;
    private RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        selectedRadio();

    }

    public void selectedRadio()
    {
        radioGroup = findViewById(R.id.radioGroup1);
        radioGroup = findViewById(R.id.radioGroup2);
        radioGroup = findViewById(R.id.radioGroup3);
        radioGroup = findViewById(R.id.radioGroup4);



    }


    /*public void checkButton(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.mercury:
                if (checked)
                    score += 2;
                break;
            case R.id.jupiter:
                if (checked)
                    score += 0;
                break;
            case R.id.mars:
                if (checked)
                    score += 0;
                break;
            case R.id.earth:
                if (checked)
                    score += 0;
                break;

        }

        switch (view.getId()) {
            case R.id.south_africa:
                if (checked)
                    score += 2;
                break;

            case R.id.denmark:
                if (checked)
                    score += 0;
                break;
            case R.id.europe:
                if (checked)
                    score += 0;
                break;
            case R.id.kenya:
                if (checked)
                    score += 0;
                break;
        }

        switch (view.getId()) {
            case R.id.everest:
                if (checked)
                    score += 2;
                break;

            case R.id.mc_kinley:
                if (checked)
                    score += 0;
                break;
            case R.id.nanga_parbat:
                if (checked)
                    score += 0;
                break;
            case R.id.kilimanjaro:
                if (checked)
                    score += 0;
                break;
        }

        switch (view.getId()) {
        case R.id.nile:
            if (checked)
                score += 2;
            break;

        case R.id.amazon:
            if (checked)
                score += 0;
            break;
        case R.id.niger:
            if (checked)
                score += 0;
            break;
        case R.id.amur:
            if (checked)
                score += 0;
            break;
    }


    }
    */

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
        radioButton = (RadioButton) findViewById(selectedId);
        switch (radioButton.getText().toString()) {
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



        Toast.makeText(this,String.valueOf(score) , Toast.LENGTH_SHORT).show();
        score = 0;
    }

}