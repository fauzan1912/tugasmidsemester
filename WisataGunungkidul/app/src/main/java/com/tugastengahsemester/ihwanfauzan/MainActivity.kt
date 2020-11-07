package com.tugastengahsemester.ihwanfauzan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var im1: ImageView
    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button
    private lateinit var btn4: Button
    private lateinit var btn5: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        im1 = findViewById(R.id.profil)
        im1.setOnClickListener(this)

        btn1 = findViewById(R.id.btnNglanggeran)
        btn1.setOnClickListener(this)

        btn2 = findViewById(R.id.btnHeha)
        btn2.setOnClickListener(this)

        btn3 = findViewById(R.id.btnDrini)
        btn3.setOnClickListener(this)

        btn4 = findViewById(R.id.btnPindul)
        btn4.setOnClickListener(this)

        btn5 = findViewById(R.id.btnJogan)
        btn5.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.profil -> {
                val next = Intent(this@MainActivity, Profil::class.java)
                startActivity(next)
            }
        }

        when (v.id) {
            R.id.btnNglanggeran -> {
                val next = Intent(this@MainActivity, Nglanggeran::class.java)
                startActivity(next)
            }
        }

        when (v.id) {
            R.id.btnHeha -> {
                val next = Intent(this@MainActivity, Heha::class.java)
                startActivity(next)
            }
        }

        when (v.id) {
            R.id.btnDrini -> {
                val next = Intent(this@MainActivity, Drini::class.java)
                startActivity(next)
            }
        }

        when (v.id) {
            R.id.btnPindul -> {
                val next = Intent(this@MainActivity, Pindul::class.java)
                startActivity(next)
            }
        }

        when (v.id) {
            R.id.btnJogan -> {
                val next = Intent(this@MainActivity, Jogan::class.java)
                startActivity(next)
            }
        }
    }
}