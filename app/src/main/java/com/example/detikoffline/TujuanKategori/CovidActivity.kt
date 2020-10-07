package com.example.detikoffline.TujuanKategori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.detikoffline.Data.DataCovid
import com.example.detikoffline.R
import com.example.detikoffline.adapter.CovidAdapter
import com.example.detikoffline.detail.DetailCovid
import kotlinx.android.synthetic.main.activity_covid.*

class CovidActivity : AppCompatActivity() {
    private lateinit var covidadapter : CovidAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_covid)

        //utak atik Headline Covid
        var bigPicCovid:DataCovid? = null
        if (DataCovid.CovidModel.covidList.isNotEmpty()){
            bigPicCovid = DataCovid.CovidModel.covidList[DataCovid.CovidModel.covidList.size -1]
            textView4.text = bigPicCovid.covidTitle
            textView5.text = bigPicCovid.covidDate
            headlinesCovid.setImageResource(R.drawable.corona)
        }

        //layout recycler
        val linearmanager = LinearLayoutManager(this)
        linearmanager.orientation = LinearLayoutManager.VERTICAL
        recyclerCovid.layoutManager = linearmanager

        //ngasih adapter dan kasih tau yang mana data yg di ambil
        covidadapter = CovidAdapter(this,DataCovid.CovidModel.covidList)
        recyclerCovid.adapter = covidadapter

        //ngasih tau ketika headline di klik
        headlinesCovid.setOnClickListener {
            val toCovidDetail = Intent(this,DetailCovid::class.java)
            toCovidDetail.putExtra(DetailCovid.covidTitle,bigPicCovid?.covidTitle)
            toCovidDetail.putExtra(DetailCovid.covidDescription,bigPicCovid?.covidDetail)
            toCovidDetail.putExtra(DetailCovid.covidPhoto,bigPicCovid?.covidPhoto.toString())
            startActivity(toCovidDetail)
        }
    }
}