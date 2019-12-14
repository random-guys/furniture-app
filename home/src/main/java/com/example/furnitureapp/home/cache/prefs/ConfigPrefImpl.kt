package com.example.furnitureapp.home.cache.prefs

import android.content.SharedPreferences
import ptml.releasing.driver.app.data.local.BasePreferencesManager
import javax.inject.Inject

/**
 * Created by kryptkode on 12/14/2019.
 */
class ConfigPrefImpl @Inject constructor(sharedPreferences: SharedPreferences) :
    BasePreferencesManager(sharedPreferences), ConfigPrefs {

    private val prefLastSyncTime = "prefLastSyncTime"

    override fun setLastCacheTime(lastCache: Long) {
        return setLongPreference(prefLastSyncTime, lastCache)
    }

    override fun getLastCacheTime(): Long {
        return getLongPreference(prefLastSyncTime)
    }
}