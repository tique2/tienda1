package com.example.parcial1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.parcial1.db.DbHelperlogin;
import com.example.parcial1.db.DbHelperproducto;

public class heme extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heme);

        EditText nombre = findViewById(R.id.nombre);
        EditText cantidad = findViewById(R.id.cantidad);
        Button guardar = findViewById(R.id.guardar);

        guardar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                DbHelperproducto DbHelperproducto = new DbHelperproducto(heme.this, "login", null, 1);
            }
        });
    }
}