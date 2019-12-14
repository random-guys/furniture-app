package com.example.furnitureapp.home.remote.model

/**
 * Created by kryptkode on 12/11/2019.
 */
data class FurnitureResponseModel(
    val name: String,
    val description: String,
    val rating: String,
    val image: String,
    val price: String,
    val length: String = "",
    val height: String = "",
    val depth: String = ""
)