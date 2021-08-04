package com.example.jobsapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_sign_up.*

class SignUpFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sign_up, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toolbar.setNavigationIcon(R.drawable.ic_outline_arrow_back_24)
        toolbar.setNavigationOnClickListener {
            view.findNavController().popBackStack()
        }
        sign_up_btn.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_signUpFragment_to_loginFragment)
        }

        sign_in_prompt.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_signUpFragment_to_loginFragment)
        }
    }
}