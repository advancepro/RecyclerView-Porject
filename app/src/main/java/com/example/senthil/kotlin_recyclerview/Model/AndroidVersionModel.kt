package com.example.senthil.kotlin_recyclerview.Model

class  AndroidVersionModel{
    var imgResId : Int? = 0
    var Name: String? = null
    var delight: String? = null
    var cost: String? = null

    constructor(imgResId: Int, Name: String, delight: String, cost: String) {
        this.imgResId = imgResId
        this.Name = Name
        this.delight = delight
        this.cost = cost
    }
}