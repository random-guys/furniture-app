package com.example.furnitureapp.home.presentation.mapper

import com.example.furnitureapp.core.presentation.Mapper
import com.example.furnitureapp.home.domain.model.Furniture
import com.example.furnitureapp.home.presentation.model.FurnitureView
import javax.inject.Inject

/**
 * Created by kryptkode on 12/14/2019.
 */
class FurnitureViewMapper
@Inject constructor() : Mapper<FurnitureView, Furniture> {
    override fun mapToView(type: Furniture): FurnitureView {
        return FurnitureView(
            type.name,
            type.description,
            type.rating,
            type.image,
            type.price,
            type.length,
            type.height,
            type.depth
        )
    }
}