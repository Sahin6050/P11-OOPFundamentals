package com.sahin.kotlinoopproject

class User : People {
    //Property -> özellikleri
    var name : String? = null
    var age : Int? = null

    // constructor
    constructor(name : String,age : Int){
        this.name = name
        this.age = age
    }
}