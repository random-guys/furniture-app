package com.example.furnitureapp.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.furnitureapp.R
import com.example.furnitureapp.data.model.HomeItem
import com.github.siyamed.shapeimageview.RoundedImageView

class HomeItemAdapter(val items: ArrayList<HomeItem>) : RecyclerView.Adapter<HomeItemAdapter.ViewHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.home_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val mProductImageView: RoundedImageView = itemView.findViewById(R.id.product_image)

        fun bind(position: Int) {
            with(items[position]) {
                mProductImageView.setImageResource(this.image)
            }
        }
    }
}