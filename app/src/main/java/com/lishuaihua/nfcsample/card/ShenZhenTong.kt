package com.lishuaihua.nfcsample.card

import com.lishuaihua.nfclib.util.Util

/**
 *  2017/9/29.
 */

class ShenZhenTong : DefaultCardInfo() {

    /**
     * 解析卡片信息,未判断9000.
     *
     */
    fun parseCardInfo(src: ByteArray): Boolean {
        try {
            val number = Util.hexToIntLittleEndian(src, 19, 4)
            cardNumber = number.toString()
            return true
        } catch (ex: Exception) {
            ex.printStackTrace()
            return false
        }

    }

    /**
     * 解析卡片余额.
     *
     * @param src 原始16进制数据
     */
    fun parseCardBalance(src: ByteArray): Boolean {
        try {
            balance = Util.hexToInt(src, 1, src.size - 2 - 1).toLong()
            return true
        } catch (ex: Exception) {
            ex.printStackTrace()
            return false
        }

    }
}
