package com.example.myapplication

import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.FrameLayout
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Установка тулбара
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setActionBar(toolbar)
        toolbar.setNavigationOnClickListener { onBackPressed() }

        actionBar?.run {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
            setDisplayShowTitleEnabled(false)
        }

        // Круглая тень у кнопки помочь
        findViewById<FrameLayout>(R.id.frame_heart).background.level = 2400
    }

    override fun onBackPressed() {
        finish()
    }

}