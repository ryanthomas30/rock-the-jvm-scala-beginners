package lectures.part2oop

object OOBasics extends App {
	val writer = new Writer("Joel", "Jose", 1994)
	val novel = new Novel("2 Caterpillar", 2008, writer)
	println(writer.fullName())
	println(novel.authorAge())
	println(novel.isWrittenBy())
	val novel2 = novel.copy(2009)
	println(novel2.authorAge())
	println(novel2.isWrittenBy())
}

// Constructor
class Person(name: String, val age: Int) {
	// Body
	val x: Int = 2

	def greet(name: String): Unit = println(s"${this.name} says: Hi $name")

	// Multiple Constructors
	def this(name: String) = this(name, 0)
}

/*
	1. Novel and a Writer

	Writer: first name, surname, year
		Method: full name

	Novel: name, year of release, author
		Method: authorAge
		Method: isWrittenBy(author)
		Method: copy(new year of release) = new instance of novel
 */

class Writer(val firstName: String, val lastName: String, val year: Int) {

	def fullName(): String = s"$firstName $lastName"
}

class Novel(val name: String, val year: Int, val author: Writer) {

	def authorAge(): Int = year - author.year

	def isWrittenBy(): String = author.fullName()

	def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}

/*
	2. Counter class
		Receives an int value
		Method: Current Count
		Method: Increment/Decrement => new Counter
		Overload inc/dec to receive an amount
 */

class Counter(val count: Int) {

	def currentCount(): Int = count

	def increment(): Counter = new Counter(count+1)

	def increment(amount: Int): Counter = new Counter(count + amount)

	def decrement(): Counter = new Counter(count-1)

	def decrement(amount: Int): Counter = new Counter(count - amount)
}
