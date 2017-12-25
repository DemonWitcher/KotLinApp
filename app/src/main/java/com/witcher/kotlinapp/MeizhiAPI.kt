package com.witcher.kotlinapp


import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Header

/**
 * Created by witcher on 2017/3/23.
 */

interface MeizhiAPI {
    @GET("api/v1/contacts/regestered")
    fun regestered(@Header("Id") id: String, @Header("Access-token") token: String): Observable<BaseMessage>

    @GET("api/v1/contacts/friends")
    fun friends(@Header("Id") id: String, @Header("Access-token") token: String): Observable<BaseMessage>

    @GET("api/v1/contacts/common_friends")
    fun commonFriends(@Header("Id") id: String, @Header("Access-token") token: String): Observable<BaseMessage>

    @GET("api/v11/contacts")
    fun contacts(@Header("Id") id: String, @Header("Access-token") token: String): Observable<BaseMessage>
}
