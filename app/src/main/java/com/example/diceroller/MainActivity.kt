package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)

        rollButton.text = "Push me"

        rollButton.setOnClickListener {
            Toast.makeText(this,"Button Clicked!", Toast.LENGTH_SHORT).show()
            rollDice()
        }

    }

    private fun rollDice() {
        val randNum = Random.nextInt(6) + 1
        val dice_roll: TextView = findViewById(R.id.roll_button)
        dice_roll.text = randNum.toString()
    }
}