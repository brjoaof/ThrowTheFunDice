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

        val dado1 = findViewById<ImageView>(R.id.dado1_IV)
        val dado2 = findViewById<ImageView>(R.id.dado2_IV)
        val btn = findViewById<Button>(R.id.throw_btn)

        val listImages = listOf(
            R.drawable.dice_1,
            R.drawable.dice_2,
            R.drawable.dice_3,
            R.drawable.dice_4,
            R.drawable.dice_5,
            R.drawable.dice_6,
        )

        btn.setOnClickListener{
            dado1.setImageResource(listImages.random())
            dado2.setImageResource(listImages.random())
        }

    }

}