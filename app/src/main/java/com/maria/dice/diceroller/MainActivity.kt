package com.maria.dice.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Declare and initialize variables


        val buttonToast:Button=findViewById(R.id.button_toast)
            buttonToast.setOnClickListener{showToast()}

        val buttonRoll:Button=findViewById(R.id.button_roll)
            buttonRoll.setOnClickListener{rollDice()}

        val buttonCount:Button=findViewById(R.id.button_count)
            buttonCount.setOnClickListener{increaseCount()}
    }

    private fun showToast() {
        Toast.makeText(this,"Ooh my,you have toasted me",Toast.LENGTH_SHORT).show()
    }

    private fun rollDice() {

        val generatedRandom = (1..6).random()

        val textViewResult: TextView = findViewById(R.id.text_result)
        textViewResult.text = generatedRandom.toString()
    }

    private fun increaseCount(){val textviewIncrease : TextView=findViewById(R.id.text_result)
        val result=textviewIncrease.text.toString().toInt()+1
        textviewIncrease.text=result.toString()
    }
}