package com.example.myadt.model

import com.google.gson.annotations.SerializedName


/*
 * Created by chornge on 09/30/2020.
 */

data class Location(
    @SerializedName("name") val name: String
)

