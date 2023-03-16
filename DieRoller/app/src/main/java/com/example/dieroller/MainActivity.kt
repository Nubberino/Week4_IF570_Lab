package com.example.dieroller

import android.os.Bundle
import android.widget.Button
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
        val ResultTextView: TextView = findViewById(R.id.textView)
            ResultTextView.text = "6"
        }
    }


}

class Dice(private val numSides: Int)
{
    fun roll(): Int
    {
        return(1..numSides).random()
    }
}