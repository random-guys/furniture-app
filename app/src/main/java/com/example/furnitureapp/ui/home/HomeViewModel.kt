package com.example.furnitureapp.ui.home

import androidx.lifecycle.asLiveData
import javax.inject.Inject

class HomeViewModel @Inject constructor(private val homeRepository: HomeRepository) {

    val furnitureItems = homeRepository.getSaveAndFetchFurniture().asLiveData()
}