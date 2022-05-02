package com.timplifier.oauth20.data.remote.dtos


import com.google.gson.annotations.SerializedName
import com.timplifier.oauth20.domain.models.AuthTokenModel

data class AuthTokenDto(
    @SerializedName("access_token")
    val accessToken: String,
    @SerializedName("created_at")
    val createdAt: Int,
    @SerializedName("expires_in")
    val expiresIn: Int,
    @SerializedName("refresh_token")
    val refreshToken: String,
    @SerializedName("scope")
    val scope: String,
    @SerializedName("token_type")
    val tokenType: String
)

fun AuthTokenDto.toDomain() =
    AuthTokenModel(accessToken, createdAt, expiresIn, refreshToken, scope, tokenType)