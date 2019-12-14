package com.example.furnitureapp.home.remote.service

import com.example.furnitureapp.home.remote.model.FurnitureResponseModel
import kotlinx.coroutines.delay
import javax.inject.Inject

class MockHomeApi @Inject constructor() : HomeApi {

    companion object {
        const val DELAY_IN_SECS = 1000 * 2L
    }

    override suspend fun getPopularItems(): List<FurnitureResponseModel> {
        delay(DELAY_IN_SECS)
        val popularItems = mutableListOf<FurnitureResponseModel>()
        val popular1 = FurnitureResponseModel(
            name = "Table",
            description = "Per guest prepare five and a half teaspoons of soy sauce with squeezed shrimps for dessert.",
            rating = "4.0",
            image = "https://images.unsplash.com/photo-1555041469-a586c61ea9bc?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=3300&q=80",
            price = "5000"
        )
        val popular2 = FurnitureResponseModel(
            name = "Chair",
            description = "The resistance is a cloudy pathway. The space suit is wisely evasive.",
            rating = "4.0",
            image = "https://images.unsplash.com/photo-1555041469-a586c61ea9bc?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=3300&q=80",
            price = "5000"
        )
        val popular3 = FurnitureResponseModel(
            name = "Stool",
            description = "Hypnosis is not shining in earth, the mind, or paradise, but everywhere.",
            rating = "4.0",
            image = "https://images.unsplash.com/photo-1555041469-a586c61ea9bc?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=3300&q=80",
            price = "5000"
        )
        val popular4 = FurnitureResponseModel(
            name = "Desk",
            description = "A falsis, scutum teres domina.Cum bulla messis, omnes sensoremes tractare alter, talis clabularees.",
            rating = "4.0",
            image = "https://images.unsplash.com/photo-1555041469-a586c61ea9bc?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=3300&q=80",
            price = "5000"
        )
        popularItems.add(popular1)
        popularItems.add(popular2)
        popularItems.add(popular3)
        popularItems.add(popular4)
        return popularItems
    }

    override suspend fun getNewArrivals(): List<FurnitureResponseModel> {
        delay(DELAY_IN_SECS)
        val newArrivals = mutableListOf<FurnitureResponseModel>()
        val newArrival1 = FurnitureResponseModel(
            name = "Table",
            description = "Frondator, scutum, et deus. Cum nomen assimilant, omnes cottaes contactus pius, teres ionicis tormentoes.",
            rating = "4.0",
            image = "https://images.unsplash.com/photo-1507904953637-96429a46671a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1300&q=80",
            price = "5000"
        )
        val newArrival2 = FurnitureResponseModel(
            name = "Chair",
            description = "Cacula de barbatus ausus, contactus lanista!Ubi est varius burgus?",
            rating = "4.0",
            image = "https://images.unsplash.com/photo-1507904953637-96429a46671a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1300&q=80",
            price = "5000"
        )
        val newArrival3 = FurnitureResponseModel(
            name = "Stool",
            description = "Racana, era, et epos. Finiss ire in fortis rugensis civitas!",
            rating = "4.0",
            image = "https://images.unsplash.com/photo-1507904953637-96429a46671a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1300&q=80",
            price = "5000"
        )
        val newArrival4 = FurnitureResponseModel(
            name = "Desk",
            description = "Pol, a bene olla.Boreas de audax brabeuta, promissio pes!Tatas potus in copinga!",
            rating = "4.0",
            image = "https://images.unsplash.com/photo-1507904953637-96429a46671a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1300&q=80",
            price = "5000"
        )
        newArrivals.add(newArrival1)
        newArrivals.add(newArrival2)
        newArrivals.add(newArrival3)
        newArrivals.add(newArrival4)

        return newArrivals
    }

}