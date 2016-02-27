/**
 * Created by yoichi.kikuchi on 2016/02/26.
 */
class FizzBuzz() {
    fun fizz(value: Int): String {
        return if (value % 3 == 0) "fizz" else ""
    }

    fun buzz(value: Int): String {
        return if (value % 5 == 0) "buzz" else ""
    }

    fun fizzBuzz(value: Int): String {
        val builder = StringBuilder(fizz(value)).append(buzz(value))

        return if (builder.isEmpty()) value.toString() else builder.toString()
    }
}
