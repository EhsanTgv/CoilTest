package com.taghavi.coiltest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.api.load
import com.taghavi.coiltest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView.load("https://file.example.vn/images/file_example_JPG_100kB.jpg") {
            placeholder(R.drawable.ic_launcher_foreground)
            error(android.R.drawable.ic_delete)
        }
    }
}