package com.example.practical1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView
    lateinit var diceImage1 : ImageView
    lateinit var diceImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

    }

    private fun rollDice() {

        val diceImage: ImageView = findViewById(R.id.dice_image)
        val diceImage1: ImageView = findViewById(R.id.dice_image1)
        val diceImage2: ImageView = findViewById(R.id.dice_image2)


        diceImage.setImageResource(randomNum())
        diceImage1.setImageResource(randomNum())
        diceImage2.setImageResource(randomNum())

    }

    private fun randomNum() : Int
    {
        val randomInt = Random().nextInt(6) + 1

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        return drawableResource
    }

   /*
    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)
        val resultText1: TextView = findViewById(R.id.number)
        val resultText2: TextView = findViewById(R.id.number2)

        if(resultText.text == "Hello World!" )
        {
            resultText.text = "1"
        }else
        {
            var resultInt = resultText.text.toString().toInt()

            if(resultInt < 6)
                resultInt++
                resultText.text = resultInt.toString()

        }

        if(resultText1.text == "Hello World!")
        {
            resultText1.text = "1"
        }else
        {
            var resultIntA = resultText1.text.toString().toInt()

            if(resultIntA < 6)
                resultIntA++
                resultText1.text = resultIntA.toString()
        }

        if(resultText2.text == "Hello World!")
        {
            resultText2.text = "1"
        }else
        {
            var resultIntB = resultText2.text.toString().toInt()

            if(resultIntB < 6)
                resultIntB++
                resultText2.text = resultIntB.toString()
        }
    }
    */
}