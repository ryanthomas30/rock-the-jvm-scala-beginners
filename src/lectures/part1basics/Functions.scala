package lectures.part1basics

object Functions extends App {
	def aFunction(a: String, b: Int): String = a + " " + b

	println(aFunction("Hello", 42))

	def aParameterlessFunction(): Int = 42;

	println(aParameterlessFunction())

	def aRepeatedFunction(aString: String, n: Int): String = {
		if (n == 1) aString
		else aString + aRepeatedFunction(aString, n - 1)
	}

	println(aRepeatedFunction("Hello", 3))

	def greet(name: String, age: Int): String = "Hi my name is " + name + " and I am " + age + " years old."
	println(greet("Joel", 13))

	def factorial(n: Int): Int = {
		if (n <= 0) 1
		else n * factorial(n - 1)
	}

	def fibonacci(n: Int): Int =
		if (n <= 1) 1
		else fibonacci(n - 1) + fibonacci(n - 2)

	def isPrime(n: Int): Boolean = {
		def isPrimeUntil(t: Int): Boolean =
			if (t <= 1) true
			else n % t != 0 && isPrimeUntil(t-1)
		isPrimeUntil(n / 2)
	}

	println(5/2)



}
