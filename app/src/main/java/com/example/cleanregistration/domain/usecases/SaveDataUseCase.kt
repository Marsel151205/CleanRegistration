package com.example.cleanregistration.domain.usecases

import com.example.cleanregistration.domain.repositories.DataRepository
import javax.inject.Inject

class SaveDataUseCase @Inject constructor(
    private val dataRepository: DataRepository
) {

    operator fun invoke(
        name: String,
        firstName: String,
        age: String,
        password: String,
        placeOfLiving: String
    ) {
        dataRepository.saveData(firstName, name, age, password, placeOfLiving)
    }
}