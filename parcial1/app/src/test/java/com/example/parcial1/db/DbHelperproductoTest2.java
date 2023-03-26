package com.example.parcial1.db;

import static org.junit.Assert.*;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

import org.junit.Test;

public class DbHelperproductoTest2 extends SQLiteOpenHelper {

    private static final int DATAVASE_VERSION=1;
    private static final String DATAVASE_NAME="producto.db";
    public static final String DATAVASE_TABLE_producto="producto";
    public DbHelperproductoTest2(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATAVASE_NAME, null, DATAVASE_VERSION);
    }

    @Test
    public void onCreate(SQLiteDatabase dbproducto) {
        dbproducto.execSQL("create table "+DATAVASE_TABLE_producto+"(" +
                "id integer primary key autoincrement," +
                "nombre text not null," +
                "cantidad text not null)");
    }

    @Test
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table "+DATAVASE_TABLE_producto);
        onCreate(sqLiteDatabase);
    }

}