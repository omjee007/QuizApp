package com.example.omjee.quizapp;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;



public class quizes extends AppCompatActivity {
    int marks;
    String names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizes);
        names = getIntent().getStringExtra("name");
        TextView name_var = (TextView) findViewById(R.id.welcome_message);
        name_var.setText("WELCOME  " + names);
    }

    /**
     * This method is called when the user submits the quiz
     */
    public void checks(View view) {
        RadioButton jetbrains = (RadioButton) findViewById(R.id.jetBrains_true);
        RadioButton operatingSystem = (RadioButton) findViewById(R.id.os_true);
        RadioButton virus = (RadioButton) findViewById(R.id.virus_true);
        RadioButton windowsVersion = (RadioButton) findViewById(R.id.windows_true);
        RadioButton smps = (RadioButton) findViewById(R.id.smps_true);
        RadioButton ramSupport = (RadioButton) findViewById(R.id.ram_true);
        RadioButton gradle = (RadioButton) findViewById(R.id.gradle_true);
        RadioButton server = (RadioButton) findViewById(R.id.server_true);
        EditText google_founder = (EditText) findViewById(R.id.google_founderTrue);
        EditText language_support = (EditText) findViewById(R.id.java_symbolTrue);
        if (jetbrains.isChecked()) {
            marks = marks + 1;
        }
        if (operatingSystem.isChecked()) {
            marks = marks + 1;
        }
        if (virus.isChecked()) {
            marks = marks + 1;
        }
        if (windowsVersion.isChecked()) {
            marks = marks + 1;
        }
        if (smps.isChecked()) {
            marks = marks + 1;
        }
        if (ramSupport.isChecked()) {
            marks = marks + 1;
        }
        if (gradle.isChecked()) {
            marks = marks + 1;
        }
        if (server.isChecked()) {
            marks = marks + 1;
        }
        if (google_founder.getText().toString().equalsIgnoreCase("Larry page")) {
            marks = marks + 1;
        }
        if (language_support.getText().toString().equalsIgnoreCase("python")) {
            marks = marks + 1;
        }
        Intent intent=new Intent(getApplicationContext(),Share.class);
        intent.putExtra("m",String.valueOf(marks));
        intent.putExtra("n",names);
        startActivity(intent);
    }
}
