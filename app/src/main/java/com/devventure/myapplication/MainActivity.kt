package com.devventure.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val playerName = intent.getStringExtra("playername")

        val dice1 = findViewById<ImageView>(R.id.dice1_IV)
        val dice2 = findViewById<ImageView>(R.id.dice2_IV)
        val btn = findViewById<Button>(R.id.throw_btn)
        val welcomeMessage = findViewById<TextView>(R.id.welcomeMessage)
        val shareButton = findViewById<FloatingActionButton>(R.id.share)

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

        shareButton.setOnClickListener{
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT, "Voce e Sortudo")
            intent.setPackage("com.whatsapp")
            intent.type = "text/plain"

            if(intent.resolveActivity(this.packageManager) != null) {
                startActivity(intent)
            } else {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.whatsapp")))
            }

        }

    }

}