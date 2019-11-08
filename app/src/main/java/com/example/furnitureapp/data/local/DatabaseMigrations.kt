package com.example.furnitureapp.data.local

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

internal object DatabaseMigrations {

    // Bump this on changing the schema
    const val latestVersion = 1

    val migrations: Array<Migration>
        get() = arrayOf(

        )

    fun migration_1_2() = object : Migration(1, 2) {
        override fun migrate(database: SupportSQLiteDatabase) {

        }

    }
}