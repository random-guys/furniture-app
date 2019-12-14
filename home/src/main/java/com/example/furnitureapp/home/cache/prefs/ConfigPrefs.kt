package com.example.furnitureapp.home.cache.prefs

/**
 * Created by kryptkode on 12/14/2019.
 */
interface ConfigPrefs {
    fun setLastCacheTime(lastCache: Long)
    fun getLastCacheTime(): Long
}