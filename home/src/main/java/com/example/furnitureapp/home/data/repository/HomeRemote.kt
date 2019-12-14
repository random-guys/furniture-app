package com.example.furnitureapp.home.data.repository

import com.example.furnitureapp.home.data.model.FurnitureEntity
import kotlinx.coroutines.flow.Flow

/**
 * Created by kryptkode on 12/11/2019.
 */
interface HomeRemote {
    suspend fun getFurniture(): Flow<List<FurnitureEntity>>
}