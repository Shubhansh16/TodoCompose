package com.example.todo.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface TodoDao {
    @Insert
    fun addTodo(todo:TodoEntity)

    @Query("SELECT * FROM 'todos'")
    fun getTodos(): Flow<List<TodoEntity>>

    @Update
    fun updateTodo(todo:TodoEntity)

    @Delete
    fun deleteTodo(todo:TodoEntity)
}