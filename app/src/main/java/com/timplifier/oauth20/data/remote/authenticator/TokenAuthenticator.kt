package com.timplifier.oauth20.data.remote.authenticator

import com.timplifier.oauth20.data.local.preferences.PreferencesClient
import com.timplifier.oauth20.data.remote.api.KitsuAuthApiService
import okhttp3.Authenticator
import okhttp3.Request
import okhttp3.Response
import okhttp3.Route
import javax.inject.Inject

class TokenAuthenticator : Authenticator {

    @Inject
    private lateinit var preferences: PreferencesClient

    @Inject
    private lateinit var kitsuAuthApiService: KitsuAuthApiService

    override fun authenticate(route: Route?, response: Response): Request? {

        val token = getNewRefreshedToken()
        return response.request.newBuilder()
            .header("Authorization", "Bearer ${token.accessToken}")
            .build()
    }

    private fun getNewRefreshedToken() =
        kitsuAuthApiService.refreshAuthToken(
            "refresh_token",
            preferences.getRefreshToken().toString()
        )


}