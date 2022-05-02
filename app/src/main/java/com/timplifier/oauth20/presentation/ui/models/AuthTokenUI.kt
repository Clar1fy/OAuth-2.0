package com.timplifier.oauth20.presentation.ui.models

data class AuthTokenUI(
    val accessToken: String,
    val createdAt: Int,
    val expiresIn: Int,
    val refreshToken: String,
    val scope: String,
    val tokenType: String
)
