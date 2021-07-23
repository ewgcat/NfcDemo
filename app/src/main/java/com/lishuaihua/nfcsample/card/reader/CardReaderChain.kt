package com.lishuaihua.nfcsample.card.reader

import com.lishuaihua.nfclib.NfcManagerCompat
import com.lishuaihua.nfcsample.card.DefaultCardInfo

import java.io.IOException

/**
 *  2018/1/4.
 */
class CardReaderChain(private val mReaders: List<IReader>) : IReader.Chain {

    @Throws(IOException::class)
    override fun proceed(nfcCardReaderManager: NfcManagerCompat): DefaultCardInfo? {
        var defaultCardInfo: DefaultCardInfo? = null
        for (reader in mReaders) {
            defaultCardInfo = reader.readCard(nfcCardReaderManager)
            if (defaultCardInfo != null) {
                break
            }
        }
        return defaultCardInfo
    }
}
