package com.example.qta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DosMitades.newInstance] factory method to
 * create an instance of this fragment.
 */
class DosMitades : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dos_mitades, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val buttonDosMitades = view.findViewById<Button>(R.id.imageView11)
        val buttonDosPalabras = view.findViewById<Button>(R.id.imageView12)
        val buttonQuitar = view.findViewById<Button>(R.id.imageView13)
        val buttonVolver = view.findViewById<Button>(R.id.imageView6)
        buttonDosPalabras.setOnClickListener{
            findNavController().navigate(R.id.action_dosMitades_to_dosPalabras)
        }
        buttonQuitar.setOnClickListener{
            findNavController().navigate(R.id.action_dosMitades_to_last)
        }
        buttonVolver.setOnClickListener{
            findNavController().navigate(R.id.action_dosMitades_to_inicioSesion)
        }
    }



}