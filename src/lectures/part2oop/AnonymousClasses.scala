package lectures.part2oop

object AnonymousClasses extends App {
	abstract class Animal {
		def eat: Unit
	}

	// Anonymous Class
	val funnyAnimal: Animal = new Animal {
		override def eat: Unit = println("memes")
	}
}
