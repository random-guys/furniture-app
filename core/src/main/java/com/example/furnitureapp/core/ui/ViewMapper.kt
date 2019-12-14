package com.example.furnitureapp.core.ui

interface ViewMapper<in P, out V> {

    fun mapToView(presentation: P): V

}