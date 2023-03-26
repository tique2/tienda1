package com.example.parcial1.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class DbHelperproducto extends SQLiteOpenHelper {
    private static final int DATAVASE_VERSION=1;
    private static final String DATAVASE_NAME="producto.db";
    public static final String DATAVASE_TABLE_producto="producto";
    public DbHelperproducto(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATAVASE_NAME, null, DATAVASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase dbproducto) {
        dbproducto.execSQL("create table "+DATAVASE_TABLE_producto+"(" +
                "id integer primary key autoincrement," +
                "nombre text not null," +
                "cantidad text not null)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
