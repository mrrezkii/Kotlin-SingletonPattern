class SingletonApp private constructor() {
    companion object {
        private var instance: SingletonApp? = null
        fun getInstance() = synchronized(this) {
            if (instance == null) instance = SingletonApp()
            instance
        }
    }
}

fun main() {
    println(SingletonApp.getInstance())
    println(SingletonApp.getInstance())
    println(SingletonApp.getInstance())
}