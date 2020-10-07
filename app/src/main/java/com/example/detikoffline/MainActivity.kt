package com.example.detikoffline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.detikoffline.Fragment.*
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNav.setOnNavigationItemSelectedListener(onBottomNavigationListener)

        var frag = supportFragmentManager.beginTransaction()
        frag.add(R.id.frame,HomeFragment())
        frag.commit()
    }

    private val onBottomNavigationListener = BottomNavigationView.OnNavigationItemSelectedListener { a ->
        var selectedFragment : Fragment = HomeFragment()

        when(a.itemId){
            R.id.homeBotNav ->{
                selectedFragment = HomeFragment()
            }

            R.id.layanan ->{
                selectedFragment = LayananFragment()
            }

            R.id.kategori ->{
                selectedFragment = KategoriFragment()
            }

            R.id.video -> {
                selectedFragment = VideoFragment()
            }
        }

        var frag = supportFragmentManager.beginTransaction()
        frag.replace(R.id.frame,selectedFragment)
        frag.commit()

        true
    }
}
