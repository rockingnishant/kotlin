// "Add remaining branches with import" "true"
// WITH_RUNTIME

package test

class OwnEnumProvider {
    fun provide() = test.enum.OwnEnum.RED
}


fun mainContext() {
    val ownLocal = OwnEnumProvider().provide()
    <caret>when (ownLocal) {
    }
}