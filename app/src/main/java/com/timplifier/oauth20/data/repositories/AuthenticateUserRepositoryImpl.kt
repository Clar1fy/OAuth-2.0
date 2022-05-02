package com.timplifier.oauth20.data.repositories

import com.timplifier.oauth20.data.remote.api.KitsuAuthApiService
import com.timplifier.oauth20.data.remote.dtos.toDomain
import com.timplifier.oauth20.data.repositories.base.BaseRepository
import com.timplifier.oauth20.domain.repositories.AuthenticateUserRepository
import javax.inject.Inject

class AuthenticateUserRepositoryImpl @Inject constructor(
    private val kitsuAuthApiService: KitsuAuthApiService
) : BaseRepository(), AuthenticateUserRepository {
    override suspend fun authenticateUser(
        grantType: String,
        username: String,
        password: String
    ) = sendRequest {

        kitsuAuthApiService.authenticateUser(grantType, username, password).toDomain()
    }


}