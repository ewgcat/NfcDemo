package com.lishuaihua.nfcsample.card.reader

import com.lishuaihua.nfclib.NfcManagerCompat
import com.lishuaihua.nfcsample.card.DefaultCardInfo
import java.io.IOException
import java.util.*

/**
 *  2018/1/5.
 */

class CardClient private constructor(builder: Builder) {

    private val readers: List<IReader>
    private val chain: IReader.Chain
    private var mNfcCardReaderManager: NfcManagerCompat


    init {
        this.readers = builder.readers
        this.mNfcCardReaderManager = builder.mNfcCardReaderManager
        chain = CardReaderChain(this.readers)
    }

    @Throws(IOException::class)
    fun execute(): DefaultCardInfo? {
        return chain.proceed(mNfcCardReaderManager)
    }


    class Builder {
        val readers = ArrayList<IReader>()
        lateinit var mNfcCardReaderManager: NfcManagerCompat

        constructor() {}

        constructor(copy: CardClient) {
            this.readers.addAll(copy.readers)
            this.mNfcCardReaderManager = copy.mNfcCardReaderManager
        }

        fun addReader(reader: IReader): Builder {
            readers.add(reader)
            return this
        }

        fun nfcManager(manager: NfcManagerCompat): Builder {
            mNfcCardReaderManager = manager
            return this
        }

        fun build(): CardClient {
            return CardClient(this)
        }
    }
}
