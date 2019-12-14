package com.example.furniture.profile.ui


import android.os.Bundle
import com.example.furniture.profile.R
import com.example.furniture.profile.databinding.FragmentProfileBinding
import com.example.furniture.profile.presentation.ProfileViewModel
import com.example.furnitureapp.core.ui.base.fragment.BaseFragment


class ProfileFragment :
    BaseFragment<FragmentProfileBinding, ProfileViewModel>(ProfileViewModel::class.java) {

    override fun getLayoutResourceId() = R.layout.fragment_profile

    companion object {
        fun newInstance(): ProfileFragment {
            val fragment = ProfileFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}
