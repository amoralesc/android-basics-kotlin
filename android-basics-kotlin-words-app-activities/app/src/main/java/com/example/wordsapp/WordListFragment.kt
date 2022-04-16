package com.example.wordsapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wordsapp.databinding.FragmentWordListBinding

class WordListFragment : Fragment() {
	/**
	 * Provides global access to these variables from anywhere in the app
	 * via WordListFragment.<variable> without needing to create
	 * a WordListFragment instance.
	 */
	companion object {
		const val LETTER = "letter"
		const val SEARCH_PREFIX = "https://www.google.com/search?q="
	}

	private lateinit var letterId: String

	private var _binding: FragmentWordListBinding? = null

	// This property is only valid between onCreateView and
	// onDestroyView.
	private val binding get() = _binding!!

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)

		arguments?.let {
			letterId = it.getString(LETTER).toString()
		}
	}

	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		// Retrieve and inflate the layout for this fragment
		_binding = FragmentWordListBinding.inflate(inflater, container, false)
		val view = binding.root
		return view
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)

		val recyclerView = binding.recyclerView
		recyclerView.layoutManager = LinearLayoutManager(requireContext())
		recyclerView.adapter = WordAdapter(letterId, requireContext())

		// Adds a [DividerItemDecoration] between items
		recyclerView.addItemDecoration(
			DividerItemDecoration(context, DividerItemDecoration.VERTICAL)
		)
	}

	/**
	 * Frees the binding object when the Fragment is destroyed.
	 */
	override fun onDestroyView() {
		super.onDestroyView()
		_binding = null
	}
}