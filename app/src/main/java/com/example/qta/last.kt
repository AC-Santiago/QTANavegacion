package com.example.qta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController


class last : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_last, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val imagendosmitades = view.findViewById<ImageView>(R.id.imageView11)
        imagendosmitades.setOnClickListener {
            findNavController().navigate(R.id.action_last_to_dosMitades)
        }

        val imagendospalabras = view.findViewById<ImageView>(R.id.imageView12)
        imagendospalabras.setOnClickListener {
            findNavController().navigate(R.id.action_last_to_dosPalabras)

        }

        val imagenx = view.findViewById<ImageView>(R.id.imageView6)
        imagenx.setOnClickListener {
            findNavController().navigate(R.id.action_last_to_inicioSesion)

        }
    }

}