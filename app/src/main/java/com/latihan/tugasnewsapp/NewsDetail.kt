package com.latihan.tugasnewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.latihan.tugasnewsapp.databinding.ActivityNewsDetailBinding

class NewsDetail : AppCompatActivity() {

    lateinit var binding : ActivityNewsDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityNewsDetailBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val dataDetail = intent.getParcelableExtra<DataNews>("DATA")
        binding.dataNews = dataDetail

    }
}