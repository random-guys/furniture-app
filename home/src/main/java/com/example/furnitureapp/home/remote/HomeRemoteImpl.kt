package com.example.furnitureapp.home.remote

import com.example.furnitureapp.home.data.model.FurnitureEntity
import com.example.furnitureapp.home.data.repository.HomeRemote
import com.example.furnitureapp.home.remote.mapper.FurnitureResponseMapper
import com.example.furnitureapp.home.remote.service.HomeApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

/**
 * Created by kryptkode on 12/14/2019.
 */
class HomeRemoteImpl
@Inject constructor(
    private val api: HomeApi,
    private val mapper: FurnitureResponseMapper
) : HomeRemote {

    override suspend fun getFurniture(): Flow<List<FurnitureEntity>> {
        return flow {
            emit(api.getPopularItems().map {
                mapper.mapFromModel(it)
            })
        }
    }
}