package com.example.furnitureapp.home.presentation.livingroom

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.furnitureapp.core.presentation.BaseViewModel
import com.example.furnitureapp.core.presentation.DataState
import com.example.furnitureapp.home.domain.usecase.GetFurnitureUseCase
import com.example.furnitureapp.home.presentation.mapper.FurnitureViewMapper
import com.example.furnitureapp.home.presentation.model.FurnitureView
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

/**
 * Created by kryptkode on 12/11/2019.
 */
class LivingRoomViewModel @Inject constructor(
    private val getFurnitureUseCase: GetFurnitureUseCase,
    private val mapper: FurnitureViewMapper
) : BaseViewModel() {

    private val furnitureData = MutableLiveData<DataState<List<FurnitureView>>>()
    fun getFurnitureDataState(): LiveData<DataState<List<FurnitureView>>> = furnitureData

    init {
        fetchFurniture()
    }

    private fun fetchFurniture() {
        viewModelScope.launch {
            furnitureData.postValue(DataState.Loading)
            try {
                val result = getFurnitureUseCase.execute()
                result.collect {
                    furnitureData.postValue(DataState.Success(it.map { mapper.mapToView(it) }))
                }
            } catch (e: Exception) {
                Timber.e(e, "Error while fetching furniture")
                furnitureData.postValue(DataState.Error(e.localizedMessage))
            }
        }
    }
}