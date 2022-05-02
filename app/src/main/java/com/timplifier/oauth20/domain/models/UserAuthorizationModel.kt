package com.timplifier.oauth20.domain.models

data class UserAuthorizationModel(
    val grantType: String,
    val username: String,
    val password: String
)
