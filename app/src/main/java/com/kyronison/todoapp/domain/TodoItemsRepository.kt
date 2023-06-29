package com.kyronison.todoapp.domain

import com.kyronison.todoapp.data.TodoItem

object TodoItemsRepository {
    private val todoItems: MutableList<TodoItem> = mutableListOf()

    fun getTodoItems(): List<TodoItem> {
        return todoItems
    }

    fun addTodoItem(todoItem: TodoItem) {
        todoItems.add(todoItem)
    }
}