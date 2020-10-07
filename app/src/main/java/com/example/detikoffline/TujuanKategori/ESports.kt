package com.example.detikoffline.TujuanKategori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.detikoffline.Data.DataESports
import com.example.detikoffline.R
import com.example.detikoffline.adapter.EsportAdapter
import com.example.detikoffline.detail.DetailSports
import kotlinx.android.synthetic.main.activity_e_sports.*

class ESports : AppCompatActivity() {
    private lateinit var sportAdapter:EsportAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_e_sports)

        //masukin headline dulu
        var headline:DataESports? = null
        if (DataESports.EsportModel.sportList.isNotEmpty()){
            headline = DataESports.EsportModel.sportList[DataESports.EsportModel.sportList.size-1]
            titleheadlinessports.text = headline.titleESport
            descheadlinesports.text = headline.date
            imageheadlinesSports.setImageResource(R.drawable.evos_juara)

            val linearLayoutManager = LinearLayoutManager(this)
            linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
            recyclerEsports.layoutManager = linearLayoutManager

            sportAdapter = EsportAdapter(this, DataESports.EsportModel.sportList)
            recyclerEsports.adapter = sportAdapter

            imageheadlinesSports.setOnClickListener {
                val todetailsports = Intent(this, DetailSports::class.java)
                todetailsports.putExtra(DetailSports.sportTitle,headline.titleESport)
                todetailsports.putExtra(DetailSports.sportdescription,headline.detailESports)
                todetailsports.putExtra(DetailSports.sportphoto,headline.photoEsport.toString())
                startActivity(todetailsports)
            }
        }
    }
}