package com.example.vaishnavi.roomkotlin.ui

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.vaishnavi.roomkotlin.Injection
import com.example.vaishnavi.roomkotlin.Injection.provideViewModelFactory
import com.example.vaishnavi.roomkotlin.R

class UserActivity : AppCompatActivity() {

    lateinit var viewModel : ViewModel
    lateinit var viewModelFactory : ViewModelProvider.AndroidViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModelFactory = provideViewModelFactory(this)
        viewModel = ViewModelProviders.of(this,viewModelFactory).get(UserViewModel::class.java)

    }
}
