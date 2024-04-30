package com.benzo.esrn15.ui.calendario

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.benzo.esrn15.databinding.FragmentCalendario3Binding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint

class CalendarioFragment : Fragment() {
    private var _binding: FragmentCalendario3Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCalendario3Binding.inflate(layoutInflater, container, false)
        return binding.root
    }

}