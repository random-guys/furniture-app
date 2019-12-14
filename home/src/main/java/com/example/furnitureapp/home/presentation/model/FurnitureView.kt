package com.example.furnitureapp.home.presentation.model

/**
 * Created by kryptkode on 12/14/2019.
 */
data class FurnitureView(
    val name: String,
    val description: String,
    val rating: String,
    val image: String,
    val price: String,
    val length: String = "",
    val height: String = "",
    val depth: String = ""
)