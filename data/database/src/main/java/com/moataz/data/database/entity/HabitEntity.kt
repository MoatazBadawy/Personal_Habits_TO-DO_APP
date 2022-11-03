package com.moataz.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.moataz.data.database.constant.DatabaseConstant.HABIT_TABLE

@Entity(tableName = HABIT_TABLE)
data class HabitEntity(
    @PrimaryKey(autoGenerate = true)
    val habitId: Long = 0,
    val name: String,
    val type: String,
    val isCompleted: Boolean,
)