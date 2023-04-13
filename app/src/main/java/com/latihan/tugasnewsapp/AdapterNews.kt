package com.latihan.tugasnewsapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.latihan.tugasnewsapp.databinding.ListBeritaBinding

class AdapterNews(var listNews : ArrayList<DataNews>): RecyclerView.Adapter<AdapterNews.ViewHolder>() {

    class ViewHolder(val binding : ListBeritaBinding):  RecyclerView.ViewHolder(binding.root) {

        fun bindItems(itemNews : DataNews){
            binding.dataNews = itemNews
            binding.listItemBerita.setOnClickListener{
                val intent = Intent(binding.root.context, NewsDetail::class.java)
                intent.putExtra("DATA", itemNews)
                binding.root.context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterNews.ViewHolder {
        var view = ListBeritaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterNews.ViewHolder, position: Int) = holder.bindItems(listNews[position])

    override fun getItemCount(): Int = listNews.size

    fun setData(list: ArrayList<DataNews>){
        this.listNews.addAll(list)
    }
}


