package com.malo.android.secretmemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editTextNumberPassword)

        findViewById<Button>(R.id.button).setOnClickListener {
            val passwordText = editText.text.toString()

            if (passwordText == "12345678") {
                Log.d("Secret Memo", "통과.")
            }
            else {
                Log.d("Secret Memo", "틀렸어요.")
            }
        }
    }
}