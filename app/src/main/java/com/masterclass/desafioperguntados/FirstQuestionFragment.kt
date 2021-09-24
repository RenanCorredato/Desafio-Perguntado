package com.masterclass.desafioperguntados





import android.graphics.Color.parseColor


import android.os.Bundle

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup



import android.widget.Toast



import com.masterclass.desafioperguntados.databinding.FragmentFirstQuestionBinding


class FirstQuestionFragment : Fragment() {

    private var binding: FragmentFirstQuestionBinding? = null




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstQuestionBinding.inflate(inflater, container, false)
        return binding?.root


    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)




        binding?.radioButton1?.setOnClickListener {

            binding?.btRespond?.setBackgroundColor(parseColor("#758CFF"))



            Toast.makeText(context, "Você clicou no botão", Toast.LENGTH_SHORT).show()
        }

    }

}



