package com.example.asas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.button3).setOnClickListener {
            var text1 = findViewById<TextView>(R.id.textView2).text.toString();
            var text2 = findViewById<EditText>(R.id.editText).text.toString();
            findViewById<TextView>(R.id.textView2).text = text1 + " " + text2;
        }
        findViewById<Button>(R.id.button4).setOnClickListener {
            findViewById<TextView>(R.id.textView2).text = "Artem Soloviov"
        }
    }
}