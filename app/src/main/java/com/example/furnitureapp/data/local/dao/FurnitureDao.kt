package com.example.furnitureapp.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.furnitureapp.data.model.HomeItem

@Dao
interface FurnitureDao {

    @Query("select * from homeitem")
    fun fetchAllDao(): List<HomeItem>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveHomeFurniture(furnitures: ArrayList<HomeItem>): List<Long>
}