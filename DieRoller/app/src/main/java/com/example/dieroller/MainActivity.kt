package com.example.dieroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener
        {
            rollDice()
        }
    }

    private fun rollDice(): Any {
        val dic = Dice(6)
        val diceRoll = dic.roll()

        val dicimage: ImageView = findViewById(R.id.imageView)
        val drawimagi = when(diceRoll)
        {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3-> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6-> R.drawable.dice_6
        }
        dicimage.setImageResource(drawimagi)
    }


}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}