package com.example.cleanregistration.presentation.ui.fragments.userinfo

import androidx.lifecycle.ViewModel
import com.example.cleanregistration.domain.usecases.*
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UserInfoViewModel @Inject constructor(
    private val firstFirstnameUseCase: GetFirstnameUseCase,
    private val name: GetNameUseCase,
    private val age: GetAgeUseCase,
    private val password: GetPasswordUseCase,
    private val placeOfLivingUseCase: GetPlaceOfLivingUseCase
): ViewModel() {

    fun getFirstnameUseCase() = firstFirstnameUseCase()
    fun getNameUseCase() = name()
    fun getAgeUseCase() = age()
    fun getPasswordUseCase() = password()
    fun getPlaceOfLivingUseCase() = placeOfLivingUseCase()
}