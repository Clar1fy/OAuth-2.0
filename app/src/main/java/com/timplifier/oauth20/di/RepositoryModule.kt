package com.timplifier.oauth20.di

import com.timplifier.oauth20.data.repositories.AuthenticateUserRepositoryImpl
import com.timplifier.oauth20.data.repositories.RefreshAccessTokenRepositoryImpl
import com.timplifier.oauth20.domain.repositories.AuthenticateUserRepository
import com.timplifier.oauth20.domain.repositories.RefreshAccessTokenRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindAuthenticateUserRepository(authenticateUserRepositoryImpl: AuthenticateUserRepositoryImpl)
            : AuthenticateUserRepository

    @Binds
    abstract fun bindRefreshAccessTokenRepository(refreshAccessTokenRepositoryImpl: RefreshAccessTokenRepositoryImpl)
            : RefreshAccessTokenRepository
}