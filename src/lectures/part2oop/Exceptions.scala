package lectures.part2oop

import java.nio.BufferOverflowException

import lectures.part2oop.Exceptions.x

object Exceptions extends App {
	val x: String = null
	// println(x.length)

	// val aWeirdValue: String = throw new NullPointerException

	// Throwable classes extend the Throwable class
	// Exception and Error are the major Throwable subtypes

	// CATCHING EXCEPTIONS
	def getInt(withExceptions: Boolean): Int =
		if (withExceptions) throw new RuntimeException("No int for you!")
		else 42

	try {
		getInt(true)
	} catch {
		case e: RuntimeException => println("Caught a Runtime Exception")
	} finally {
		// Code that will get executed no matter what
		print("Finally!")
	}

	// Defining your own Exceptions
	class MyException extends Exception
	val exception = new MyException

	throw exception

	class OverflowException extends Exception
	class UnderflowException extends Exception
	class MathCalculationException extends Exception

	object PocketCalculator {
		def add(x: Int, y: Int): Int = {
			val result = x + y
			if (x > 0 && y > 0 && result < 0) throw new OverflowException
			else if (x < 0 && y < 0 && result > 0) throw new UnderflowException
			else result
		}
		def subtract(x: Int, y: Int): Int = {
			val result = x - y
			if (x > 0 && y < 0 && result < 0) throw new OverflowException
			else if (x < 0 && y > 0 && result > 0) throw new UnderflowException
			else result
		}
		def multiply(x: Int, y: Int): Int = {
			val result = x * y
			if (x > 0 && y > 0 && result < 0) throw new OverflowException
			else if (x < 0 && y < 0 && result > 0) throw new OverflowException
			else if (x > 0 && y < 0 && result > 0) throw new UnderflowException
			else if (x < 0 && y > 0 && result > 0) throw new UnderflowException
			else result
		}
		def divide(x: Int, y: Int): Int =
			if (y == 0) throw new MathCalculationException
			else x / y
	}

}
