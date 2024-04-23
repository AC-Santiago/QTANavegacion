package com.example.qta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController


class DosPalabras : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dos_palabras, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val imagendosmitades = view.findViewById<ImageView>(R.id.imageView2Mitades)
        imagendosmitades.setOnClickListener {
            findNavController().navigate(R.id.action_dosPalabras_to_dosMitades)
        }

        val imagenquitar = view.findViewById<ImageView>(R.id.imageViewQuitar)
        imagenquitar.setOnClickListener {
            findNavController().navigate(R.id.action_dosPalabras_to_last)

        }

        val imagenx = view.findViewById<ImageView>(R.id.imageView6)
        imagenx.setOnClickListener {
            findNavController().navigate(R.id.action_dosPalabras_to_inicioSesion)

        }
    }
}