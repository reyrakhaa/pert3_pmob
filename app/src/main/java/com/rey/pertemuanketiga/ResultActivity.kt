package com.rey.pertemuanketiga

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rey.pertemuanketiga.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fullName = intent.getStringExtra("DATA_FULL_NAME")
        val username = intent.getStringExtra("DATA_USERNAME")
        val age = intent.getStringExtra("DATA_AGE")
        val email = intent.getStringExtra("DATA_EMAIL")
        val gender = intent.getStringExtra("DATA_GENDER")

        binding.fullNameResult.text = "Full Name: ${fullName ?: "N/A"}"
        binding.usernameResult.text = "Username: ${username ?: "N/A"}"
        binding.ageResult.text = "Age: ${age ?: "N/A"}"
        binding.emailResult.text = "Email: ${email ?: "N/A"}"
        binding.genderResult.text = "Gender: ${gender ?: "N/A"}"
    }

}