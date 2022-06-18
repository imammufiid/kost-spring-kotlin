package com.mufid.kost.response

data class BaseResponse<T>(
    var status: Boolean = false,
    var message: String = "",
    var data: T? = null
)
