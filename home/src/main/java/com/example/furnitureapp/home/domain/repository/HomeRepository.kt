package com.example.furnitureapp.home.domain.repository

import com.example.furnitureapp.home.domain.model.Furniture

import kotlinx.coroutines.flow.Flow

/**
 * Created by kryptkode on 12/11/2019.
 */
interface HomeRepository {
    suspend fun getFurniture(): Flow<List<Furniture>>
}