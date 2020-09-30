package com.example.myadt.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


/*
 * Created by chornge on 09/30/2020.
 */

object RetrofitBuilder {
    private const val BASE_URL = "https://rickandmortyapi.com/api/"

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build() //Doesn't require the adapter
    }

    val apiService: ApiService = getRetrofit().create(ApiService::class.java)
}