package com.example.detikoffline.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.detikoffline.Data.DataESports
import com.example.detikoffline.R
import com.example.detikoffline.detail.DetailSports
import kotlinx.android.synthetic.main.listesport.view.*

class EsportAdapter(val context: Context, private val listEsports: List<DataESports>) :
    RecyclerView.Adapter<AdapterEsports>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterEsports {
        val view = LayoutInflater.from(context).inflate(R.layout.listesport,parent,false)
        return AdapterEsports(view)
    }

    override fun getItemCount(): Int {
        return listEsports.size
    }

    override fun onBindViewHolder(holder: AdapterEsports, position: Int) {
        val dataepsorts = listEsports[position]
        holder.setENews(dataepsorts,position)

        holder.itemView.setOnClickListener {
            val detailSportRV = Intent(this.context,DetailSports::class.java)
            detailSportRV.putExtra(DetailSports.sportTitle, dataepsorts.titleESport)
            detailSportRV.putExtra(DetailSports.sportTitle, dataepsorts.titleESport)
            detailSportRV.putExtra(DetailSports.sportphoto, dataepsorts.photoEsport.toString())
            context.startActivity(detailSportRV)
        }
    }
}

class AdapterEsports(item: View):RecyclerView.ViewHolder(item) {
    var currentES : DataESports? = null
    var currentpositionEs : Int = 0

    fun setENews(current : DataESports, position: Int){
        itemView.titleEsport.text = current.titleESport
        itemView.DescriptionEsport.text = current.detailESports
        itemView.imageEsport.setImageResource(current.photoEsport)

        this.currentES
        this.currentpositionEs
    }
}
