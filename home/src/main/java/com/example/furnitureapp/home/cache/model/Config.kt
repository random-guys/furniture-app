package com.example.furnitureapp.home.cache.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Config(
    @PrimaryKey(autoGenerate = true)
    var id: Int = -1,
    var lastCacheTime: Long
)