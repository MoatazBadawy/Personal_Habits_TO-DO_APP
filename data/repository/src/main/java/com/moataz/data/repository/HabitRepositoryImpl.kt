package com.moataz.data.repository

import com.moataz.data.database.dao.HabitsDao
import com.moataz.data.database.entity.HabitEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class HabitRepositoryImpl @Inject constructor(
    private val dao: HabitsDao
) : HabitRepository {

    override suspend fun insertHabit(habit: HabitEntity) {
        dao.insertHabit(habit)
    }

    override fun getAllHabitsByType(habitType: String): Flow<List<HabitEntity>> {
        return dao.getAllHabitsByType(habitType)
    }

    override suspend fun updateHabitByCompleted(habit: HabitEntity, isCompleted: Boolean) {
        dao.updateHabitByCompleted(habit.habitId, isCompleted)
    }

    override suspend fun updateHabitByName(habit: HabitEntity, name: String) {
        dao.updateHabitByName(habit.habitId, name)
    }

    override suspend fun deleteHabit(habit: HabitEntity) {
        dao.deleteHabit(habit.habitId)
    }
}