package com.example.alarma
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.ImageButton
import android.widget.Button

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        val btn: ImageButton = findViewById<ImageButton>(R.id.close_session_to_login)
        btn.setOnClickListener {
            val intent = Intent(this,Login::class.java)
            startActivity(intent)}

        val btn2: Button = findViewById<Button>(R.id.alarmas)
        btn2.setOnClickListener {
            val intent = Intent(this,Alarmas::class.java)
            startActivity(intent)}

        val btn3: Button = findViewById<Button>(R.id.facturas)
        btn3.setOnClickListener {
            val intent = Intent(this,Facturas::class.java)
            startActivity(intent)}



    }
}