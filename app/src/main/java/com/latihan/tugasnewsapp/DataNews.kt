package com.latihan.tugasnewsapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DataNews(val judulBerita: String,
                    val tglBerita: String,
                    val penulisBerita: String,
                    val img: Int,
                    val contentBerita: String
                    ) : Parcelable
