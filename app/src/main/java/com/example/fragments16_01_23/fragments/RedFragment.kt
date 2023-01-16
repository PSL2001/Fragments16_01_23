package com.example.fragments16_01_23.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.fragments16_01_23.R

class RedFragment : Fragment() {

    var listener: InterfazBotonesFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_red, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val boton = view.findViewById<Button>(R.id.btn_red)
        boton.setOnClickListener {
            listener?.botonClick("Fragment Red")
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is InterfazBotonesFragment) listener = context
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }
}