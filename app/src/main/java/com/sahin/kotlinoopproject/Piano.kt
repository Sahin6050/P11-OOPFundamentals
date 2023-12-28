package com.sahin.kotlinoopproject

 class Piano : HouseDecor,Intrument {
    var brand : String? = null
    var digital : Boolean? = null
     override var roomName: String
         get() = "Kitchen"
         set(value) {}

     override fun info() {
         println("Instrument info ")
     }


 }