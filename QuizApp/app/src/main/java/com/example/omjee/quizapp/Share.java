package com.example.omjee.quizapp;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Share extends AppCompatActivity {
    String marks;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        TextView textView=(TextView)findViewById(R.id.Text_view_marks);
         marks = getIntent().getStringExtra("m");
         name = getIntent().getStringExtra("n");
        textView.setText(marks + name);
        if(Integer.parseInt(marks)<=3){
            textView.setText("You need Practice "  + name + " because You scored : " +marks +" marks");
        }
        if (Integer.parseInt(marks)>=3){
            textView.setText("You are great "  + name + " because You scored : " +marks +" marks");
        }
        if (Integer.parseInt(marks)>=7){
            textView.setText("Woahh!! You are awesome "  + name + " because You scored : " +marks +" marks");
        }
    }
    public void share(View view){
        Intent intent=new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT,"I just completed a IT quiz made by omjee shukla and scored " + Integer.parseInt(marks) + " marks. Wanna give it a try");
        intent.setType("text/plain");
        startActivity(intent);
    }
}
