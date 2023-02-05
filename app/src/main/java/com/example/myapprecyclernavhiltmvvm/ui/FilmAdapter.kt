package com.example.myapprecyclernavhiltmvvm.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapprecyclernavhiltmvvm.R
import com.example.myapprecyclernavhiltmvvm.domain.FilmUIData

class FilmAdapter(
    private val list: List<FilmUIData>,
    private val itemCLick: (String, String) -> Unit
): RecyclerView.Adapter<FilmViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
        return FilmViewHolder(view, itemCLick)
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size

}