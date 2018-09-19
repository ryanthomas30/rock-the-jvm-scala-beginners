package lectures.part2oop

import exercises.{Cons, Empty}

object PackagingAndImports extends App {

	// Package members are accessible by their simple name
	val writer = new Writer("Daniel", "RockTheJVM", 2018)

	val myList = Cons(1, Empty)
}
