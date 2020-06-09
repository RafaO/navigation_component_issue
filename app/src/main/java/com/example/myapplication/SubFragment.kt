package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class SubFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_sub, container, false)
        root.findViewById<Button>(R.id.button_1).setOnClickListener {
            findNavController().navigate(
//                SubFragmentDirections.actionToNavGraph2("From 1")
                SubNavGraph2Directions.actionToNavGraph2("From 1")
            )
        }
        return root
    }
}
