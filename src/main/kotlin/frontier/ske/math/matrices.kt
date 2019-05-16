package frontier.ske.math

import com.flowpowered.math.matrix.*

// @formatter:off

//
// Absolute
//

operator fun Matrix2f.unaryPlus(): Matrix2f = this.abs()
operator fun Matrix2d.unaryPlus(): Matrix2d = this.abs()

operator fun Matrix3f.unaryPlus(): Matrix3f = this.abs()
operator fun Matrix3d.unaryPlus(): Matrix3d = this.abs()

operator fun Matrix4f.unaryPlus(): Matrix4f = this.abs()
operator fun Matrix4d.unaryPlus(): Matrix4d = this.abs()

operator fun MatrixNf.unaryPlus(): MatrixNf = this.abs()
operator fun MatrixNd.unaryPlus(): MatrixNd = this.abs()

//
// Negate
//

operator fun Matrix2f.unaryMinus(): Matrix2f = this.negate()
operator fun Matrix2d.unaryMinus(): Matrix2d = this.negate()

operator fun Matrix3f.unaryMinus(): Matrix3f = this.negate()
operator fun Matrix3d.unaryMinus(): Matrix3d = this.negate()

operator fun Matrix4f.unaryMinus(): Matrix4f = this.negate()
operator fun Matrix4d.unaryMinus(): Matrix4d = this.negate()

operator fun MatrixNf.unaryMinus(): MatrixNf = this.negate()
operator fun MatrixNd.unaryMinus(): MatrixNd = this.negate()

//
// Invert
//

operator fun Matrix2f.not(): Matrix2f = this.invert()
operator fun Matrix2d.not(): Matrix2d = this.invert()

operator fun Matrix3f.not(): Matrix3f = this.invert()
operator fun Matrix3d.not(): Matrix3d = this.invert()

operator fun Matrix4f.not(): Matrix4f = this.invert()
operator fun Matrix4d.not(): Matrix4d = this.invert()

operator fun MatrixNf.not(): MatrixNf = this.invert()
operator fun MatrixNd.not(): MatrixNd = this.invert()

//
// Addition
//

operator fun Matrix2f.plus(other: Matrix2f): Matrix2f = this.add(other)
operator fun Matrix2d.plus(other: Matrix2d): Matrix2d = this.add(other)

operator fun Matrix3f.plus(other: Matrix3f): Matrix3f = this.add(other)
operator fun Matrix3d.plus(other: Matrix3d): Matrix3d = this.add(other)

operator fun Matrix4f.plus(other: Matrix4f): Matrix4f = this.add(other)
operator fun Matrix4d.plus(other: Matrix4d): Matrix4d = this.add(other)

operator fun MatrixNf.plus(other: MatrixNf): MatrixNf = this.add(other)
operator fun MatrixNd.plus(other: MatrixNd): MatrixNd = this.add(other)

//
// Subtraction
//

operator fun Matrix2f.minus(other: Matrix2f): Matrix2f = this.sub(other)
operator fun Matrix2d.minus(other: Matrix2d): Matrix2d = this.sub(other)

operator fun Matrix3f.minus(other: Matrix3f): Matrix3f = this.sub(other)
operator fun Matrix3d.minus(other: Matrix3d): Matrix3d = this.sub(other)

operator fun Matrix4f.minus(other: Matrix4f): Matrix4f = this.sub(other)
operator fun Matrix4d.minus(other: Matrix4d): Matrix4d = this.sub(other)

operator fun MatrixNf.minus(other: MatrixNf): MatrixNf = this.sub(other)
operator fun MatrixNd.minus(other: MatrixNd): MatrixNd = this.sub(other)

//
// Multiplication
//

operator fun Matrix2f.times(other: Matrix2f): Matrix2f = this.mul(other)
operator fun Matrix2f.times(other: Float): Matrix2f = this.mul(other)
operator fun Matrix2f.times(other: Double): Matrix2f = this.mul(other)

operator fun Matrix2d.times(other: Matrix2d): Matrix2d = this.mul(other)
operator fun Matrix2d.times(other: Double): Matrix2d = this.mul(other)
operator fun Matrix2d.times(other: Float): Matrix2d = this.mul(other)

operator fun Matrix3f.times(other: Matrix3f): Matrix3f = this.mul(other)
operator fun Matrix3f.times(other: Float): Matrix3f = this.mul(other)
operator fun Matrix3f.times(other: Double): Matrix3f = this.mul(other)

operator fun Matrix3d.times(other: Matrix3d): Matrix3d = this.mul(other)
operator fun Matrix3d.times(other: Double): Matrix3d = this.mul(other)
operator fun Matrix3d.times(other: Float): Matrix3d = this.mul(other)

operator fun Matrix4f.times(other: Matrix4f): Matrix4f = this.mul(other)
operator fun Matrix4f.times(other: Float): Matrix4f = this.mul(other)
operator fun Matrix4f.times(other: Double): Matrix4f = this.mul(other)

operator fun Matrix4d.times(other: Matrix4d): Matrix4d = this.mul(other)
operator fun Matrix4d.times(other: Double): Matrix4d = this.mul(other)
operator fun Matrix4d.times(other: Float): Matrix4d = this.mul(other)

operator fun MatrixNf.times(other: MatrixNf): MatrixNf = this.mul(other)
operator fun MatrixNf.times(other: Float): MatrixNf = this.mul(other)
operator fun MatrixNf.times(other: Double): MatrixNf = this.mul(other)

operator fun MatrixNd.times(other: MatrixNd): MatrixNd = this.mul(other)
operator fun MatrixNd.times(other: Double): MatrixNd = this.mul(other)
operator fun MatrixNd.times(other: Float): MatrixNd = this.mul(other)

// @formatter:on