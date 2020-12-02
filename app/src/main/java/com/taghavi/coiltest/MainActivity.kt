package com.taghavi.coiltest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import coil.api.load
import coil.transform.CircleCropTransformation
import com.taghavi.coiltest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        val disposable =
            binding.imageView.load("https://file.example.vn/images/file_example_JPG_100kB.jpg") {
                placeholder(R.drawable.ic_launcher_foreground)
                error(android.R.drawable.ic_delete)
                transformations(CircleCropTransformation())
            }

        Handler(Looper.getMainLooper()).postDelayed({
            disposable.dispose()
        }, 10000)
    }
}