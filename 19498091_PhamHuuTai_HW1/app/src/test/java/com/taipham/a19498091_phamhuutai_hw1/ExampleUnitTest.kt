package com.taipham.a19498091_phamhuutai_hw1

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
   fun addition_isCorrect() {
        var oldPrices: ArrayList<String> = ArrayList()
        var numbers = listOf("text20", "text10", "text5", "text1", "text25c", "text10c","text5c","text1c")
        for (i in numbers){
            oldPrices.add(i.toString())
        }
        print(oldPrices)

    }
}