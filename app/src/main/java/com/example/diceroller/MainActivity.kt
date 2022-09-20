package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollD6()}


    }
    fun rollD6()
    {
        val randomInt = (1..6).random()
        val resultText:TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }
}


