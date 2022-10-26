package com.yusud.siniflarvefonksiyonlar

class Superkahraman {

    //Property
    var name = ""
    var age = 0
    var job = ""

    //Constructor
    constructor(name : String, age : Int, job : String){
        this.name = name
        this.age = age
        this.job = job

        println("Constructor Çağrıldı")
    }

    //Birincil Constructor
    /*
      class Superkahraman(var name:String, var age:Int, var job:String){
      }
      Diğeriyle hiçbir farkı yok.
     */

    fun testFonksiyonu(){
        println("Test")
    }





}