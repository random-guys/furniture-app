package com.example.furnitureapp.core.domain

abstract class UseCase<T, PARAMS> protected constructor() {

    protected abstract suspend fun buildUseCase(params: PARAMS?): T

    suspend fun execute(params: PARAMS? = null) = buildUseCase(params)
}
