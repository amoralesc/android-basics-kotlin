/*
 All collections (lists, sets, maps) presented here
 can be used as immutable or mutable variables. 
 If it's immutable, it can't be changed after its initialization
 If it's mutable, it can be changed
*/
fun main() {
	// Lambda functions: flexible, can be stored as variables
    // i.e.: takes an Int, triples it and returns it
    val triple: (Int) -> Int = { a: Int -> a * 3 }
    println(triple(5))
    // 'it' is an implicit parameter, automatically included if there is only one parameter
    // The above function can be simplified to:
    val tripleSimplified: (Int) -> Int = { it * 3 }

    // Lists: useful for ordered elements
    val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")
    // i.e.: take all words that start with b, shuffle them, select two, order them
    val filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }
        .shuffled()
        .take(2)
        .sorted()
    println(filteredWords)
    
    // Sets: useful for non-repeating unordered elements
    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
    println("list:   ${numbers}")
    println("sorted: ${numbers.sorted()}")
    val setOfNumbers = numbers.toSet()
    println("set:    ${setOfNumbers}")
    val set1 = setOf(1,2,3)
    val set2 = mutableSetOf(3,2,1)
    println("$set1 == $set2: ${set1 == set2}")	// They are equal because they contain the same elements
    println("contains 7: ${setOfNumbers.contains(7)}")
    
    // Maps: key-value pairs
    val peopleAges = mutableMapOf<String, Int>(
        "Fred" to 30,
        "Ann" to 23
    )
    peopleAges.put("Barbara", 42)
    peopleAges["Joe"] = 51
    // i.e.: map key (name) and value (age) pairs as strings
    // and join them in a single string separated by ", "
    // joinToString omits adding a separator after the last element
    println(peopleAges.map { "${it.key} is ${it.value}" }.joinToString(", ") )
}

