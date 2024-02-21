package com.example.ooo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity()
{
   // private lateinit

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView123 : TextView
        textView123 = findViewById(R.id.textView)
        var myVariable123imageButton : ImageButton = findViewById(R.id.imageButton)
        var MyEditText : EditText = findViewById(R.id.editTextText1)

        myVariable123imageButton.setOnClickListener{
            if (!MyEditText.text.isEmpty())
                textView123.text = "Привет, " + MyEditText.text
            else
                textView123.text = "Привет, друзья!"
        }
    }
}