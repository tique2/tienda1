package com.example.parcial1.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class DbHelperlogin extends SQLiteOpenHelper {
    private static final int DATAVASE_VERSION=1;
    private static final String DATAVASE_NAME="login.db";
    public static final String DATAVASE_TABLE_login="login";
    public static final String DATAVASE_TABLE_productos="productos";
    public DbHelperlogin(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATAVASE_NAME, null, DATAVASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase dblogin) {
        dblogin.execSQL("create table "+DATAVASE_TABLE_login+"(" +
                "id integer primary key autoincrement," +
                "usuario text not null," +
                "Password text not null)");
    }
    public void onGuardar(SQLiteDatabase guardar){
        guardar.execSQL("UPDATE "+DATAVASE_TABLE_login);
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table "+DATAVASE_TABLE_login);
        onCreate(sqLiteDatabase);
    }
}