package com.example.furnitureapp.data.mock

import com.example.furnitureapp.R
import com.example.furnitureapp.data.model.HomeItem

class MockHelper : MockHelperInterface {

    override fun mockPopularItems(): ArrayList<HomeItem> {
        val popularItems = ArrayList<HomeItem>()
        val popular1 = HomeItem(name = "Table", description = "All in on table", rating = "4.0", image = R.drawable.furniture_image, price = "5000")
        val popular2 = HomeItem(name = "Table", description = "All in on table", rating = "4.0", image = R.drawable.furniture_image, price = "5000")
        val popular3 = HomeItem(name = "Table", description = "All in on table", rating = "4.0", image = R.drawable.furniture_image, price = "5000")
        val popular4 = HomeItem(name = "Table", description = "All in on table", rating = "4.0", image = R.drawable.furniture_image, price = "5000")
        popularItems.add(popular1)
        popularItems.add(popular2)
        popularItems.add(popular3)
        popularItems.add(popular4)

        return popularItems
    }

    override fun mockNewArrivals(): ArrayList<HomeItem> {
        val newArrivals = ArrayList<HomeItem>()
        val newArrival1 = HomeItem(name = "Table", description = "All in on table", rating = "4.0", image = R.drawable.furniture_image, price = "5000")
        val newArrival2 = HomeItem(name = "Table", description = "All in on table", rating = "4.0", image = R.drawable.furniture_image, price = "5000")
        val newArrival3 = HomeItem(name = "Table", description = "All in on table", rating = "4.0", image = R.drawable.furniture_image, price = "5000")
        val newArrival4 = HomeItem(name = "Table", description = "All in on table", rating = "4.0", image = R.drawable.furniture_image, price = "5000")
        newArrivals.add(newArrival1)
        newArrivals.add(newArrival2)
        newArrivals.add(newArrival3)
        newArrivals.add(newArrival4)

        return newArrivals
    }
}