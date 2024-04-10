package com.example.dbpoints

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var num = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        val textView: TextView = findViewById(R.id.text)

        button.setOnClickListener {
            num++

            val preferences = applicationContext.getSharedPreferences(name: "datos", mode:0)
            val editor = pref.edit()
        }

        val preferences = applicationContext.getSharedPreferences(name: "datos", mode:0)
        num = prefInt(key: "contador", defValue: 0)
        textView.text = num.toString()
    }
}