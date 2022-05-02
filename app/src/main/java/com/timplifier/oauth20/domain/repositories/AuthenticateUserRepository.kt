package com.timplifier.oauth20.domain.repositories

import com.timplifier.oauth20.domain.either.Either
import com.timplifier.oauth20.domain.models.UserAuthorizationModel
import kotlinx.coroutines.flow.Flow

interface AuthenticateUserRepository {
    suspend fun authenticateUser(
        grantType: String,
        username: String,
        password: String
    ): Flow<Either<String, UserAuthorizationModel>>
}