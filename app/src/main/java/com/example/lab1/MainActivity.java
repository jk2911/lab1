package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.lab1.text.TextFunctionRename;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int count = 0; count < 10; count++) {
            Log.d("MainActivity", "counter = " + count);
        }
        displayText();
    }

    private void displayText() {
        TextFunctionRename tf = new TextFunctionRename();
        TextView tv = findViewById(R.id .maxim);
        tv.setText(tf.getValue());
    }
}