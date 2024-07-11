package com.example.profilescreen

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.profilescreen.databinding.ActivityProfileScreenBinding

class ProfileScreenActivity : AppCompatActivity() {
    lateinit var binding: ActivityProfileScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true);
        binding=ActivityProfileScreenBinding.inflate(layoutInflater)
        binding.GithubIcon.setOnClickListener{
            var githubClick=Intent(
                Intent.ACTION_VIEW, Uri.parse("https://github.com/Noha-Teaima")
            )
            startActivity(githubClick)
        }

        binding.LinkedInIcon.setOnClickListener{

            var linkedClick=Intent(
                Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/noha-teaima-ab2a1b239?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=ios_app")
            )
            startActivity(linkedClick)
        }

        binding.FacebookIcon.setOnClickListener{

            var facebookClick=Intent(
                Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/noha.teaima")
            )
            startActivity(facebookClick)
        }
        setContentView(binding.root)
    }
}