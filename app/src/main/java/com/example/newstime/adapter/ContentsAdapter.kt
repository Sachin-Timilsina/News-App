package com.example.newstime.adapter

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.newstime.R
import com.example.newstime.model.Model

class ContentsAdapter(
    private val context: Context,
    private val dataset: List<Model>
) : RecyclerView.Adapter<ContentsAdapter.ContentsViewHolder>() {

    class ContentsViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.contents_text)
        val imageView: ImageView = view.findViewById(R.id.contents_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentsViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout,parent,false)

        return ContentsViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ContentsViewHolder, position: Int) {
        val content = dataset[position]
        holder.textView.text = context.resources.getString(content.stringResourceId)
        holder.imageView.setImageResource(content.drawableResourceId)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}