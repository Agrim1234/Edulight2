package com.agrim.edulight;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by agrim on 28/12/17.
 */

public class Databasehelper1 extends SQLiteOpenHelper {
    Context context1;
    public static final int DATABASE_VERSION=1;
    public static final String DATABASE_NAME="like1.db";
    public static final String TABLE_NAME="like1";
    public static final String COLUMN_ID="id";
    public static final String COLUMN_NAME="name";
    public static final String COLUMN_NUMBER="number";
    SQLiteDatabase db;
    public static final String TABLE_CREATE=" CREATE TABLE " + TABLE_NAME + " (" + COLUMN_ID + " INTEGER, " + COLUMN_NAME + " TEXT, "
            + COLUMN_NUMBER + " INTEGER PRIMARY KEY);";
    public Databasehelper1(Context context) {
        super(context, DATABASE_NAME,null,DATABASE_VERSION);
        Log.e("DATABASE OPERATIONS","Database created...");
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TABLE_CREATE);
        this.db=sqLiteDatabase;
        Log.e("DATABASE OPERATIONS","Table created...");
    }
    public void insertNumber(int z,String s){
        this.db=getWritableDatabase();
        ContentValues values1=new ContentValues();
        Cursor cursor=db.rawQuery("select * from " + TABLE_NAME,null);
        int count=cursor.getCount();
        values1.put(COLUMN_ID,count);
        values1.put(COLUMN_NAME,s);
        values1.put(COLUMN_NUMBER,z);
        db.insert(TABLE_NAME,null,values1);
        Log.e("DATABASE OPERATIONS","One row inserted...");
    }
    public void removeNumber(int z){
        this.db=getWritableDatabase();
        db.delete(TABLE_NAME,COLUMN_NUMBER + "=?",new String[]{"z"});
        Log.e("DATABASE OPERATIONS","one row removed...");
        Cursor cursor3=db.rawQuery("select id,number,name from " + TABLE_NAME,null);
        int number1,h=0;
        String name1;
        ContentValues values1=new ContentValues();
        int count1=cursor3.getCount();
        if (cursor3.moveToFirst())
        do{
            number1=cursor3.getInt(1);
            db.execSQL(" UPDATE " + TABLE_NAME + " SET " + COLUMN_ID + " = " + String.valueOf(h) + " WHERE " + COLUMN_NUMBER + " = " + String.valueOf(number1));
            h++;
        }while (cursor3.moveToNext());
        Log.e("DATABASE OPERATIONS","one row updated");
    }
    public int searchNumber(int id){
        this.db=getReadableDatabase();
        Cursor cursor2=db.rawQuery("select id,number from " + TABLE_NAME,null);
        int id1,number=0;
        if (cursor2.moveToFirst())
        {
            do {id1=cursor2.getInt(0);
                if (id==id1)
                {number=cursor2.getInt(1);
                break;}
        } while (cursor2.moveToNext());}
        Log.e("DATABASE OPERATIONS","one row read...");
        return number;
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXIST " + TABLE_NAME);
        onCreate(db);
    }
}
