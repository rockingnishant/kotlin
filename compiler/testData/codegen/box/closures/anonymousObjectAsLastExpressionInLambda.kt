// !LANGUAGE: +NewInference
// WITH_RUNTIME

object A {
    var result = "not ok"
}

operator fun A.invoke(x: () -> Unit) {
    x()
}

fun test() {
    run {
        (A) {
            A.result = "OK"
        }
    }
}

fun box(): String {
    test()
    return A.result
}