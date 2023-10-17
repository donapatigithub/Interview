package com.example.interview.dB

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


class AppDB(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME,null,DATABASE_VERSION){
    companion object{
        const val DATABASE_NAME = "user_database"
        const val DATABASE_VERSION = 2
        const val TABLE_NAME = "users"
        const val COLUMN_NAME = "name"
        const val COLUMN_MIDNAME ="mName"
        const val COLUMN_LASTNAME="lName"
        const val COLUMN_MOBILE = "mobile"
        const val COLUMN_EMAIL = "email"
        const val COLUMN_FLAT ="flat"
        const val COLUMN_STREET ="street"
        const val COLUMN_LANDMARK = "landmark"
        const val COLUMN_CITY ="city"
        const val COLUMN_PINCODE ="pincode"
        const val COLUMN_PASSWORD = "password"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val createTable = "CREATE TABLE $TABLE_NAME("+"_id INTEGER PRIMARY KEY AUTOINCREMENT,"+"" +
                "$COLUMN_NAME TEXT,"+
                "$COLUMN_MIDNAME TEXT,"+
                "$COLUMN_LASTNAME TEXT,"+
                "$COLUMN_MOBILE TEXT,"+
                "$COLUMN_EMAIL TEXT,"+
                "$COLUMN_FLAT TEXT,"+
                "$COLUMN_STREET TEXT,"+
                "$COLUMN_LANDMARK TEXT,"+
                "$COLUMN_CITY TEXT,"+
                "$COLUMN_PINCODE INTEGER,"+
                "$COLUMN_PASSWORD TEXT)"
        db?.execSQL(createTable)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }
}