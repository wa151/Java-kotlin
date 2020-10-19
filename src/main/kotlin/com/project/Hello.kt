package com.project

//分號可有可無
fun main() {
    println("Hello kotlin")
    Human().hello()
    val h = Human();
    h.hello;

    //定義資料變數時，一定要使用var(可改變值)、val(不可改變值)
    //Kotlin 會自動變數型態資料推斷(也可冒號給資料型態)
    val name  = "Happy";
    var age :Int =19;
    var weight = 66.5f;

}

class Human {
    fun hello(){
        println("Hello KOTLIN")
    }
}