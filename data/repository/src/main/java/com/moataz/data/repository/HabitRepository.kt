package com.moataz.data.repository

import com.moataz.data.database.entity.HabitEntity
import kotlinx.coroutines.flow.Flow

interface HabitRepository {
    suspend fun insertHabit(habit: HabitEntity)
    fun getAllHabitsByType(habitType: String): Flow<List<HabitEntity>>
    suspend fun updateHabitByCompleted(habit: HabitEntity, isCompleted: Boolean)
    suspend fun updateHabitByName(habit: HabitEntity, name: String)
    suspend fun deleteHabit(habit: HabitEntity)
}