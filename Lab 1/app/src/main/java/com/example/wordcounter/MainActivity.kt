package com.example.wordcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val submit = findViewById<Button>(R.id.button)
        val textInit = findViewById<TextView>(R.id.inputText)
        val textResult = findViewById<TextView>(R.id.count)

        submit.setOnClickListener {
            val words = textInit.text.toString().split("\\s".toRegex()).toTypedArray()
            textResult.text = words.filter { e -> e.contains("[aA]".toRegex()) }.count().toString()

        }
    }
}