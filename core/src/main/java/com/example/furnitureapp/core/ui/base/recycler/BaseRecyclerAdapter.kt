package com.example.furnitureapp.core.ui.base.recycler

import androidx.recyclerview.widget.RecyclerView

abstract class BaseRecyclerAdapter<T, V> :
    RecyclerView.Adapter<V>() where V : BaseRecyclerViewHolder<T, *> {
    protected val listItems = mutableListOf<T>()

    fun setList(listOfItems: List<T>) {
        listItems.clear()
        listItems.addAll(listOfItems)
        notifyDataSetChanged()
    }

    override fun getItemCount() = listItems.size

    override fun onBindViewHolder(holder: V, position: Int) {
        holder.performBind(listItems[position])
    }
}