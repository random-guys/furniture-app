package com.example.furnitureapp.home.ui


import android.os.Bundle
import android.view.View
import com.example.furnitureapp.core.ui.base.fragment.BaseFragment
import com.example.furnitureapp.core.ui.utils.CustomPagerAdapter
import com.example.furnitureapp.home.R
import com.example.furnitureapp.home.databinding.FragmentHomeBinding
import com.example.furnitureapp.home.presentation.HomeViewModel
import com.example.furnitureapp.home.ui.bathroom.BathRoomFragment
import com.example.furnitureapp.home.ui.livingroom.LivingRoomFragment

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(HomeViewModel::class.java) {

    private lateinit var mPagerAdapter: CustomPagerAdapter

    override fun getLayoutResourceId() = R.layout.fragment_home

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mPagerAdapter = CustomPagerAdapter(childFragmentManager)

        mPagerAdapter.addFragment(LivingRoomFragment.newInstance(), "LIVING ROOM")
        mPagerAdapter.addFragment(BathRoomFragment.newInstance(), "BATHROOM")
        mPagerAdapter.addFragment(LivingRoomFragment.newInstance(), "BEDROOM")
        mPagerAdapter.addFragment(LivingRoomFragment.newInstance(), "DINING ROOM")

//        binding.viewpager.isPagingEnabled = false
        binding.viewpager.adapter = mPagerAdapter
        binding.viewpagertab.setViewPager(binding.viewpager)
    }

    companion object {
        fun newInstance(): HomeFragment {
            val fragment = HomeFragment()
            val args = Bundle()
            fragment.arguments = args

            return fragment
        }
    }

}
