package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textView : TextView
    lateinit var listView : ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        listView = findViewById(R.id.list)

        val colors = listOf(
            "Red", "Green", "Yellow", "Orange"
        )

        val adapter = ArrayAdapter<String>(
            this //context
            ,android.R.layout.simple_list_item_1 //layout
            ,colors //list
        )

        listView.adapter = adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener{ parent, view, position, id ->
            val selectedItem = parent.getItemAtPosition(position) as String
            textView.text = "Your favorite color is : $selectedItem"

        }




    }
}