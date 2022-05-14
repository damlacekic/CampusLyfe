package com.example.campuslyfe.koin

import com.example.campuslyfe.fragment.signIn.SignInViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object KoinModule {

    val viewModelsModule = module {
        viewModel { SignInViewModel() }
    }
}