package com.example.features.ui.detail

import androidx.fragment.app.viewModels
import com.example.core.base.BaseFragment
import com.example.features.R
import com.example.features.databinding.FragmentDetailUserBinding
import com.example.features.databinding.FragmentListUserBinding
import com.example.features.ui.user.UserViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.SupervisorJob
import kotlin.coroutines.CoroutineContext


@ExperimentalCoroutinesApi
@AndroidEntryPoint
class DetailUserFragment : BaseFragment<FragmentDetailUserBinding, DetailUserViewModel>(), CoroutineScope {

    override val layoutId=  R.layout.fragment_detail_user

    private val viewModel: DetailUserViewModel by viewModels()
    override fun getVM() = viewModel

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.IO + SupervisorJob()


}