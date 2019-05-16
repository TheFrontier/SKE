package frontier.ske.math

import com.flowpowered.math.vector.*

// @formatter:off

//
// Absolute
//

operator fun Vector2i.unaryPlus(): Vector2i = this.abs()
operator fun Vector2l.unaryPlus(): Vector2l = this.abs()
operator fun Vector2f.unaryPlus(): Vector2f = this.abs()
operator fun Vector2d.unaryPlus(): Vector2d = this.abs()

operator fun Vector3i.unaryPlus(): Vector3i = this.abs()
operator fun Vector3l.unaryPlus(): Vector3l = this.abs()
operator fun Vector3f.unaryPlus(): Vector3f = this.abs()
operator fun Vector3d.unaryPlus(): Vector3d = this.abs()

operator fun Vector4i.unaryPlus(): Vector4i = this.abs()
operator fun Vector4l.unaryPlus(): Vector4l = this.abs()
operator fun Vector4f.unaryPlus(): Vector4f = this.abs()
operator fun Vector4d.unaryPlus(): Vector4d = this.abs()

operator fun VectorNi.unaryPlus(): VectorNi = this.abs()
operator fun VectorNl.unaryPlus(): VectorNl = this.abs()
operator fun VectorNf.unaryPlus(): VectorNf = this.abs()
operator fun VectorNd.unaryPlus(): VectorNd = this.abs()

//
// Negate
//

operator fun Vector2i.unaryMinus(): Vector2i = this.negate()
operator fun Vector2l.unaryMinus(): Vector2l = this.negate()
operator fun Vector2f.unaryMinus(): Vector2f = this.negate()
operator fun Vector2d.unaryMinus(): Vector2d = this.negate()

operator fun Vector3i.unaryMinus(): Vector3i = this.negate()
operator fun Vector3l.unaryMinus(): Vector3l = this.negate()
operator fun Vector3f.unaryMinus(): Vector3f = this.negate()
operator fun Vector3d.unaryMinus(): Vector3d = this.negate()

operator fun Vector4i.unaryMinus(): Vector4i = this.negate()
operator fun Vector4l.unaryMinus(): Vector4l = this.negate()
operator fun Vector4f.unaryMinus(): Vector4f = this.negate()
operator fun Vector4d.unaryMinus(): Vector4d = this.negate()

operator fun VectorNi.unaryMinus(): VectorNi = this.negate()
operator fun VectorNl.unaryMinus(): VectorNl = this.negate()
operator fun VectorNf.unaryMinus(): VectorNf = this.negate()
operator fun VectorNd.unaryMinus(): VectorNd = this.negate()

//
// Normalize
//

operator fun Vector2f.not(): Vector2f = this.normalize()
operator fun Vector2d.not(): Vector2d = this.normalize()

operator fun Vector3f.not(): Vector3f = this.normalize()
operator fun Vector3d.not(): Vector3d = this.normalize()

operator fun Vector4f.not(): Vector4f = this.normalize()
operator fun Vector4d.not(): Vector4d = this.normalize()

operator fun VectorNf.not(): VectorNf = this.normalize()
operator fun VectorNd.not(): VectorNd = this.normalize()

//
// Increment
//

operator fun Vector2i.inc(): Vector2i = this.add(Vector2i.ONE)
operator fun Vector2l.inc(): Vector2l = this.add(Vector2l.ONE)
operator fun Vector2f.inc(): Vector2f = this.add(Vector2f.ONE)
operator fun Vector2d.inc(): Vector2d = this.add(Vector2d.ONE)

operator fun Vector3i.inc(): Vector3i = this.add(Vector3i.ONE)
operator fun Vector3l.inc(): Vector3l = this.add(Vector3l.ONE)
operator fun Vector3f.inc(): Vector3f = this.add(Vector3f.ONE)
operator fun Vector3d.inc(): Vector3d = this.add(Vector3d.ONE)

operator fun Vector4i.inc(): Vector4i = this.add(Vector4i.ONE)
operator fun Vector4l.inc(): Vector4l = this.add(Vector4l.ONE)
operator fun Vector4f.inc(): Vector4f = this.add(Vector4f.ONE)
operator fun Vector4d.inc(): Vector4d = this.add(Vector4d.ONE)

