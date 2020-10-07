package com.example.detikoffline.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.detikoffline.Data.Data
import com.example.detikoffline.R
import com.example.detikoffline.detail.ActivityDetail
import kotlinx.android.synthetic.main.list_fragment.view.*

class Adapter(val context: Context, private val listNews : List<Data>) :
    RecyclerView.Adapter<MyHomeViewHolders>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHomeViewHolders {
        val view = LayoutInflater.from(context).inflate(R.layout.list_fragment,parent,false)
        return MyHomeViewHolders(view)
    }

    override fun getItemCount(): Int {
        return listNews.size
    }

    override fun onBindViewHolder(holder: MyHomeViewHolders, position: Int) {
        val dataNews = listNews[position]
        holder.setNews(dataNews,position)

        holder.itemView.setOnClickListener {
            val detail = Intent(context,ActivityDetail::class.java)
            detail.putExtra(ActivityDetail.newsTitle, dataNews.title)
            detail.putExtra(ActivityDetail.newsContent, dataNews.desc)
            detail.putExtra(ActivityDetail.newsPhoto, dataNews.photo.toString())
            context.startActivity(detail)
        }

    }
}

class MyHomeViewHolders(item: View):RecyclerView.ViewHolder(item){
    var currentNews: Data? = null
    var currentPosition: Int = 0

    fun setNews(current: Data, position : Int){
        itemView.Title.text = current.title
        itemView.Description.text = current.desc
        itemView.image.setImageResource(current.photo)

        this.currentNews
        this.currentPosition
    }
}
