package com.example.furnitureapp.data.local.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.furnitureapp.data.model.HomeItem

@Dao
interface FurnitureDao {

    @Query("select * from homeitem")
    fun fetchAllDao(): List<HomeItem>
}