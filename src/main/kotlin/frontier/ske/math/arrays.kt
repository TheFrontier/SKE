package frontier.ske.math

inline fun IntArray.mapArray(transform: (index: Int, value: Int) -> Int): IntArray {
    val result = IntArray(size)

    for (index in indices) {
        result[index] = transform(index, this[index])
    }

    return result
}

inline fun LongArray.mapArray(transform: (index: Int, value: Long) -> Long): LongArray {
    val result = LongArray(size)

    for (index in indices) {
        result[index] = transform(index, this[index])
    }

    return result
}

inline fun FloatArray.mapArray(transform: (index: Int, value: Float) -> Float): FloatArray {
    val result = FloatArray(size)

    for (index in indices) {
        result[index] = transform(index, this[index])
    }

    return result
}

inline fun DoubleArray.mapArray(transform: (index: Int, value: Double) -> Double): DoubleArray {
    val result = DoubleArray(size)

    for (index in indices) {
        result[index] = transform(index, this[index])
    }

    return result
}