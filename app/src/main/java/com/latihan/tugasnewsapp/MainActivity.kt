package com.latihan.tugasnewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.latihan.tugasnewsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    lateinit var setViewModel: NewViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val adapterNews1 = AdapterNews(ArrayList())
        val lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvMain.layoutManager = lm
        binding.rvMain.adapter = adapterNews1

        setViewModel = ViewModelProvider(this)[NewViewModel::class.java]
        setViewModel.newsLd.observe(this,){
            adapterNews1.setData(it as ArrayList<DataNews>)
        }

    }
}