package com.example.furnitureapp.home.ui.bathroom


import android.os.Bundle
import com.example.furnitureapp.core.ui.base.fragment.BaseFragment
import com.example.furnitureapp.home.R
import com.example.furnitureapp.home.databinding.FragmentBathRoomBinding
import com.example.furnitureapp.home.presentation.bathroom.BathRoomViewModel
import javax.inject.Inject


class BathRoomFragment
@Inject constructor() :
    BaseFragment<FragmentBathRoomBinding, BathRoomViewModel>(
        BathRoomViewModel::class.java
    ) {

    override fun getLayoutResourceId() = R.layout.fragment_bath_room

    companion object {
        fun newInstance(): BathRoomFragment {
            val fragment = BathRoomFragment()
            val args = Bundle()
            fragment.arguments = args

            return fragment
        }
    }

}
