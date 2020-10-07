package com.example.detikoffline.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.detikoffline.R
import kotlinx.android.synthetic.main.activity_detail_covid.*

class DetailCovid : AppCompatActivity() {

    companion object{
        const val covidTitle = "judul covid"
        const val covidDescription = "deskripsi covid"
        const val covidPhoto = "foto covid"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_covid)

        txt_TitleCovid.setText(intent.getStringExtra(covidTitle))
        txt_kontenCovid.setText(intent.getStringExtra(covidDescription))
        imgDetailCovid.setImageResource(intent.getStringExtra(covidPhoto).toInt())
    }
}