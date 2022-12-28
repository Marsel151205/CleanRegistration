package com.example.cleanregistration.di

import com.example.cleanregistration.data.repositories.DataRepositoryImpl
import com.example.cleanregistration.domain.repositories.DataRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoriesModule {

    @Binds
    fun bindDataRepository(dataRepositoryImpl: DataRepositoryImpl): DataRepository
}