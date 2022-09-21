package com.example.newstime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.newstime.adapter.ContentsAdapter
import com.example.newstime.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        val myDataSet = DataSource().loadContents()
        recyclerView.adapter = ContentsAdapter(this, myDataSet)
        recyclerView.setHasFixedSize(true )
    }
}