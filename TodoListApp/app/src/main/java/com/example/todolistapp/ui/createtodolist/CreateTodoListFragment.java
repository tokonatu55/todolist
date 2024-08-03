package com.example.todolistapp.ui.createtodolist;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.todolistapp.R;

public class CreateTodoListFragment extends Fragment {

    private CreateTodoListFragment() {
    }

    public static CreateTodoListFragment newInstance() {
        CreateTodoListFragment fragment = new CreateTodoListFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_create_todo_list, container, false);
    }
}