package com.example.furnitureapp.home.cache.mapper

import com.example.furnitureapp.core.cache.CacheMapper
import com.example.furnitureapp.home.cache.model.CachedFurniture
import com.example.furnitureapp.home.data.model.FurnitureEntity
import javax.inject.Inject

/**
 * Created by kryptkode on 12/11/2019.
 */
class CacheFurnitureMapper @Inject constructor() : CacheMapper<CachedFurniture, FurnitureEntity> {

    override fun mapFromCached(type: CachedFurniture): FurnitureEntity {
        return FurnitureEntity(
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

    override fun mapToCached(type: FurnitureEntity): CachedFurniture {
        return CachedFurniture(
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