package com.example.parcial1;

import static org.junit.Assert.*;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.parcial1.db.DbHelperproducto;

import org.junit.Test;

public class hemeTest3 extends AppCompatActivity {
    @Test
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heme);

        EditText nombre = findViewById(R.id.nombre);
        EditText cantidad = findViewById(R.id.cantidad);
        Button guardar = findViewById(R.id.guardar);

        guardar.setOnClickListener(new View.OnClickListener() {

            @Test
            public void onClick(View v) {
                DbHelperproducto DbHelperproducto = new DbHelperproducto(hemeTest3.this, "login", null, 1);
            }
        });
    }
}