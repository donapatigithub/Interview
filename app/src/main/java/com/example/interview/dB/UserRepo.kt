package com.example.interview.dB

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.util.Log
import com.example.interview.model.Address
import com.example.interview.model.NameModel
import com.example.interview.model.RegisterModel

class UserRepo(conext:Context) {
    private val userDB = AppDB(conext)
    fun registerUser(user: RegisterModel):Long{
        val db = userDB.writableDatabase
        val values = ContentValues()

        values.put(AppDB.COLUMN_NAME, user.name?.firstName)
        values.put(AppDB.COLUMN_MIDNAME, user.name?.middleName)
        values.put(AppDB.COLUMN_LASTNAME, user.name?.lastName)
        values.put(AppDB.COLUMN_MOBILE, user.mobile)
        values.put(AppDB.COLUMN_EMAIL, user.email)
        values.put(AppDB.COLUMN_FLAT, user.address?.flatno)
        values.put(AppDB.COLUMN_STREET, user.address?.street)
        values.put(AppDB.COLUMN_LANDMARK, user.address?.landmark)
        values.put(AppDB.COLUMN_CITY, user.address?.city)
        values.put(AppDB.COLUMN_PINCODE, user.address?.pincode)
        values.put(AppDB.COLUMN_PASSWORD, user.password)

        val result = db.insert(AppDB.TABLE_NAME,null,values)
        db.close()
        Log.d("user_Reg","User:${user.email},Name:${user.name?.firstName},mName:${user.name?.middleName},lName:${user.name?.lastName},Flat:${user.address?.flatno},street:${user.address?.street},city:${user.address?.city},pin:${user.address?.pincode},Mobile:${user.mobile},Password:${user.password}")
        return result
    }
    @SuppressLint("Range")
    fun getUserByEmail(email: String):RegisterModel?{
        val db = userDB.readableDatabase
        val cursor =db.query(AppDB.TABLE_NAME,null,"${AppDB.COLUMN_EMAIL}=?", arrayOf(email),null,null,null)
        val  user = if (cursor.moveToFirst()){
            val name = cursor.getString(cursor.getColumnIndex(AppDB.COLUMN_NAME))
            val mName = cursor.getString(cursor.getColumnIndex(AppDB.COLUMN_MIDNAME))
            val lName = cursor.getString(cursor.getColumnIndex(AppDB.COLUMN_LASTNAME))
            val mobile = cursor.getString(cursor.getColumnIndex(AppDB.COLUMN_MOBILE))
            val flat = cursor.getString(cursor.getColumnIndex(AppDB.COLUMN_FLAT))
            val street = cursor.getString(cursor.getColumnIndex(AppDB.COLUMN_STREET))
            val landmark = cursor.getString(cursor.getColumnIndex(AppDB.COLUMN_LANDMARK))
            val city = cursor.getString(cursor.getColumnIndex(AppDB.COLUMN_CITY))
            val pincode = cursor.getInt(cursor.getColumnIndex(AppDB.COLUMN_PINCODE))
            val password = cursor.getString(cursor.getColumnIndex(AppDB.COLUMN_PASSWORD))
            RegisterModel(NameModel(name,mName,lName), mobile, email, Address(flat, street, landmark, city, pincode), password)
        }else {
            null
        }
        cursor.close()
        db.close()
        return user
    }
}