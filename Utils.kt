package com.example.class_iu_work


//Kotlin Object To use
//isko use krengy hum tag ki jaga
object Utils {
    const val appName="Application Of IU"
    fun validate(value:String):Boolean{
         if(value.isNullOrEmpty())
             return false
         return true
    }
}