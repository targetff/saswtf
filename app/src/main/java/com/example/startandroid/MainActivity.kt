package com.example.startandroid

import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myBtn = findViewById<Button>(R.id.myBtn)
        var myTxt = findViewById<TextView>(R.id.myTextView)
        myBtn.setOnClickListener {
            Toast.makeText(this, "Нет у тебя силы воли...", Toast.LENGTH_LONG).show();
            myTxt.text = "Зачем нажал?"
        }/**/
    }
}