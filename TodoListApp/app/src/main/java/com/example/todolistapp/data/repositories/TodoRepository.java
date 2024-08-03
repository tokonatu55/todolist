package com.example.todolistapp.data.repositories;

import android.content.Context;

import androidx.room.Room;

import com.example.todolistapp.data.dao.TodoDao;
import com.example.todolistapp.data.database.TodoDatabase;
import com.example.todolistapp.data.entities.Todo;

import java.util.List;

public class TodoRepository {

    private TodoDatabase db;
    private TodoDao todoDao;

    public TodoRepository(Context context) {
        db = Room.databaseBuilder(
                context, TodoDatabase.class,
                "todo-db"
        ).build();
        todoDao = db.todoDao();
    }

    public void insertTodoData(Todo todo) {
        todoDao.insert(todo);
    }

    public  List<Todo> getAllTodoData() {
        return todoDao.getAllTodo();
    }


}
