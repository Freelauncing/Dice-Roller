package com.saiharshafinalexam

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.saiharshafinalexam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var viewDataBinding: ActivityMainBinding

    private val viewModel : MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate view and obtain an instance of the binding class.
        viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // Specify the current activity as the lifecycle owner.
        viewDataBinding.setLifecycleOwner(this)

        viewDataBinding .viewmodel = viewModel


    }
}


