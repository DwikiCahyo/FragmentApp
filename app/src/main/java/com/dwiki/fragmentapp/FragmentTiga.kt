package com.dwiki.fragmentapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dwiki.fragmentapp.databinding.FragmentSatuBinding
import com.dwiki.fragmentapp.databinding.FragmentTigaBinding


class FragmentTiga : Fragment() {

    private var _binding: FragmentTigaBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentTigaBinding.inflate(inflater, container, false)
        return binding.root
    }

}