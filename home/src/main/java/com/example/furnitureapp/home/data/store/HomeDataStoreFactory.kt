package com.example.furnitureapp.home.data.store

import com.example.furnitureapp.core.utils.AppCoroutineDispatchers
import com.example.furnitureapp.home.data.repository.HomeDataStore
import kotlinx.coroutines.withContext
import javax.inject.Inject

class HomeDataStoreFactory @Inject constructor(
    private val cacheDataStore: HomeCacheDataStore,
    private val remoteDataStore: HomeRemoteDataSource,
    private val dispatchers: AppCoroutineDispatchers
) {

    suspend fun getDataStore(
        projectsCached: Boolean,
        cacheExpired: Boolean
    ): HomeDataStore {
        return if (projectsCached && !cacheExpired) {
            withContext(dispatchers.db) {
                cacheDataStore
            }
        } else {
            withContext(dispatchers.network) {
                remoteDataStore
            }
        }
    }

    suspend fun getCacheDataStore(): HomeDataStore {
        return withContext(dispatchers.db) {
            cacheDataStore
        }
    }

    suspend fun getRemoteDataStore(): HomeDataStore {
        return withContext(dispatchers.network) {
            remoteDataStore
        }
    }

}