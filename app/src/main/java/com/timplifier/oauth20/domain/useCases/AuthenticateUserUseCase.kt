package com.timplifier.oauth20.domain.useCases

import com.timplifier.oauth20.domain.repositories.AuthenticateUserRepository
import javax.inject.Inject

class AuthenticateUserUseCase @Inject constructor(
    private val authenticateUserRepository: AuthenticateUserRepository
) {
    suspend operator fun invoke(grantType: String, username: String, password: String) =
        authenticateUserRepository.authenticateUser(grantType, username, password)
}