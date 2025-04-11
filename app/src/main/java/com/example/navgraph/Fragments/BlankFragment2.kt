package com.example.navgraph.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.navgraph.R
import com.example.navgraph.databinding.FragmentBlank1Binding
import com.example.navgraph.databinding.FragmentBlank2Binding


class BlankFragment2 : Fragment() {
    private lateinit var binding: FragmentBlank2Binding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        navController= Navigation.findNavController(view)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlank2Binding.inflate(inflater, container, false)

        binding.button2.setOnClickListener {
        navController.navigate(R.id.action_blankFragment2_to_settingsFragment)
        }
        binding.button3.setOnClickListener {
        navController.navigate(R.id.action_blankFragment2_to_loginFragment2)
        }
        return binding.root
    }

    companion object {

    }
}