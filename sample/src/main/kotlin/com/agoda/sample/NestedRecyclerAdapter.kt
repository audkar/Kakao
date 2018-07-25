package com.agoda.sample

import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class NestedRecyclerAdapter : androidx.recyclerview.widget.RecyclerView.Adapter<NestedRecyclerAdapter.ViewHolder>() {
    override fun getItemCount() = 1

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // no-op
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ViewHolder(parent.inflate(R.layout.item_nested_recycler))

    class ViewHolder(itemView: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(itemView) {
        init {
            itemView.findViewById<androidx.recyclerview.widget.RecyclerView>(R.id.nested_recycler_view).run {
                layoutManager = androidx.recyclerview.widget.LinearLayoutManager(
                    itemView.context,
                    androidx.recyclerview.widget.LinearLayoutManager.HORIZONTAL,
                    false
                )
                adapter = RecyclerAdapter()
            }
        }
    }

    fun ViewGroup.inflate(@LayoutRes layout: Int)
            = LayoutInflater.from(context).inflate(layout, this, false)
}
