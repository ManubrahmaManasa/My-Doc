package com.devedroy.mydoc

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.devedroy.mydoc.databinding.LogInBinding
import com.devedroy.mydoc.views.homepage.HomePageActivity

class LogInActivity  : AppCompatActivity() {

    private lateinit var binding:LogInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= LogInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener(){
            startActivity(Intent(this@LogInActivity, HomePageActivity::class.java))

        }
    }


}