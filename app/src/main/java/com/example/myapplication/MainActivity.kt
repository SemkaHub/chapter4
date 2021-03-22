package com.example.myapplication

import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private final val images = arrayOf(
        R.drawable.children, R.drawable.adult, R.drawable.elder,
        R.drawable.animal, R.drawable.event
    )
    private final val texts = arrayOf("Дети", "Взрослые", "Пожилые", "Животные", "Мероприятия")

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

        //
        val recyclerView: RecyclerView = findViewById(R.id.recycleView)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = MyAdapter(images, texts)
    }

    override fun onBackPressed() {
        finish()
    }

}