package com.example.cleanregistration.domain.repositories

interface DataRepository {

    fun saveData(
        firstName: String,
        name: String,
        age: String,
        password: String,
        placeOfLiving: String
    )

    fun getFirstname(): String
    fun getName(): String
    fun getAge(): String
    fun getPassword(): String
    fun getPlaceOfLiving(): String
}