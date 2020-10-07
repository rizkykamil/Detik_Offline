package com.example.detikoffline.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.detikoffline.Data.DataCovid
import com.example.detikoffline.R
import com.example.detikoffline.detail.DetailCovid
import kotlinx.android.synthetic.main.list_covid.view.*

class CovidAdapter(val context: Context, private val listCovid : List<DataCovid>) :
    RecyclerView.Adapter<MyCovidAdapter>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyCovidAdapter {
        val view = LayoutInflater.from(context).inflate(R.layout.list_covid,parent,false)
        return MyCovidAdapter(view)
    }

    override fun getItemCount(): Int {
        return listCovid.size
    }

    override fun onBindViewHolder(holder: MyCovidAdapter, position: Int) {
        val data = listCovid[position]
        holder.setCovidNews(data,position)

        holder.itemView.setOnClickListener {
            val toCovidDetail = Intent(this.context, DetailCovid::class.java)
            toCovidDetail.putExtra(DetailCovid.covidTitle,data.covidTitle)
            toCovidDetail.putExtra(DetailCovid.covidDescription,data.covidDetail)
            toCovidDetail.putExtra(DetailCovid.covidPhoto,data.covidPhoto.toString())
            context.startActivity(toCovidDetail)
        }
    }

}

class MyCovidAdapter(item: View): RecyclerView.ViewHolder(item) {
    var currentCovid : DataCovid? = null
    var currentposition : Int = 0

    fun setCovidNews(current: DataCovid, position: Int){
        itemView.imageViewCovid.setImageResource(current.covidPhoto)
        itemView.textViewCovid.setText(current.covidTitle)
        itemView.textViewDescCovid.setText(current.covidDetail)

        this.currentCovid
        this.currentposition
    }
}


