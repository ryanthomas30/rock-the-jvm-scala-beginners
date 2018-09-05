package lectures.part1basics

object Recursion extends App {
	def factorial(n: Int): Int =
		if (n <= 1) 1
		else n * factorial(n - 1)

	def anotherFactorial(n: Int): Int = {
		def factorialHelper(x: Int, accumulator: Int): Int =
			if (x <= 1) accumulator
			else factorialHelper(x - 1, x * accumulator)

		factorialHelper(n, 1)
	}

	// 1. Concatenate a string n times
	def stringConcat(text: String, n: Int): String = {
		def helper(x: Int, acc: String): String =
			if (x <= 1) acc
			else helper(x - 1, acc + text)

		helper(n, text)
	}

	println(stringConcat("Hello", 3))

	// 2. IsPrime function
	def isPrime(n: Int): Boolean = {
		// Counts factors down from n/2 and checks if all leave remainders when n % currentFactor
		def helper(currentFactor: Int, primeStatus: Boolean): Boolean =
			if (currentFactor <= 1) primeStatus
			else helper(currentFactor - 1, primeStatus && n % currentFactor != 0)

		helper(n / 2, true)
	}

	val maybePrime: Int = 7919
	println(if (isPrime(maybePrime)) maybePrime + " is prime!" else maybePrime + " is NOT prime!")

	// 3. Fibonacci
	def fibonacci(n: Int): Int = {
		def helper(i: Int, last: Int, nextToLast: Int): Int =
			if (i >= n) last
			else helper(i + 1, last + nextToLast, last)

		if (n <= 2) 1
		// If n >= 3, start at 2, go to n
		else helper(2, 1, 1)
	}

	println(fibonacci(8))
}


