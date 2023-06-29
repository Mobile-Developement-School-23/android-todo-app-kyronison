package com.kyronison.todoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kyronison.todoapp.adapters.TodoListAdapter
import com.kyronison.todoapp.domain.TodoItemsRepository
import com.kyronison.todoapp.ui.theme.ToDoAppTheme


class MainActivity : AppCompatActivity() {
    private lateinit var todoListAdapter: TodoListAdapter

    val todoListRecyclerView = findViewById<RecyclerView>(R.id.rv_todo_list)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val todoList = TodoItemsRepository.getTodoItems()
        todoListAdapter = TodoListAdapter(todoList)

        todoListRecyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = todoListAdapter
        }
    }
}