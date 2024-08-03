package com.example.todolistapp.ui.todolist.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.todolistapp.R;

import java.util.List;

public class TodoListAdapter extends RecyclerView.Adapter<TodoListAdapter.TodoListViewFolder> {

    private List<String> list;

    public TodoListAdapter(List<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public TodoListViewFolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_todo_list_item, parent,false);
        TodoListViewFolder vh = new TodoListViewFolder(inflate);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull TodoListViewFolder holder, int position) {
        holder.textView.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class TodoListViewFolder extends RecyclerView.ViewHolder {

        public TextView textView;

        public TodoListViewFolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.title_view);
        }
    }
}
