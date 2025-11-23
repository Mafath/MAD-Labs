fun main() {
    println("Hello")
    println("world")
    
    val name: String = "Ahamed"
    var age: Int = 25
    
    val name1 = "ahamed"
    var name2 = "mafath"
    println(name1)
    println(name2)

    name2 = "mafathq"
    println(name2)
    
    println()
    
    println(name)
    println(age)   
}

// ----------functions-------------------------------------------------------------------------------------------------------------------------------

fun printAge(a: Int, b: String){
    println("Tha age of $b is $a")
}


fun main() {
//  printAge(12,"Cookie")
	printAge(a=12, b="Cookie")

}


// -------------data types----------------------------------------------------------------------------------------------------------------------------

fun main() {

    //Data Types in Kotlin

    //Numbers
    val intvalue = 1 //Integer      or    val intValue : Int = 1
    val longValue1 = 100000 //Long
    val longValue2 = 1L //Long
    val byteValue : Byte = 1 //Byte
    val doubleVal = 1.0 //Double
    val floatValue = 1.2384789f //Float

    val trueValue = true //True
    val falseValue = false //False

    //Characters
    val characterValue = "A"

    //Strings
    val strValue = "kotlin" 
    
}


// -------------arrays----------------------------------------------------------------------------------------------------------------------------

    var brands = arrayListOf("Gucci", "Adidas", "Nike", "Puma")  //ArrayList

fun main(){
    var brands = arrayOf("Gucci", "Adidas", "Nike", "Puma")
    
    println(brands.size)
    
   	println(brands[1])
    
    brands[1] = "Zara"
	println(brands[1])
    
    for(i in brands){
        println(i)
    }
}

//arrayOf - type eka 'Array'. Can modify elements. But can not add or remove elements
//arrayListOf - type eka 'ArrayList'. can modify, add, remove elements 


// -------------operators----------------------------------------------------------------------------------------------------------------------------

fun main(){
    
    val a = 5
    val b = 3

    //Arithmetic Operators
    val sum = a+b //summation
    val sub = a-b //subtraction
    val mul = a*b //multiplication
    val div = a/b //division
	val div2 = a/b.toFloat() //division


    //Comparison Operators
    val val1 =a>b
    val val2 = a == b
    val val3 = a != b

    //Logical Operators
    val t = true
    val f = false

    val val4 = t&&f //AND operator
    val val5 = t || f //OR operator
    val val6 = !t //NOT operator
    
    
    
    println("sum = $sum")
    println("sub = $sub")
    println("mul = $mul")
    println("div = $div")
    println("div2 = $div2")

    println("val1 (a > b) = $val1")
    println("val2 (a == b) = $val2")
    println("val3 (a != b) = $val3")

    println("t = $t")
    println("f = $f")

    println("val4 (t && f) = $val4")
    println("val5 (t || f) = $val5")
    println("val6 (!t) = $val6")
    
}


// -------------if else----------------------------------------------------------------------------------------------------------------------------


fun main(){
    var age = 5
    if (age > 18){
    	println("The person is an adult. ")
    }
    
    else {
    	println("The person is a child. ")    
    }
    
// -----------when expression--------------    
    var x=5
    
    when (x) {
    	0, 1 -> println("x == 0 or x == 1")  // if x is 0 or 1
    	else -> println("otherwise")
    }
    
// -----------for loop--------------  
    
    for (i in 1 .. 10){
    	print("$i ") //1 2 3 4 5 6 7 8 9 10
    }
    println()
    
    
    for (i in 1 until 10){
    	print("$i ")  //1 2 3 4 5 6 7 8 9
    }
    println()

    
    for (i in 0 .. 20 step 5){
    	print("$i ")     //0 5 10 15 20
    }
    println()


    for (i in 5 downTo 1 step 2){
    	print(i)
    }
    println()

    
    for (i in 1 .. 10){
        print("$i ")  //1 2 3 4 5

		if (i == 5){
			break
		}
    }
	println()

    
    
    for (i in 1 .. 10){
		if (i == 5){
			continue
        }
        
		print("$i ") //1 2 3 4 6 7 8 9 10
    }
    println()
    
// -------------while loop--------------    

    var i = 0
	while (i < 5) {
		println(i)
		i++
	}
    
    
// -------------do-while loop--------------
    var j = 0
    do {
        println("Do-while iteration: $j")
        j++
    } while (j < 5)
    
    
}


-------------Generic functions---------------------------------------------------------------------------------------------------------

// without generics
    fun printInt(value: Int) {
        println(value)
    }

    fun printString(value: String) {
        println(value)
    }
    
fun main(){
    
    printInt(21)
    printString("her")
    
	//	This is repetitive.both functions do the same thing but with different types.
}


// a basic generic function
fun <T> printValue(value: T) {
    println(value)
}

fun main() {
    printValue(10)          // Int
    printValue("Hello")     // String
    printValue(3.14)        // Double
    
    
// Here,T is a type parameter. Kotlin replaces it with the actual type (Int, String, etc.) when you call the function.
}

// -------------Generic classes---------------------------------------------------------------------------------------------------


class Box<T>(val content: T)

