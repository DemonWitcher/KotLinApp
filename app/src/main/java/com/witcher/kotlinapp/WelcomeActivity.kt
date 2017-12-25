package com.witcher.kotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater

/**
 * Created by witcher on 2017/12/13.
 */
class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvMeizhi = findViewById<RecyclerView>(R.id.rv_meizhi)

        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val data = listOf("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg")

        val meizhiAdapter = MeizhiAdapter(data, LayoutInflater.from(this))

        rvMeizhi.layoutManager = linearLayoutManager
        rvMeizhi.adapter = meizhiAdapter
//        RetrofitProvider.instance.
    }
}