package com.example.furnitureapp.home.data.store

import com.example.furnitureapp.home.data.model.FurnitureEntity
import com.example.furnitureapp.home.data.repository.HomeDataStore
import com.example.furnitureapp.home.data.repository.HomeRemote
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * Created by kryptkode on 12/11/2019.
 */
class HomeRemoteDataSource
@Inject constructor(
    private val remote: HomeRemote
) : HomeDataStore {

    override suspend fun saveFurniture(items: List<FurnitureEntity>) {
        throw UnsupportedOperationException("Saving furniture isn't supported here...")
    }

    override suspend fun getFurniture(): Flow<List<FurnitureEntity>> {
        return remote.getFurniture()
    }

    override suspend fun areFurnitureCached(): Flow<Boolean> {
        throw UnsupportedOperationException("This isn't supported here...")
    }

    override suspend fun setLastCacheTime(lastCache: Long) {
        throw UnsupportedOperationException("This isn't supported here...")
    }

    override suspend fun isFurnitureCacheExpired(): Flow<Boolean> {
        throw UnsupportedOperationException("This isn't supported here...")
    }
}