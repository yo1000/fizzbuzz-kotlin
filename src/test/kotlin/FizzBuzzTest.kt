import org.jetbrains.spek.api.Spek

data class Params(val value: Int)
data class Expects(val fizz: String, val buzz: String, val fizzBuzz: String)

class FizzBuzzTest: Spek() {
    init {
        given("fizzBuzz") {
            val fizzBuzz = FizzBuzz()

            listOf(
                    Params( 3) to Expects("fizz" , ""    , "fizz"    ),
                    Params( 5) to Expects(""     , "buzz", "buzz"    ),
                    Params(15) to Expects("fizz" , "buzz", "fizzbuzz"),
                    Params( 4) to Expects(""     , ""    , "4"       )
            ).forEach {
                val (param, expect) = it

                on("fizzbuzz param=${param.value}") {
                    val fizz = fizzBuzz.fizz(param.value)
                    val buzz = fizzBuzz.buzz(param.value)
                    val fizzBuzz = fizzBuzz.fizzBuzz(param.value)

                    it ("${expect.fizz}=${fizz}") {
                        assert(expect.fizz == fizz)
                    }
                    it ("${expect.buzz}=${buzz}") {
                        assert(expect.buzz == buzz)
                    }
                    it ("${expect.fizzBuzz}=${fizzBuzz}") {
                        assert(expect.fizzBuzz == fizzBuzz)
                    }
                }
            }
        }
    }
}
