package com.example.parcial1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button button = (Button)findViewById(R.id.entrar);
        // Register the onClick listener with the implementation above
        button.setOnClickListener();
    }
}