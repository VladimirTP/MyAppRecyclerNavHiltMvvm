package com.example.myapprecyclernavhiltmvvm.ui.film_fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ProgressBar
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapprecyclernavhiltmvvm.R
import com.example.myapprecyclernavhiltmvvm.ui.FilmAdapter
import com.example.myapprecyclernavhiltmvvm.ui.FilmViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FilmListFragment : Fragment() {

    private val viewModel by viewModels<FilmViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_film_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recycler = view.findViewById<RecyclerView>(R.id.rv_film_list)
        val progressBar = view.findViewById<ProgressBar>(R.id.progress_bar)
        val favoriteFilmButton = view.findViewById<Button>(R.id.bt_show_favorite_film)

        viewModel.liveData.observe(viewLifecycleOwner) {
            val itemClick: (String, String) -> Unit = {name, description ->
                val action = FilmListFragmentDirections.actionFilmListFragmentToFilmDescriptionFragment(name, description)
                findNavController().navigate(action)
            }
            val adapter = FilmAdapter(it, itemClick)
            recycler.adapter = adapter
            recycler.layoutManager = LinearLayoutManager(this@FilmListFragment.context, LinearLayoutManager.VERTICAL, false)
        }
        viewModel.getFilms()
        viewModel.getUserFavoriteFilm()

        viewModel.errorLiveData.observe(viewLifecycleOwner) {
            Toast.makeText(requireContext(), it, Toast.LENGTH_SHORT).show()
        }

        viewModel.loadingLiveData.observe(viewLifecycleOwner) {
            if (recycler.isVisible) {
                progressBar.visibility = View.GONE
            } else {
                progressBar.visibility = View.VISIBLE
            }
        }

        favoriteFilmButton.setOnClickListener{
            viewModel.userFavoriteFilmLiveData.observe(viewLifecycleOwner){film->
                if (film != null) {
                    Toast.makeText(requireContext(),"Любимый фильм: ${film.name}",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}