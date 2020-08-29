package com.klapertart.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import com.klapertart.myapplication.data.User
import com.klapertart.myapplication.db.AppDatabase

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "dbsample"
        ).allowMainThreadQueries().build()


        val user = User(1,"Abdillah","Hamka")
        db.userDao().insertAll(user)

        println(db.userDao().getAll())
    }
}
