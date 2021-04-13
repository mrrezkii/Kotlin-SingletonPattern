class SingletonApp private constructor() {
    companion object {
        private var instance: SingletonApp? = null
        operator fun invoke() = synchronized(this) {
            if (instance == null) instance = SingletonApp()
            instance
        }
    }
}

fun main() {
    println(SingletonApp)
    println(SingletonApp)
    println(SingletonApp)
}