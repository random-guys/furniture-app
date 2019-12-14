package com.example.furnitureapp.core.remote

interface ModelMapper<in M, out E> {

    fun mapFromModel(model: M): E

}