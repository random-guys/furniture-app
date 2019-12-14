package com.example.furnitureapp.home.cache

import com.example.furnitureapp.home.cache.mapper.CacheFurnitureMapper
import com.example.furnitureapp.home.cache.prefs.ConfigPrefs
import com.example.furnitureapp.home.data.model.FurnitureEntity
import com.example.furnitureapp.home.data.repository.HomeCache
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

/**
 * Created by kryptkode on 12/11/2019.
 */
class HomeCacheImpl @Inject constructor(
    private val dbHomeProvider: DbHomeProvider,
    private val configPrefs: ConfigPrefs,
    private val mapper: CacheFurnitureMapper
) : HomeCache {

    override suspend fun saveFurniture(items: List<FurnitureEntity>) {
        return dbHomeProvider.getFurnitureDao().insert(items.map { mapper.mapToCached(it) })
    }

    override suspend fun getFurniture(): Flow<List<FurnitureEntity>> {
        return flow {
            emit(
                dbHomeProvider.getFurnitureDao().fetchAllFurniture().map { mapper.mapFromCached(it) }
            )
        }

    }

    override suspend fun areFurnitureCached(): Flow<Boolean> {
        return flow {
            emit(
                dbHomeProvider.getFurnitureDao().fetchAllFurniture().isNotEmpty()
            )
        }
    }

    override suspend fun setLastCacheTime(lastCache: Long) {
        return configPrefs.setLastCacheTime(lastCache)
    }

    override suspend fun isFurnitureCacheExpired(): Flow<Boolean> {
        return flow {
            val currentTime = System.currentTimeMillis()
            val expirationTime = (60 * 10 * 1000).toLong()
            val lastCacheTime = configPrefs.getLastCacheTime()
            emit((currentTime - lastCacheTime) > expirationTime)
        }

    }
}