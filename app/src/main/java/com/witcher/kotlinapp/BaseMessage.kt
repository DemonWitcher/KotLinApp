package com.witcher.kotlinapp

/**
 * Created by witcher on 2017/12/25.
 */
open class BaseMessage {
    var error: Boolean
        get() = false
        set(error) {
            this.error = error
        }
}