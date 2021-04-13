object SingletonApp {
    init {
        println("Singleton Pattern Initialized")
    }
}

fun main() {
    println(SingletonApp)
    println(SingletonApp)
    println(SingletonApp)
}