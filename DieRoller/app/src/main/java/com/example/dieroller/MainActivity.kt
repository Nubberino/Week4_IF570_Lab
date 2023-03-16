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
       dicimage.setImageResource(R.drawable.dice_2)
    }


}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}