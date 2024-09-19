package com.example.tugasintent

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tugasintent.databinding.ActivityDashboardBinding

class dashboardActivity : AppCompatActivity() {
    lateinit var binding: ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            usernameText.setText(intent.getStringExtra("username"))
            emailText.setText(intent.getStringExtra("email"))
            jkText.setText(intent.getStringExtra("jenisKelamin"))
            telpText.setText(intent.getStringExtra("telp"))
        }
    }
}