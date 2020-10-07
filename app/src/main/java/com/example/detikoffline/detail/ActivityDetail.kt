package com.example.detikoffline.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.detikoffline.R
import kotlinx.android.synthetic.main.activity_detail.*

class ActivityDetail : AppCompatActivity() {

    companion object{
        const val newsTitle = "judul berita"
        const val newsContent = "konten berita"
        const val newsPhoto = "foto berita"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        txt_TitleNews.setText(intent.getStringExtra(newsTitle))
        txt_kontenNews.setText(intent.getStringExtra(newsContent))
        img_toolbar_sport.setImageResource(intent.getStringExtra(newsPhoto).toInt())
    }
}