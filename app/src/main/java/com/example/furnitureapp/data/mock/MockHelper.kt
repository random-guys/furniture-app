package com.example.furnitureapp.data.mock

import com.example.furnitureapp.data.model.HomeItem
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MockHelper @Inject constructor() : MockHelperInterface {

    override fun mockPopularItems(): ArrayList<HomeItem> {
        val popularItems = ArrayList<HomeItem>()
        val popular1 = HomeItem(name = "Table", description = "All in on table", rating = "4.0", image = "https://images.unsplash.com/photo-1555041469-a586c61ea9bc?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=3300&q=80", price = "5000")
        val popular2 = HomeItem(name = "Chair", description = "All in on table", rating = "4.0", image = "https://images.unsplash.com/photo-1555041469-a586c61ea9bc?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=3300&q=80", price = "5000")
        val popular3 = HomeItem(name = "Stool", description = "All in on table", rating = "4.0", image = "https://images.unsplash.com/photo-1555041469-a586c61ea9bc?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=3300&q=80", price = "5000")
        val popular4 = HomeItem(name = "Desk", description = "All in on table", rating = "4.0", image = "https://images.unsplash.com/photo-1555041469-a586c61ea9bc?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=3300&q=80", price = "5000")
        popularItems.add(popular1)
        popularItems.add(popular2)
        popularItems.add(popular3)
        popularItems.add(popular4)

        return popularItems
    }

    override fun mockNewArrivals(): ArrayList<HomeItem> {
        val newArrivals = ArrayList<HomeItem>()
        val newArrival1 = HomeItem(name = "Table", description = "All in on table", rating = "4.0", image = "https://images.unsplash.com/photo-1507904953637-96429a46671a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1300&q=80", price = "5000")
        val newArrival2 = HomeItem(name = "Chair", description = "All in on table", rating = "4.0", image = "https://images.unsplash.com/photo-1507904953637-96429a46671a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1300&q=80", price = "5000")
        val newArrival3 = HomeItem(name = "Stool", description = "All in on table", rating = "4.0", image = "https://images.unsplash.com/photo-1507904953637-96429a46671a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1300&q=80", price = "5000")
        val newArrival4 = HomeItem(name = "Desk", description = "All in on table", rating = "4.0", image = "https://images.unsplash.com/photo-1507904953637-96429a46671a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1300&q=80", price = "5000")
        newArrivals.add(newArrival1)
        newArrivals.add(newArrival2)
        newArrivals.add(newArrival3)
        newArrivals.add(newArrival4)

        return newArrivals
    }
}