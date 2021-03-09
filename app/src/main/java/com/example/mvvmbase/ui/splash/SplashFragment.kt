package com.example.mvvmbase.ui.splash

import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import com.example.core.base.BaseFragment
import com.example.core.utils.setTextCompute
import com.example.mvvmbase.R
import com.example.mvvmbase.databinding.FragmentSplashBinding
import com.example.mvvmbase.navigation.AppNavigation
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SplashFragment : BaseFragment<FragmentSplashBinding, SplashViewModel>() {

    @Inject
    lateinit var appNavigation: AppNavigation

    override val layoutId = R.layout.fragment_splash

    private val viewModel: SplashViewModel by viewModels()

    override fun getVM() = viewModel

    override fun initView() {
        super.initView()
        binding.text.setTextCompute("Splash")
    }

    override fun bindingAction() {
        super.bindingAction()
        viewModel.actionSPlash.observe(viewLifecycleOwner, {
            when (it) {
                SplashActionState.Finish -> {
                    appNavigation.openSplashToHomeScreen()
                }
            }
        })
    }

}