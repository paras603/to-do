package com.example.to_do

data class Todo(
    val title: String,
    var isChecked: Boolean = false
)