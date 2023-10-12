package com.example.interview.dB

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DbHelper(context: Context):SQLiteOpenHelper(context,DATABASE_NAME,null,DATABASE_VERSION) {
    companion object{
        const val DATABASE_NAME = "my_database"
        const val DATABASE_VERSION = 2
        const val TABLE_NAME = "my_table"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val createTableSQL = "CREATE TABLE IF NOT EXISTS $TABLE_NAME"+"(id INTEGER PRIMARY KEY, name TEXT, age INTEGER)"
        if (db != null) {
            db.execSQL(createTableSQL)
        }
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        if (oldVersion<2){
            if (db != null) {
                db.execSQL("ALTER TABLE $TABLE_NAME ADD COLUMN new_column TEXT")
            }
        }
    }
}