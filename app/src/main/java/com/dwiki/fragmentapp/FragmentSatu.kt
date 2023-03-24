package com.dwiki.fragmentapp

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dwiki.fragmentapp.databinding.FragmentSatuBinding

class FragmentSatu : Fragment() {

    private var _binding:FragmentSatuBinding? = null
    private val binding get() = _binding!!

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("Fragment Satu","OnAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Fragment Satu","OnCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSatuBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Fragment Satu","OnViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Fragment Satu","OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Fragment Satu","OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Fragment Satu","OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Fragment Satu", "OnStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Fragment Satu","OnDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}