package lectures.part2oop

object Generics extends App {

	class MyList[+A] {
		def add[B >: A](element: B): MyList[B] = ???
	}

	class MyMap[Key, Value]

	val listOfIntegers = new MyList[Int]
	val listOfStrings = new MyList[String]

	// Generic Methods
	object MyList {
		def empty[A]: MyList[A] = ???
	}

	val emptyListOfIntegers = MyList.empty[Int]

	// Variance Problem
	class Animal
	class Car
	class Cat extends Animal
	class Dog extends Animal

	// 1. List[Cat] extends List[Animal] = COVARIANCE
	class CovariantList[+A]
	val covariantAnimalList: CovariantList[Animal] = new CovariantList[Cat]
	// animalList.add(new Dog) ??? HARD QUESTION => We return a list of Animals

	// 2. NO = INVARIANCE
	class InvariantList[A]
	val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

	// 3. Hell no! CONTRAVARIANCE
	class Trainer[-A]
	val trainer: Trainer[Cat] = new Trainer[Animal]

	// Bounded Types
	class Cage[A <: Animal](animal: A)
	val cage = new Cage(new Cat)
}