operator fun VectorNi.inc(): VectorNi = this.add(*IntArray(this.size()) { 1 })
operator fun VectorNl.inc(): VectorNl = this.add(*LongArray(this.size()) { 1 })
operator fun VectorNf.inc(): VectorNf = this.add(*FloatArray(this.size()) { 1.0f })
operator fun VectorNd.inc(): VectorNd = this.add(*DoubleArray(this.size()) { 1.0 })

//
// Decrement
//

operator fun Vector2i.dec(): Vector2i = this.sub(Vector2i.ONE)
operator fun Vector2l.dec(): Vector2l = this.sub(Vector2l.ONE)
operator fun Vector2f.dec(): Vector2f = this.sub(Vector2f.ONE)
operator fun Vector2d.dec(): Vector2d = this.sub(Vector2d.ONE)

operator fun Vector3i.dec(): Vector3i = this.sub(Vector3i.ONE)
operator fun Vector3l.dec(): Vector3l = this.sub(Vector3l.ONE)
operator fun Vector3f.dec(): Vector3f = this.sub(Vector3f.ONE)
operator fun Vector3d.dec(): Vector3d = this.sub(Vector3d.ONE)

operator fun Vector4i.dec(): Vector4i = this.sub(Vector4i.ONE)
operator fun Vector4l.dec(): Vector4l = this.sub(Vector4l.ONE)
operator fun Vector4f.dec(): Vector4f = this.sub(Vector4f.ONE)
operator fun Vector4d.dec(): Vector4d = this.sub(Vector4d.ONE)

operator fun VectorNi.dec(): VectorNi = this.sub(*IntArray(this.size()) { 1 })
operator fun VectorNl.dec(): VectorNl = this.sub(*LongArray(this.size()) { 1 })
operator fun VectorNf.dec(): VectorNf = this.sub(*FloatArray(this.size()) { 1.0f })
operator fun VectorNd.dec(): VectorNd = this.sub(*DoubleArray(this.size()) { 1.0 })

//
// Addition
//

operator fun Vector2i.plus(other: Vector2i): Vector2i = this.add(other)
operator fun Vector2l.plus(other: Vector2l): Vector2l = this.add(other)
operator fun Vector2f.plus(other: Vector2f): Vector2f = this.add(other)
operator fun Vector2d.plus(other: Vector2d): Vector2d = this.add(other)

operator fun Vector3i.plus(other: Vector3i): Vector3i = this.add(other)
operator fun Vector3l.plus(other: Vector3l): Vector3l = this.add(other)
operator fun Vector3f.plus(other: Vector3f): Vector3f = this.add(other)
operator fun Vector3d.plus(other: Vector3d): Vector3d = this.add(other)

operator fun Vector4i.plus(other: Vector4i): Vector4i = this.add(other)
operator fun Vector4l.plus(other: Vector4l): Vector4l = this.add(other)
operator fun Vector4f.plus(other: Vector4f): Vector4f = this.add(other)
operator fun Vector4d.plus(other: Vector4d): Vector4d = this.add(other)

operator fun VectorNi.plus(other: VectorNi): VectorNi = this.add(other)
operator fun VectorNl.plus(other: VectorNl): VectorNl = this.add(other)
operator fun VectorNf.plus(other: VectorNf): VectorNf = this.add(other)
operator fun VectorNd.plus(other: VectorNd): VectorNd = this.add(other)

//
// Subtraction
//

operator fun Vector2i.minus(other: Vector2i): Vector2i = this.sub(other)
operator fun Vector2l.minus(other: Vector2l): Vector2l = this.sub(other)
operator fun Vector2f.minus(other: Vector2f): Vector2f = this.sub(other)
operator fun Vector2d.minus(other: Vector2d): Vector2d = this.sub(other)

operator fun Vector3i.minus(other: Vector3i): Vector3i = this.sub(other)
operator fun Vector3l.minus(other: Vector3l): Vector3l = this.sub(other)
operator fun Vector3f.minus(other: Vector3f): Vector3f = this.sub(other)
operator fun Vector3d.minus(other: Vector3d): Vector3d = this.sub(other)

operator fun Vector4i.minus(other: Vector4i): Vector4i = this.sub(other)
operator fun Vector4l.minus(other: Vector4l): Vector4l = this.sub(other)
operator fun Vector4f.minus(other: Vector4f): Vector4f = this.sub(other)
operator fun Vector4d.minus(other: Vector4d): Vector4d = this.sub(other)

