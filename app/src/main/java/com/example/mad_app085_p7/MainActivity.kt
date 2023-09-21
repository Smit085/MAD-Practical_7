package com.example.mad_app085_p7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowCompat

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate (savedInstancestate: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstancestate)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initiatePlayer()
        binding.btn_switch
    }
}