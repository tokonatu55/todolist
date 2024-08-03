package com.example.todolistapp.ui.todolist;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.todolistapp.R;
import com.example.todolistapp.ui.todolist.adapter.TodoListAdapter;

import java.util.ArrayList;
import java.util.List;

public class TodoListFragment extends Fragment {

    private RecyclerView recyclerView;

    private TodoListFragment() {
    }

    public static TodoListFragment newInstance() {
        TodoListFragment fragment = new TodoListFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_todo_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView =  view.findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(requireContext());
        DividerItemDecoration dividerItemDecoration =
                new DividerItemDecoration(requireContext(),layoutManager.getOrientation());
        List<String> sampleData = getSampleData();
        TodoListAdapter todoListAdapter = new TodoListAdapter(sampleData);
        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(todoListAdapter);
    }

    private List<String> getSampleData() {
        List<String> dataset = new ArrayList<>();
        dataset.add("タイトル１");
        dataset.add("タイトル２");
        dataset.add("タイトル３");
        return dataset;
    }
}