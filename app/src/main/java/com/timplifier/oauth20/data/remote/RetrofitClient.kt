package com.timplifier.oauth20.data.remote

import com.timplifier.oauth20.data.remote.api.KitsuAuthApiService
import com.timplifier.oauth20.data.remote.authenticator.TokenAuthenticator
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitClient {
    private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(provideLoggingInterceptor())
        .authenticator(TokenAuthenticator())
        .connectTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .build()

    private fun provideLoggingInterceptor() =
        HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()


    fun provideKitsuAuthApiService(): KitsuAuthApiService =
        retrofit.create(KitsuAuthApiService::class.java)

    companion object {
        const val BASE_URL = "https://kitsu.io/api/"
    }

}