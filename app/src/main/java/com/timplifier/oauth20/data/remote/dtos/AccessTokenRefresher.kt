package com.timplifier.oauth20.data.remote.dtos


import com.google.gson.annotations.SerializedName

data class AccessTokenRefresher(
    @SerializedName("grant_type")
    val grantType: String,
    @SerializedName("refresh_token")
    val refreshToken: String
)