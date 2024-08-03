package com.example.todolistapp.data.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.todolistapp.data.entities.Todo;
import java.util.List;

@Dao
public interface TodoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Todo todo);

    @Query("SELECT * FROM Todo")
    List<Todo> getAllTodo();

    @Update
    void update(Todo todo);

    @Delete
    void delete(Todo todo);

}
