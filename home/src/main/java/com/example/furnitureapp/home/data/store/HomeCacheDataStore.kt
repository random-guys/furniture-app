package com.example.furnitureapp.home.data.store

import com.example.furnitureapp.home.data.model.FurnitureEntity
import com.example.furnitureapp.home.data.repository.HomeCache
import com.example.furnitureapp.home.data.repository.HomeDataStore
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * Created by kryptkode on 12/11/2019.
 */
class HomeCacheDataStore @Inject constructor(
    private val homeCache: HomeCache
) : HomeDataStore {

    override suspend fun saveFurniture(items: List<FurnitureEntity>) {
        return homeCache.saveFurniture(items)
    }

    override suspend fun getFurniture(): Flow<List<FurnitureEntity>> {
        return homeCache.getFurniture()
    }

    override suspend fun areFurnitureCached(): Flow<Boolean> {
        return homeCache.areFurnitureCached()
    }

    override suspend fun setLastCacheTime(lastCache: Long) {
        return homeCache.setLastCacheTime(lastCache)
    }

    override suspend fun isFurnitureCacheExpired(): Flow<Boolean> {
        return homeCache.isFurnitureCacheExpired()
    }
}