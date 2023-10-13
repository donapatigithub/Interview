package com.example.interview.dB

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.util.Log
import com.example.interview.model.RegisterModel

class UserRepo(conext:Context) {
    private val userDB = AppDB(conext)
    fun registerUser(user: RegisterModel):Long{
        val db = userDB.writableDatabase
        val values = ContentValues()

        values.put(AppDB.COLUMN_NAME, user.name)
        values.put(AppDB.COLUMN_MOBILE, user.mobile)
        values.put(AppDB.COLUMN_EMAIL, user.email)
        values.put(AppDB.COLUMN_PASSWORD, user.password)

        val result = db.insert(AppDB.TABLE_NAME,null,values)
        db.close()
        Log.d("user_Reg","User:${user.email},Name:${user.name},Mobile:${user.mobile},Password:${user.password}")
        return result
    }
    @SuppressLint("Range")
    fun getUserByEmail(email: String):RegisterModel?{
        val db = userDB.readableDatabase
        val cursor =db.query(AppDB.TABLE_NAME,null,"${AppDB.COLUMN_EMAIL}=?", arrayOf(email),null,null,null)
        val  user = if (cursor.moveToFirst()){
            val name = cursor.getString(cursor.getColumnIndex(AppDB.COLUMN_NAME))
            val mobile = cursor.getString(cursor.getColumnIndex(AppDB.COLUMN_MOBILE))
            val password = cursor.getString(cursor.getColumnIndex(AppDB.COLUMN_PASSWORD))
            RegisterModel(name, mobile, email, password)
        }else {
            null
        }
        cursor.close()
        db.close()
        return user
    }
}