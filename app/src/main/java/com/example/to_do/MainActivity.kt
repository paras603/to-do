package com.example.to_do

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var todoAdapter: TodoAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        todoAdapter = TodoAdapter(mutableListOf())

        rvTodoItems.adapter = todoAdapter
        rvRodoItems.layoutManager = LinearLayoutManager(this)

        btnAddTodo.setOnClickListener {
            val todoTitle = etTodoTitle.text.toString()
            if(todoTitle.isNotEmpty){
                val todo = Todo(todoTitle)
                todoAdapter.addTodo(todo)
                etTodoTile.text.clear()
            }
        }
        btnDeleteDoneTodos.setOnClickListerner {
            todoAdapter.deleteDoneTodos()
        }
    }
}