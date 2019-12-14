package com.example.furnitureapp.home.cache.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by kryptkode on 12/11/2019.
 */
@Entity
data class CachedFurniture(
    @ColumnInfo(name = "name") var name: String,
    @ColumnInfo(name = "description") var description: String,
    @ColumnInfo(name = "rating") var rating: String,
    @ColumnInfo(name = "image") var image: String,
    @ColumnInfo(name = "price") var price: String,
    @ColumnInfo(name = "length")
    val length: String = "",
    @ColumnInfo(name = "height")
    val height: String = "",
    @ColumnInfo(name = "depth")
    val depth: String = "",
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    val id: Int = -1
)