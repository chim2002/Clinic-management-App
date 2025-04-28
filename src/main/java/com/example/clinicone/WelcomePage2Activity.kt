package com.example.clinicone

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class WelcomePage2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome_page2)

        val btnToPage3 = findViewById<Button>(R.id.onBNextBtn)
        btnToPage3.setOnClickListener {
            val intent = Intent(this, WelcomePage3Activity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left)
        }
    }
}
