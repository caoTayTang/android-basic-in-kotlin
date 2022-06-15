fun main()
{
  	val pattern = "`-._,-'"
    val timesToRepeat = 7
    printBorder(pattern,timesToRepeat)
    
	val age = 24
    val name = "Kaios the handsome"
    val layers = 5
    
	printWholeCake(age, layers)	
    println("")
    printCongrat(age,name)
 	printBorder(pattern,timesToRepeat)
}

fun printBorder(pattern : String,timesToRepeat : Int)
{
    repeat(timesToRepeat)
    {
        print(pattern)
    }
    println()
}

fun printWholeCake(age : Int , layers : Int)
{
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)
}

fun printCakeTop(age: Int) {
    repeat(age + 2) {
        print("=")
    }
    println()
}

fun printCakeCandles(age: Int) {
    print(" ")
    repeat(age) {
        print(",")
    }    
    println() // Print an empty line   
 
    print(" ") // Print the inset of the candles on the cake
    repeat(age) {
        print("|")
    }    
    println()
}

fun printCakeBottom(age : Int, layers : Int)
{
    repeat(layers)
    {
		repeat(age+2)
        {
            print("@")
        }
        println("");
    }
}

fun printCongrat(age : Int, name : String)
{
    println("You are already ${age} days old, ${name}!")
    println("${age} days old is the very best age to celebrate!")
}