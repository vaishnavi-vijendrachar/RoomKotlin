package com.example.vaishnavi.roomkotlin.data

import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context

abstract class UsersDatabase : RoomDatabase() {
    abstract fun userDao()  : UserDao

    companion object {

        @Volatile private var INSTANCE : UsersDatabase? = null

        fun getInstance(context: Context): UsersDatabase =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: buildDatabase(context).also { INSTANCE = it }
            }

        private fun buildDatabase(context : Context) =
                Room.databaseBuilder(context.applicationContext,UsersDatabase::class.java,"User.db").build()

    }

}