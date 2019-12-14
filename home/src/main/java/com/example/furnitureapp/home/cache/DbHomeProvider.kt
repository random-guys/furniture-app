package com.example.furnitureapp.home.cache

import com.example.furnitureapp.home.cache.dao.FurnitureDao

/**
 * Created by kryptkode on 12/14/2019.
 */
interface DbHomeProvider {
    fun getFurnitureDao(): FurnitureDao
}