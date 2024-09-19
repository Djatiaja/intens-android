package com.example.tugasintent

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tugasintent.databinding.ActivityLoginBinding


class loginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            submitButton.setOnClickListener(){
                if (usernameInput.equals("")){
                    return@setOnClickListener
                }
                if (passwordInput.equals("")){
                    return@setOnClickListener
                }

                if (usernameInput.text.toString() != intent.getStringExtra("username")){
                    Toast.makeText(this@loginActivity, "User tidak ada", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

                if (passwordInput.text.toString() != intent.getStringExtra("password")){
                    Toast.makeText(this@loginActivity, "password salah", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

                var intentToDashboardActivity = Intent(this@loginActivity, dashboardActivity::class.java)

                intentToDashboardActivity.putExtra("username", usernameInput.text.toString())
                intentToDashboardActivity.putExtra("password", passwordInput.text.toString())
                intentToDashboardActivity.putExtra("email", intent.getStringExtra("email"))
                intentToDashboardActivity.putExtra("jenisKelamin", intent.getStringExtra("jenisKelamin"))
                intentToDashboardActivity.putExtra("telp", intent.getStringExtra("telp"))

                startActivity(intentToDashboardActivity)
            }
        }

    }
}