package com.timplifier.oauth20.domain.repositories

import com.timplifier.oauth20.domain.either.Either
import com.timplifier.oauth20.domain.models.AuthTokenModel
import kotlinx.coroutines.flow.Flow

interface RefreshAccessTokenRepository {

    fun refreshAccessToken(
        grantType: String,
        refreshToken: String
    ): Flow<Either<String, AuthTokenModel>>
}