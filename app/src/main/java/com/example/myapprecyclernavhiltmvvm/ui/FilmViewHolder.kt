package com.example.myapprecyclernavhiltmvvm.ui

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapprecyclernavhiltmvvm.R
import com.example.myapprecyclernavhiltmvvm.domain.FilmUIData

class FilmViewHolder(itemView: View, private val itemCLick: (String, String) -> Unit) : RecyclerView.ViewHolder(itemView) {

    fun onBind(film: FilmUIData) {
        val poster = itemView.findViewById<ImageView>(R.id.iv_poster)
        val name = itemView.findViewById<TextView>(R.id.tv_name)
        val oscar = itemView.findViewById<ImageView>(R.id.iv_is_oscar)
        val rating = itemView.findViewById<TextView>(R.id.tv_rating)
        val description = itemView.findViewById<TextView>(R.id.tv_description)

        name.text = film.name
        oscar.isVisible = film.trueOscar == true
        rating.text = film.rating.toString()
        description.text = film.description

        itemView.setOnClickListener {
            itemCLick(film.name, film.description)
        }

        Glide
            .with(itemView.context)
            .load(film.imageUrl)
            .into(poster)
    }
}