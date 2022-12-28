package com.example.cleanregistration.domain.usecases

import com.example.cleanregistration.domain.repositories.DataRepository
import javax.inject.Inject

class GetAgeUseCase @Inject constructor(
    private val dataRepository: DataRepository
) {

    operator fun invoke() = dataRepository.getAge()
}