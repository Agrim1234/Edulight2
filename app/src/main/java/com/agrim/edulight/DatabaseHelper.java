package com.agrim.edulight;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;
import android.util.Log;

/**
 * Created by agrim on 24/12/17.
 */

public class DatabaseHelper extends SQLiteOpenHelper{
    Context context1;
    public static final int DATABASE_VERSION=1;
    public static final String DATABASE_NAME="contacts.db";
    public static final String TABLE_NAME="contacts";
    public static final String COLUMN_ID="id";
    public static final String COLUMN_NAME="name";
    public static final String COLUMN_EMAIL="email";
    public static final String COLUMN_UNAME="uname";
    public static final String COLUMN_PASS="pass";
    SQLiteDatabase db;
    public static final String TABLE_CREATE="CREATE TABLE "+ TABLE_NAME+"("+ COLUMN_ID+" INTEGER PRIMARY KEY,"+ COLUMN_NAME+" TEXT,"
            + COLUMN_EMAIL+" TEXT,"+ COLUMN_UNAME+" TEXT,"+ COLUMN_PASS+" TEXT);";
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        Log.e("DATABASE OPERATIONS","Database1 created...");
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TABLE_CREATE);
        this.db=sqLiteDatabase;
        Log.e("DATABASE OPERATIONS","Table1 created...");
    }
    public void insertContact(contact c){
        db=getWritableDatabase();
        ContentValues values=new ContentValues();
        String query="select * from "+TABLE_NAME;
        Cursor cursor=db.rawQuery(query,null);
        int count=cursor.getCount();
        values.put(COLUMN_ID,count);
        values.put(COLUMN_NAME,c.getName());
        values.put(COLUMN_EMAIL,c.getEmail());
        values.put(COLUMN_UNAME,c.getUname());
        values.put(COLUMN_PASS,c.getPass());
        db.insertOrThrow(TABLE_NAME,null,values);
        Log.e("DATABASE OPERATIONS","One row1 inserted...");
    }
    public String searchPass(String uname){
        db=getReadableDatabase();
        String query="select uname,pass from "+TABLE_NAME;
        Cursor cursor=db.rawQuery(query,null);
        String a,b;
        b="not found";
        if (cursor.moveToFirst())
        {
            do {a=cursor.getString(0);
                if (a.equals(uname)){
                    b=cursor.getString(1);
                    break;
                }
            }while (cursor.moveToNext());
        }
        Log.e("DATABSE OPERATIONS","one password returned");
        return b;
    }
    public String searchName(String uname){
        db=getReadableDatabase();
        Cursor cursor1=db.rawQuery("select uname,name from "+TABLE_NAME,null);
        String c,d="not known";
        if (cursor1.moveToFirst())
        {
            do {c=cursor1.getString(0);
                if (c.equals(uname)){
                    d=cursor1.getString(1);
                    break;
                }
            }while (cursor1.moveToNext());
        }
        Log.e("DATABASE OPERATIONS","one name returned");
        return d;
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String query="DROP TABLE IF EXIST "+TABLE_NAME;
        sqLiteDatabase.execSQL(query);
        onCreate(db);
    }
}
