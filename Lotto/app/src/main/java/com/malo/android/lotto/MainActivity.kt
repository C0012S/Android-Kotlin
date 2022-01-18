package com.malo.android.lotto

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = findViewById<Button>(R.id.lottoNum1)

        findViewById<FloatingActionButton>(R.id.runButton).setOnClickListener {
            Log.d("로또 앱", "버튼 누름")

            num1.text = "45"
            num1.backgroundTintList = ColorStateList.valueOf(Color.rgb(255, 0, 0))
        }
    }
}