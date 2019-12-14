package com.example.furnitureapp.home.ui.mapper

import com.example.furnitureapp.core.ui.ViewMapper
import com.example.furnitureapp.home.presentation.model.FurnitureView
import com.example.furnitureapp.home.ui.model.HomeItem
import javax.inject.Inject

/**
 * Created by kryptkode on 12/14/2019.
 */
class HomeItemMapper
@Inject
constructor() : ViewMapper<FurnitureView, HomeItem> {

    override fun mapToView(presentation: FurnitureView): HomeItem {
        return HomeItem(
            presentation.name,
            presentation.description,
            presentation.rating,
            presentation.image,
            presentation.price
        )
    }
}