fun main() {
    val intBox = Box(123)         // T = Int
    val stringBox = Box("Kotlin") // T = String

    println(intBox.content)
    println(stringBox.content)
    
//     Box<T> can hold any type (Int, String, etc.).
//	   You don’t need separate classes like IntBox, StringBox.
}



// -------------Multiple Type Parameters---------------------------------------------------------------------------------------------------

// You can use more than one generic type:

class PairBox<A, B>(val first: A, val second: B)

fun main() {
    val pair = PairBox("Age", 25) // A = String, B = Int
    println("${pair.first} -> ${pair.second}")
}
	



fun main(){
    //listOf - immutable list(read only. once created, you cannot add, remove, or change items in it.)
    val family = listOf("father","mother","sister")

    println(family)		// [father, mother, sister]
    println(family[0])    // father
    

    for (i in family){
        print("$i ")      //father mother sister
    }

    println()
    println(family.size)  //3

}


fun main(){
    //mutableListOf - mutable list
    val family = mutableListOf("father","mother")
    
	println(family)    // [father, mother]
 	println(family[1])	// mother

    	family.add("brother")
		println(family)    // [father, mother, brother]
    	family.remove("father")
		println(family)    // [mother, brother]
    
    	for (i in family){
        print("$i ")      // mother brother
    	}
    
    	println()
   	println(family.size)

}


fun main(){
    //immutable set
    val family = setOf("father","mother","mother","brother","mother", "brother","sister")
    
    println(family)  // [father, mother, brother, sister]


    println(family.size)
    
    for(i in family){
        print("$i ") //father mother brother sister
    }
}



fun main(){
    //mutable set
    val family = mutableSetOf("father","mother","mother","brother","brother","sister")
    
	println(family)
    
    family.add("grandmother")
    family.remove("sister")
    
    println(family.size)

    for(i in family){
        print("$i ") //father mother brother grandmother
    }


}



fun main(){
    //immutable map
    val grade = mapOf("stu1" to "A", "stu2" to "B","stu3" to "A")

    println(grade)		// {stu1=A, stu2=B, stu3=A}
    println(grade["stu1"])   //A
    
    println("All students : ${grade.keys}")  //All students : [stu1, stu2, stu3]
    
    println("All grades : ${grade.values}")  //All grades : [A, B, A]
    
	println(grade.size)		// 3

    for (key in grade.keys) {
    	println(key)
	}
    
    for (value in grade.values) {
    	println(value)
	}
    
    
    for ((key, value) in grade) {
    	println("$key -> $value")
	}

}



fun main(){
    //mutable map
    val grade = mutableMapOf("stu1" to "A", "stu2" to "B","stu3" to "A")
    
    
    grade.remove("stu1")
    grade["stu4"] = "C"

    println(grade)		// {stu1=A, stu2=B, stu3=A}
    println(grade["stu1"])   //A
    
    println("All students : ${grade.keys}")  //All students : [stu1, stu2, stu3]
    
    println("All grades : ${grade.values}")  //All grades : [A, B, A]
    
	println(grade.size)		// 3

    for (key in grade.keys) {
    	println(key)
	}
    
    for (value in grade.values) {
    	println(value)
	}
    
    
    for ((key, value) in grade) {
    	println("$key -> $value")
	}
}





// -------------------sealed classes---------------------------------------------------------------------------------------------------------


/*
    A sealed class restricts inheritance.
    It allows only a fixed set of subclasses (all must be defined in the same file).
    Useful when you want to represent a limited set of possible types (like enums, but with state and properties).
	By default, a sealed class cannot be directly instantiated (constructor is private)  
*/


sealed class Shape {
    class Circle(var radius: Float): Shape()
    class Square(var length: Int): Shape()
    class Rectangle(var length: Int, var breadth: Int): Shape()
    object NotAShape : Shape()
}

/*
    Here, Shape is the sealed class.
    Subclasses:
    Circle
    Square
    Rectangle
    NotAShape (singleton object)
*/


fun area(shape: Shape): Double {
    return when (shape) {
        is Shape.Circle -> Math.PI * shape.radius * shape.radius
        is Shape.Square -> (shape.length * shape.length).toDouble()
        is Shape.Rectangle -> (shape.length * shape.breadth).toDouble()
        Shape.NotAShape -> Double.NaN
        // No 'else' needed because all subclasses are covered
    }
}


// Suppose you want to calculate area. With sealed classes, you can safely use when without needing else.


// -------------------enum classes---------------------------------------------------------------------------------------------------------



enum class Direction {
    NORTH, SOUTH, EAST, WEST
}

fun main() {
    val dir = Direction.NORTH

    when (dir) {
        Direction.NORTH -> println("Going Up ⬆️")
        Direction.SOUTH -> println("Going Down ⬇️")
        Direction.EAST -> println("Going Right ➡️")
        Direction.WEST -> println("Going Left ⬅️")
    }
}













enum class Day(val dayOfWeek: Int) {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7)
}


fun main() {
    val today = Day.FRIDAY

    println("Today is $today")                // Today is FRIDAY
    println("Day number: ${today.dayOfWeek}") // Day number: 5
}
