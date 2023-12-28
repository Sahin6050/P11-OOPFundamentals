package com.sahin.kotlinoopproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var myUser = User("Berk",24)
        myUser.name = "Lars"
        myUser.age = 34



        println(myUser.name)
        println(myUser.age)
        println(myUser.information())

        // Encapsulation aslında kapsülleme demek kod parçalarının bütünlüğünü korur ve
        //gizlenmesi ne gerekiyorsa bunun sayesinde yaparız.
        var james = Musician("James","Guitar",55)
        println(james.returnBandName("Atil"))
        println(james.returnBandName("Emre"))

        // İnheritance -> Kalıtım yani miras almak demektir.

        val lars = SuperMusician("Lars","Drums",65)
        println(lars.name)
        println(lars.returnBandName("Atil"))
        lars.sing()

        // Polymorphism -> Çok biçimlilik demektir.Aynı ismi kullanıp farklı işlemler yapabiliriz.
        // Static ve Dynamic polymorphism vardır.
        // Aynı sınıf içindeki çeşitlilik veya çokbiçimliliğe Static polymorphism denir.
        // Farklı sınıf içindeki çeşitlilik veya çokbiçimliliğe Dynamic polymorphism denir.

        // Static Polymorphism
        val math = Mathematics()
        println(math.sum())
        println(math.sum(3,4))
        println(math.sum(3,4,5))

        // Dynamic Polymorphism
        val animal = Animal()
        animal.sing()

        val barley = Dog()
        barley.test()
        barley.sing()

        // Abstract - İnterface -> Soyutlama demektir. Yani bir obje veya nesne oluşturamayız.

        //val myPeople = People() abstract sınıf olduğu için nesne oluşmaz.
        // Kalıtım tek sınıftan olabilir.Eğer birden fazla kalıtım yapmak istiyorsak interfaceleri kullanırız.

        val myPiano = Piano()
        myPiano.brand = "Yamaha"
        myPiano.digital = true
        println(myPiano.brand)
        println(myPiano.digital)
        println(myPiano.roomName)
        myPiano.info()

        // Lambda Expressions

        fun testString(myString : String){
            println(myString)
        }

        testString("My Test String")

        val lambda = {myString : String -> println(myString) }
        lambda("my Lambda")

        val multiplyLambda = {x : Int,y : Int -> x * y }
        println(multiplyLambda(9,8))

        // veri tipleri önce yazılabilir.
        val multiplyLambda2 :(Int,Int) -> Int = {a,b -> a*b}

        println(multiplyLambda2(3,2))

        //asynchrnous -> Senkronize olmayan

        // callback function,listener function,completion function

        fun downloadMusicians(url : String,completion : (Musician) -> Unit){
            // url git -> download
            // data

            val Kirk = Musician("Kirk","Guitar",22)

            completion(Kirk)

        }

        downloadMusicians("Metalica.com",{ musician ->
            println(musician.name)
            println("Completed - Ready ")
        })


















































































































































































        
    }
}