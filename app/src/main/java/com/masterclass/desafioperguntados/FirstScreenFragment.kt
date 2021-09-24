package com.masterclass.desafioperguntados

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.masterclass.desafioperguntados.databinding.FragmentFirstScreenBinding

class FirstScreenFragment : Fragment() {

    private var binding : FragmentFirstScreenBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstScreenBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.btStart?.setOnClickListener {
            findNavController().navigate(R.id.firstQuestionFragment)
        }
    }

}