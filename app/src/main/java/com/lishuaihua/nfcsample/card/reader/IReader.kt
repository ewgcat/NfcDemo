package com.lishuaihua.nfcsample.card.reader

import com.lishuaihua.nfclib.NfcManagerCompat
import com.lishuaihua.nfcsample.card.DefaultCardInfo

import java.io.IOException

/**
 *  2018/1/4.
 */

interface IReader {

    val type: Int

    @Throws(IOException::class)
    fun readCard(nfcCardReaderManager: NfcManagerCompat): DefaultCardInfo?

    interface Chain {
        @Throws(IOException::class)
        fun proceed(nfcCardReaderManager: NfcManagerCompat): DefaultCardInfo?
    }
}
