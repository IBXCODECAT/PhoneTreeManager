package com.nathan.phonetreemanager.ui.inbound_calls

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.nathan.phonetreemanager.CallModalFragment
import com.nathan.phonetreemanager.R
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

        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

            val transaction: FragmentTransaction = parentFragmentManager.beginTransaction()

            // Create and show the dialog.
            val callModalFragment: CallModalFragment = CallModalFragment()

            callModalFragment.show(transaction, "dialog"   )


        }

        // Optionally add items to the list
        itemsList.clear()
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
