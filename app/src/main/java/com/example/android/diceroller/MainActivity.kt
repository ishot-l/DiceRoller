package com.example.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countUpButton: Button = findViewById(R.id.countup_button)
        countUpButton.setOnClickListener { countUp() }
    }

    private fun rollDice() {
        // Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()

        val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = (1..6).random()

        resultText.text = randomInt.toString()

    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)

        resultText.text = when(resultText.text) {
            getString(R.string.hello_world) -> "1"
            "1", "2", "3", "4", "5" -> (resultText.text.toString().toInt() + 1).toString()
             else -> resultText.text
        }
    }
}
