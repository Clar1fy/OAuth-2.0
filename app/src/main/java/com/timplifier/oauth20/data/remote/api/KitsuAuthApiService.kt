package com.timplifier.oauth20.data.remote.api

import com.timplifier.oauth20.data.remote.dtos.AuthTokenDto
import com.timplifier.oauth20.data.remote.dtos.UserAuthorizationDto
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface KitsuAuthApiService {


    @POST("oauth/token")
    @FormUrlEncoded
    suspend fun authenticateUser(
        @Field("grant_type") grantType: String,
        @Field("<email|slug>") username: String,
        @Field("password") password: String
    ): UserAuthorizationDto


    @POST("oauth/token")
    @FormUrlEncoded
    fun refreshAuthToken(
        @Field("grant_type") grantType: String,
        @Field("refresh_token") refreshToken: String
    ): AuthTokenDto
}