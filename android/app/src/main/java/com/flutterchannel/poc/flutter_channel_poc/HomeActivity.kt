package com.flutterchannel.poc.flutter_channel_poc

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import io.flutter.embedding.android.FlutterActivity
import android.content.Intent





class HomeActivity : FlutterActivity() {

    private lateinit var purchaseBook: Button
    private lateinit var bookUrl: TextView
    private lateinit var bookUrlValue: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        purchaseBook = findViewById(R.id.purchaseBook)
        bookUrl = findViewById(R.id.bookUrl)


        getIntentArgs()
        bookUrl.text = bookUrlValue


        purchaseBook.setOnClickListener {
            this.finish()
            val intent = Intent(context, FlutterActivity::class.java)
            intent.action = Intent.ACTION_RUN
            intent.putExtra("route", "/PurchaseScreen")
           startActivity(intent)
        }

    }

    private fun getIntentArgs() {
        bookUrlValue = intent.getStringExtra("bookUrl") ?: ""
    }




}