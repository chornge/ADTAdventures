package com.example.myadt.model

import com.google.gson.annotations.SerializedName


/*
 * Created by chornge on 09/30/2020.
 */

data class Info(
    @SerializedName("count") val count: Int,
    @SerializedName("pages") val pages: Int,
    @SerializedName("next") val next: String,
    @SerializedName("prev") val prev: Any
)