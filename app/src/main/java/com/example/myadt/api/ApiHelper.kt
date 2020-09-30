package com.example.myadt.api


/*
 * Created by chornge on 09/30/2020.
 */

class ApiHelper(private val apiService: ApiService) {
    suspend fun getCharacters() = apiService.getCharacters()
}