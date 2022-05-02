package com.timplifier.oauth20.data.local.preferences

import android.content.SharedPreferences
import javax.inject.Inject

class PreferencesClient @Inject constructor(
    private val sharedPreferences: SharedPreferences
) {


    fun saveRefreshToken(refreshToken: String) {
        sharedPreferences.edit().putString("token", refreshToken).apply()

    }

    fun getRefreshToken() = sharedPreferences.getString("token", "")

}