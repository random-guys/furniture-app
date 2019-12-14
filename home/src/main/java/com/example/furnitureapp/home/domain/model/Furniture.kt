package com.example.furnitureapp.home.domain.model

data class Furniture(
    val name: String,
    val description: String,
    val rating: String,
    val image: String,
    val price: String,
    val length: String = "",
    val height: String = "",
    val depth: String = ""
)
