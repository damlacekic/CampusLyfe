package com.example.campuslyfe.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(val adSoyad: String? = null , val bolum: String? = null , val bilgi: String? = null) : Parcelable
