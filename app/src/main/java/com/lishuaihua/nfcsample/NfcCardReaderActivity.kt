package com.lishuaihua.nfcsample

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.lishuaihua.nfcsample.R

/**
 *  2019/3/21.
 */
class NfcCardReaderActivity : AppCompatActivity() {
    private lateinit var mBtnOpen: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nfc_cardreader)
        mBtnOpen = findViewById(R.id.btnOpenReadCityCardActivity)
        mBtnOpen.setOnClickListener {
            openReadCityCardActivity()
        }
    }

    fun openReadCityCardActivity() {
        startActivity(Intent(this, MainActivity::class.java))
    }
}
