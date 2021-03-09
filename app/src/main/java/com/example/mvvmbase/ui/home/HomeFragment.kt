package com.example.mvvmbase.ui.home

import androidx.fragment.app.viewModels
import com.example.core.base.BaseFragment
import com.example.mvvmbase.R
import com.example.mvvmbase.databinding.FragmentHomeBinding
import com.example.mvvmbase.navigation.AppNavigation
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {

    @Inject
    lateinit var appNavigation: AppNavigation

    private val viewModel: HomeViewModel by viewModels()

    override val layoutId = R.layout.fragment_home

    override fun setOnClick() {
        super.setOnClick()

        binding.btnRecyclerview.text = "Hello"
        binding.btnRecyclerview.setOnClickListener {
            appNavigation.openSplashToLoginScreen()
        }
    }

    override fun getVM(): HomeViewModel = viewModel

}