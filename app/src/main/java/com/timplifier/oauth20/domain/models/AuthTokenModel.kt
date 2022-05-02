package com.timplifier.oauth20.domain.models

import com.timplifier.oauth20.presentation.ui.models.AuthTokenUI

data class AuthTokenModel(
    val accessToken: String,
    val createdAt: Int,
    val expiresIn: Int,
    val refreshToken: String,
    val scope: String,
    val tokenType: String
)

fun AuthTokenModel.toUI() =
    AuthTokenUI(accessToken, createdAt, expiresIn, refreshToken, scope, tokenType)