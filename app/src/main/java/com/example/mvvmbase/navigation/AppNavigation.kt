package com.example.mvvmbase.navigation

import android.os.Bundle
import com.example.core.navigationComponent.BaseNavigator

interface AppNavigation : BaseNavigator {

    fun openSplashToHomeScreen(bundle: Bundle? = null)

    fun openSplashToLoginScreen(bundle: Bundle? = null)

    fun openListUserToDetailScreen(bundle: Bundle? = null)

}