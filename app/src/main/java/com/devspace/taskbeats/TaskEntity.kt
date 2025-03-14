package com.devspace.taskbeats

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TaskEntity(
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0,
    val category : String,
    val name : String

)
