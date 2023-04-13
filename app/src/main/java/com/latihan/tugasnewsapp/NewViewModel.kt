package com.latihan.tugasnewsapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.thedeanda.lorem.LoremIpsum


class NewViewModel: ViewModel() {
    val listNewsData2 = arrayListOf(
        DataNews("Babak I: Man City Ungguli Soton 1-0", "09 Apr 2023", "Randy Prasatya", R.drawable.ligainggris, LoremIpsum.getInstance().getWords(80)),
        DataNews("Babak I: Man City Ungguli Soton 1-0", "09 Apr 2023", "Randy Prasatya", R.drawable.ligainggris, LoremIpsum.getInstance().getWords(80)),
        DataNews("Babak I: Man City Ungguli Soton 1-0", "09 Apr 2023", "Randy Prasatya", R.drawable.ligainggris, LoremIpsum.getInstance().getWords(80)),
        DataNews("Babak I: Man City Ungguli Soton 1-0", "09 Apr 2023", "Randy Prasatya", R.drawable.ligainggris, LoremIpsum.getInstance().getWords(80)),
        DataNews("Babak I: Man City Ungguli Soton 1-0", "09 Apr 2023", "Randy Prasatya", R.drawable.ligainggris, LoremIpsum.getInstance().getWords(80)),
        DataNews("Babak I: Man City Ungguli Soton 1-0", "09 Apr 2023", "Randy Prasatya", R.drawable.ligainggris, LoremIpsum.getInstance().getWords(80)),
    )
        val dataMut : MutableLiveData<List<DataNews>> = MutableLiveData(listNewsData2)
        val newsLd : LiveData<List<DataNews>> = dataMut
}