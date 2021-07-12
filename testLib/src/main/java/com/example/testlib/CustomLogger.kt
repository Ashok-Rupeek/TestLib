package com.example.testlib

import android.util.Log

object CustomLogger {

    fun debugLog(msg: String) {
        Log.d("==>msg", "$msg")
    }
}