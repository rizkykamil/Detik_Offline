package com.example.detikoffline.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.detikoffline.TujuanKategori.CovidActivity
import com.example.detikoffline.TujuanKategori.ESports
import com.example.detikoffline.R
import kotlinx.android.synthetic.main.fragment_kategori.*

class KategoriFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kategori, container, false)
    }

    override fun onStart() {
        super.onStart()
        esports.setOnClickListener {
            val toEsports = Intent(context,
                ESports::class.java)
            startActivity(toEsports)
        }

        covid.setOnClickListener {
            val toCovid = Intent(context,
                CovidActivity::class.java)
            startActivity(toCovid)
        }
    }
}