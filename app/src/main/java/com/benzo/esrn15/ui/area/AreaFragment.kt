package com.benzo.esrn15.ui.area

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.benzo.esrn15.databinding.FragmentAreaBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint

class AreaFragment : Fragment() {

    private var _binding: FragmentAreaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAreaBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}