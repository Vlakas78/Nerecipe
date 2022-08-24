package ru.netology.nerecipe.data

interface SettingsRepository {

    fun saveStateSwitch(key: String, b: Boolean)
    fun getStateSwitch(key: String):Boolean

}