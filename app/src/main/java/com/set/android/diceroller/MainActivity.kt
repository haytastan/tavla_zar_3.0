package com.set.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    lateinit var dice1Image : ImageView
    lateinit var dice2Image : ImageView
    var a = "Birinci"
    var b = "İkinci"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dice1Image = findViewById(R.id.dice_1_image)
        dice2Image = findViewById(R.id.dice_2_image)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

    }
    private fun rollDice() {
        val randomInt_1 = (1..6).random()
        val randomInt_2 = (1..6).random()


        Toast.makeText(this, a + " Oyuncunun Zarları",Toast.LENGTH_SHORT).show()
        a = b.also { b = a }

        val drawableResource_1 = when (randomInt_1) {
            1 -> R.drawable.zar_1
            2 -> R.drawable.zar_2
            3 -> R.drawable.zar_3
            4 -> R.drawable.zar_4
            5 -> R.drawable.zar_5
            else -> R.drawable.zar_6
        }
        dice1Image.setImageResource(drawableResource_1)

        val drawableResource_2 = when (randomInt_2) {
            1 -> R.drawable.zar_1
            2 -> R.drawable.zar_2
            3 -> R.drawable.zar_3
            4 -> R.drawable.zar_4
            5 -> R.drawable.zar_5
            else -> R.drawable.zar_6
        }
        dice2Image.setImageResource(drawableResource_2)

    }
}