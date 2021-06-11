package com.devventure.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val playerName = intent.getStringExtra("playername")

        val dice1 = findViewById<ImageView>(R.id.dice1_IV)
        val dice2 = findViewById<ImageView>(R.id.dice2_IV)
        val btn = findViewById<Button>(R.id.throw_btn)
        val welcomeMessage = findViewById<TextView>(R.id.welcomeMessage)

        welcomeMessage.text = getString(R.string.welcome, playerName)

        val listImages = listOf(
            R.drawable.dice_1,
            R.drawable.dice_2,
            R.drawable.dice_3,
            R.drawable.dice_4,
            R.drawable.dice_5,
            R.drawable.dice_6,
        )

        btn.setOnClickListener{
            dice1.setImageResource(listImages.random())
            dice2.setImageResource(listImages.random())
        }

    }

}