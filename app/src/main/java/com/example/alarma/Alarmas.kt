package com.example.alarma
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.ImageButton
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class Alarmas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.alarmas)

    val btn: ImageButton = findViewById<ImageButton>(R.id.back_button_to_home)
    btn.setOnClickListener {
        val intent = Intent(this,Home::class.java)
        startActivity(intent)}

        val btn2: ImageButton = findViewById<ImageButton>(R.id.crear_alarma)
        btn2.setOnClickListener {
            val intent = Intent(this,CrearAlarma::class.java)
            startActivity(intent)}

        val btn4: ImageButton = findViewById<ImageButton>(R.id.eliminar_alarma)
        btn4.setOnClickListener {
            val intent = Intent(this,EliminarAlarma::class.java)
            startActivity(intent)}





    }
}
