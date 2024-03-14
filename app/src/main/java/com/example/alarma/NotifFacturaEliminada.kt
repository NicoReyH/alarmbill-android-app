package com.example.alarma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class NotifFacturaEliminada : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.notiffacturaeliminada)

        val btn: Button = findViewById<Button>(R.id.back_button_to_main_menu4)
        btn.setOnClickListener {
            val intent = Intent(this,Facturas::class.java)
            startActivity(intent)}

    }
}