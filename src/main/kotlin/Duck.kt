class duck {
    fun quack() {
        println("Quack! Quack! Quack!")
    }
}

fun main(args: Array<String>) {
    var myDuck = duck()
    println(myDuck.quack())
}