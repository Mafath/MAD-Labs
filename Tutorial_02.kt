//---------------------basic kotlin class(no constructor)---------------------

class Bird {} or
class Bird(){}
//---------------------kotlin class(with constructor)--------------------

class Bird(var type: String, var color: String){}

//---------------------------create objects-------------------------------

val myBird1 = Bird()
myBird1.type = "Chicken"
myBird1.color = "White"

val myBird2 = Bird("Parrot", "Green")

//---------------------------declare functions---------------------------

//without parameters
fun sayHello() {
    println("Hello, World!")
}

//with parameters
fun greet(name: String) {
    println("Hello, $name!")
}

//with return type
fun add(a: Int, b: Int): Int {
    return a + b
}

//------------------------elvis operator----------------------------provides a default value when something is null

var myNum : Int?  = null 

var displayNum = myNum  ?:  26

print(displayNum)

//-------------------------operators----------------------------------

fun main() {
    val name: String? = null          // A nullable String, currently null
    val finalName = name ?: "Guest"   // Elvis operator used here

    println(finalName) // Output: Guest
}



//-------------basic class------------------------------------------------------------------------------


// class Bird {
//     var type = ""
//     var color = "" 
// }

// fun main() {
//     val myBird = Bird()
//     myBird.type = "Parrot"
//     myBird.color = "Green"

//     println("Type: ${myBird.type}, Color: ${myBird.color}")
// }

//-------------using a constructor + a method------------------------------------------------------------------------------


// class Bird(var type: String, var color: String){
//     fun describe() {
//         println("The $color $type is beautiful!")
//     }
// }

// fun main() {
//     val myBird = Bird("Parrot", "Green")
//     myBird.describe()
// }


//-------------properties------------------------------------------------------------------------------


// class Abc(
//     val name: String,      // read-only property (val)
//     var isPassed: Boolean  // read-write property (var)
// )

// fun main() {
//     val abc = Abc("Bob", true)

//     println(abc.name)       // Bob (readable via getter)
//     println(abc.isPassed)   // true (readable via getter)

//     abc.isPassed = false     // writable via setter
//     println(abc.isPassed)    // false
// }


//-------------Inheritance and override------------------------------------------------------------------------------
/*
 	Superclass (Parent): The class whose properties and functions are inherited.
	Subclass (Child): The class that inherits from the parent class.

	Kotlin uses : to denote inheritance.
	Important:- In Kotlin, classes and functions are final by default.
	You must use open keyword in the parent class to allow inheritance. 
	Subclass inherits all public/protected properties and functions.
	Subclass can add new properties and functions.
	Can also override parent functions using override keyword (more advanced).
 */

// open class Bird {
//     var color = "Green"
//     open fun fly(){
//         println("I can fly")
//     }
// }

// class Parrot : Bird() {      // Parrot inherits from Bird
//     fun myFunction() {
//         println(color)       // can access 'color' from Bird
//     }
//     override fun fly(){
//         println("I am a parrot. I can fly")
//     }
// }


// fun main() {
//     val myObj = Parrot()  
//     val myObj2 = Bird()
//     myObj.myFunction()     // prints: Green
//     myObj.fly()
//     println(myObj.color)
//     println(myObj2.color)
// 	myObj2.fly()

// }



/*
 by default classes and functions are final. to inherit a class make it open. then child can inherit all the properties and functions of the parent class.
 to override a function of parent class, we have to make the function of parent class open. And put overide key word infront of the function in child
*/


//-------------properties------------------------------------------------------------------------------


// class Abc(
//     val name: String,      // read-only property (val)
//     var isPassed: Boolean  // read-write property (var)
// )

// fun main() {
//     val abc = Abc("Bob", true)

//     println(abc.name)       // Bob (readable via getter)
//     println(abc.isPassed)   // true (readable via getter)

//     abc.isPassed = false     // writable via setter
//     println(abc.isPassed)    // false
// }


//-------------interface------------------------------------------------------------------------------

/*
 Concrete function → has a body (implementation).
 Abstract function → declared but has no body (must be implemented by a subclass).
 If a class contains only abstract methods, it’s essentially an interface
 
 Abstract class → can have both abstract and concrete methods.
 Interface → traditionally only abstract methods (Java 8+ allows default implementations).
*/


interface Vehicle {
    fun start()
    fun stop()
}

class Car : Vehicle {
    override fun start() {
        println("Car started")
    }

    override fun stop() {
        println("Car stopped")
    }
}

fun main() {
    val obj = Car()
    obj.start()  // Car started
    obj.stop()   // Car stopped
}
