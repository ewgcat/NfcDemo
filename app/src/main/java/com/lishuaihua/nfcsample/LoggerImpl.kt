package com.lishuaihua.nfcsample

import android.util.Log
import com.lishuaihua.nfclib.util.Printer

/**
 *  2019-08-22.
 */
class LoggerImpl : Printer {
    override fun println(tag: String, message: String, exception: Exception) {
        exception.printStackTrace()
        Log.d(tag, message)
    }

    override fun println(message: String, exception: Exception) {
        exception.printStackTrace()
        Log.d(TAG, message)
    }

    override fun println(tag: String, message: String) {
        Log.d(tag, message)
    }

    override fun println(message: String) {
        Log.d(TAG, message)
    }

    companion object {
        private const val TAG = "LoggerImpl"
    }
}