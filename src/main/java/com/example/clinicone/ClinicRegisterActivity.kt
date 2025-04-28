package com.example.clinicone

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ClinicRegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.clinic_registration)

        val btnToPage3 = findViewById<Button>(R.id.submitBtn)
        btnToPage3.setOnClickListener {
            val intent = Intent(this,RegistrationSuccess ::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left)
        }
    }
}
