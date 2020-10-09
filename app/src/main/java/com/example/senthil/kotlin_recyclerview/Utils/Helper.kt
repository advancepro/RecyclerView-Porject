package com.example.senthil.kotlin_recyclerview.Utils

import com.example.senthil.kotlin_recyclerview.Model.AndroidVersionModel
import com.example.senthil.kotlin_recyclerview.R

class Helper{
    companion object {
        fun <ArrayList> getVersionsList(): ArrayList {
            var androidVersionList = ArrayList<AndroidVersionModel>()
            androidVersionList.add(AndroidVersionModel(R.drawable.cupcake, "Cupcake", "1.5", cost = "$3"))
            androidVersionList.add(AndroidVersionModel(R.drawable.donutt, "Donut", "1.6", cost = "$4"))
            androidVersionList.add(AndroidVersionModel(R.drawable.eclair, "Eclair", "2.0 - 2.1", cost = "$5"))
            androidVersionList.add(AndroidVersionModel(R.drawable.marshmallow, "Marshmallow", "6.0 - 6.0.1", cost = "$23"))
            androidVersionList.add(AndroidVersionModel(R.drawable.pie, "pie", "9.0", cost = "$28"))
            androidVersionList.add(AndroidVersionModel(R.drawable.oreo, "Oreo", "8.0 - 8.1", cost = "$26"))
            androidVersionList.add(AndroidVersionModel(R.drawable.froyoo, "Froyo", "2.2 - 2.2.3", cost = "$8"))
            androidVersionList.add(AndroidVersionModel(R.drawable.ginger_bread, "Gingerbread", "2.3 - 2.3.7", cost = "$10"))
            androidVersionList.add(AndroidVersionModel(R.drawable.ice_cream_sandwich, "Ice Cream Sandwich", "4.0 - 4.0.4", cost = "$14"))
            androidVersionList.add(AndroidVersionModel(R.drawable.lollipop, "Lollipop", "5.0 - 5.1.1", cost = "$21"))
            androidVersionList.add(AndroidVersionModel(R.drawable.nougat, "Nougat", "7.0 - 7.1.2", cost = "$24"))

            return androidVersionList as ArrayList
        }
    }
}