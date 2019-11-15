package com.example.furnitureapp.data.model

import android.os.Parcel
import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "homeitem")
data class HomeItem(@PrimaryKey
                    @ColumnInfo(name = "name") var name: String,
                    @ColumnInfo(name = "description") var description: String,
                    @ColumnInfo(name = "rating") var rating: String,
                    @ColumnInfo(name = "image") var image: String,
                    @ColumnInfo(name = "price") var price: String) : Parcelable {

    @ColumnInfo(name = "length")
    var length: String = ""
    @ColumnInfo(name = "height")
    var height: String = ""
    @ColumnInfo(name = "depth")
    var depth: String = ""

    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
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
        parcel.writeString(image)
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