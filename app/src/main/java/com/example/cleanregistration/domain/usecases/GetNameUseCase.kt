package com.example.cleanregistration.domain.usecases

import com.example.cleanregistration.data.local.sharedpreferences.LoginPreferencesHelper
import javax.inject.Inject

class GetNameUseCase @Inject constructor(
    private val preferencesHelper: LoginPreferencesHelper
) {

    operator fun invoke() = preferencesHelper.name
}