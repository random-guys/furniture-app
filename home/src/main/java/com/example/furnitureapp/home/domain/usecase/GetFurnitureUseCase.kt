package com.example.furnitureapp.home.domain.usecase

import com.example.furnitureapp.core.domain.UseCase
import com.example.furnitureapp.home.domain.model.Furniture
import com.example.furnitureapp.home.domain.repository.HomeRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * Created by kryptkode on 12/11/2019.
 */
class GetFurnitureUseCase
@Inject constructor(
    private val repository: HomeRepository
) : UseCase<Flow<List<Furniture>>, Unit>() {

    override suspend fun buildUseCase(params: Unit?): Flow<List<Furniture>> {
        return repository.getFurniture()
    }
}