package com.example.alarma
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class NotifAlarmaCreada : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.notifalarmacreada)

        val btn: Button = findViewById<Button>(R.id.back_button_to_main_menu)
        btn.setOnClickListener {
            val intent = Intent(this,Alarmas::class.java)
            startActivity(intent)}

    }
}