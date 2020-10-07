package com.example.detikoffline.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.detikoffline.R
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_detail_sports.*
import kotlinx.android.synthetic.main.activity_detail_sports.img_toolbar_sport

class DetailSports : AppCompatActivity() {

    companion object{
        const val sportTitle = "judul berita"
        const val sportdescription = "deskripsi berita"
        const val sportphoto = "foto berita"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_sports)

        txt_TitleSport.setText(intent.getStringExtra(sportTitle))
        txt_kontenSports.setText(intent.getStringExtra(sportdescription))
        img_toolbar_sport.setImageResource(intent.getStringExtra(sportphoto).toInt())
    }
}