package com.example.expo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.GridView
import android.widget.ListView
import android.widget.Spinner
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val gridView: GridView = findViewById(R.id.gridView)
        val spinner: Spinner = findViewById(R.id.spinner)
        val button: Button = findViewById(R.id.button)

        // Datos de ejemplo para el GridView (solo 4 imágenes)
        val imageArray = arrayOf(
            R.drawable.carnivoro,
            R.drawable.herbivoro,
            R.drawable.omnivoro,
            R.drawable.insectivoro,
            R.drawable.carnivoro,
            R.drawable.herbivoro,
            R.drawable.omnivoro,
            R.drawable.insectivoro,
            R.drawable.carnivoro,
            R.drawable.herbivoro,
            R.drawable.omnivoro,
            R.drawable.insectivoro,
            R.drawable.carnivoro,
            R.drawable.herbivoro,
            R.drawable.omnivoro,
            R.drawable.insectivoro,
            R.drawable.carnivoro,
            R.drawable.herbivoro,
            R.drawable.omnivoro,
            R.drawable.insectivoro,
            R.drawable.carnivoro,
            R.drawable.herbivoro,
            R.drawable.omnivoro,
            R.drawable.insectivoro,
            R.drawable.carnivoro,
            R.drawable.herbivoro,
            R.drawable.omnivoro,
            R.drawable.insectivoro,
            R.drawable.carnivoro,
            R.drawable.herbivoro,
            R.drawable.omnivoro,
            R.drawable.insectivoro,
            R.drawable.carnivoro,
            R.drawable.herbivoro,
            R.drawable.omnivoro,
            R.drawable.insectivoro,
            R.drawable.carnivoro,
            R.drawable.herbivoro,
            R.drawable.omnivoro,
            R.drawable.insectivoro,
            R.drawable.carnivoro,
            R.drawable.herbivoro,
            R.drawable.omnivoro,
            R.drawable.insectivoro,
            R.drawable.carnivoro,
            R.drawable.herbivoro,
            R.drawable.omnivoro,
            R.drawable.insectivoro
        )

        // Adaptador para el GridView
        val adapter = ImageAdapter(this, imageArray)
        gridView.adapter = adapter

        // Datos de ejemplo para el Spinner
        val dataSpinner = arrayOf("Carnívoros", "Herbívoros", "Omnívoros", "Insectívoros")

        // Adaptador para el Spinner
        val adapterSpinner = ArrayAdapter(this, android.R.layout.simple_spinner_item, dataSpinner)
        adapterSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapterSpinner

        // Acción del botón
        button.setOnClickListener {
            val selectedAnimalType = spinner.selectedItem.toString()
            val message = "Te gustan los animales: $selectedAnimalType"
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
    }
}