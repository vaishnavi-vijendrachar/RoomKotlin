package com.example.vaishnavi.roomkotlin.ui

import android.arch.lifecycle.ViewModel
import com.example.vaishnavi.roomkotlin.data.User
import com.example.vaishnavi.roomkotlin.data.UserDao
import io.reactivex.Completable
import io.reactivex.Flowable

class UserViewModel(private val dataSource :  UserDao) : ViewModel() {
    fun userName(): Flowable<String> {
        return dataSource.getUserById(USER_ID)
            .map { user -> user.username }
    }

    /**
     * Update the user name.
     * @param userName the new user name
     * *
     * @return a [Completable] that completes when the user name is updated
     */
    fun updateUserName(userName: String): Completable {
        return Completable.fromAction {
            val user = User(USER_ID, userName)
            dataSource.insertUser(user)
        }
    }

    companion object {
        // using a hardcoded value for simplicity
        const val USER_ID = "1"
    }
}