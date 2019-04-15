package com.example.vaishnavi.roomkotlin.data

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.util.*


@Entity
data class User(@PrimaryKey val id : String = UUID.randomUUID().toString(), val username : String)