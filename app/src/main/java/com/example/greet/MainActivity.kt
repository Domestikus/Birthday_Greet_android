package com.example.greet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener{

            val name=findViewById<EditText>(R.id.editTextText).editableText.toString()

            val intent = Intent(this, card::class.java)
            intent.putExtra("name_extra", name)
            startActivity(intent)
        }
    }
}