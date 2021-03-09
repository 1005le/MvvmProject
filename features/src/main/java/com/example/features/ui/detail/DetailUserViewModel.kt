package com.example.features.ui.detail

import androidx.hilt.lifecycle.ViewModelInject
import com.example.core.base.BaseViewModel
import com.example.core.network.ApiInterface

class DetailUserViewModel @ViewModelInject constructor(
    private val apiInterface: ApiInterface
) : BaseViewModel() {

}