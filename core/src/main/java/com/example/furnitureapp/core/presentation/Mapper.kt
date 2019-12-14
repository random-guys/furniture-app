package com.example.furnitureapp.core.presentation

interface Mapper<out V, in D> {

    fun mapToView(type: D): V

}