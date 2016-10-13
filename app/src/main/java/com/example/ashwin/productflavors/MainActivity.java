package com.example.ashwin.productflavors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextViewHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextViewHome = (TextView) findViewById(R.id.textViewHome);

        mTextViewHome.setText(BuildConfig.HOMESCREEN_TEXT);
    }
}
