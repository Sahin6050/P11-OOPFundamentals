package com.sahin.kotlinoopproject

open class Musician(name: String, ınstrument: String, age: Int) {

    // Encapsulation -> kapsülleme demektir. Kodların anlamlı bir araya gelmesi ve kapsüllenmesi demektir.
     var name : String? = name
        private set // Değiştiremezsin
        get         // Ama okuyabilirsin.

    private var ınstrument : String? = ınstrument
     var age : Int? = age
                get
                private  set

    private val bandName : String = "Metallica"

    fun returnBandName(password : String): String{
        if(password == "Atil"){
            return bandName
        }else{
            return "Wrong Password"
        }

    }

}