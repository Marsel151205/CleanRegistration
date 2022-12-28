package com.example.cleanregistration.presentation.ui.fragments.sign

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.cleanregistration.R
import com.example.cleanregistration.databinding.FragmentRegistrationBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegistrationFragment : Fragment(R.layout.fragment_registration) {

    private val binding by viewBinding(FragmentRegistrationBinding::bind)
    private val viewModel: RegistrationViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupListener()
    }

    private fun setupListener() {
        with(binding) {
            btnSignUp.setOnClickListener {

                val firstName = etFirstName.text.toString().trim()
                val name = etName.text.toString().trim()
                val age = etAge.text.toString().trim()
                val password = etPassword.text.toString().trim()
                val placeOfLiving = etPlaceOfLiving.text.toString().trim()

                viewModel.saveUserData(firstName, name, age, password, placeOfLiving)

                findNavController().navigate(R.id.userInfoFragment)
            }
        }
    }
}