package com.timplifier.oauth20.di

import com.timplifier.oauth20.data.remote.RetrofitClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RemoteModule {

    @Singleton
    private val retrofitClient = RetrofitClient()

    @Singleton
    @Provides
    fun provideKitsuAuthApiService() = retrofitClient.provideKitsuAuthApiService()
}