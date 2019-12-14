package com.example.furnitureapp.home.data.repository

import com.example.furnitureapp.home.data.mapper.FurnitureMapper
import com.example.furnitureapp.home.data.store.HomeDataStoreFactory
import com.example.furnitureapp.home.domain.model.Furniture
import com.example.furnitureapp.home.domain.repository.HomeRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flatMapConcat
import kotlinx.coroutines.flow.map
import javax.inject.Inject

/**
 * Created by kryptkode on 12/11/2019.
 */
@FlowPreview
@ExperimentalCoroutinesApi
class HomeRepositoryImpl
@Inject constructor(
    private val mapper: FurnitureMapper,
    private val factory: HomeDataStoreFactory
) : HomeRepository {


    override suspend fun getFurniture(): Flow<List<Furniture>> {
        return factory.getCacheDataStore().areFurnitureCached().combine(
            factory.getCacheDataStore().isFurnitureCacheExpired()
        ) { cached, expired ->
            Pair(cached, expired)
        }.flatMapConcat {
            factory.getDataStore(it.first, it.second).getFurniture()
                .map { list ->
                    list.map { item ->
                        mapper.mapFromEntity(item)
                    }
                }
        }
    }
}