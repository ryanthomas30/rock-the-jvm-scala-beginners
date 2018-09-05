package lectures.part1basics

object Expressions extends App {
	// INSTRUCTIONS (DO) vs EXPRESSIONS (VALUE)

	// IF expression

	val aCondition: Boolean = true
	val aConditionedValue = if(aCondition) 5 else 3
	println(aConditionedValue)

	// SAD!
	var i = 0
	while (i < 10) {
		println(i)
		i += 1
	}

	var aVariable = 4
	val aWeirdValue = (aVariable = 3) // Unit === void
	println(aWeirdValue)

	// side effects: println(), whiles, reassigning

	// Code Blocks

	val aCodeBlock = {
		val y = 2
		val z = y + 1

		if (z > 2) "Hello" else "World"
	}

}
