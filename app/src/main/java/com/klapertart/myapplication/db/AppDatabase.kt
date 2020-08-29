package com.klapertart.myapplication.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.klapertart.myapplication.dao.UserDao
import com.klapertart.myapplication.data.User

@Database(entities = arrayOf(User::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}