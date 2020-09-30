package com.example.myadt.utils


/*
 * Created by chornge on 09/30/2020.
 */

class ADTResource<out T>(val status: Status, val data: T?, val message: String?) {
    companion object {
        fun <T> success(data: T): ADTResource<T> =
            ADTResource(status = Status.SUCCESS, data = data, message = null)

        fun <T> error(data: T?, message: String): ADTResource<T> =
            ADTResource(status = Status.ERROR, data = data, message = message)

        fun <T> loading(data: T?): ADTResource<T> =
            ADTResource(status = Status.LOADING, data = data, message = null)
    }
}