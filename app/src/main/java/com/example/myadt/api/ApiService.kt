package com.example.myadt.api

import com.example.myadt.model.Character
import com.example.myadt.model.RootResponse
import retrofit2.http.GET


/*
 * Created by chornge on 09/30/2020.
 */

interface ApiService {
    @GET("character")
    suspend fun getCharacters(): RootResponse
}