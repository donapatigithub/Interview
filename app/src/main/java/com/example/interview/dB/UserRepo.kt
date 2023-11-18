package com.example.interview.dB

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import com.example.interview.model.Address
import com.example.interview.model.NameModel
import com.example.interview.model.RegisterModel

class UserRepo(conext:Context) {
    private val userDB = AppDB(conext)
    fun registerUser(user: RegisterModel):Long{
        val db = userDB.writableDatabase
        val values = ContentValues()

        values.put(AppDB.NAME, user.name?.firstName)
        values.put(AppDB.MIDNAME, user.name?.middleName)
        values.put(AppDB.LASTNAME, user.name?.lastName)
        values.put(AppDB.MOBILE, user.mobile)
        values.put(AppDB.EMAIL, user.email)
        values.put(AppDB.FLAT, user.address?.flatno)
        values.put(AppDB.STREET, user.address?.street)
        values.put(AppDB.LANDMARK, user.address?.landmark)
        values.put(AppDB.CITY, user.address?.city)
        values.put(AppDB.PINCODE, user.address?.pincode)
        values.put(AppDB.PASSWORD, user.password)

        val result = db.insert(AppDB.TABLE_NAME,null,values)
        db.close()
        return result
    }
    @SuppressLint("Range")
    fun getUserByEmail(email: String):RegisterModel?{
        val db = userDB.readableDatabase
        val cursor =db.query(AppDB.TABLE_NAME,null,"${AppDB.EMAIL}=?", arrayOf(email),null,null,null)
        val  user = if (cursor.moveToFirst()){
            val name = cursor.getString(cursor.getColumnIndex(AppDB.NAME))
            val mName = cursor.getString(cursor.getColumnIndex(AppDB.MIDNAME))
            val lName = cursor.getString(cursor.getColumnIndex(AppDB.LASTNAME))
            val mobile = cursor.getString(cursor.getColumnIndex(AppDB.MOBILE))
            val flat = cursor.getString(cursor.getColumnIndex(AppDB.FLAT))
            val street = cursor.getString(cursor.getColumnIndex(AppDB.STREET))
            val landmark = cursor.getString(cursor.getColumnIndex(AppDB.LANDMARK))
            val city = cursor.getString(cursor.getColumnIndex(AppDB.CITY))
            val pincode = cursor.getInt(cursor.getColumnIndex(AppDB.PINCODE))
            val password = cursor.getString(cursor.getColumnIndex(AppDB.PASSWORD))
            RegisterModel(NameModel(name,mName,lName), mobile, email, Address(flat, street, landmark, city, pincode), password)
        }else {
            null
        }
        cursor.close()
        db.close()
        return user
    }
}