package main

// find sum of items in list that are integers
val declarativeSumInput = listOf(
    "123", "abc", "1ds", "987", "abdf", "1d3", "de1", "88", "101"
)

fun declarativeSum (input: List<String>): Int = input
    .filter { it.matches(Regex("\\d+")) }
    .map(String::toInt)
    .sum()
