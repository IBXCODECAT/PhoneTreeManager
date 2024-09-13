package com.nathan.phonetreemanager.ui.parked_calls

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import com.nathan.phonetreemanager.databinding.InboundCallsFragmentBinding
import com.nathan.phonetreemanager.databinding.ParkedCallsFragmentBinding

class ParkedCallsFragment : Fragment() {

    private var _binding: ParkedCallsFragmentBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    // Create a list to hold the strings
    private val itemsList = mutableListOf<String>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = ParkedCallsFragmentBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Set up the ListView and its adapter
        val listView = binding.parkedCallList
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, itemsList)
        listView.adapter = adapter

        // Optionally add items to the list
        itemsList.add("Parked Call " + (itemsList.count() + 1).toString())
        itemsList.add("Parked Call " + (itemsList.count() + 1).toString())
        itemsList.add("Parked Call " + (itemsList.count() + 1).toString())
        adapter.notifyDataSetChanged()

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}