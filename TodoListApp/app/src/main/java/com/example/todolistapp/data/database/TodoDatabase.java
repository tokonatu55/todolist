package com.example.todolistapp.data.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.example.todolistapp.data.dao.TodoDao;
import com.example.todolistapp.data.entities.Todo;

@Database(entities = {Todo.class}, exportSchema = false, version = 1)
public abstract class TodoDatabase extends RoomDatabase {
    public abstract TodoDao todoDao();
}
