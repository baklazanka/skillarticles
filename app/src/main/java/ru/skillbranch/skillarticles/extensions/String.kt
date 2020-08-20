package ru.skillbranch.skillarticles.extensions

fun String?.indexesOf(substr: String, ignoreCase: Boolean = true): List<Int> {
    if (this.isNullOrEmpty() || substr.isNullOrEmpty()) return listOf<Int>()

    val regex = if (ignoreCase) substr.toLowerCase().toRegex() else substr.toRegex()
    val matches = if (ignoreCase) regex.findAll(this.toLowerCase()) else regex.findAll(this)
    return matches.map { it.range.first }.toList()
}