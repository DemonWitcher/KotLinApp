package com.witcher.kotlinapp


import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Url

/**
 * Created by witcher on 2017/3/23.
 */

interface MeizhiAPI {
    @GET()
    fun meizhiList(@Url() url: String): Observable<MeizhiList>
}
