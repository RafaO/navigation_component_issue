package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_main, container, false)
        root.findViewById<Button>(R.id.button_1).setOnClickListener {
            findNavController().navigate(
                MainFragmentDirections.actionMainFragmentToSubNavGraph()
            )
        }
        root.findViewById<Button>(R.id.button_2).setOnClickListener {
            findNavController().navigate(
//                MainFragmentDirections.actionToNavGraph2("From Main")
                SubNavGraph2Directions.actionToNavGraph2("From Main")
            )
        }
        return root
    }
}
