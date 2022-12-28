package com.example.cleanregistration.domain.usecases

import com.example.cleanregistration.data.local.sharedpreferences.LoginPreferencesHelper
import javax.inject.Inject

class GetPlaceOfLivingUseCase @Inject constructor(
    private val preferencesHelper: LoginPreferencesHelper
) {

    operator fun invoke() = preferencesHelper.placeOfLiving
}