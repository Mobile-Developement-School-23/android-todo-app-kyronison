package com.kyronison.todoapp.data

import java.util.Date

data class TodoItem(
    val id: String,
    val text: String,
    val importance: Importance,
    val dueDate: Date? = null,
    var isDone: Boolean = false,
    val creationDate: Date,
    var modificationDate: Date? = null
)

enum class Importance {
    LOW, NORMAL, URGENT
}
