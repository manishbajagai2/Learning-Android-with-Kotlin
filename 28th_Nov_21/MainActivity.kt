package com.example.testingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick = findViewById(R.id.btnClickMe) as Button
        val textview = findViewById(R.id.textView) as TextView
        var clicked = 0

        btnClick.setOnClickListener{
            clicked += 1
            textview.text = clicked.toString()
            Toast.makeText(this@MainActivity,"Hi Manish", Toast.LENGTH_SHORT).show()
        }
    }
}