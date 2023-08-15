package com.example.greet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class card : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)

        val name= intent.getStringExtra("name_extra")

        findViewById<TextView>(R.id.textView2).text= "HAPPY BIRTHDAY\n$name"
    }
}