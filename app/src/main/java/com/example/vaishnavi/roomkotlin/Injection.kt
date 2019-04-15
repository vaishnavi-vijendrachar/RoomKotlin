package com.example.vaishnavi.roomkotlin


import android.content.Context
import com.example.vaishnavi.roomkotlin.data.UserDao
import com.example.vaishnavi.roomkotlin.data.UsersDatabase
import com.example.vaishnavi.roomkotlin.ui.ViewModelFactory

object Injection{
    fun provideUserDataSource(context : Context) : UserDao{
        val database = UsersDatabase.getInstance(context)
        return database.userDao()
    }

    fun provideViewModelFactory(context : Context) : ViewModelFactory {
        val dataSource = provideViewModelFactory(context)
        return dataSource
    }
}