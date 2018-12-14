package year2018.dec.level6

fun ktchallenge1(s: String): Int {
    val expression: List<String> = s.trim().split(" ")
    return evaluate(expression)
}

private enum class Ops(val symbol: String) {
    ADD("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/"),
}

private fun evaluate(expression: List<String>): Int {
    var total = 0
    var currentOp = Ops.ADD

    for (value in expression) {
        try {
            val current = value.toInt()

            when (currentOp) {
                Ops.ADD -> total += current
                Ops.MINUS -> total -= current
                Ops.MULTIPLY -> total *= current
                Ops.DIVIDE -> total /= current
            }
        } catch (e: Exception) {
            when (value) {
                Ops.ADD.symbol -> currentOp = Ops.ADD
                Ops.MINUS.symbol -> currentOp = Ops.MINUS
                Ops.MULTIPLY.symbol -> currentOp = Ops.MULTIPLY
                Ops.DIVIDE.symbol -> currentOp = Ops.DIVIDE
                else -> e.printStackTrace()
            }
        }

    }
    return total
}

fun ktchallenge2(array: IntArray, a: Int): IntArray {
    val result = IntArray(2)

    for (i in 0 until array.size) {
        for (j in i+1 until  array.size) {
            when (a) {
                array[i] + array[j]-> {
                    result[0] = i
                    result[1] = j
                }
            }
        }
    }

    return result
}

fun ktchallenge3(array1: IntArray, array2: IntArray): Int = (reverseArray(array1).sum() + reverseArray(array2).sum())

private fun reverseArray(array: IntArray): IntArray {
    return array.
            map { it.toString().reversed().toInt() }.
            toIntArray()
}

fun <T> ktchallenge4(c: Class<T>, a: Double, b: Double): T? {
    return null
}

fun ktchallenge5(s: String, a: Int): Int {

    var text = s

    // replace ops with op with spaces
    // for this case only
    text = text.replace("+", " + ")
    // Index of "r" in return
    val returnIndex = text.indexOf("return")
    val semiIndex = text.indexOf(";")

    // replace i with a (this will do it for all, but it doesn't matter
    text = text.replace("i", a.toString())

    val expression = text.slice(returnIndex+6 until semiIndex )

    return ktchallenge1(expression)
}