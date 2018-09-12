package lectures.part2oop

object Inheritance extends App{

	// Single class inheritance
	class Animal {
		val creatureType = "wild"
		protected def eat = println("eats food")
	}

	class Cat extends Animal {
		def crunch = {
			eat
			println("crunch crunch")
		}
	}

	val cat = new Cat
	cat.crunch


	class Person(name: String, age: Int) {
		def this(name: String) = this(name, 0)
	}

	class Adult(name: String, age: Int, idCard: String) extends Person(name)

	// overriding
	class Dog extends Animal {
		override val creatureType = "domestic"
		override def eat = println("crunch, crunch")
	}
	val dog = new Dog
	dog.eat

	// Preventing overrides
	// 1. Keyword final on member
	// 2. Use final on the entire class
	// 3. Seal the class = extend classes in THIS FILE, prevent extension in other files

}
