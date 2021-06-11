package com.devventure.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val userName = findViewById<EditText>(R.id.username_ET)
        val btnRegisterUser = findViewById<Button>(R.id.btn_registerUser)

        btnRegisterUser.setOnClickListener{
            var player = userName.text.toString()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("playername", player)
            startActivity(intent)
        }

    }
}