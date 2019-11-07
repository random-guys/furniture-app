package com.example.furnitureapp.data.model

import android.os.Parcel
import android.os.Parcelable

data class HomeItem(var name: String, var description: String, var rating: String, var image: Int, var price: String) : Parcelable {

    lateinit var length: String
    lateinit var height: String
    lateinit var depth: String

    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readString()!!
    ) {
        length = parcel.readString()!!
        height = parcel.readString()!!
        depth = parcel.readString()!!
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(description)
        parcel.writeString(rating)
        parcel.writeInt(image)
        parcel.writeString(price)
        parcel.writeString(length)
        parcel.writeString(height)
        parcel.writeString(depth)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<HomeItem> {
        override fun createFromParcel(parcel: Parcel): HomeItem {
            return HomeItem(parcel)
        }

        override fun newArray(size: Int): Array<HomeItem?> {
            return arrayOfNulls(size)
        }
    }

}