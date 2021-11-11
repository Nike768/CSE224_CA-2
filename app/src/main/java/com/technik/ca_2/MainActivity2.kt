package com.technik.ca_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val rb1 = findViewById<RadioButton>(R.id.male)
        val rb2 = findViewById<RadioButton>(R.id.female)
        val chb1 = findViewById<CheckBox>(R.id.android)
        val chb2 = findViewById<CheckBox>(R.id.Datasci)
        val chb3 = findViewById<CheckBox>(R.id.cyber)
        val chb4 = findViewById<CheckBox>(R.id.iot)

        rb1.setOnClickListener{
            Toast.makeText(applicationContext,rb1.text.toString() + " is selected", Toast.LENGTH_SHORT).show()
        }
        rb2.setOnClickListener{
            Toast.makeText(applicationContext,rb2.text.toString() + " is Selected", Toast.LENGTH_SHORT).show()
        }

        chb1.setOnClickListener{
            if(chb1.isChecked) {
                Toast.makeText(
                    applicationContext,
                    chb1.text.toString() + " is Selected",
                    Toast.LENGTH_SHORT
                ).show()
            }
            else{
                Toast.makeText(
                    applicationContext,
                    chb1.text.toString() + " is Unselected",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        chb2.setOnClickListener{
            if(chb2.isChecked) {
                Toast.makeText(
                    applicationContext,
                    chb2.text.toString() + " is Selected",
                    Toast.LENGTH_SHORT
                ).show()
            }
            else{
                Toast.makeText(
                    applicationContext,
                    chb2.text.toString() + " is Unselected",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        chb3.setOnClickListener{
            if(chb3.isChecked) {
                Toast.makeText(
                    applicationContext,
                    chb3.text.toString() + " is Selected",
                    Toast.LENGTH_SHORT
                ).show()
            }
            else{
                Toast.makeText(
                    applicationContext,
                    chb3.text.toString() + " is Unselected",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        chb4.setOnClickListener{
            if(chb4.isChecked) {
                Toast.makeText(
                    applicationContext,
                    chb4.text.toString() + " is Selected",
                    Toast.LENGTH_SHORT
                ).show()
            }
            else{
                Toast.makeText(
                    applicationContext,
                    chb4.text.toString() + " is Unselected",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

    }
}