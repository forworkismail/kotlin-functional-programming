package main

// find sum of integers in range
val sumInRangeInput = listOf("1", "10", "a", "7", "ad2", "3")

fun sumInRange(input: List<String>, range: IntRange): Int = input
    .filter { it.matches(Regex("\\d+")) }
    .map { it.toInt() }
    .filter { it in range }
    .sum()


