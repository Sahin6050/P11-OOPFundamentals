package com.sahin.kotlinoopproject

class SuperMusician(name: String, ınstrument: String, age: Int) : Musician(name, ınstrument, age) {
    fun sing(){
        println("nothing else matters")
    }
}