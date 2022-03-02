package com.example.checkboxtutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var pizza: CheckBox
    lateinit var kawa: CheckBox
    lateinit var burger: CheckBox
    lateinit var przycisk: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pizza = findViewById(R.id.pizzacheckBox)
        kawa = findViewById(R.id.kawacheckBox)
        burger = findViewById(R.id.burgercheckBox)
        przycisk = findViewById(R.id.potwierdzbtn)

        przycisk.setOnClickListener{
            var Cena: Int =0
            var result = StringBuilder()
            result.append("Wybrane produkty:")
            if(pizza.isChecked){
                result.append("\nPizza 20zł")
                Cena +=20
            }
            if(kawa.isChecked){
                result.append("\nKawa 10zł")
                Cena +=10
            }
            if(burger.isChecked){
                result.append("\nBurger 17zł")
                Cena +=17
            }

            result.append("\nRazem: " + Cena + "zł" )
            Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}