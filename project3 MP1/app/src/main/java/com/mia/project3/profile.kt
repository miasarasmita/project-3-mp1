package com.mia.project3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_detail.btn_back
import kotlinx.android.synthetic.main.activity_profile.*

class profile : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        button4.setOnClickListener{
            button4.text = "Following"
            lbl_text.text = "1.441"
        }

    btn_back.setOnClickListener {
        val back = Intent(this@profile, MainActivity::class.java)
        startActivity(back)
        }
    }
}