package com.example.profilescreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.profilescreen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        binding.button.setOnClickListener{

        val intent=Intent(this,ProfileScreenActivity::class.java)
        startActivity(intent)

        }


        setContentView(binding.root)
    }
}