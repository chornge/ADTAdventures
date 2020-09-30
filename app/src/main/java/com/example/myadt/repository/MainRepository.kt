package com.example.myadt.repository

import com.example.myadt.api.ApiHelper


/*
 * Created by chornge on 09/30/2020.
 */

class MainRepository(private val apiHelper: ApiHelper) {
    suspend fun getCharacters() = apiHelper.getCharacters()
}