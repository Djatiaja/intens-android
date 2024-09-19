package com.example.tugasintent

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tugasintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            submitButton.setOnClickListener(){
                if (usernameInput.equals("")){
                    Toast.makeText(this@MainActivity, "Mohon masukan username", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
                if (passwordInput.equals("")){
                    Toast.makeText(this@MainActivity, "Mohon masukan password", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
                if (emailInput.equals("")){
                    Toast.makeText(this@MainActivity, "Mohon masukan email", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
                if (jenisKelaminInput.equals("")){
                    Toast.makeText(this@MainActivity, "Mohon masukan jenis kelamin", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

                var intentTologinActivity = Intent(this@MainActivity, loginActivity::class.java)

                intentTologinActivity.putExtra("username", usernameInput.text.toString())
                intentTologinActivity.putExtra("password", passwordInput.text.toString())
                intentTologinActivity.putExtra("email", emailInput.text.toString())
                intentTologinActivity.putExtra("jenisKelamin", jenisKelaminInput.text.toString())
                intentTologinActivity.putExtra("telp", noTelpInput.text.toString())

                startActivity(intentTologinActivity)
            }
        }
    }

}