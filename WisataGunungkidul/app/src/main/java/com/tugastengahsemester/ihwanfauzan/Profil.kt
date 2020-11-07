package com.tugastengahsemester.ihwanfauzan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Profil : AppCompatActivity(), View.OnClickListener {
    private lateinit var btn_back1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)
        btn_back1 = findViewById(R.id.btn_back1)
        btn_back1.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when(v.id) {
            R.id.btn_back1 -> {
                val next = Intent(this@Profil, MainActivity::class.java)
                startActivity(next)
            }
        }
    }
}