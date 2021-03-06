package com.example.desafiopicpayandroid.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val userProfileAvatar: String,
    val userId: String,
    val userName: String,
    val cash: Double = 0.0
): Parcelable