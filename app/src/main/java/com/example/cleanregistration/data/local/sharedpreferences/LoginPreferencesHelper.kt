package com.example.cleanregistration.data.local.sharedpreferences

import android.content.Context
import android.content.SharedPreferences

class LoginPreferencesHelper(context: Context) {

    private val firstnamePreference: SharedPreferences =
        context.getSharedPreferences("firstNamePreference", Context.MODE_PRIVATE)

    var firstName: String?
        get() = firstnamePreference.getString("firstNamePreference", "")
        set(value) = firstnamePreference.edit().putString("firstNamePreference", value).apply()

    private val namePreference: SharedPreferences =
        context.getSharedPreferences("namePreference", Context.MODE_PRIVATE)

    var name: String?
        get() = namePreference.getString("namePreference", "")
        set(value) = namePreference.edit().putString("namePreference", value).apply()

    private val agePreference: SharedPreferences =
        context.getSharedPreferences("namePreference", Context.MODE_PRIVATE)

    var age: String?
        get() = agePreference.getString("agePreference", "")
        set(value) = agePreference.edit().putString("agePreference", value).apply()

    private val passwordPreference: SharedPreferences =
        context.getSharedPreferences("namePreference", Context.MODE_PRIVATE)

    var password: String?
        get() = passwordPreference.getString("passwordPreference", "")
        set(value) = passwordPreference.edit().putString("passwordPreference", value).apply()

    private val placeOfLivingPreference: SharedPreferences =
        context.getSharedPreferences("placeOfLivingPreference", Context.MODE_PRIVATE)

    var placeOfLiving: String?
        get() = placeOfLivingPreference.getString("placeOfLivingPreference", "")
        set(value) = placeOfLivingPreference.edit().putString("placeOfLivingPreference", value).apply()
}