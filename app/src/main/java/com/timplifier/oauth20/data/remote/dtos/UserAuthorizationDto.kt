package com.timplifier.oauth20.data.remote.dtos


import com.google.gson.annotations.SerializedName
import com.timplifier.oauth20.domain.models.UserAuthorizationModel

data class UserAuthorizationDto(
    @SerializedName("grant_type")
    val grantType: String,
    @SerializedName("username")
    val username: String,
    @SerializedName("password")
    val password: String
)

fun UserAuthorizationDto.toDomain() = UserAuthorizationModel(grantType, username, password)