package com.example.furnitureapp.home.cache.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.furnitureapp.core.cache.BaseDao
import com.example.furnitureapp.home.cache.model.CachedFurniture

/**
 * Created by kryptkode on 12/13/2019.
 */
@Dao
abstract class FurnitureDao : BaseDao<CachedFurniture> {
    @Query("SELECT * FROM cachedfurniture")
    abstract suspend fun fetchAllFurniture(): List<CachedFurniture>
}