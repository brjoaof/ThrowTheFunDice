package com.devventure.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dado1 = findViewById<TextView>(R.id.Dado1_TV)
        val dado2 = findViewById<TextView>(R.id.Dado2_TV)
        val btn = findViewById<Button>(R.id.throw_btn)

        btn.setOnClickListener{
            dado1.text = getRandomNumber().toString();
            dado2.text = getRandomNumber().toString();
        }

    }

    private fun getRandomNumber() : Int {
        return (1..6).random()
    }

}