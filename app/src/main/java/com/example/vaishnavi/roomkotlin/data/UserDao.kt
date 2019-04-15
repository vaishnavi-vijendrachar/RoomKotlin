package com.example.vaishnavi.roomkotlin.data

import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import io.reactivex.Flowable

interface UserDao {

    @Query("SELECT * FROM User WHERE id = :id")
    fun getUserById(id : String) : Flowable<User>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(user : User)

    @Query("DELETE FROM User")
    fun deleteAllUsers()
}