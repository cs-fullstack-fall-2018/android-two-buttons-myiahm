package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView showCount1;
    private TextView showCount2;
    private int count1=0;
    private int count2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCount1 = (TextView) findViewById(R.id.couter1);
        showCount2 = (TextView) findViewById(R.id.counter2);



    }

    public void showCount(View view) {
        ++count1;
        if (showCount1 != null)
            showCount1.setText(Integer.toString(count1));
    }


    public void showCount2(View view) {
        ++count2;
        if (showCount2 != null)
            showCount2.setText(Integer.toString(count2));
    }


    public void Reset(View view) {
        count1=0;
        count2=0;
    }
}
