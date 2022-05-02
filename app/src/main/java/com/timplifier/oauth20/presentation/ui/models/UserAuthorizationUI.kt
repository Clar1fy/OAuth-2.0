package com.timplifier.oauth20.presentation.ui.models

import com.timplifier.oauth20.domain.models.UserAuthorizationModel

data class UserAuthorizationUI(
    val grantType: String,
    val username: String,
    val password: String
)

fun UserAuthorizationModel.toUI() = UserAuthorizationUI(grantType, username, password)
