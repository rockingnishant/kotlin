// "Create extension function 'String?.notExistingFun'" "true"
fun foo(n: Int) {}

fun context(p: String?) {
    foo(p.<caret>notExistingVal)
}