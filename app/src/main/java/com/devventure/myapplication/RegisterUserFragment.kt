package com.devventure.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.devventure.myapplication.databinding.FragmentRegisterUserBinding

class RegisterUserFragment : Fragment() {
    private var binding : FragmentRegisterUserBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentRegisterUserBinding.inflate(inflater, container, false )

        val userName = binding?.usernameET
        val btnRegisterUser = binding?.btnRegisterUser

        btnRegisterUser?.setOnClickListener{
            val playerName = userName?.text.toString()
        }

        return binding?.root
    }
}