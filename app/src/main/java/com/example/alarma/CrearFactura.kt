package com.example.alarma
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class CrearFactura: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.crearfactura)

        val btn: ImageButton = findViewById<ImageButton>(R.id.back_button_to_facturas)
        btn.setOnClickListener {
            val intent = Intent(this,Facturas::class.java)
            startActivity(intent)}

        val btn2: Button = findViewById<Button>(R.id.Crear_Factura)
        btn2.setOnClickListener {
            val intent = Intent(this,NotifFacturaCreada::class.java)
            startActivity(intent)}
    }
}
