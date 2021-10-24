package com.mia.project3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class product : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)


        val onClickListener = btn_back.setOnClickListener {
            val back = Intent(this@product, MainActivity::class.java)
            startActivity(back)
        }
    }
}