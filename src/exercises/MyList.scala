package exercises

abstract class MyList[+A] {
	// head => First element of list
	def head: A
	// tail => Remainder of the list
	def tail: MyList[A]
	// isEmpty: Boolean => Is this list empty?
	def isEmpty: Boolean
	// add(Int) => New List with this element added
	def add[B >: A](element: B): MyList[B]

	protected def printElements: String
	override def toString: String = "[" + printElements + "}"
}

object Empty extends MyList[Nothing] {
	def head: Nothing = throw new NoSuchElementException
	def tail: MyList[Nothing] = throw new NoSuchElementException
	def isEmpty: Boolean = true
	def add[B >: Nothing](element: B): MyList[B] = new Cons(element, Empty)
	def printElements: String = ""
}

class Cons[+A](h: A, t: MyList[A]) extends MyList[A] {
	def head: A = h
	def tail: MyList[A] = t
	def isEmpty: Boolean = false
	def add[B >: A](element: B): MyList[B] = new Cons(element, this)
	def printElements: String =
		if(t.isEmpty) "" + h
		else h + " " + t.printElements
}

object ListTest extends App {
	val listOfIntegers: MyList[Int] = new Cons(1, new Cons(2, new Cons(3, Empty)))
	val listOfStrings: MyList[String] = new Cons("Hello", new Cons("Scala", Empty))

	println(listOfIntegers.toString)
	println(listOfStrings.toString)

}
