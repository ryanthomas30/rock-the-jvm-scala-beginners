package lectures.part2oop

object AbstractDataTypes extends App {

	abstract class Animal {
		val creatureType: String = "Wild"
		def eat: Unit
	}

	class Dog extends Animal {
		override val creatureType: String = "Canine"
		def eat: Unit = println("Crunch, crunch")
	}

	// Traits

	trait Carnivore {
		def eat(animal: Animal): Unit
		val preferredMeal: String = "fresh meat"
	}

	class Crocodile extends Animal with Carnivore {
		override val creatureType: String = "Reptile"
		def eat: Unit = println("Munch, munch")
		def eat(animal: Animal): Unit = println(s"I'm a ${this.creatureType} and I'm eating a/an ${animal.creatureType}")
	}

	val dog = new Dog
	val croc = new Crocodile
	croc.eat(dog)

	// Traits vs Abstract Classes
	// 1. Traits do not have constructor parameters
	// 2. Multiple traits may be inherited by one class
	// 3. Traits = Behavior; Abstract Class = Type of thing

}
