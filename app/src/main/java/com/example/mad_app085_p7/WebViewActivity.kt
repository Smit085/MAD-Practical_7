package com.example.mad_app085_p7

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.widget.MediaController
import androidx.core.view.WindowCompat
import com.example.mad_app085_p7.databinding.ActivityWebViewBinding

class WebViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWebViewBinding
    override fun onCreate (savedInstancestate: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstancestate)

        binding = ActivityWebViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initWebVideoPlayer()
        binding.btnSwitch.setOnClickListener{
            Intent(this,MainActivity::class.java).also{ startActivity(it) }
        }
    }
    private fun initWebVideoPlayer(){
        val webSettings: WebSettings = binding.webvideoView.Settings
    }
}