operator fun VectorNi.minus(other: VectorNi): VectorNi = this.sub(other)
operator fun VectorNl.minus(other: VectorNl): VectorNl = this.sub(other)
operator fun VectorNf.minus(other: VectorNf): VectorNf = this.sub(other)
operator fun VectorNd.minus(other: VectorNd): VectorNd = this.sub(other)

//
// Multiplication
//

operator fun Vector2i.times(other: Vector2i): Vector2i = this.mul(other)
operator fun Vector2i.times(other: Int): Vector2i = this.mul(other)
operator fun Vector2i.times(other: Double): Vector2i = this.mul(other)

operator fun Vector2l.times(other: Vector2l): Vector2l = this.mul(other)
operator fun Vector2l.times(other: Long): Vector2l = this.mul(other)
operator fun Vector2l.times(other: Double): Vector2l = this.mul(other)

operator fun Vector2f.times(other: Vector2f): Vector2f = this.mul(other)
operator fun Vector2f.times(other: Float): Vector2f = this.mul(other)
operator fun Vector2f.times(other: Double): Vector2f = this.mul(other)

operator fun Vector2d.times(other: Vector2d): Vector2d = this.mul(other)
operator fun Vector2d.times(other: Double): Vector2d = this.mul(other)
operator fun Vector2d.times(other: Float): Vector2d = this.mul(other)

operator fun Vector3i.times(other: Vector3i): Vector3i = this.mul(other)
operator fun Vector3i.times(other: Int): Vector3i = this.mul(other)
operator fun Vector3i.times(other: Double): Vector3i = this.mul(other)

operator fun Vector3l.times(other: Vector3l): Vector3l = this.mul(other)
operator fun Vector3l.times(other: Long): Vector3l = this.mul(other)
operator fun Vector3l.times(other: Double): Vector3l = this.mul(other)

operator fun Vector3f.times(other: Vector3f): Vector3f = this.mul(other)
operator fun Vector3f.times(other: Float): Vector3f = this.mul(other)
operator fun Vector3f.times(other: Double): Vector3f = this.mul(other)

operator fun Vector3d.times(other: Vector3d): Vector3d = this.mul(other)
operator fun Vector3d.times(other: Double): Vector3d = this.mul(other)
operator fun Vector3d.times(other: Float): Vector3d = this.mul(other)

operator fun Vector4i.times(other: Vector4i): Vector4i = this.mul(other)
operator fun Vector4i.times(other: Int): Vector4i = this.mul(other)
operator fun Vector4i.times(other: Double): Vector4i = this.mul(other)

operator fun Vector4l.times(other: Vector4l): Vector4l = this.mul(other)
operator fun Vector4l.times(other: Long): Vector4l = this.mul(other)
operator fun Vector4l.times(other: Double): Vector4l = this.mul(other)

operator fun Vector4f.times(other: Vector4f): Vector4f = this.mul(other)
operator fun Vector4f.times(other: Float): Vector4f = this.mul(other)
operator fun Vector4f.times(other: Double): Vector4f = this.mul(other)

operator fun Vector4d.times(other: Vector4d): Vector4d = this.mul(other)
operator fun Vector4d.times(other: Double): Vector4d = this.mul(other)
operator fun Vector4d.times(other: Float): Vector4d = this.mul(other)

operator fun VectorNi.times(other: VectorNi): VectorNi = this.mul(other)
operator fun VectorNi.times(other: Int): VectorNi = this.mul(other)
operator fun VectorNi.times(other: Double): VectorNi = this.mul(other)

operator fun VectorNl.times(other: VectorNl): VectorNl = this.mul(other)
operator fun VectorNl.times(other: Long): VectorNl = this.mul(other)
operator fun VectorNl.times(other: Double): VectorNl = this.mul(other)

operator fun VectorNf.times(other: VectorNf): VectorNf = this.mul(other)
operator fun VectorNf.times(other: Float): VectorNf = this.mul(other)
operator fun VectorNf.times(other: Double): VectorNf = this.mul(other)

operator fun VectorNd.times(other: VectorNd): VectorNd = this.mul(other)
operator fun VectorNd.times(other: Double): VectorNd = this.mul(other)
operator fun VectorNd.times(other: Float): VectorNd = this.mul(other)

