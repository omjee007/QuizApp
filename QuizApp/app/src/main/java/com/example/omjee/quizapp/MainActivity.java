package com.example.omjee.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.name;
import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the user accepts the terms and conditions of Quiz app
     **/
    public void checkBox_validation(View view) {
        EditText name_editText = (EditText) findViewById(R.id.name_editText);
        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox_instructions);
        Boolean checkBoxChecked = checkBox.isChecked();
        EditText ageText = (EditText) findViewById(R.id.age_editText);

        /**
         * Here the ageText variable is parsed to int so that the value must be compared to the Condition Flow statement using int condition checks
         * Then an intent is passed if the checkBox is checked and the age is within the limits of condition
         * In else statement Toast are printed so that user may know which conditions are executing wrong
         **/

        //This block checks the field if someone does not enters the name or age

        if (name_editText.getText().toString().equals("") || ageText.getText().toString().equals("")) {
            Toast.makeText(this, "Please enter the text in name and age fields", Toast.LENGTH_SHORT).show();
        } else {

            //if the age and the name are entered then this statement check for the limited age

            if (Integer.parseInt(ageText.getText().toString()) >= 1 && Integer.parseInt(ageText.getText().toString()) <= 120) {

                //This block executes when the age is in with limited variables and sees if the checkBox is ticked or not

                if (checkBoxChecked) {

                    //if the checkBox is ticked then the data with name is passed through intent to another activity

                    Intent intent = new Intent(getBaseContext(), quizes.class);
                    intent.putExtra("name", name_editText.getText().toString());
                    startActivity(intent);

                    // If the Box is not checked then the following else statement is executed

                } else {
                    Toast.makeText(this, "Please check the box to continue", Toast.LENGTH_SHORT).show();
                }
                // If the age is not within the limited boundaries then the following block is executed

            } else {
                Toast.makeText(this, "Please enter the Correct age", Toast.LENGTH_SHORT).show();
            }
        }
    }
}

