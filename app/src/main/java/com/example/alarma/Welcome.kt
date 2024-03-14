package com.example.alarma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class Welcome : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome)

        val btn: Button = findViewById<Button>(R.id.login_button)
        btn.setOnClickListener{
            val intent = Intent(this, Login::class.java)
            startActivity(intent)}

    }
}