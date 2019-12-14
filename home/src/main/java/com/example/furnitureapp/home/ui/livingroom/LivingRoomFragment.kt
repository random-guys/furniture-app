package com.example.furnitureapp.home.ui.livingroom


import android.os.Bundle
import android.view.View
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.furnitureapp.core.presentation.DataState
import com.example.furnitureapp.core.ui.base.fragment.BaseFragment
import com.example.furnitureapp.core.ui.utils.StaggeredGridSpacingItemDecoration
import com.example.furnitureapp.home.R
import com.example.furnitureapp.home.databinding.FragmentLivingRoomBinding
import com.example.furnitureapp.home.presentation.livingroom.LivingRoomViewModel
import com.example.furnitureapp.home.ui.HomeItemAdapter
import com.example.furnitureapp.home.ui.mapper.HomeItemMapper
import javax.inject.Inject

class LivingRoomFragment
@Inject
constructor() :
    BaseFragment<FragmentLivingRoomBinding, LivingRoomViewModel>(
        LivingRoomViewModel::class.java
    ) {

    private lateinit var popularAdapter: HomeItemAdapter
    private lateinit var newArrivalAdapter: HomeItemAdapter


    @Inject
    lateinit var mapper: HomeItemMapper

    override fun getLayoutResourceId() = R.layout.fragment_living_room
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        popularAdapter = HomeItemAdapter()
        binding.popularRecyclerView.setHasFixedSize(true)
        binding.popularRecyclerView.layoutManager =
            LinearLayoutManager(activity, RecyclerView.HORIZONTAL, false)
        binding.popularRecyclerView.adapter = popularAdapter
//        mPopularAdapter.setList()

        //New Arrival
        newArrivalAdapter = HomeItemAdapter()
        binding.newArrivalsRecyclerView.setHasFixedSize(true)
        binding.newArrivalsRecyclerView.layoutManager =
            StaggeredGridLayoutManager(1, RecyclerView.HORIZONTAL)
        binding.newArrivalsRecyclerView.addItemDecoration(
            StaggeredGridSpacingItemDecoration(
                8,
                true
            )
        )
        binding.newArrivalsRecyclerView.adapter = newArrivalAdapter

        viewModel.getFurnitureDataState().observe(this) {
            when (it) {
                is DataState.Loading -> {
                    //TODO: Handle loading
                }

                is DataState.Success -> {
                    newArrivalAdapter.setList(it.data?.map { mapper.mapToView(it) } ?: listOf())
                    popularAdapter.setList(it.data?.map { mapper.mapToView(it) } ?: listOf())
                }

                is DataState.Error -> {
                    notifyUser(it.error as String?)
                }
            }
        }

    }

    companion object {
        fun newInstance(): LivingRoomFragment {
            val fragment = LivingRoomFragment()
            val args = Bundle()
            fragment.arguments = args

            return fragment
        }
    }

}
