package com.example.cipri.fitnesstracker.classes;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Petruta Deac on 1/12/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    private final static int DATABASE_VERSION = 1;
    private final static String DATABASE_NAME = "users.db";
    private final static String TABLE_NAME = "users";
    private final static String COLUMN_ID = "id";
    private final static String COLUMN_NUME = "nume";
    private final static String COLUMN_PRENUME = "prenume";
    private final static String COLUMN_EMAIL = "email";
    private final static String COLUMN_PAROLA = "parola";
    private final static String COLUMN_GREUTATE = "greutate";
    private final static String COLUMN_INALTIME = "inaltime";
    private final static String COLUMN_GEN = "Gen";
    private final static String COLUMN_UTILIZATOR = "nume_utilizator";
    SQLiteDatabase db;


    private static final String createTable = "create table " + TABLE_NAME + "(id integer primary key not null, " + "nume text not null, prenume text not null, " +
            "email text not null, parola text not null, greutate integer not null, inaltime integer not null, gen text not null, " +
            "nume_utilizator text not null)";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(createTable);

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE" + TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);

    }

    public void insertUser(Utilizator u) {
        String query = "SELECT * FROM " + TABLE_NAME;
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        Cursor cursor = db.rawQuery(query, null);
        Integer count = cursor.getCount();
        if (count == null) {
            count = 0;
        }
        values.put(COLUMN_ID, count);
        values.put(COLUMN_NUME, u.getNume());
        values.put(COLUMN_PRENUME, u.getPrenume());
        values.put(COLUMN_EMAIL, u.getEmail());
        values.put(COLUMN_PAROLA, u.getParola());
        values.put(COLUMN_GREUTATE, u.getGreutate());
        values.put(COLUMN_GEN, "FEMININ");
        values.put(COLUMN_INALTIME, u.getInaltime());
        values.put(COLUMN_UTILIZATOR, u.getNumeUtilizator());
        db.insert(TABLE_NAME, null, values);
        db.close();
    }

    public String searchPassword(String user) {

        db = this.getReadableDatabase();
        String query = "Select nume_utilizator, parola from " + TABLE_NAME;
        Cursor cursor = db.rawQuery(query, null);
        String u;
        String p="parola nu s-a gasit";
        if (cursor.moveToFirst())
            do {
               u=cursor.getString(0);
                if (u.equals(user))
                {
                    p=cursor.getString(1);
                    break;
                }
            }
            while (cursor.moveToNext());

            return p;
    }
}