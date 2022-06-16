package com.example.instabugtask.data.model
/**
 * Created by Momen on 6/15/2022.
 */

data class ApiEntity(

    var headers: String,
    var queryBody: String,
    var responseCode: String,
    var output: String,
    var error: String,
    var requestType:String,
    var requestURL:String,
    var id:Int
)
