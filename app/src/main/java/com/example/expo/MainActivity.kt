package com.example.expo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val linearCarnivores: LinearLayout = findViewById(R.id.linearSection1)
        val linearHerbivores: LinearLayout = findViewById(R.id.linearSection2)
        val linearOmnivores: LinearLayout = findViewById(R.id.linearSection3)
        val linearInsectivores: LinearLayout = findViewById(R.id.linearSection4)

        // TextViews adicionales para mostrar información
        val textViewInfoCarnivores: TextView = findViewById(R.id.textViewInfoCarnivores)
        val textViewInfoHerbivores: TextView = findViewById(R.id.textViewInfoHerbivores)
        val textViewInfoOmnivores: TextView = findViewById(R.id.textViewInfoOmnivores)
        val textViewInfoInsectivores: TextView = findViewById(R.id.textViewInfoInsectivores)

        val buttonNext: Button = findViewById(R.id.buttonNext)

        linearCarnivores.setOnClickListener {
            // Muestra información sobre carnívoros
            textViewInfoCarnivores.text = "Los carnívoros son animales que se alimentan principalmente de carne."
            textViewInfoCarnivores.visibility = View.VISIBLE

            // Oculta información de otras secciones
            textViewInfoHerbivores.visibility = View.GONE
            textViewInfoOmnivores.visibility = View.GONE
            textViewInfoInsectivores.visibility = View.GONE
        }

        linearHerbivores.setOnClickListener {
            // Muestra información sobre herbívoros
            textViewInfoHerbivores.text = "Los herbívoros son animales que se alimentan principalmente de plantas."
            textViewInfoHerbivores.visibility = View.VISIBLE

            // Oculta información de otras secciones
            textViewInfoCarnivores.visibility = View.GONE
            textViewInfoOmnivores.visibility = View.GONE
            textViewInfoInsectivores.visibility = View.GONE
        }

        linearOmnivores.setOnClickListener {
            // Muestra información sobre omnívoros
            textViewInfoOmnivores.text = "Los omnívoros son animales que se alimentan tanto de carne como de plantas."
            textViewInfoOmnivores.visibility = View.VISIBLE

            // Oculta información de otras secciones
            textViewInfoCarnivores.visibility = View.GONE
            textViewInfoHerbivores.visibility = View.GONE
            textViewInfoInsectivores.visibility = View.GONE
        }

        linearInsectivores.setOnClickListener {
            // Muestra información sobre insectívoros
            textViewInfoInsectivores.text = "Los insectívoros son animales que se alimentan principalmente de insectos."
            textViewInfoInsectivores.visibility = View.VISIBLE

            // Oculta información de otras secciones
            textViewInfoCarnivores.visibility = View.GONE
            textViewInfoHerbivores.visibility = View.GONE
            textViewInfoOmnivores.visibility = View.GONE
        }

        buttonNext.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }

}