package com.example.parcial1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.parcial1.db.DbHelperlogin;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText usuario = findViewById(R.id.usuario);
        EditText password = findViewById(R.id.password);
        Button entrar = findViewById(R.id.entrar);

        entrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                DbHelperlogin DbHelperlogin=new DbHelperlogin(MainActivity.this,"login",null,1);
            }
        });
    }
}