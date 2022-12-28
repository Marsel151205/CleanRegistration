package com.example.cleanregistration.presentation.ui.fragments.userinfo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.cleanregistration.R
import com.example.cleanregistration.databinding.FragmentUserInfoBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserInfoFragment : Fragment(R.layout.fragment_user_info) {

    private val binding by viewBinding(FragmentUserInfoBinding::bind)
    private val viewModel: UserInfoViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupListener()
    }

    private fun setupListener() {
        with(binding) {
            btnGetData.setOnClickListener {
                viewModel.apply {

                    tvGetFirstName.text = viewModel.getFirstnameUseCase()
                    tvGetName.text = viewModel.getNameUseCase()
                    tvGetPassword.text = viewModel.getPasswordUseCase()
                    tvGetAge.text = viewModel.getAgeUseCase()
                    tvGetPlaceOfLiving.text = viewModel.getPlaceOfLivingUseCase()
                }
            }
        }
    }
}