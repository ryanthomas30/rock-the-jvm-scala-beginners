package lectures.part1basics

object ValuesVariablesTypes extends App {

	val x: Int = 42
	println(x)

	// VALS ARE IMMUTABLE

	// COMPILER CAN INFER TYPES

	val aString: String = "Hello"

	val aBoolean: Boolean = false
	val aChar: Char = 'a'
	val anInt: Int = x
	val aShort: Short = 4613
	// Use L to denote Long
	val aLong: Long = 1234123412234L
	val aFloat: Float = 2.023423f
	val aDouble: Double = 3.03

	// VARIABLES
	var aVariable: Int = 4
	aVariable = 5 // side effects
}
