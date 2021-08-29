package com.epicdevler.diceapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val diceHolderOne: ImageView = findViewById(R.id.diceHolderOne)
        val diceHolderTwo: ImageView = findViewById(R.id.diceHolderTwo)
        val rollButton : Button = findViewById(R.id.rollDices)

        val dice = Dice(6)

//        HANDLE EVENT FOR WHEN ROLL DICE BUTTON IS CLICKED
        rollButton.setOnClickListener {

//            SELECT AND STORE MATCHING DICE IMAGE RESOURCE TO firstDice VARIABLE WHEN THE DICE IS ROLLED
            val firstDice = when (dice.roll()) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                6 -> R.drawable.dice_6
                else -> R.drawable.empty_dice
            }

//            SELECT AND STORE MATCHING DICE IMAGE RESOURCE TO secondDice VARIABLE WHEN THE DICE IS ROLLED
            val secondDice = when (dice.roll()) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                6 -> R.drawable.dice_6
                else -> R.drawable.empty_dice
            }

//            SET IMAGE OF DICE HOLDER VIEWS
            diceHolderOne.setImageResource(firstDice)
            diceHolderTwo.setImageResource(secondDice)
        }




    }

    class Dice(val totalSides: Int) {
        fun roll(): Int {
            val diceInitial = 1
            return (diceInitial..totalSides).random()
        }
    }

}