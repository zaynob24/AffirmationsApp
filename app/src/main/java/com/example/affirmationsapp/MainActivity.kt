package com.example.affirmationsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val affirmationsList = mutableListOf<AffirmationsDataModel>(

        AffirmationsDataModel(R.drawable.wallpaper1,"I am strong"),
        AffirmationsDataModel(R.drawable.wallpaper2,"I believe in my self"),
        AffirmationsDataModel(R.drawable.wallpaper3,"I am good developer")
    )

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: AffirmationsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.affirmationsRecyclerView)
        adapter = AffirmationsAdapter(affirmationsList)
        recyclerView.adapter = adapter

    }
}