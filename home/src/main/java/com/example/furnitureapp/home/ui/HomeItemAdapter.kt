package com.example.furnitureapp.home.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.furnitureapp.core.ui.base.recycler.BaseRecyclerAdapter
import com.example.furnitureapp.core.ui.base.recycler.BaseRecyclerViewHolder
import com.example.furnitureapp.core.ui.utils.ImageLoader
import com.example.furnitureapp.home.R
import com.example.furnitureapp.home.databinding.HomeListItemBinding
import com.example.furnitureapp.home.ui.model.HomeItem

class HomeItemAdapter : BaseRecyclerAdapter<HomeItem, HomeItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            HomeListItemBinding
                .inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    inner class ViewHolder(binding: HomeListItemBinding) :
        BaseRecyclerViewHolder<HomeItem, HomeListItemBinding>(binding) {

        override fun performBind(item: HomeItem?) {
            ImageLoader()
                .with(binding.productImage)
                .error(R.drawable.favorite_selected)
                .placeholder(R.drawable.favorite)
                .load(item?.image)

        }
    }

}