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

class EliminarFactura : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.eliminarfactura)

        val btn: ImageButton = findViewById<ImageButton>(R.id.back_button_to_facturas2)
        btn.setOnClickListener {
            val intent = Intent(this,Alarmas::class.java)
            startActivity(intent)}

        val btn2: Button = findViewById<Button>(R.id.eliminar_factura2)
        btn2.setOnClickListener {
            val intent = Intent(this,NotifAlarmaEliminada::class.java)
            startActivity(intent)}

        // Obtener referencia al Spinner usando findViewById
        val spinnerOptions: Spinner = findViewById(R.id.spinnerOptions)

        // Opciones para el Spinner
        val options = arrayOf("EMSA", "EAAV", "Claro Hogar", "Llanogas", "ETB")

        // Adaptador para el Spinner
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, options)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Establecer el adaptador para el Spinner
        spinnerOptions.adapter = adapter

        // Manejar la selección del Spinner
        spinnerOptions.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                val selectedItem = parent.getItemAtPosition(position).toString()
                // Aquí puedes realizar acciones según la opción seleccionada
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // No es necesario realizar ninguna acción aquí
            }
        }
    }
}
