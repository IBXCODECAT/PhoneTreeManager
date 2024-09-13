package com.nathan.phonetreemanager.ui.inbound_calls

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import com.nathan.phonetreemanager.databinding.InboundCallsFragmentBinding

class InboundCallsFragment : Fragment() {

    private var _binding: InboundCallsFragmentBinding? = null
    private val binding get() = _binding!!

    // Create a list to hold the strings
    private val itemsList = mutableListOf<String>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = InboundCallsFragmentBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Set up the ListView and its adapter
        val listView = binding.inboundCallList
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, itemsList)
        listView.adapter = adapter

        // Optionally add items to the list
        itemsList.add("Inbound Call " + (itemsList.count() + 1).toString())
        itemsList.add("Inbound Call " + (itemsList.count() + 1).toString())
        itemsList.add("Inbound Call " + (itemsList.count() + 1).toString())
        adapter.notifyDataSetChanged()

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
