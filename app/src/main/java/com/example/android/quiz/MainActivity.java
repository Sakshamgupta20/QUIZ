package com.example.android.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int count=0;
    public void submit(View view)
    {


        RadioButton radio2 = (RadioButton) findViewById(R.id.radio2);
        RadioButton radio7 = (RadioButton)findViewById(R.id.radio7);
        RadioButton radio9 = (RadioButton)findViewById(R.id.radio9);
        RadioButton radio14= (RadioButton)findViewById(R.id.radio14);
        RadioButton radio18= (RadioButton)findViewById(R.id.radio18);



        if(radio2.isChecked())
        {
            count++;
        }


        if(radio7.isChecked())
        {
            count++;
        }

        if(radio9.isChecked())
        {
            count++;
        }
        if(radio14.isChecked())
        {
            count++;
        }
        if(radio18.isChecked())
        {
            count++;
        }


        displayMessage("Your Score is "+count);
        count=0;
    }
    public void restart(View view)
    {
        count=0;
        RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.radiogroup1);
        radioGroup1.clearCheck();
        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.radiogroup2);
        radioGroup2.clearCheck();
        RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.radiogroup3);
        radioGroup3.clearCheck();
        RadioGroup radioGroup4 = (RadioGroup) findViewById(R.id.radiogroup4);
        radioGroup4.clearCheck();
        RadioGroup radioGroup5 = (RadioGroup) findViewById(R.id.radiogroup5);
        radioGroup5.clearCheck();


        displayMessage("");
    }

    public void displayMessage(String message) {
        TextView score = (TextView) findViewById(R.id.score);
        score.setText(message);
    }
}
