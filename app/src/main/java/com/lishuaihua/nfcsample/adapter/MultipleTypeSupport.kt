package com.lishuaihua.nfcsample.adapter

/**
 *  2017/8/8.
 */

interface MultipleTypeSupport<T> {

    fun getLayoutId(t: T, position: Int): Int
}