//
// Remainder
//

operator fun Vector2i.rem(other: Vector2i): Vector2i = Vector2i(this.x % other.x, this.y % other.y)
operator fun Vector2l.rem(other: Vector2l): Vector2l = Vector2l(this.x % other.x, this.y % other.y)
operator fun Vector2f.rem(other: Vector2f): Vector2f = Vector2f(this.x % other.x, this.y % other.y)
operator fun Vector2d.rem(other: Vector2d): Vector2d = Vector2d(this.x % other.x, this.y % other.y)

operator fun Vector2i.rem(other: Int): Vector2i = Vector2i(this.x % other, this.y % other)
operator fun Vector2l.rem(other: Long): Vector2l = Vector2l(this.x % other, this.y % other)
operator fun Vector2f.rem(other: Float): Vector2f = Vector2f(this.x % other, this.y % other)
operator fun Vector2d.rem(other: Double): Vector2d = Vector2d(this.x % other, this.y % other)

operator fun Vector3i.rem(other: Vector3i): Vector3i = Vector3i(this.x % other.x, this.y % other.y, this.z % other.z)
operator fun Vector3l.rem(other: Vector3l): Vector3l = Vector3l(this.x % other.x, this.y % other.y, this.z % other.z)
operator fun Vector3f.rem(other: Vector3f): Vector3f = Vector3f(this.x % other.x, this.y % other.y, this.z % other.z)
operator fun Vector3d.rem(other: Vector3d): Vector3d = Vector3d(this.x % other.x, this.y % other.y, this.z % other.z)

operator fun Vector3i.rem(other: Int): Vector3i = Vector3i(this.x % other, this.y % other, this.z % other)
operator fun Vector3l.rem(other: Long): Vector3l = Vector3l(this.x % other, this.y % other, this.z % other)
operator fun Vector3f.rem(other: Float): Vector3f = Vector3f(this.x % other, this.y % other, this.z % other)
operator fun Vector3d.rem(other: Double): Vector3d = Vector3d(this.x % other, this.y % other, this.z % other)

operator fun Vector4i.rem(other: Vector4i): Vector4i = Vector4i(this.x % other.x, this.y % other.y, this.z % other.z, this.w % other.w)
operator fun Vector4l.rem(other: Vector4l): Vector4l = Vector4l(this.x % other.x, this.y % other.y, this.z % other.z, this.w % other.w)
operator fun Vector4f.rem(other: Vector4f): Vector4f = Vector4f(this.x % other.x, this.y % other.y, this.z % other.z, this.w % other.w)
operator fun Vector4d.rem(other: Vector4d): Vector4d = Vector4d(this.x % other.x, this.y % other.y, this.z % other.z, this.w % other.w)

operator fun Vector4i.rem(other: Int): Vector4i = Vector4i(this.x % other, this.y % other, this.z % other, this.w % other)
operator fun Vector4l.rem(other: Long): Vector4l = Vector4l(this.x % other, this.y % other, this.z % other, this.w % other)
operator fun Vector4f.rem(other: Float): Vector4f = Vector4f(this.x % other, this.y % other, this.z % other, this.w % other)
operator fun Vector4d.rem(other: Double): Vector4d = Vector4d(this.x % other, this.y % other, this.z % other, this.w % other)

operator fun VectorNi.rem(other: VectorNi): VectorNi = VectorNi(*this.toArray().mapArray { i, v -> v % other[i] })
operator fun VectorNl.rem(other: VectorNl): VectorNl = VectorNl(*this.toArray().mapArray { i, v -> v % other[i] })
operator fun VectorNf.rem(other: VectorNf): VectorNf = VectorNf(*this.toArray().mapArray { i, v -> v % other[i] })
operator fun VectorNd.rem(other: VectorNd): VectorNd = VectorNd(*this.toArray().mapArray { i, v -> v % other[i] })

operator fun VectorNi.rem(other: Int): VectorNi = VectorNi(*this.toArray().mapArray { _, value -> value % other })
operator fun VectorNl.rem(other: Long): VectorNl = VectorNl(*this.toArray().mapArray { _, value -> value % other })
operator fun VectorNf.rem(other: Float): VectorNf = VectorNf(*this.toArray().mapArray { _, value -> value % other })
operator fun VectorNd.rem(other: Double): VectorNd = VectorNd(*this.toArray().mapArray { _, value -> value % other })

