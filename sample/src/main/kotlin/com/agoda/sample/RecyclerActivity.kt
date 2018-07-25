package com.agoda.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        val recycler: androidx.recyclerview.widget.RecyclerView = findViewById(R.id.recycler_view)
        recycler.setHasFixedSize(true)
        recycler.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(this)
        recycler.adapter = RecyclerAdapter()
    }
}
