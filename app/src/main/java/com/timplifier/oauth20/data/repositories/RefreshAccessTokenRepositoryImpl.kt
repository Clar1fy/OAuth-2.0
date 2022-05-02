package com.timplifier.oauth20.data.repositories

import com.timplifier.oauth20.data.remote.api.KitsuAuthApiService
import com.timplifier.oauth20.data.remote.dtos.toDomain
import com.timplifier.oauth20.data.repositories.base.BaseRepository
import com.timplifier.oauth20.domain.repositories.RefreshAccessTokenRepository
import javax.inject.Inject

class RefreshAccessTokenRepositoryImpl @Inject constructor(
    private val kitsuAuthApiService: KitsuAuthApiService
) : BaseRepository(), RefreshAccessTokenRepository {


    override fun refreshAccessToken(grantType: String, refreshToken: String) = sendRequest {
        kitsuAuthApiService.refreshAuthToken(grantType, refreshToken).toDomain()
    }

}