package com.example.parcial1;

import static org.junit.Assert.*;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.parcial1.db.DbHelperlogin;

import org.junit.Test;

public class MainActivityTest4 extends AppCompatActivity {

    @Test
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText usuario = findViewById(R.id.usuario);
        EditText password = findViewById(R.id.password);
        Button entrar = findViewById(R.id.entrar);

        entrar.setOnClickListener(new View.OnClickListener() {

            @Test
            public void onClick(View v) {
                DbHelperlogin DbHelperlogin=new DbHelperlogin(MainActivityTest4.this,"login",null,1);
            }
        });
    }
}