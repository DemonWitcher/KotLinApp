package com.witcher.kotlinapp

/**
 * Created by witcher on 2017/12/25.
 */
class MeizhiList: BaseMessage() {
    var results: List<Meizhi>
        get() = listOf()
        set(results) {
            this.results = results
        }
}