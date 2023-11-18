package com.example.interview.dB

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log


class AppDB(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME,null,DATABASE_VERSION){
    companion object{
        const val DATABASE_NAME = "user_database"
        const val DATABASE_VERSION = 3
        const val TABLE_NAME = "users"
        const val NAME = "name"
        const val MIDNAME ="mName"
        const val LASTNAME="lName"
        const val MOBILE = "mobile"
        const val EMAIL = "email"
        const val FLAT ="flat"
        const val STREET ="street"
        const val LANDMARK = "landmark"
        const val CITY ="city"
        const val PINCODE ="pincode"
        const val PASSWORD = "password"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val createTable = "CREATE TABLE $TABLE_NAME("+"_id INTEGER PRIMARY KEY AUTOINCREMENT,"+"" +
                "$NAME TEXT,"+
                "$MIDNAME TEXT,"+
                "$LASTNAME TEXT,"+
                "$MOBILE TEXT,"+
                "$EMAIL TEXT,"+
                "$FLAT TEXT,"+
                "$STREET TEXT,"+
                "$LANDMARK TEXT,"+
                "$CITY TEXT,"+
                "$PINCODE INTEGER,"+
                "$PASSWORD TEXT)"
        db?.execSQL(createTable)
        Log.d("AppDB","Table : $createTable")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }
}