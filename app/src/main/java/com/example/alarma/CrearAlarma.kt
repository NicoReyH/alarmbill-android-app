package com.example.alarma

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*
import android.widget.ImageButton
import android.content.Intent

class CrearAlarma : AppCompatActivity() {

    private lateinit var selectedDateTextView: TextView
    private lateinit var selectedTimeTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.crearalarma)

        val btn: ImageButton = findViewById<ImageButton>(R.id.back_button_to_alarms)
        btn.setOnClickListener {
            val intent = Intent(this,Alarmas::class.java)
            startActivity(intent)}

        selectedDateTextView = findViewById(R.id.selectedDateTextView)
        selectedTimeTextView = findViewById(R.id.selectedTimeTextView)

        val selectDateButton: Button = findViewById(R.id.selectDateButton)
        val selectTimeButton: Button = findViewById(R.id.selectTimeButton)

        selectDateButton.setOnClickListener {
            showDatePickerDialog()
        }

        selectTimeButton.setOnClickListener {
            showTimePickerDialog()
    }
}

    private fun showDatePickerDialog() {
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener { _, year, monthOfYear, dayOfMonth ->
                // Set the selected date to the TextView
                selectedDateTextView.text = "$dayOfMonth/${monthOfYear + 1}/$year"
            },
            year,
            month,
            dayOfMonth
        )

        // Show DatePickerDialog
        datePickerDialog.show()
}

    private fun showTimePickerDialog() {
        val calendar = Calendar.getInstance()
        val hour = calendar.get(Calendar.HOUR_OF_DAY)
        val minute = calendar.get(Calendar.MINUTE)

        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { _, hourOfDay, minute ->
                // Set the selected time to the TextView
                selectedTimeTextView.text = "$hourOfDay:$minute" },
            hour,
            minute,
            true
        )

        // Show TimePickerDialog
        timePickerDialog.show()



        val btn2: Button = findViewById<Button>(R.id.crear_alarma2)
        btn2.setOnClickListener {
            val intent = Intent(this,NotifAlarmaCreada::class.java)
            startActivity(intent)}


    }
}
