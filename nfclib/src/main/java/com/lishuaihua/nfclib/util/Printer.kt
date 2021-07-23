package com.lishuaihua.nfclib.util

/**
 *  2019-08-21.
 */
interface Printer {
    fun println(tag: String, message: String)
    fun println(message: String)
    fun println(tag: String, message: String, exception: Exception)
    fun println(message: String, exception: Exception)
}