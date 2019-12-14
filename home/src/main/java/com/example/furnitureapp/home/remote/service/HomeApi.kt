package com.example.furnitureapp.home.remote.service

import com.example.furnitureapp.home.remote.model.FurnitureResponseModel

/**
 * Created by kryptkode on 12/14/2019.
 */
interface HomeApi {
    suspend fun getPopularItems(): List<FurnitureResponseModel>
    suspend fun getNewArrivals(): List<FurnitureResponseModel>
}