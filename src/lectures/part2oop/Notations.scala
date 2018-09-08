package lectures.part2oop

object Notations extends App {

	class Person(val name: String, favoriteMovie: String) {
		def likes(movie: String): Boolean = movie == favoriteMovie

		def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
	}

	val mary = new Person("Mary", "Inception")

	println(mary.likes("Inception"))
	// infix notation (methods with single param)
	println(mary likes "Inception")

	// "Operators" in Scala
	val tom = new Person("Tom", "Fight Club")
	println(mary hangOutWith tom)



}
