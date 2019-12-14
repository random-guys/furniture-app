package com.example.furnitureapp.home.data.model

/**
 * Created by kryptkode on 12/11/2019.
 */
data class FurnitureEntity(
    val name: String,
    val description: String,
    val rating: String,
    val image: String,
    val price: String,
    val length: String = "",
    val height: String = "",
    val depth: String = ""
)