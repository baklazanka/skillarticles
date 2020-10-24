package ru.skillbranch.skillarticles.extensions

fun List<Pair<Int, Int>>.groupByBounds(bounds: List<Pair<Int, Int>>): List<MutableList<Pair<Int, Int>>> {
    val result = mutableListOf<MutableList<Pair<Int, Int>>>()

    repeat(bounds.size) {
        result.add(mutableListOf())
    }

    forEach {
        val start = it.first
        val end = it.second

        // такой алгоритм не обрабатывает случай, если диапазон из this входит в 3 и больше диапазонов bounda
        var element = bounds.find { pair -> start in pair.first..pair.second }
        if (element != null) {
            val index = bounds.indexOf(element)

            if (end > element.second) {
                result[index].add(start to element.second)
                element = bounds.find { pair -> end in pair.first..pair.second }
                if (element != null) {
                    result[index].add(element.first to end)
                }
            } else {
                result[index].add(start to end)
            }
        }

//        bounds.forEachIndexed { index, pair ->
//            val range = pair.first..pair.second
//            if (start in range){
//                if (end > pair.second){
//                    end = pair.second
//                }
//
//                result[index].add(start to end)
//
//                if (end == it.second) return@forEachIndexed
//            } else if (end in range){
//
//            }
//        }
    }

    return result
}