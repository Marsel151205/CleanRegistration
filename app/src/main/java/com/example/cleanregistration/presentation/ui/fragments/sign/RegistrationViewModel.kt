package com.example.cleanregistration.presentation.ui.fragments.sign

import androidx.lifecycle.ViewModel
import com.example.cleanregistration.domain.usecases.SaveDataUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RegistrationViewModel @Inject constructor(
    private val saveDataUseCase: SaveDataUseCase
) : ViewModel() {

    fun saveUserData(
        firstName: String,
        name: String,
        age: String,
        password: String,
        placeOfLiving: String
    ) {
        saveDataUseCase(name, firstName, age, password, placeOfLiving)
    }
}