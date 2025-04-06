package com.elyana.tugas3android

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LandingActivity : AppCompatActivity() {
    private lateinit var welcomeText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)

        welcomeText = findViewById(R.id.welcomeText)

        val user = intent.getParcelableExtra<User>("user")
        welcomeText.text = "Selamat datang, ${user?.name}! Nikmati layanan berbelanja yang seru❤\uFE0F"
    }
}
