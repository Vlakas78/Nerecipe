package ru.netology.nerecipe.data

import android.app.Application
import android.content.Context

class SharedPrefsSettingsRepository(
    application: Application
) : SettingsRepository {

    private val prefs = application.getSharedPreferences("repo", Context.MODE_PRIVATE)

    override fun saveStateSwitch(key: String, b: Boolean) = prefs.edit().putBoolean(key, b).apply()

    override fun getStateSwitch(key: String): Boolean = prefs.getBoolean(key, true)

}