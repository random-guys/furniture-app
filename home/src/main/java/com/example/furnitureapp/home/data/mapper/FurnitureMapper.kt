package com.example.furnitureapp.home.data.mapper

import com.example.furnitureapp.core.data.EntityMapper
import com.example.furnitureapp.home.data.model.FurnitureEntity
import com.example.furnitureapp.home.domain.model.Furniture
import javax.inject.Inject

/**
 * Created by kryptkode on 12/11/2019.
 */
class FurnitureMapper
@Inject constructor() : EntityMapper<FurnitureEntity, Furniture> {
    override fun mapFromEntity(entity: FurnitureEntity): Furniture {
        return Furniture(
            entity.name,
            entity.description,
            entity.rating,
            entity.image,
            entity.price,
            entity.length,
            entity.height,
            entity.depth
        )
    }

    override fun mapToEntity(domain: Furniture): FurnitureEntity {
        return FurnitureEntity(
            domain.name,
            domain.description,
            domain.rating,
            domain.image,
            domain.price,
            domain.length,
            domain.height,
            domain.depth
        )
    }
}