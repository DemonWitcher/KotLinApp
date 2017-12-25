package com.witcher.kotlinapp

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by witcher on 2017/12/14.
 */
class RetrofitProvider private constructor() {

    companion object {
        val instance: Retrofit by lazy {
            Holder.retrofit
        }
    }

    private object Holder {
        var builder = OkHttpClient().newBuilder().
                readTimeout(13, TimeUnit.SECONDS).
                connectTimeout(13, TimeUnit.SECONDS).
                retryOnConnectionFailure(true).
                addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))!!
        var retrofit = Retrofit.Builder().baseUrl("baseUrl")
                .client(builder.build())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
    }

//    companion object {
//        fun get(): Retrofit {
//            return Inner.retrofit
//        }
//    }
//
//    private object Inner {
//        var builder = OkHttpClient().newBuilder().
//                readTimeout(13, TimeUnit.SECONDS).
//                connectTimeout(13, TimeUnit.SECONDS).
//                retryOnConnectionFailure(true).
//                addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))!!
//        var retrofit = Retrofit.Builder().baseUrl("baseUrl")
//                .client(builder.build())
//                .addConverterFactory(GsonConverterFactory.create())
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//                .build()
//    }
}