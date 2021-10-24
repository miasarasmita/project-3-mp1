package com.mia.project3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val onClickListener = btn_back.setOnClickListener {
            val back = Intent(this@detail, MainActivity::class.java)
            startActivity(back)
        }
    }
}