// Distance-Squared

operator fun Vector2i.rangeTo(other: Vector2i): Int = this.distanceSquared(other)
operator fun Vector2l.rangeTo(other: Vector2l): Long = this.distanceSquared(other)
operator fun Vector2f.rangeTo(other: Vector2f): Float = this.distanceSquared(other)
operator fun Vector2d.rangeTo(other: Vector2d): Double = this.distanceSquared(other)

operator fun Vector3i.rangeTo(other: Vector3i): Int = this.distanceSquared(other)
operator fun Vector3l.rangeTo(other: Vector3l): Long = this.distanceSquared(other)
operator fun Vector3f.rangeTo(other: Vector3f): Float = this.distanceSquared(other)
operator fun Vector3d.rangeTo(other: Vector3d): Double = this.distanceSquared(other)

operator fun Vector4i.rangeTo(other: Vector4i): Int = this.distanceSquared(other)
operator fun Vector4l.rangeTo(other: Vector4l): Long = this.distanceSquared(other)
operator fun Vector4f.rangeTo(other: Vector4f): Float = this.distanceSquared(other)
operator fun Vector4d.rangeTo(other: Vector4d): Double = this.distanceSquared(other)

operator fun VectorNi.rangeTo(other: VectorNi): Int = this.distanceSquared(other)
operator fun VectorNl.rangeTo(other: VectorNl): Long = this.distanceSquared(other)
operator fun VectorNf.rangeTo(other: VectorNf): Float = this.distanceSquared(other)
operator fun VectorNd.rangeTo(other: VectorNd): Double = this.distanceSquared(other)



//
// Destructuring
//

operator fun Vector2i.component1() = this.x
operator fun Vector2i.component2() = this.y

operator fun Vector2l.component1() = this.x
operator fun Vector2l.component2() = this.y

operator fun Vector2f.component1() = this.x
operator fun Vector2f.component2() = this.y

operator fun Vector2d.component1() = this.x
operator fun Vector2d.component2() = this.y

operator fun Vector3i.component1() = this.x
operator fun Vector3i.component2() = this.y
operator fun Vector3i.component3() = this.z

operator fun Vector3l.component1() = this.x
operator fun Vector3l.component2() = this.y
operator fun Vector3l.component3() = this.z

operator fun Vector3f.component1() = this.x
operator fun Vector3f.component2() = this.y
operator fun Vector3f.component3() = this.z

operator fun Vector3d.component1() = this.x
operator fun Vector3d.component2() = this.y
operator fun Vector3d.component3() = this.z

operator fun Vector4i.component1() = this.x
operator fun Vector4i.component2() = this.y
operator fun Vector4i.component3() = this.z
operator fun Vector4i.component4() = this.w

operator fun Vector4l.component1() = this.x
operator fun Vector4l.component2() = this.y
operator fun Vector4l.component3() = this.z
operator fun Vector4l.component4() = this.w

operator fun Vector4f.component1() = this.x
operator fun Vector4f.component2() = this.y
operator fun Vector4f.component3() = this.z
operator fun Vector4f.component4() = this.w

operator fun Vector4d.component1() = this.x
operator fun Vector4d.component2() = this.y
operator fun Vector4d.component3() = this.z
operator fun Vector4d.component4() = this.w

operator fun VectorNi.component1() = this[0]
operator fun VectorNi.component2() = this[1]
operator fun VectorNi.component3() = this[2]
operator fun VectorNi.component4() = this[3]
operator fun VectorNi.component5() = this[4]

operator fun VectorNl.component1() = this[0]
operator fun VectorNl.component2() = this[1]
operator fun VectorNl.component3() = this[2]
operator fun VectorNl.component4() = this[3]
operator fun VectorNl.component5() = this[4]

operator fun VectorNf.component1() = this[0]
operator fun VectorNf.component2() = this[1]
operator fun VectorNf.component3() = this[2]
operator fun VectorNf.component4() = this[3]
operator fun VectorNf.component5() = this[4]

operator fun VectorNd.component1() = this[0]
operator fun VectorNd.component2() = this[1]
operator fun VectorNd.component3() = this[2]
operator fun VectorNd.component4() = this[3]
operator fun VectorNd.component5() = this[4]

//
// String joining
//

