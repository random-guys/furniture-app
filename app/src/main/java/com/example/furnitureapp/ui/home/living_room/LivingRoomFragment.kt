package com.example.furnitureapp.ui.home.living_room


import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.furnitureapp.MainActivity
import com.example.furnitureapp.MyApplication

import com.example.furnitureapp.R
import com.example.furnitureapp.base.BaseFragment
import com.example.furnitureapp.data.mock.MockHelper
import com.example.furnitureapp.ui.home.HomeItemAdapter
import com.example.furnitureapp.ui.home.HomeViewModel
import javax.inject.Inject

class LivingRoomFragment : BaseFragment() {

    @Inject
    lateinit var mHomeViewModel: HomeViewModel

    @Inject
    lateinit var mMockHelper: MockHelper

    private lateinit var mPopularRecyclerView: RecyclerView
    private lateinit var mNewArrivalRecyclerView: RecyclerView
    private lateinit var mPopularAdapter: HomeItemAdapter
    private lateinit var mNewArrivalAdapter: HomeItemAdapter
    private lateinit var mLinearLayoutManager: LinearLayoutManager

    override fun bindViews(views: View) {
        mPopularRecyclerView = views.findViewById(R.id.popular_recycler_view)
        mNewArrivalRecyclerView = views.findViewById(R.id.new_arrivals_recycler_view)
    }

    override fun setUp(view: View) {

        mPopularAdapter = HomeItemAdapter(context!!)
        mLinearLayoutManager = LinearLayoutManager(activity, RecyclerView.HORIZONTAL, false)
        mPopularRecyclerView.setHasFixedSize(true)
        mPopularRecyclerView.layoutManager = mLinearLayoutManager
        mPopularRecyclerView.adapter = mPopularAdapter
        mPopularAdapter.add(mMockHelper.mockPopularItems())

        //New Arrival
        mNewArrivalAdapter = HomeItemAdapter(context!!)
        mLinearLayoutManager = LinearLayoutManager(activity, RecyclerView.HORIZONTAL, false)
        mNewArrivalRecyclerView.setHasFixedSize(true)
        mNewArrivalRecyclerView.layoutManager = mLinearLayoutManager
        mNewArrivalRecyclerView.adapter = mNewArrivalAdapter

        mHomeViewModel.furnitureItems.observe(this, Observer {
            mNewArrivalAdapter.add(items = ArrayList(it))
        })
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_living_room, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (activity!!.application as MyApplication).appComponent.inject(this)
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