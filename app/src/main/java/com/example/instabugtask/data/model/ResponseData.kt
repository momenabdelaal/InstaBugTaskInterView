package com.example.instabugtask.data.model
/**
 * Created by Momen on 6/15/2022.
 */

data class ResponseData(
    var headers: String,
    var queryBody: String,
    var responseCode: String,
    var output: String,
    var error: String
)
