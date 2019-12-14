package com.example.furnitureapp.home.remote.mapper

import com.example.furnitureapp.core.remote.ModelMapper
import com.example.furnitureapp.home.data.model.FurnitureEntity
import com.example.furnitureapp.home.remote.model.FurnitureResponseModel
import javax.inject.Inject

/**
 * Created by kryptkode on 12/14/2019.
 */
class FurnitureResponseMapper @Inject constructor() :
    ModelMapper<FurnitureResponseModel, FurnitureEntity> {

    override fun mapFromModel(model: FurnitureResponseModel): FurnitureEntity {
        return FurnitureEntity(
            model.name,
            model.description,
            model.rating,
            model.image,
            model.price,
            model.length,
            model.height,
            model.depth
        )
    }
}