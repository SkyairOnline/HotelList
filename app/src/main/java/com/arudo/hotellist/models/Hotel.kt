package com.arudo.hotellist.models

data class Hotel(
    var name: String = "",
    var detail: String = "",
    var photo: Int = 0,
    var rating: Float = 0F,
    var website: String = "",
    var location: String = ""
)