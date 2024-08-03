package com.example.todolistapp.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.todolistapp.R;
import com.example.todolistapp.data.entities.Todo;
import com.example.todolistapp.data.repositories.TodoRepository;
import com.example.todolistapp.ui.dialog.CreateTodoListDialogFragment;
import com.example.todolistapp.ui.todolist.TodoListFragment;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private FrameLayout plusButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.Egg_Blue_Dark_Shade));
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        plusButton = findViewById(R.id.plus_view);
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CreateTodoListDialogFragment().show(getSupportFragmentManager(), "");
            }
        });

        TodoListFragment  fragment = TodoListFragment.newInstance();

        getSupportFragmentManager().beginTransaction()
                .add(R.id.main_container, fragment)
                .commitNow();

        /*new Thread(() -> {
            TodoRepository repository = new TodoRepository(this);
            repository.insertTodoData(new Todo("TEST TODO"));
        }).start();*/
    }
}