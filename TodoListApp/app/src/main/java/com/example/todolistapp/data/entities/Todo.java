package com.example.todolistapp.data.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "todo")
public class Todo {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "todo_title")
    public String todoTitle;
}
