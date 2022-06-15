package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //make a dice at start
        rollDice();
        //Get the button and if it click then do rollDice()
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice(); }
    }
/*
*make a object from Dice class.
*find textView by ID then change text value to roll() value
 */
    private fun rollDice() {
        val firstDice = Dice(6)
        val firstDiceRoll = firstDice.roll()
        val firstDiceImage: ImageView = findViewById(R.id.imageView)
        firstDiceImage.contentDescription = firstDiceRoll.toString()

        val firstImageID = when (firstDiceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    firstDiceImage.setImageResource(firstImageID);


        val secondDice = Dice(6)
        val secondDiceRoll = secondDice.roll()
        val secondDiceImage: ImageView = findViewById(R.id.imageView2)
    secondDiceImage.contentDescription = secondDiceRoll.toString()

        val imageID = when (secondDiceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    secondDiceImage.setImageResource(imageID);


    }
}

class Dice(private val numSides: Int) {

    fun roll(): Int
    {
        return (1..numSides).random()
    }
}