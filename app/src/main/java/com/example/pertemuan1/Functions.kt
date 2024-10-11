package com.example.pertemuan1

fun withoutParameter() {
    println("=== withoutparameter===")
    println("hello world")
}

fun withParameter(name: String) {
    println()
    println("===with parameter")
    println("hello $name")
}


//name argumen merupakan cara untuk memanggil fungsi dengan menyebutkan nama parameter
fun withNamedArgument(name:String, age:Int) {
    println()
    println("===withnamedargument===")
    println("Hello, $name: you are $age years old")
}