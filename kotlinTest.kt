
//test fun
fun main(args : Array<String>) {
    
    //example1
    println("Hello, world!!!")
    //example2
    println(addTwo(2, 3))
    //example3
    println(multifyTwo(2, 3.1f))
    //example4
    infixTest()
    //example5
    val name1  = person("AA")
    val name2  = person("BB")
    val result  = name1 likes name2
    println(result)
    //example6
    operatorTest()
    //example7
    varargTest()
    //example8
    var nullable : String? = null
    //example9
    cases(1)
    cases("Hello")
    cases("Hi")
    cases(3f)
    //example10
    ranges()
    //example11
    val food  = setOf("apple", "banana", "strawberry")
    val fruit = setOf("banana", "strawberry", "apple")
    val food2 = listOf("apple", "banana", "strawberry")
    val fruit2 = listOf("banana", "strawberry", "apple")
    println(food2 == fruit)//false
    println(food == fruit)//true
    println(food === fruit)//false
    println(food2 == fruit2)//false
}

//----------------------------------------------
//example2
fun addTwo(a:Int, b:Int) : Int{
    return a + b
}

//example3
fun multifyTwo(a : Int, b : Float) = a * b

//example4
fun infixTest(){
	infix fun Int.times(str : String) = str.repeat(this)
    println(2 times "Bye ")
    
    val pair = "Hello" to "World"
    println(pair)
    
    infix fun String.onto(str : String) = Pair(this, str)
    val myPair = "see" onto "you"
    val newPair = "see".onto("you")
    println(myPair)
    println(newPair)
}

//example5
class person(val name  : String){
    val likePeople = mutableListOf<person>()
    infix fun likes(name : person){
        likePeople.add(name)
    }
}

//example6
fun operatorTest(){
    operator fun Int.times(str : String) = str.repeat(this)
    println(2 * "Bye")
    
    operator fun String.get(range : IntRange) = substring(range)
    val s1 = "Everything goes OK"
    println(s1[0..10])
}

//example7
fun varargTest(){
    fun printAll(vararg lists : String){
        for(l in lists){
            println(l)
        }
    }
    
    fun printAllWithPrefix(vararg lists : String, prefix : String){
        for(l in lists){
            println(prefix + l)
        }
    }
    
    printAllWithPrefix("A", "B", "C", "D", prefix = "lable:")
}

//example9
fun cases(elements : Any){
    when(elements){
        1 -> println("One")
     "Hello" -> println("Greeting")
        is String -> println("String")
        !is String -> println("Not String")
    }
}

//example10
fun ranges(){
    for(i in 0..4 step 2){
        println(i)
    }
    println(" ")
    for(c in 'z' downTo('s') step 2){
        println(c)
    }
}
