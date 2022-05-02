package com.timplifier.oauth20.di

import android.content.Context
import android.content.SharedPreferences
import com.timplifier.oauth20.data.local.preferences.PreferencesClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LocalModule {


    @Singleton
    @Provides
    fun provideSharedPreferences(@ApplicationContext context: Context): SharedPreferences =
        context.getSharedPreferences("prefs", Context.MODE_PRIVATE)

    @Singleton
    @Provides
    fun providePreferencesClient(preferences: SharedPreferences): PreferencesClient =
        PreferencesClient(preferences)

}