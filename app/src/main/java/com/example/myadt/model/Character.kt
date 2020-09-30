package com.example.myadt.model

import com.google.gson.annotations.SerializedName


/*
 * Created by chornge on 09/30/2020.
 */

data class Character(
    @SerializedName("id") val id: String,
    @SerializedName("name") val name: String,
    @SerializedName("status") val status: String,
    @SerializedName("species") val species: String,
    @SerializedName("image") val image: String,
    @SerializedName("location") val location: Location
)