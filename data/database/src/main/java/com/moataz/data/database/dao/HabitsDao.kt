package com.moataz.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.moataz.data.database.entity.HabitEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface HabitsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertHabit(habitEntity: HabitEntity)

    @Query("SELECT * FROM HABIT_TABLE WHERE type = :type ORDER BY isCompleted ASC")
    fun getAllHabitsByTypeASC(type: String): Flow<List<HabitEntity>>

    @Query("UPDATE HABIT_TABLE SET isCompleted = :isCompleted WHERE habitId = :habitId")
    suspend fun updateHabitByCompleted(habitId: Long, isCompleted: Boolean)

    @Query("UPDATE HABIT_TABLE SET name = :name WHERE habitId = :habitId")
    suspend fun updateHabitByName(habitId: Long, name: String)

    @Query("DELETE FROM HABIT_TABLE WHERE habitId = :habitId")
    suspend fun deleteHabit(habitId: Long)
}