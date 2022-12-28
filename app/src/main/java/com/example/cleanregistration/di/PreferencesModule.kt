package com.example.cleanregistration.di

import android.content.Context
import com.example.cleanregistration.data.local.sharedpreferences.LoginPreferencesHelper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PreferencesModule {

    @Singleton
    @Provides
    fun provideLoginPreferencesHelper(@ApplicationContext context: Context) =
        LoginPreferencesHelper(context)
}