package com.kyronison.todoapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kyronison.todoapp.R
import com.kyronison.todoapp.data.TodoItem

class TodoListAdapter(private val todoItems: List<TodoItem>) : RecyclerView.Adapter<TodoListAdapter.TodoViewHolder>() {

    class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivStatus: ImageView = itemView.findViewById(R.id.iv_status)
        val tvTodoText: TextView = itemView.findViewById(R.id.tv_todo_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.todo_item, parent, false)
        return TodoViewHolder(view)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        val todoItem = todoItems[position]
        holder.tvTodoText.text = todoItem.text
        // Set status image based on todoItem.isDone
    }

    override fun getItemCount() = todoItems.size
}