package com.sahin.kotlinoopproject

class Dog : Animal() {
    fun test(){
        super.sing()
    }
    override fun sing(){
        println("Dog Class")
    }
}