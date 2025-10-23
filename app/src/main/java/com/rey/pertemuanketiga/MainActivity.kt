package com.rey.pertemuanketiga

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.rey.pertemuanketiga.ResultActivity
import com.rey.pertemuanketiga.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {

            val fullName = binding.fullName.text.toString().trim()
            val username = binding.username.text.toString().trim()
            val ageString = binding.age.text.toString().trim()
            val email = binding.email.text.toString().trim()
            val password = binding.password.text.toString()
            val confirmPassword = binding.confirmPassword.text.toString()

            val selectedGenderId = binding.gender.checkedRadioButtonId
            val gender = when (selectedGenderId) {
                binding.male.id -> "Laki-laki"
                binding.female.id -> "Perempuan"
                else -> "" // Kosong jika belum dipilih
            }

            val ageInt = ageString.toIntOrNull()

            if (ageInt == null) {
                Toast.makeText(this, "Kolom Age harus diisi dengan angka!", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            if (fullName.isEmpty() || username.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty() || gender.isEmpty()) {
                Toast.makeText(this, "Semua kolom harus diisi!", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            if (password != confirmPassword) {
                Toast.makeText(this, "Password dan Confirm Password tidak cocok!", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            val intent = Intent(this, ResultActivity::class.java).apply {
                putExtra("DATA_FULL_NAME", fullName)
                putExtra("DATA_USERNAME", username)
                putExtra("DATA_AGE", ageString)
                putExtra("DATA_EMAIL", email)
                putExtra("DATA_GENDER", gender)
            }
            startActivity(intent)
        }
    }
}