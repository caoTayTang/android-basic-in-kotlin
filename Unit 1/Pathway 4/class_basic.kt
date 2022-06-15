fun main() 
{
	val myFirstDice = Dice(6,"red");
    println("Your ${myFirstDice.numSides} sided ${myFirstDice.color} dice rolled ${myFirstDice.roll()}!");
    
	val mySecondDice = Dice(20,"black");
    println("Your ${mySecondDice.numSides} sided ${mySecondDice.color} dice rolled ${mySecondDice.roll()}!");
    
    val myThirdDice = Dice(200,"maroon");
    println("Your ${myThirdDice.numSides} sided ${myThirdDice.color} dice rolled ${myThirdDice.roll()}!");
	
    println("==================================");
    val myFirstCoin = Coin("copper");
    println("Your ${myFirstCoin.material} coin is ${myFirstCoin.flip()}")
    
}

class Dice(val numSides: Int, val color: String)
{  
    fun roll(): Int
    {
		return (1..numSides).random();
    }
}

class Coin(val material: String)
{
	
    fun flip(): String
    {
        val randomValue = (0..1).random();
        //if 0 -> head else tail
        if (randomValue == 0)
        {
            return "head";
        }else
        {
            return "tail";
        }
    }
    
}
