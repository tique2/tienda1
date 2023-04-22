package com.example.parcial1.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelperProducto extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "parcial1.db";
    private static final int DATABASE_VERSION = 1;

    public DbHelperProducto(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE productos (_id INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT, cantidad TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Aquí puedes agregar código para actualizar la base de datos
    }
}