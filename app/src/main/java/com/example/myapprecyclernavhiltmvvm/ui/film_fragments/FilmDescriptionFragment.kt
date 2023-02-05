package com.example.myapprecyclernavhiltmvvm.ui.film_fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import com.example.myapprecyclernavhiltmvvm.R

class FilmDescriptionFragment : Fragment() {

    private val args: FilmDescriptionFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_film_description, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val name = args.name
        val description = args.description
        view.findViewById<TextView>(R.id.tv_name_title).text = name
        view.findViewById<TextView>(R.id.tv_name_description).text = description
    }
}