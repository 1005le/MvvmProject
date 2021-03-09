package com.example.mvvmbase.ui.main

import android.os.Bundle
import androidx.activity.viewModels
import androidx.navigation.fragment.NavHostFragment
import com.example.core.base.BaseActivity
import com.example.mvvmbase.R
import com.example.mvvmbase.databinding.ActivityMainBinding
import com.example.mvvmbase.navigation.AppNavigation
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    @Inject
    lateinit var appNavigation: AppNavigation

    private val viewModel: MainViewModel by viewModels()

    override fun getVM() = viewModel

    override val layoutId = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host) as NavHostFragment
        appNavigation.bind(navHostFragment.navController)
    }
}