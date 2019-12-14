package com.example.furnitureapp.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.furnitureapp.home.cache.dao.FurnitureDao

import com.example.furnitureapp.home.cache.model.CachedFurniture

@Database(
    entities = [CachedFurniture::class],
    version = DatabaseMigrations.latestVersion,
    exportSchema = false
)
abstract class AppRoomDatabase : RoomDatabase() {

    abstract fun furnitureDao(): FurnitureDao

    companion object {

        private const val databaseName = "furniture-db"

        fun buildDefault(context: Context) =
            Room.databaseBuilder(context, AppRoomDatabase::class.java, databaseName)
                .addMigrations(*DatabaseMigrations.migrations)
                .build()
    }
}