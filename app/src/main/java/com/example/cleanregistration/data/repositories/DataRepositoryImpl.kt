package com.example.cleanregistration.data.repositories

import com.example.cleanregistration.data.local.sharedpreferences.LoginPreferencesHelper
import com.example.cleanregistration.domain.repositories.DataRepository
import javax.inject.Inject

class DataRepositoryImpl @Inject constructor(
    private val loginPreferencesHelper: LoginPreferencesHelper
) : DataRepository {

    override fun saveData(
        firstName: String,
        name: String,
        age: String,
        password: String,
        placeOfLiving: String
    ) {
        loginPreferencesHelper.name = name
        loginPreferencesHelper.firstName = firstName
        loginPreferencesHelper.age = age
        loginPreferencesHelper.password = password
        loginPreferencesHelper.placeOfLiving = placeOfLiving
    }

    override fun getFirstname(): String = loginPreferencesHelper.firstName!!.toString()

    override fun getName(): String = loginPreferencesHelper.name!!

    override fun getAge(): String = loginPreferencesHelper.age!!

    override fun getPassword(): String = loginPreferencesHelper.password!!

    override fun getPlaceOfLiving(): String = loginPreferencesHelper.placeOfLiving!!
}