package com.timplifier.oauth20.data.remote.api

import com.timplifier.oauth20.data.remote.dtos.AccessTokenRefresher
import com.timplifier.oauth20.data.remote.dtos.AuthTokenDto
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface KitsuAuthApiService {

    @POST("oauth/token")
    @FormUrlEncoded
    suspend fun authorize(
        @Field("grant_type") grantType: String,
        @Field("<email|slug>") username: String,
        @Field("password") password: String
    ): AuthTokenDto


    @POST("oauth/token")
    @FormUrlEncoded
    fun refreshAuthToken(
        @Field("grant_type") grantType: String,
        @Field("refresh_token") refreshToken: String
    ): Response<AccessTokenRefresher>
}