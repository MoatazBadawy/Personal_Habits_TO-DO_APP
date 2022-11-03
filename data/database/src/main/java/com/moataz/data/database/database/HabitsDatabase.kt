package com.moataz.data.database.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.moataz.data.database.dao.HabitsDao
import com.moataz.data.database.entity.HabitEntity

@Database(
    entities = [HabitEntity::class],
    version = 1
)
abstract class HabitsDatabase : RoomDatabase() {
    abstract fun habitDao(): HabitsDao
}