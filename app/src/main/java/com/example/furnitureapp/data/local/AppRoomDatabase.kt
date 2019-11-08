package com.example.furnitureapp.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.furnitureapp.data.local.dao.FurnitureDao
import com.example.furnitureapp.data.model.HomeItem

@Database(entities = [HomeItem::class], version = DatabaseMigrations.latestVersion)
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