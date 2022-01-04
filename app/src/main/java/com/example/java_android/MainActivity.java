package com.example.java_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textview);

//        public void clickedOne(View view) {
//            primaryTextView.setText(primaryTextView.getText() + "1");
//        }


    }
    public  void one(View view){
        textView.setText(textView.getText()+"1");
    }
    public  void two(View view){
        textView.setText(textView.getText()+"2");
    }
    public  void three(View view){
        textView.setText(textView.getText()+"3");
    }
    public  void four(View view){
        textView.setText(textView.getText()+"4");
    }
    public  void five(View view){
        textView.setText(textView.getText()+"5");
    }
    public  void six(View view){
        textView.setText(textView.getText()+"6");
    }
    public  void seven(View view){
        textView.setText(textView.getText()+"7");
    }
    public  void eight(View view){
        textView.setText(textView.getText()+"8");
    }
    public  void nine(View view){
        textView.setText(textView.getText()+"9");
    }
}