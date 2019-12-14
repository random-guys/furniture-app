package ptml.releasing.driver.app.data.local

import android.content.SharedPreferences

/**
 * Created by kryptkode on 10/23/2019.
 */

abstract class BasePreferencesManager(protected val sharedPreferences: SharedPreferences) {


    protected val defaultStringValue = "{}"

    protected fun setStringPreference(key: String, value: String) {
        sharedPreferences.edit()
            .putString(key, value)
            .apply()
    }

    protected fun getStringPreference(
        key: String,
        defaultValue: String = defaultStringValue
    ): String {
        return sharedPreferences.getString(key, defaultValue) ?: defaultStringValue
    }

    protected fun setIntPreference(key: String, value: Int) {
        sharedPreferences.edit()
            .putInt(key, value)
            .apply()
    }

    protected fun getIntPreference(key: String): Int {
        return sharedPreferences.getInt(key, -1)
    }


    protected fun setLongPreference(key: String, value: Long) {
        sharedPreferences.edit()
            .putLong(key, value)
            .apply()
    }

    protected fun getLongPreference(key: String): Long {
        return sharedPreferences.getLong(key, -1)
    }

    protected fun getBooleanPreference(key: String, defaultValue: Boolean = false): Boolean {
        return sharedPreferences.getBoolean(key, defaultValue)
    }

    protected fun setBooleanPreference(key: String, value: Boolean) {
        sharedPreferences.edit()
            .putBoolean(key, value)
            .apply()
    }
}