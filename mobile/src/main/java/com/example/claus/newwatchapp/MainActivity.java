package com.example.claus.newwatchapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView mTextView;
    private TextView mobileTextView;
    private Button myButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.text);
        mobileTextView = (TextView) findViewById(R.id.mobileTextView);
        Button myButton = (Button) findViewById(R.id.button2);

    }

    public void pullString(View view){
        //String watchMessage = mTextView.getText().toString();
        //mobileTextView.setText(watchMessage);
    }
}
