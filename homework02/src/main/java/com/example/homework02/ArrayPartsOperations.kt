package com.example.homework02

!class ArrayPartsOperations {
    fun getPartsOfArrayDivisionResult(arrayNumbers: IntArray): Double {
        val firstHalfArray = (arrayNumbers.copyOfRange(0, arrayNumbers.size / 2).sum()).toDouble()
        val secondHalfArray = (arrayNumbers.copyOfRange(arrayNumbers.size / 2, arrayNumbers.size)
            .reduce { x, y ->  x - y }).toDouble()
        return firstHalfArray / secondHalfArray
    }
}