package com.timplifier.oauth20.domain.useCases

import com.timplifier.oauth20.domain.repositories.RefreshAccessTokenRepository
import javax.inject.Inject

class RefreshAccessTokenUseCase @Inject constructor(
    private val refreshAccessTokenRepository: RefreshAccessTokenRepository
) {
    operator fun invoke(grantType: String, refreshToken: String) =
        refreshAccessTokenRepository.refreshAccessToken(grantType, refreshToken)
}