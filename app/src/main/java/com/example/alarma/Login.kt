package com.example.alarma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val btn: ImageButton = findViewById<ImageButton>(R.id.back_button_to_welcome)
        btn.setOnClickListener {
            val intent = Intent(this,Welcome::class.java)
            startActivity(intent)}

        val btn2: Button = findViewById<Button>(R.id.login_button2)
        btn2.setOnClickListener {
            val intent = Intent(this,Home::class.java)
            startActivity(intent)}


    }
}