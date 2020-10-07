package com.example.detikoffline.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.detikoffline.Data.Data
import com.example.detikoffline.R
import com.example.detikoffline.adapter.Adapter
import com.example.detikoffline.detail.ActivityDetail
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment:Fragment(){
    private lateinit var newsHomeAdapter: Adapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var headline:Data? = null
        if (Data.NewsModel.newsList.isNotEmpty()){
            headline=Data.NewsModel.newsList[Data.NewsModel.newsList.size-1]
            titleHomeFrag.text = headline.title
            descHomeFrag.text=headline.title
            imageView4.setImageResource(headline.photo)
        }

        imageView4.setOnClickListener {
            val intent = Intent(context,ActivityDetail::class.java)
            intent.putExtra(ActivityDetail.newsTitle,headline?.title)
            intent.putExtra(ActivityDetail.newsPhoto,headline?.photo.toString())
            intent.putExtra(ActivityDetail.newsContent,headline?.desc)
            startActivity(intent)
        }

        val linearManager = LinearLayoutManager(context)
        linearManager.orientation = LinearLayoutManager.VERTICAL
        recycler.layoutManager = linearManager

        newsHomeAdapter = Adapter(context!!, Data.NewsModel.newsList)
        recycler.adapter = newsHomeAdapter
    }

}