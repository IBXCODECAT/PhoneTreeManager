package com.nathan.phonetreemanager.ui.inbound_calls

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.nathan.phonetreemanager.databinding.InboundCallsFragmentBinding

class InboundCallsFragment : Fragment() {

    private var _binding: InboundCallsFragmentBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val inboundCallsViewModel =
            ViewModelProvider(this).get(InboundCallsViewModel::class.java)

        _binding = InboundCallsFragmentBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.menuFragmentText
        inboundCallsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}