fun Vector2i.joinToString(prefix: CharSequence = "", separator: CharSequence = ", ", postfix: CharSequence = ""): String =
    StringBuilder()
        .append(prefix).append(x)
        .append(separator).append(y)
        .append(postfix).toString()

fun Vector2l.joinToString(prefix: CharSequence = "", separator: CharSequence = ", ", postfix: CharSequence = ""): String =
    StringBuilder()
        .append(prefix).append(x)
        .append(separator).append(y)
        .append(postfix).toString()

fun Vector2f.joinToString(prefix: CharSequence = "", separator: CharSequence = ", ", postfix: CharSequence = ""): String =
    StringBuilder()
        .append(prefix).append(x)
        .append(separator).append(y)
        .append(postfix).toString()

fun Vector2d.joinToString(prefix: CharSequence = "", separator: CharSequence = ", ", postfix: CharSequence = ""): String =
    StringBuilder()
        .append(prefix).append(x)
        .append(separator).append(y)
        .append(postfix).toString()

fun Vector3i.joinToString(prefix: CharSequence = "", separator: CharSequence = ", ", postfix: CharSequence = ""): String =
    StringBuilder()
        .append(prefix).append(x)
        .append(separator).append(y)
        .append(separator).append(z)
        .append(postfix).toString()

fun Vector3l.joinToString(prefix: CharSequence = "", separator: CharSequence = ", ", postfix: CharSequence = ""): String =
    StringBuilder()
        .append(prefix).append(x)
        .append(separator).append(y)
        .append(separator).append(z)
        .append(postfix).toString()

fun Vector3f.joinToString(prefix: CharSequence = "", separator: CharSequence = ", ", postfix: CharSequence = ""): String =
    StringBuilder()
        .append(prefix).append(x)
        .append(separator).append(y)
        .append(separator).append(z)
        .append(postfix).toString()

fun Vector3d.joinToString(prefix: CharSequence = "", separator: CharSequence = ", ", postfix: CharSequence = ""): String =
    StringBuilder()
        .append(prefix).append(x)
        .append(separator).append(y)
        .append(separator).append(z)
        .append(postfix).toString()

fun Vector4i.joinToString(prefix: CharSequence = "", separator: CharSequence = ", ", postfix: CharSequence = ""): String =
    StringBuilder()
        .append(prefix).append(x)
        .append(separator).append(y)
        .append(separator).append(z)
        .append(separator).append(w)
        .append(postfix).toString()

fun Vector4l.joinToString(prefix: CharSequence = "", separator: CharSequence = ", ", postfix: CharSequence = ""): String =
    StringBuilder()
        .append(prefix).append(x)
        .append(separator).append(y)
        .append(separator).append(z)
        .append(separator).append(w)
        .append(postfix).toString()

fun Vector4f.joinToString(prefix: CharSequence = "", separator: CharSequence = ", ", postfix: CharSequence = ""): String =
    StringBuilder()
        .append(prefix).append(x)
        .append(separator).append(y)
        .append(separator).append(z)
        .append(separator).append(w)
        .append(postfix).toString()

fun Vector4d.joinToString(prefix: CharSequence = "", separator: CharSequence = ", ", postfix: CharSequence = ""): String =
    StringBuilder()
        .append(prefix).append(x)
        .append(separator).append(y)
        .append(separator).append(z)
        .append(separator).append(w)
        .append(postfix).toString()

fun VectorNi.joinToString(prefix: CharSequence = "", separator: CharSequence = ", ", postfix: CharSequence = ""): String =
    this.toArray().joinToString(prefix = prefix, separator = separator, postfix = postfix)

fun VectorNl.joinToString(prefix: CharSequence = "", separator: CharSequence = ", ", postfix: CharSequence = ""): String =
    this.toArray().joinToString(prefix = prefix, separator = separator, postfix = postfix)

fun VectorNf.joinToString(prefix: CharSequence = "", separator: CharSequence = ", ", postfix: CharSequence = ""): String =
    this.toArray().joinToString(prefix = prefix, separator = separator, postfix = postfix)

fun VectorNd.joinToString(prefix: CharSequence = "", separator: CharSequence = ", ", postfix: CharSequence = ""): String =
    this.toArray().joinToString(prefix = prefix, separator = separator, postfix = postfix)

// @formatter:on