package com.example.homework02

import kotlin.random.Random

!class Randomizer {
    !fun getSetRandomNumbers(minSetSize: Int, maxSetSize: Int,
                            minNumberInLSet: Int, maxNumberInSet: Int): HashSet<Int> {

        /***
         * To get guaranteed even random sized HashSet from a given range
         */

        val sizeSet = (Random.nextInt(minSetSize,maxSetSize + 1) / 2) * 2
        val setNumbers = hashSetOf<Int>()

        /***
         * Because each number is unique, make sure HashSet is filled out
         * Fill HashSet with random numbers from a given range
         */

        if (sizeSet < maxNumberInSet - minNumberInLSet && minSetSize >= 2) {
            while (setNumbers.size < sizeSet) {
                setNumbers.add(Random.nextInt(minNumberInLSet, maxNumberInSet + 1))
            }
        }
        return setNumbers
    }
}
