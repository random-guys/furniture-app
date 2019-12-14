package com.example.furnitureapp.data.local

import com.example.furnitureapp.home.cache.DbHomeProvider
import com.example.furnitureapp.home.cache.dao.FurnitureDao
import javax.inject.Inject

/**
 * Created by kryptkode on 12/14/2019.
 */
class DbHomeProviderImpl
@Inject
constructor(private val db: AppRoomDatabase) : DbHomeProvider {

    override fun getFurnitureDao(): FurnitureDao {
        return db.furnitureDao()
    }
}