package com.example.furnitureapp.home.data.repository

import com.example.furnitureapp.home.data.model.FurnitureEntity
import kotlinx.coroutines.flow.Flow

/**
 * Created by kryptkode on 12/11/2019.
 */
interface HomeCache {
    suspend fun saveFurniture(items: List<FurnitureEntity>)
    suspend fun getFurniture(): Flow<List<FurnitureEntity>>

    suspend fun areFurnitureCached(): Flow<Boolean>
    suspend fun setLastCacheTime(lastCache: Long)
    suspend fun isFurnitureCacheExpired(): Flow<Boolean>

}