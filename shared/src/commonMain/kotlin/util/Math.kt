package util

import kotlin.random.Random

/** Common Random functions which returns by Type **/
fun randomNextInt(to: Int, from: Int = 0): Int = Random.nextInt(to - from) + from
fun randomNextDouble(to: Double, from: Double = 0.0): Double = Random.nextDouble(to - from) + from


/** Common Circle-related calculation **/
const val DEGREES_TO_RADIANS = 0.017453292519943295
const val RADIANS_TO_DEGREES = 57.29577951308232

fun toRadians(angdeg: Double): Double = angdeg * DEGREES_TO_RADIANS
fun toDegrees(angdeg: Double): Double = angdeg * RADIANS_TO_DEGREES